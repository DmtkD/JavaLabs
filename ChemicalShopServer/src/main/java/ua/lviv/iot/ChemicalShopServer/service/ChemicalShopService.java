package ua.lviv.iot.ChemicalShopServer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.ChemicalShopServer.exception.ChemicalNotFoundException;
import ua.lviv.iot.ChemicalShopServer.model.Chemical;
import ua.lviv.iot.ChemicalShopServer.repository.IChemicalShopRepository;

import javax.ws.rs.core.Response;
import java.util.List;
import java.util.Optional;

@Service
public class ChemicalShopService {

   @Autowired
   private IChemicalShopRepository chemicalShopRepository;

   public Chemical createChemical(Chemical chemical) {
      return chemicalShopRepository.save(chemical);
   }

//   public Response createChemical (Chemical chemical) {
//      return Response.ok(chemicalShopRepository.save(chemical)).build();
//   }
   public void updateChemical(Chemical chemical) {
      chemicalShopRepository.save(chemical);
   }

   public Chemical getChemical(Integer id) {
      Optional<Chemical> chemicalOptional= Optional.ofNullable(chemicalShopRepository.findById(id).orElseThrow(ChemicalNotFoundException::new));
      Chemical chemical = chemicalOptional.get();
      return chemical;
   }

   public List<Chemical> getChemicals() {
      return (List<Chemical>)chemicalShopRepository.findAll();
   }

   public void deleteChemical(Integer id) {
      chemicalShopRepository.deleteById(id);
   }

   public boolean isChemicalInList(Integer id) {
      return chemicalShopRepository.existsById(id);
   }
}
