package ua.lviv.iot.ChemicalShopServer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.ChemicalShopServer.model.Chemical;
import ua.lviv.iot.ChemicalShopServer.service.ChemicalShopService;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.POST;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
import java.util.List;

@RestController
@Path("/chemicals")
public class ChemicalShopController {

   @Autowired
   private ChemicalShopService chemicalShopService;

   @GET
   @Consumes(MediaType.APPLICATION_JSON)
   @Produces(MediaType.APPLICATION_JSON)
   public List<Chemical> getAllChemicals() {
      return chemicalShopService.getChemicals();
   }

   @GET
   @Consumes(MediaType.APPLICATION_JSON)
   @Produces(MediaType.APPLICATION_JSON)
   @Path("/{id}")
   public Chemical getChemicalById(@PathParam("id") Integer id) {
      return chemicalShopService.getChemical(id);
   }

   @GET
   @Consumes(MediaType.APPLICATION_JSON)
   @Produces(MediaType.APPLICATION_JSON)
   @Path("chemical_here/{id}")
   public boolean isChemicalById (@PathParam("id") Integer id) {
      return chemicalShopService.isChemicalInList(id);
   }

   @POST
   @Consumes(MediaType.APPLICATION_JSON)
   @Produces(MediaType.APPLICATION_JSON)
   @Path("/add_chemical")
//   public void createChemical (Chemical chemical) {
//      chemicalShopService.createChemical(chemical);
//   }
   public Chemical createChemical (Chemical chemical) {
      return chemicalShopService.createChemical(chemical);
   }

   @PUT
   @Consumes(MediaType.APPLICATION_JSON)
   @Produces(MediaType.APPLICATION_JSON)
   @Path("/update_chemical")
   public void updateChemical (Chemical chemical) {
      chemicalShopService.updateChemical(chemical);
   }

   @DELETE
   @Consumes(MediaType.APPLICATION_JSON)
   @Produces(MediaType.APPLICATION_JSON)
   @Path("/delete_chemical/{id}")
   public void deleteChemicalById(@PathParam("id") Integer id) {
      chemicalShopService.deleteChemical(id);
   }
}
