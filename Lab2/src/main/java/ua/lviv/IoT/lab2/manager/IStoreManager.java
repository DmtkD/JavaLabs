package ua.lviv.IoT.lab2.manager;

import ua.lviv.IoT.lab2.model.Chemical;

import java.util.List;

public interface IStoreManager {

   void addGoods(Chemical goods);

   List<Chemical> sortByPrice(boolean reverse);

   List<Chemical> sortByCompany(boolean reverse);

   List<Chemical> findChemicalsForCleaning();
}
