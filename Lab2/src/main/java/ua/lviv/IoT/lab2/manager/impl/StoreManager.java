package ua.lviv.IoT.lab2.manager.impl;

import ua.lviv.IoT.lab2.manager.IStoreManager;
import ua.lviv.IoT.lab2.model.Chemical;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class StoreManager implements IStoreManager {

   private final List<Chemical> listOfChemicals = new LinkedList<>();

   @Override
   public void addGoods(Chemical goods) {
      listOfChemicals.add(goods);
   }

   @Override
   public List<Chemical> sortByPrice(boolean reverse) {
      if (reverse) {
         return listOfChemicals.stream().sorted(Comparator.comparing(Chemical::getPrice).reversed()).collect(Collectors.toList());
      } else {
         return listOfChemicals.stream().sorted(Comparator.comparing(Chemical::getPrice)).collect(Collectors.toList());
      }
   }

   @Override
   public List<Chemical> sortByCompany(boolean reverse) {
      if (reverse) {
         return listOfChemicals.stream().sorted(Comparator.comparing(Chemical::getCompany).reversed()).collect(Collectors.toList());
      } else {
         return listOfChemicals.stream().sorted(Comparator.comparing(Chemical::getCompany)).collect(Collectors.toList());
      }
   }

   @Override
   public List<Chemical> findChemicalsForCleaning() {
      List<Chemical> listOfFinding = new LinkedList<>(listOfChemicals);
      listOfFinding.removeIf(obj -> !obj.getForCleaning());
      return listOfFinding;
   }
}