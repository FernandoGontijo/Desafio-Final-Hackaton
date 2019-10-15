package com.stefanini.hackaton.api;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.stefanini.hackaton.service.JogadorService;

@Path("/jogador")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class JogadorApi {

	@Inject
	JogadorService jogadorService;
	
	
	//public Response cadastrar()
	
	
	
}
