package com.stefanini.hackaton.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


//
//
//@NamedQueries(value = { @NamedQuery(name = "Jogador.findByNomeSenha", query = "SELECT j FROM Jogador j WHERE J.nickname= :nickname AND j.senha= :senha"),
//	@NamedQuery(name = "Jogador.findByNome", query = "SELECT j FROM Jogador j WHERE J.nickname= :nickname"),
//	@NamedQuery(name = "Jogador.getByIdHeroi", query = "SELECT j FROM Jogador j WHERE J.heroi.id= :idHeroi"),
//	@NamedQuery(name = "Jogador.deleteById", query = "DELETE FROM Jogador j WHERE J.id = :id")
//})

@Entity
@Table(name = "jogador")
public class Jogador implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nickname;
	private String senha;
	
	@ManyToOne
	@JoinColumn(name="idHeroi", referencedColumnName = "id")
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
