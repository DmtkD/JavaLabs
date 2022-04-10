package ua.lviv.IoT.lab2.manager.impl;

import ua.lviv.IoT.lab2.manager.IStoreManager;
import ua.lviv.IoT.lab2.model.Chemicals;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class StoreManager implements IStoreManager {

   private final List<Chemicals> listOfChemicals = new LinkedList<>();

   @Override
   public void addGoods(Chemicals goods) {
      listOfChemicals.add(goods);
   }

   @Override
   public List<Chemicals> sortByPrice(boolean reverse) {
      if (reverse) {
         return listOfChemicals.stream().sorted(Comparator.comparing(Chemicals::getPrice)).collect(Collectors.toList());
      } else {
         return listOfChemicals.stream().sorted(Comparator.comparing(Chemicals::getPrice).reversed()).collect(Collectors.toList());
      }
   }

   @Override
   public List<Chemicals> sortByCompany(boolean reverse) {
      if (reverse) {
         return listOfChemicals.stream().sorted(Comparator.comparing(Chemicals::getCompany)).collect(Collectors.toList());
      } else {
         return listOfChemicals.stream().sorted(Comparator.comparing(Chemicals::getCompany).reversed()).collect(Collectors.toList());
      }
   }

   @Override
   public List<Chemicals> findChemicalsForCleaning() {
      List<Chemicals> listOfFinding = new LinkedList<>(listOfChemicals);
      listOfFinding.removeIf(obj -> !obj.getForCleaning());
      return listOfFinding;
   }
}