package ua.lviv.IoT.lab2;

import ua.lviv.IoT.lab2.manager.impl.FindWord;
import ua.lviv.IoT.lab2.manager.impl.ChemicalWriter;
import ua.lviv.IoT.lab2.manager.impl.StoreManager;
import ua.lviv.IoT.lab2.model.Detergent;
import ua.lviv.IoT.lab2.model.Kitchen;
import ua.lviv.IoT.lab2.model.Toiletry;
import ua.lviv.IoT.lab2.model.Chemical;

import java.util.Arrays;
import java.util.List;

public class Main {

   public static void main(String[] args) {

      Detergent example1 = new Detergent(100, 500, "Samsung", true, 7.5, true);
      Toiletry example2 = new Toiletry(50, 1000, "Xiaomi", false, 85, 10);
      Kitchen example3 = new Kitchen(25, 1500, "Apple", true, 27, false);

      StoreManager store = new StoreManager();

      store.addGoods(example1);
      store.addGoods(example2);
      store.addGoods(example3);

      System.out.println(store.sortByCompany(true));
      System.out.println(store.sortByPrice(false));
      System.out.println(store.findChemicalsForCleaning());

      List<Chemical> list = Arrays.asList(example1, example2, example3);
      ChemicalWriter writer = new ChemicalWriter();
      writer.writeToFile(list);

      System.out.println(FindWord.findWordsThatMoreThanNTimes("Hello I and  I go to Home and go to school", 1));
   }
}