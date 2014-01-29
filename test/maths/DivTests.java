package maths;

import static org.junit.Assert.*;

import org.junit.Test;

import testdemo.maths.Maths;

public class DivTests {

  @Test
  public void testOne() {
    Maths maths = new Maths();
    assertEquals(1, maths.div(2, 2));
  }

  @Test
  public void testTwo() {
    Maths maths = new Maths();
    assertEquals(4, maths.div(4, 2));
  }
}
