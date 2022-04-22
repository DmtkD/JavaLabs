package ua.lviv.IoT.lab2.manager.impl;

import org.junit.jupiter.api.Test;
import ua.lviv.IoT.lab2.model.Chemicals;
import ua.lviv.IoT.lab2.model.Detergents;
import ua.lviv.IoT.lab2.model.Kitchens;
import ua.lviv.IoT.lab2.model.Toiletries;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StoreManagerTest {

   private final StoreManager shop = new StoreManager();
   private final Toiletries obj1 = new Toiletries(100, 500, "Canada", true, 7.5, 15);
   private final Kitchens obj2 = new Kitchens(200, 500, "Apple", false, 25, true);
   private final Detergents obj3 = new Detergents(500, 100, "Dania", true, 7.5, true);

   @Test
   void addGoods() {
      try {
         shop.addGoods(obj1);
         var privateField = StoreManager.class.getDeclaredField("listOfChemicals");
         privateField.setAccessible(true);
         var listTest = (List<Chemicals>)privateField.get(shop);
         assertEquals(obj1, listTest.get(listTest.size()-1));
      } catch (Exception shop) {
         shop.printStackTrace();
      }
   }

   @Test
   void sortByPriceToUp() {
      shop.addGoods(obj1);
      shop.addGoods(obj2);
      shop.addGoods(obj3);
      List<Chemicals> listTest = Arrays.asList(obj1, obj2, obj3);
      assertEquals(listTest, shop.sortByPrice(false));
   }

   @Test
   void sortByPriceToDown() {
      shop.addGoods(obj1);
      shop.addGoods(obj2);
      shop.addGoods(obj3);
      List<Chemicals> listTest = Arrays.asList(obj3, obj2, obj1);
      assertEquals(listTest, shop.sortByPrice(true));
   }

   @Test
   void sortByCompanyUp() {
      shop.addGoods(obj1);
      shop.addGoods(obj2);
      shop.addGoods(obj3);
      List<Chemicals> listTest = Arrays.asList(obj2, obj1, obj3);
      assertEquals(listTest, shop.sortByCompany(false));
   }

   @Test
   void sortByCompanyDown() {
      shop.addGoods(obj1);
      shop.addGoods(obj2);
      shop.addGoods(obj3);
      List<Chemicals> listTest = Arrays.asList(obj3, obj1, obj2);
      assertEquals(listTest, shop.sortByCompany(true));
   }

   @Test
   void findSomethingChemicalsForCleaning() {
      shop.addGoods(obj1);
      shop.addGoods(obj2);
      shop.addGoods(obj3);
      List<Chemicals> listTest = Arrays.asList(obj1, obj3);
      assertEquals(listTest, shop.findChemicalsForCleaning());
   }

   @Test
   void findNothingChemicalsForCleaning() {
      shop.addGoods(obj2);
      List<Chemicals> listTest = new ArrayList<>();
      assertEquals(listTest, shop.findChemicalsForCleaning());
   }
}