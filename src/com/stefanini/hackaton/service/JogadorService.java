package com.stefanini.hackaton.service;

import javax.inject.Inject;

import com.stefanini.hackaton.dto.JogadorDTO;
import com.stefanini.hackaton.parsers.JogadorParserDTO;
import com.stefanini.hackaton.persistence.JogadorDAO;

public class JogadorService {

	@Inject
	JogadorDAO jogadorDAO;
	
	@Inject
	JogadorParserDTO parser;
	
	public void inserir(JogadorDTO dto) {
		jogadorDAO.insert(parser.toEntity(dto));
	}
	
	
}
