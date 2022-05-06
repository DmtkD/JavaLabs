package ua.lviv.IoT.lab2.manager.impl;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CheckWord {
   static public Set<String> checkWord(final String input, int n) {
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
         if (k > n) {
            listOfResult.add(word);
         }
         k = 1;
         j++;
      }
      return listOfResult;
   }
}
