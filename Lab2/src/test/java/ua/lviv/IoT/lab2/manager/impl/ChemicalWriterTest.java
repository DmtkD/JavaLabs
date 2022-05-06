package ua.lviv.IoT.lab2.manager.impl;

import org.junit.jupiter.api.Test;
import ua.lviv.IoT.lab2.model.Chemical;
import ua.lviv.IoT.lab2.model.Detergent;
import ua.lviv.IoT.lab2.model.Kitchen;
import ua.lviv.IoT.lab2.model.Toiletry;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ChemicalWriterTest {

   private final Toiletry obj1 = new Toiletry(100, 500, "Canada", true, 7.5, 15);
   private final Kitchen obj2 = new Kitchen(200, 500, "Apple", false, 25, true);
   private final Detergent obj3 = new Detergent(500, 100, "Dania", true, 7.5, true);

   @Test
   void writeToFile() {
      List<Chemical> listTest = Arrays.asList(obj1, obj2, obj3);
      ChemicalWriter writer = new ChemicalWriter();
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