package com.travel.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;

import com.travel.model.Trek;
import com.travel.service.ITrekService;



@RestController
@Path("/travel")
public class TrekResource {
	
	@Autowired
	@Qualifier("trekService")
	ITrekService trekService; //ITravelService campService;
	
	@GET
	@Path("/treks")
	@Produces("application/xml")
	public Response getTreks() {
		List<Trek> treks = trekService.getTreks();
		GenericEntity<List<Trek>> geTreks = new GenericEntity<List<Trek>>(treks){};
		return Response.status(200).entity(geTreks).build();
	}
}
