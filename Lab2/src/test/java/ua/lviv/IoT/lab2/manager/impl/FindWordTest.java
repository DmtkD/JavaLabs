package ua.lviv.IoT.lab2.manager.impl;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


class FindWordTest {

   @Test
   void checkWord() {
      String testLine = "I was Here and here and I go to Here";
      Set<String> expectationResult1 = new HashSet<>(Arrays.asList("i", "here", "and"));
      Set<String> expectationResult2 = new HashSet<>(List.of("here"));
      Set<String> expectationResult3 = new HashSet<>(Arrays.asList("here", "i"));
      assertEquals(expectationResult1, FindWord.findWordsThatMoreThanNTimes(testLine, 1));
      assertEquals(expectationResult2, FindWord.findWordsThatMoreThanNTimes(testLine, 2));
      assertNotEquals(expectationResult3, FindWord.findWordsThatMoreThanNTimes(testLine, 0));
   }
}