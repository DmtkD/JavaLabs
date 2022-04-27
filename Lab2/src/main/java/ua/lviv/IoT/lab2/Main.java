package ua.lviv.IoT.lab2;

import ua.lviv.IoT.lab2.manager.impl.ChemicalsWriter;
import ua.lviv.IoT.lab2.manager.impl.StoreManager;
import ua.lviv.IoT.lab2.model.*;

import java.util.Arrays;
import java.util.List;

public class Main {

   public static void main(String[] args) {

      Detergents example1 = new Detergents(100, 500, "Samsung", true, 7.5, true);
      Toiletries example2 = new Toiletries(50, 1000, "Xiaomi", false, 85, 10);
      Kitchens example3 = new Kitchens(25, 1500, "Apple", true, 27, false);

      StoreManager store = new StoreManager();

      store.addGoods(example1);
      store.addGoods(example2);
      store.addGoods(example3);

      System.out.println(store.sortByCompany(true));
      System.out.println(store.sortByPrice(false));
      System.out.println(store.findChemicalsForCleaning());

      List<Chemicals> list = Arrays.asList(example1, example2, example3);
      ChemicalsWriter writer = new ChemicalsWriter();
      writer.writeToFile(list);
   }
}