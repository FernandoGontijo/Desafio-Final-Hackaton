package com.stefanini.hackaton.api;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.stefanini.hackaton.dto.HeroiDto;
import com.stefanini.hackaton.service.BatalhaService;

@Path("/batalha")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BatalhaApi {

	@Inject
	BatalhaService batalha;
	

	
	@POST
	public Response batalhar(List<HeroiDto> herois) {
		
		return Response.ok(batalha.batalhar(herois)).build();

	}
	
	
	
	
	
	
}
