package ua.lviv.IoT.lab2;

import ua.lviv.IoT.lab2.manager.impl.StoreManager;
import ua.lviv.IoT.lab2.model.Chemicals;
import ua.lviv.IoT.lab2.model.Detergents;
import ua.lviv.IoT.lab2.model.Kitchens;
import ua.lviv.IoT.lab2.model.Toiletries;

public class Main {

   public static void main(String[] args) {

      Chemicals example1 = new Detergents(100, 500, "Samsung",
              true, 7.5, true);
      Chemicals example2 = new Toiletries(50, 1000, "Xiaomi",
              false, 85, 10);
      Chemicals example3 = new Kitchens(25, 1500, "Apple",
              true, 27, false);

      StoreManager store = new StoreManager();

      store.addGoods(example1);
      store.addGoods(example2);
      store.addGoods(example3);

      System.out.println(store.sortByCompany(true));
      System.out.println(store.sortByPrice(false));
      System.out.println(store.findChemicalsForCleaning());
   }
}