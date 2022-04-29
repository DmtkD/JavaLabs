package ua.lviv.IoT.lab2.manager.impl;

import ua.lviv.IoT.lab2.manager.IChemicalWriter;
import ua.lviv.IoT.lab2.model.Chemical;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ChemicalWriter implements IChemicalWriter {

   public void writeToFile(final List<Chemical> chemicals) {
      try {
         File file = new File(String.format("%s%s%s%s%s", System.getProperty("user.dir"), File.separator, "src\\main\\resources", File.separator, "result.csv"));
         file.createNewFile();
         FileWriter writer = new FileWriter(file);
         for (Chemical chemical : chemicals) {
            writer.write(chemical.getHeader());
            writer.write(chemical.toCSV());
         }
         writer.flush();
         writer.close();
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}
