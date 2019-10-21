package com.stefanini.hackaton.service;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.NoResultException;

import com.stefanini.hackaton.dto.JogadorDTO;
import com.stefanini.hackaton.dto.LoginDTO;
import com.stefanini.hackaton.entities.Jogador;
import com.stefanini.hackaton.parsers.JogadorParserDTO;
import com.stefanini.hackaton.persistence.JogadorDAO;
import com.stefanini.hackaton.rest.exceptions.NegocioException;

public class LoginService {

	@Inject
	JogadorDAO jogadorDAO;
	
	@Inject
	JogadorParserDTO parser;
	
	
	public List<JogadorDTO> listar() {
		
		return parser.toDTO(jogadorDAO.list());
		
	}
	
	
	
	
	public JogadorDTO verificar(LoginDTO dto) throws NegocioException{
		
		List<JogadorDTO> jogadores = this.listar();
		Jogador jogadorLogado = new Jogador();
			
		try {
			
			for(JogadorDTO jogador : jogadores) {
				
				
				if(jogador.getNickname().equals(dto.getNickname()) && jogador.getSenha().equals(dto.getSenha())) {
			
					jogadorLogado.setHeroi(jogador.getHeroi());
					jogadorLogado.setId(jogador.getId());
					jogadorLogado.setNickname(jogador.getNickname());
					jogadorLogado.setSenha(jogador.getSenha());
					
				}
		
			}
			
			return parser.toDTO(jogadorLogado);
			
		} catch (NoResultException e) {
			
			throw new NegocioException("Nickname ou senha está incorreto!");
			
		}
	
	
	
		
		
		
	}	
		
		
}