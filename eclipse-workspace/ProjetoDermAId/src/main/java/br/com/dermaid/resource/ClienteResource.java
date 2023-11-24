package br.com.dermaid.resource;

import java.sql.SQLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import br.com.dermaid.beans.Cliente;
import br.com.dermaid.bo.ClienteBO;

@Path("/Cliente")
public class ClienteResource {
	

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String buscar() {
		return "Teste Novo Yeah!";	}
		
	
	private ClienteBO clienteBO = new ClienteBO();	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastroRs (Cliente cliente, @Context UriInfo uriInfo ) throws ClassNotFoundException, SQLException {
		clienteBO.inserirBo(cliente);
		UriBuilder builder = uriInfo.getAbsolutePathBuilder();
		builder.path(Long.toString(cliente.getCpf()));
		return Response.created(builder.build()).build();		
	}
	
	@PUT
	@Path("/{email}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response atualizaRs (Cliente cliente, @PathParam("email") String email) throws SQLException, ClassNotFoundException {
		clienteBO.atualizarBo(cliente);
		return Response.ok().build();
	}
	
}