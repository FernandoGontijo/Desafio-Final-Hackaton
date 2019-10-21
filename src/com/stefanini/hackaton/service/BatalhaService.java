package com.stefanini.hackaton.service;

import java.util.List;

import javax.inject.Inject;

import com.stefanini.hackaton.dto.HeroiDto;
import com.stefanini.hackaton.parsers.JogadorParserDTO;
import com.stefanini.hackaton.persistence.HeroiDAO;
import com.stefanini.hackaton.persistence.JogadorDAO;

public class BatalhaService {


	@Inject
	JogadorDAO jogadorDAO;
	
	@Inject
	HeroiDAO heroiDAO;
	
	@Inject
	JogadorParserDTO dto;
	

	

	
	public Boolean vencedor(Integer vida_jogador_1, Integer vida_jogador_2) {
		
		if (vida_jogador_1 <= 0 || vida_jogador_2 <= 0) {
			return true;	
		} else {
			return false;
		}
	}
	
	

	
	
	public String batalhar(List<HeroiDto> herois) {

		Integer ataque = 0;
		Integer defesa = 0;
		Integer poder = 0;
	
		HeroiDto heroi_1 = herois.get(0);
		HeroiDto heroi_2 = herois.get(1);
		 
	
		
		Integer heroi_jogador_1 = 0;
		Integer heroi_jogador_2 = 0;

		String vencedor = "";
		
		Integer vida_jogador_1 = (heroi_1.getVida()/10);
		Integer vida_jogador_2 = (heroi_2.getVida()/10);
		
		Boolean batalhando = true;
		
		
		if (  (heroi_1.getAtaque().equals(heroi_2.getAtaque())) && (heroi_1.getDefesa().equals(heroi_2.getDefesa())) 
				&& (heroi_1.getInteligencia().equals(heroi_2.getInteligencia())) && (heroi_1.getPoder()
						.equals(heroi_2.getPoder())) && (heroi_1.getVelocidade().equals(heroi_2.getVelocidade())) ) {
			
			vencedor = "Deu empate!";
			
			
			
		} else {
		
	
		
		
		while (batalhando) {
			
			
			
			heroi_jogador_1 = heroi_1.getAtaque();
			heroi_jogador_2 = heroi_2.getAtaque();
			
			
			
			if(heroi_jogador_1 > heroi_jogador_2) {
				
				ataque = (heroi_jogador_1 - heroi_jogador_2) *100;
				vida_jogador_2 = vida_jogador_2 - ataque;
				
			} else if (heroi_jogador_2 > heroi_jogador_1) {
				
				ataque = (heroi_jogador_2 - heroi_jogador_1) * 100;
				vida_jogador_1 = vida_jogador_1 - ataque;
			
				
			} else if(heroi_jogador_1 == heroi_jogador_2) {
				
				vida_jogador_1 = vida_jogador_1 - heroi_jogador_2;
				vida_jogador_2 = vida_jogador_2 - heroi_jogador_2;
				
			}
			
			if (vida_jogador_1 <=0 || vida_jogador_2 <= 0) {
				
				batalhando = false;
			}
			
			heroi_jogador_1 = heroi_1.getDefesa();
			heroi_jogador_2 = heroi_2.getDefesa();
			
			
			
			if(heroi_jogador_1 > heroi_jogador_2) {
							
			defesa = (heroi_jogador_1 - heroi_jogador_2) *50;
			vida_jogador_2 -= defesa;
							
			} else if (heroi_jogador_2 > heroi_jogador_1) {
							
			defesa = (heroi_jogador_2 - heroi_jogador_1) * 50;
			vida_jogador_1 -= defesa;
							
			} 
			
			if (vida_jogador_1 <=0 || vida_jogador_2 <= 0) {
				
				batalhando = false;
			}
	
			heroi_jogador_1 = heroi_1.getInteligencia();
			heroi_jogador_2 = heroi_2.getInteligencia();
			
			Integer inteligencia = 0;
			
			if(heroi_jogador_1 > heroi_jogador_2) {
							
				inteligencia = (heroi_jogador_1 - heroi_jogador_2) *75;
			    vida_jogador_2 -= inteligencia;
							
			} else if (heroi_jogador_2 > heroi_jogador_1) {
							
				inteligencia = (heroi_jogador_2 - heroi_jogador_1) * 75;
			    vida_jogador_1 -= inteligencia;
							
			} 
			
			
			if (vida_jogador_1 <=0 || vida_jogador_2 <= 0) {
				
				batalhando = false;
			}
	
			heroi_jogador_1 = heroi_1.getPoder();
			heroi_jogador_2 = heroi_2.getPoder();
			
			
			
			if(heroi_jogador_1 > heroi_jogador_2) {
							
				poder = (heroi_jogador_1 - heroi_jogador_2) *120;
			vida_jogador_2 -= poder;
							
			} else if (heroi_jogador_2 > heroi_jogador_1) {
							
				poder = (heroi_jogador_2 - heroi_jogador_1) * 120;
			vida_jogador_1 -= poder;
							
			} 
			
			if (vida_jogador_1 <=0 || vida_jogador_2 <= 0) {
				
				batalhando = false;
			}
			
			

		}
	 
			
		}
		
		if (vida_jogador_1 > vida_jogador_2) {
			
			vencedor = ("Jogador1 venceu! Vida jogador 1" + vida_jogador_1 + "vida jogador 2 " + vida_jogador_2);
		
			
		} else if (vida_jogador_2 > vida_jogador_1) {
			
			vencedor = ("Jogador2 venceu! jogador 1 = " + vida_jogador_1 + "vida jogador 2 = " + vida_jogador_2);
		
		}

	
		return vencedor;
		
	}
	
	

	
	
	
	
}
	
	
	
//	
//if (vida_jogador_1 > vida_jogador_2) {
//	
//	JogadorVencedor = "Jogador1 venceu!";
//	
//} else if (vida_jogador_2 > vida_jogador_1) {
//	
//	JogadorVencedor = "Jogador2 venceu!";
//}
