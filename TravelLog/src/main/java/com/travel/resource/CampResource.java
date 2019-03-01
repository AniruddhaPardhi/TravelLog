package com.travel.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.GenericEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;

import com.travel.model.Camp;
import com.travel.service.ICampService;

@RestController
@Path("/travel")
public class CampResource {
	
	@Autowired
	@Qualifier("campService")
	ICampService campService; //ITravelService campService;
	
	@GET
	@Path("/camps")
	@Produces("application/xml")
	public Response getCamps() {
		List<Camp> camps = campService.getCamps();
		GenericEntity<List<Camp>> geCamps = new GenericEntity<List<Camp>>(camps){};
		return Response.status(200).entity(geCamps).build();
	}
}
