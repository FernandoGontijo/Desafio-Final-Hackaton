package com.stefanini.hackaton.api;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.stefanini.hackaton.dto.JogadorDTO;
import com.stefanini.hackaton.service.JogadorService;

@Path("/jogador")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class JogadorApi {

	@Inject
	JogadorService jogadorService;
	
	
	@POST
	public Response cadastrar(JogadorDTO dto) {
		
		jogadorService.inserir(dto);
		return Response.ok().build();
	}
	
	
	
}
