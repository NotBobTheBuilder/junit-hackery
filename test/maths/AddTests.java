package maths;

import static org.junit.Assert.*;

import org.junit.Test;

import testdemo.maths.Maths;

public class AddTests {

  @Test
  public void testAddOne() {
    Maths maths = new Maths();
    assertEquals(2, maths.add(1, 1));
  }

  @Test
  public void testAddTwo() {
    Maths maths = new Maths();
    assertEquals(3, maths.add(2, 1));
  }
}
