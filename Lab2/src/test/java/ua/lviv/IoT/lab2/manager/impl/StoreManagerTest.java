package ua.lviv.IoT.lab2.manager.impl;

import org.junit.jupiter.api.Test;
import ua.lviv.IoT.lab2.model.Chemical;
import ua.lviv.IoT.lab2.model.Detergent;
import ua.lviv.IoT.lab2.model.Kitchen;
import ua.lviv.IoT.lab2.model.Toiletry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StoreManagerTest {

   private final StoreManager shop = new StoreManager();
   private final Toiletry obj1 = new Toiletry(100, 500, "Canada", true, 7.5, 15);
   private final Kitchen obj2 = new Kitchen(200, 500, "Apple", false, 25, true);
   private final Detergent obj3 = new Detergent(500, 100, "Dania", true, 7.5, true);

   @Test
   void addGoods() {
      try {
         shop.addGoods(obj1);
         var privateField = StoreManager.class.getDeclaredField("listOfChemicals");
         privateField.setAccessible(true);
         var listTest = (List<Chemical>)privateField.get(shop);
         assertEquals(obj1, listTest.get(listTest.size()-1));
      } catch (Exception e) {
         e.printStackTrace();
      }
   }

   @Test
   void sortByPriceToUp() {
      shop.addGoods(obj1);
      shop.addGoods(obj2);
      shop.addGoods(obj3);
      List<Chemical> listTest = Arrays.asList(obj1, obj2, obj3);
      assertEquals(listTest, shop.sortByPrice(false));
   }

   @Test
   void sortByPriceToDown() {
      shop.addGoods(obj1);
      shop.addGoods(obj2);
      shop.addGoods(obj3);
      List<Chemical> listTest = Arrays.asList(obj3, obj2, obj1);
      assertEquals(listTest, shop.sortByPrice(true));
   }

   @Test
   void sortByCompanyUp() {
      shop.addGoods(obj1);
      shop.addGoods(obj2);
      shop.addGoods(obj3);
      List<Chemical> listTest = Arrays.asList(obj2, obj1, obj3);
      assertEquals(listTest, shop.sortByCompany(false));
   }

   @Test
   void sortByCompanyDown() {
      shop.addGoods(obj1);
      shop.addGoods(obj2);
      shop.addGoods(obj3);
      List<Chemical> listTest = Arrays.asList(obj3, obj1, obj2);
      assertEquals(listTest, shop.sortByCompany(true));
   }

   @Test
   void findSomethingChemicalsForCleaning() {
      shop.addGoods(obj1);
      shop.addGoods(obj2);
      shop.addGoods(obj3);
      List<Chemical> listTest = Arrays.asList(obj1, obj3);
      assertEquals(listTest, shop.findChemicalsForCleaning());
   }

   @Test
   void findNothingChemicalsForCleaning() {
      shop.addGoods(obj2);
      List<Chemical> listTest = new ArrayList<>();
      assertEquals(listTest, shop.findChemicalsForCleaning());
   }
}