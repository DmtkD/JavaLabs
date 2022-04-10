package ua.lviv.IoT.lab2.manager;

import ua.lviv.IoT.lab2.model.Chemicals;

import java.util.List;

public interface IStoreManager {

   void addGoods(Chemicals goods);

   List<Chemicals> sortByPrice(boolean reverse);

   List<Chemicals> sortByCompany(boolean reverse);

   List<Chemicals> findChemicalsForCleaning();
}
