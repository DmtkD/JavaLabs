package ua.lviv.IoT.lab2.manager.impl;

import ua.lviv.IoT.lab2.manager.IChemicalsWriter;
import ua.lviv.IoT.lab2.model.Chemicals;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ChemicalsWriter implements IChemicalsWriter {

   public void writeToFile(List<Chemicals> Chemicals) {
      try {
         File file = new File(String.format("%s%s%s%s%s", System.getProperty("user.dir"), File.separator, "src\\main\\resources", File.separator, "result.csv"));
         file.createNewFile();
         FileWriter writer = new FileWriter(file);
         for (Chemicals chemical : Chemicals) {
            writer.write(chemical.getHeader());
            writer.write(chemical.toSVC());
         }
         writer.flush();
         writer.close();
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}
