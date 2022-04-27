package ua.lviv.IoT.lab2.manager.impl;

import org.junit.jupiter.api.Test;
import ua.lviv.IoT.lab2.model.Chemicals;
import ua.lviv.IoT.lab2.model.Detergents;
import ua.lviv.IoT.lab2.model.Kitchens;
import ua.lviv.IoT.lab2.model.Toiletries;

import java.io.*;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ChemicalsWriterTest {

   private final Toiletries obj1 = new Toiletries(100, 500, "Canada", true, 7.5, 15);
   private final Kitchens obj2 = new Kitchens(200, 500, "Apple", false, 25, true);
   private final Detergents obj3 = new Detergents(500, 100, "Dania", true, 7.5, true);

   @Test
   void writeToFile() {
      List<Chemicals> listTest = Arrays.asList(obj1, obj2, obj3);
      ChemicalsWriter writer = new ChemicalsWriter();
      writer.writeToFile(listTest);

      String readerEx = String.format("%s%s%s%s%s", System.getProperty("user.dir"), File.separator, "src\\test\\resources", File.separator, "example.csv");
      String readerRes = String.format("%s%s%s%s%s", System.getProperty("user.dir"), File.separator, "src\\main\\resources", File.separator, "result.csv");

      try {
         BufferedReader readerResult = new BufferedReader(new FileReader(readerRes));
         BufferedReader readerExample = new BufferedReader(new FileReader(readerEx));
         assertEquals(readerExample.readLine(), readerResult.readLine());
         assertNotEquals(null, readerResult.readLine());
         assertNotEquals(readerExample.readLine(), null);
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}