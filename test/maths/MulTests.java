package maths;

import static org.junit.Assert.*;

import org.junit.Test;

import testdemo.maths.Maths;

public class MulTests {

  @Test
  public void testOne() {
    Maths maths = new Maths();
    assertEquals(1, maths.mul(1, 1));
  }

  @Test
  public void testTwo() {
    Maths maths = new Maths();
    assertEquals(4, maths.mul(2, 2));
  }

  @Test
  public void testThree() {
    Maths maths = new Maths();
    assertEquals(8, maths.mul(2, 4));
  }
}
