package ua.lviv.iot.ChemicalShopServer.repository;


import org.springframework.stereotype.Repository;
import ua.lviv.iot.ChemicalShopServer.model.Chemical;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface IChemicalShopRepository extends CrudRepository<Chemical, Integer> {
}
