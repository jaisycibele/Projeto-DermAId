package br.com.dermaid.resource;

import java.sql.SQLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import br.com.dermaid.beans.EsqueceuSenha;
import br.com.dermaid.bo.EsqueceuSenhaBO;

@Path("/EsqueceuSenha")
public class EsqueceuSenhaResource {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String buscar() {
		return "Teste Novo Yeah!";	}
	
private EsqueceuSenhaBO esqueceuSenhaBO = new EsqueceuSenhaBO();	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastroRs (EsqueceuSenha esqueceuSenha, @Context UriInfo uriInfo ) throws ClassNotFoundException, SQLException {
		esqueceuSenhaBO.inserirBo(esqueceuSenha);
		UriBuilder builder = uriInfo.getAbsolutePathBuilder();
		builder.path(esqueceuSenha.getEmail());
		return Response.created(builder.build()).build();		
	}

	
}
