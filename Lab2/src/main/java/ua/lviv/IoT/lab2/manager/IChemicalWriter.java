package ua.lviv.IoT.lab2.manager;

import ua.lviv.IoT.lab2.model.Chemical;

import java.io.IOException;
import java.util.List;

public interface IChemicalWriter {

   void writeToFile(List<Chemical> chemicals) throws IOException;
}
