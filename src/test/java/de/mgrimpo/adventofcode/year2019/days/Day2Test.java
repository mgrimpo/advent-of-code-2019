/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package de.mgrimpo.adventofcode.year2019.days;


import de.mgrimpo.adventofcode.year2019.intcodemachine.IntCodeProgram;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Day2Test {

  @Test
  void additionOpExecutesCorrectly() {
    var intCodeProgram = new IntCodeProgram(new int[]{1, 0, 0, 0, 99});
    var expected = new IntCodeProgram(new int[]{2, 0, 0, 0, 99});
    assertEquals(expected, intCodeProgram.execute(), "1 + 1 should equal 2");
  }

  @Test
  void multiplicationOpExecutesCorrectly() {
    var multiplicationProgram1 = new IntCodeProgram(new int[]{2, 3, 0, 3, 99});
    var expected1 = new IntCodeProgram(new int[]{ 2, 3, 0, 6, 99});
    assertEquals(expected1, multiplicationProgram1.execute(), "3 * 2  should equal 6");
    var multiplicationProgram2 = new IntCodeProgram(new int[]{ 2, 4, 4, 5, 99, 0});
    var expected2 = new IntCodeProgram(new int[]{ 2, 4, 4, 5, 99, 9801});
    assertEquals(expected2, multiplicationProgram2.execute(), "99 * 99 should equal 9801");
  }

  @Test
  void selfModifyingIntCodeProgramExecutesCorrectly() {
    var intCodeProgram = new IntCodeProgram(new int[]{ 1, 1, 1, 4, 99, 5, 6, 0, 99});
    var expected = new IntCodeProgram(new int[]{ 30, 1, 1, 4, 2, 5, 6, 0, 99});
    assertEquals(expected, intCodeProgram.execute());
  }

}
