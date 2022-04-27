package ua.lviv.IoT.lab2.manager;

import ua.lviv.IoT.lab2.model.Chemicals;

import java.util.List;

public interface IChemicalsWriter {

   void writeToFile(List<Chemicals> Chemicals);
}
