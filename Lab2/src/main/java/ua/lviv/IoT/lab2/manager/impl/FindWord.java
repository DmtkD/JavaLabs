package ua.lviv.IoT.lab2.manager.impl;

import java.util.HashSet;
import java.util.Set;

public class FindWord {
   static public Set<String> findWordsThatMoreThanNTimes (final String input, int nTimes) {
      String[] listOfWord = input.toLowerCase().split("\\W");
      Set<String> listOfResult = new HashSet<>();
      int k = 1;
      int j = 1;
      for (String word : listOfWord) {
         for (int i = j; i < listOfWord.length; i++) {
            if (!word.equals("")) {
               if (listOfWord[i].equals(word)) {
                  k++;
               }
            }
         }
         if (k > nTimes) {
            listOfResult.add(word);
         }
         k = 1;
         j++;
      }
      return listOfResult;
   }
}
