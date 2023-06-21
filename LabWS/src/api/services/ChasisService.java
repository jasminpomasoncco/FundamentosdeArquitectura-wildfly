package api.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HEAD;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import api.domain.Chasis;

@Path("/chasis")
@Consumes(value= MediaType.APPLICATION_JSON)
@Produces(value = MediaType.APPLICATION_JSON)

public class ChasisService {
	
	    @GET
		public Response obtieneTelemetria(){
	    	
			Chasis chasis = new Chasis();
			return Response.ok(chasis).build();
		}
	    
	    @HEAD
		public Response pingUsersService() {
			return Response.noContent().header("running", true).build();
		}
}
