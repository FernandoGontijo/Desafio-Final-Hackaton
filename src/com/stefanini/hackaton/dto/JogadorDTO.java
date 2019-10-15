package com.stefanini.hackaton.dto;

import java.io.Serializable;

import com.stefanini.hackaton.entities.Heroi;

public class JogadorDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private Integer id;
	private String nickname;
	private String senha;
	private Heroi heroi;
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Heroi getHeroi() {
		return heroi;
	}
	public void setHeroi(Heroi heroi) {
		this.heroi = heroi;
	}
	
	
	
	
	
	
	
	

}
