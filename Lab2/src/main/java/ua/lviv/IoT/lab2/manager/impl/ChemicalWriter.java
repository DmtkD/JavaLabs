package ua.lviv.IoT.lab2.manager.impl;

import ua.lviv.IoT.lab2.manager.IChemicalWriter;
import ua.lviv.IoT.lab2.model.Chemical;

import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.List;

public class ChemicalWriter implements IChemicalWriter {

   public void writeToFile(final List<Chemical> chemicals) {
      String path = String.format("%s%s%s%s%s", System.getProperty("user.dir"), File.separator, "src\\main\\resources", File.separator, "result.csv");
      try (FileWriter writer = new FileWriter(path)) {
         for (Chemical chemical : chemicals) {
            writer.write(chemical.getHeader());
            writer.write(chemical.toCSV());
         }
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}
