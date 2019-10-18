package com.stefanini.hackaton.service;

import javax.inject.Inject;

import com.stefanini.hackaton.dto.JogadorDTO;
import com.stefanini.hackaton.dto.LoginDTO;
import com.stefanini.hackaton.entities.Jogador;
import com.stefanini.hackaton.parsers.JogadorParserDTO;
import com.stefanini.hackaton.persistence.JogadorDAO;

public class LoginService {

	@Inject
	JogadorDAO jogadorDAO;
	
	@Inject
	JogadorParserDTO parser;
	
	public JogadorDTO verificar(LoginDTO dto) {
		
		Jogador jogador = new Jogador();
		
		if (jogadorDAO.findByNomeSenha(dto.getNickname(), dto.getSenha()) != null) {
			jogador = jogadorDAO.findByNomeSenha(dto.getNickname(), dto.getSenha());
		
		}
		
		return parser.toDTO(jogador);
		
	}
	
	
}
