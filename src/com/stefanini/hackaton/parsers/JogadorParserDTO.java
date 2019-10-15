package com.stefanini.hackaton.parsers;

import com.stefanini.hackaton.dto.HeroiDto;
import com.stefanini.hackaton.dto.JogadorDTO;
import com.stefanini.hackaton.entities.Heroi;
import com.stefanini.hackaton.entities.Jogador;

public class JogadorParserDTO extends AbstractParser<JogadorDTO, Jogador> {

	
	@Override
	public JogadorDTO toDTO(Jogador entity) {
		JogadorDTO dto = new JogadorDTO();
		dto.setId(entity.getId());
		dto.setNickname(entity.getNickname());
		dto.setSenha(entity.getSenha());
		dto.setHeroi(entity.getHeroi());
		return dto;
	}
	
	
	@Override
	public Jogador toEntity(JogadorDTO dto) {
		Jogador  entity = new Jogador();
		entity.setId(dto.getId());
		entity.setNickname(dto.getNickname());
		entity.setSenha(dto.getSenha());
		entity.setHeroi(dto.getHeroi());
		return entity;
	}
}
