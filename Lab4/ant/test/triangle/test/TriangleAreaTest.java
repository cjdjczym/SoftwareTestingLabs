package triangle.test;

import junit.framework.TestCase;

public class TriangleAreaTest extends TestCase {
    private static final double DELTA = 0.001;

    // boundary test cases
    public void test1() {
        assertEquals (triangle.UpgradedTriangle.calculateArea(0, 0, 0), 0.0);
   }

   public void test2() {
        assertEquals (triangle.UpgradedTriangle.calculateArea(-1, 0, -1), 0.0);
   }

   public void test3() {
        assertEquals (triangle.UpgradedTriangle.calculateArea(1, 1, 0), 0.0);
   }

   public void test4() {
        assertEquals (triangle.UpgradedTriangle.calculateArea(0, 1, 0), 0.0);
   }

   public void test5() {
        assertEquals (triangle.UpgradedTriangle.calculateArea(0, 1, -1), 0.0);
   }

   public void test6() {
        assertEquals (triangle.UpgradedTriangle.calculateArea(3, 2, 1), 0.0);
   }

   public void test7() {
        assertEquals (triangle.UpgradedTriangle.calculateArea(1, 2, 4), 0.0);
   }

   // MC/DC test cases   
   public void test8() {
        assertEquals (triangle.UpgradedTriangle.calculateArea(1, 1, 1), 0.433, DELTA);
   }
   
   public void test9() {
        assertEquals (triangle.UpgradedTriangle.calculateArea(3, 3, 3), 3.897, DELTA);
   }

   public void test10() {
        assertEquals (triangle.UpgradedTriangle.calculateArea(3, 4, 5), 6.0);
   }
   
   public void test11() {
        assertEquals (triangle.UpgradedTriangle.calculateArea(5, 12, 13), 30.0);
   }

   public void test12() {
        assertEquals (triangle.UpgradedTriangle.calculateArea(1, 1, 1), 0.433, DELTA);
   }

   public void test13() {
        assertEquals (triangle.UpgradedTriangle.calculateArea(-10, -10, -10), 0.0);
   }

   public void test14() {
        assertEquals (triangle.UpgradedTriangle.calculateArea(10, 10, 10), 43.301, DELTA);
   }

   public void test15() {
        assertEquals (triangle.UpgradedTriangle.calculateArea(1, 5, 5), 2.487, DELTA);
   }

   public void test16() {
        assertEquals (triangle.UpgradedTriangle.calculateArea(2, 1, 2), 0.968, DELTA);
   }

   public void test17() {
        assertEquals (triangle.UpgradedTriangle.calculateArea(3, 3, 2), 2.828, DELTA);
   }

   public void test18() {
        assertEquals (triangle.UpgradedTriangle.calculateArea(2, 3, 4), 2.905, DELTA);
   }

   public void test19() {
        assertEquals (triangle.UpgradedTriangle.calculateArea(4, 6, 7), 11.977, DELTA);
   }

   public void test20() {
        assertEquals (triangle.UpgradedTriangle.calculateArea(5, 3, 4), 6.0, DELTA);
   }
}