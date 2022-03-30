package triangle.test;

import junit.framework.TestCase;
import static triangle.UpgradedTriangle.Type;

public class TriangleClassTest extends TestCase {
   // boundary test cases
   public void test1() {
        assertEquals (triangle.UpgradedTriangle.classifyTriangle(1187,1146,1), Type.INVALID);
   }

   public void test2() {
        assertEquals (triangle.UpgradedTriangle.classifyTriangle(784,784,1956), Type.INVALID);
   }

   public void test3() {
        assertEquals (triangle.UpgradedTriangle.classifyTriangle(1,450,1), Type.INVALID);
   }

   public void test4() {
        assertEquals (triangle.UpgradedTriangle.classifyTriangle(0,1301,1), Type.INVALID);
   }

   public void test5() {
        assertEquals (triangle.UpgradedTriangle.classifyTriangle(1108,1,1), Type.INVALID);
   }

   public void test6() {
        assertEquals (triangle.UpgradedTriangle.classifyTriangle(1,1088,15), Type.INVALID);
   }

   public void test7() {
        assertEquals (triangle.UpgradedTriangle.classifyTriangle(1,2,450), Type.INVALID);
   }

   public void test8() {
        assertEquals (triangle.UpgradedTriangle.classifyTriangle(1,0,-665), Type.INVALID);
   }

   public void test9() {
        assertEquals (triangle.UpgradedTriangle.classifyTriangle(1,1,0), Type.INVALID);
   }

   public void test10() {
        assertEquals (triangle.UpgradedTriangle.classifyTriangle(-1,1,1), Type.INVALID);
   }

   public void test11() {
        assertEquals (triangle.UpgradedTriangle.classifyTriangle(1,-1,1), Type.INVALID);
   }

   public void test12() {
        assertEquals (triangle.UpgradedTriangle.classifyTriangle(1,2,3), Type.INVALID);
   }

   public void test13() {
        assertEquals (triangle.UpgradedTriangle.classifyTriangle(2,3,1), Type.INVALID);
   }

   public void test14() {
        assertEquals (triangle.UpgradedTriangle.classifyTriangle(3,1,2), Type.INVALID);
   }

   public void test15() {
        assertEquals (triangle.UpgradedTriangle.classifyTriangle(1,1,2), Type.INVALID);
   }

   public void test16() {
        assertEquals (triangle.UpgradedTriangle.classifyTriangle(1,2,1), Type.INVALID);
   }

   public void test17() {
        assertEquals (triangle.UpgradedTriangle.classifyTriangle(2,1,1), Type.INVALID);
   }

   public void test18() {
        assertEquals (triangle.UpgradedTriangle.classifyTriangle(0,1,1), Type.INVALID);
   }

   public void test19() {
        assertEquals (triangle.UpgradedTriangle.classifyTriangle(1,0,1), Type.INVALID);
   }

   public void test20() {
        assertEquals (triangle.UpgradedTriangle.classifyTriangle(1,2,-1), Type.INVALID);
   }

   public void test21() {
        assertEquals (triangle.UpgradedTriangle.classifyTriangle(1,1,-1), Type.INVALID);
   }

   public void test22() {
        assertEquals (triangle.UpgradedTriangle.classifyTriangle(0,0,0), Type.INVALID);
   }

   public void test23() {
        assertEquals (triangle.UpgradedTriangle.classifyTriangle(3,2,5), Type.INVALID);
   }

   public void test24() {
        assertEquals (triangle.UpgradedTriangle.classifyTriangle(5,9,2), Type.INVALID);
   }

   public void test25() {
        assertEquals (triangle.UpgradedTriangle.classifyTriangle(7,4,3), Type.INVALID);
   }

   public void test26() {
        assertEquals (triangle.UpgradedTriangle.classifyTriangle(3,8,3), Type.INVALID);
   }

   public void test27() {
        assertEquals (triangle.UpgradedTriangle.classifyTriangle(7,3,3), Type.INVALID);
   }

   // MC/DC test cases   
   public void test28() {
        assertEquals (triangle.UpgradedTriangle.classifyTriangle(1,1,1), Type.EQUILATERAL);
   }

   public void test29() {
        assertEquals (triangle.UpgradedTriangle.classifyTriangle(582,582,582), Type.EQUILATERAL);
   }

   public void test30() {
        assertEquals (triangle.UpgradedTriangle.classifyTriangle(1663,1088,823), Type.SCALENE);
   }

   public void test31() {
        assertEquals (triangle.UpgradedTriangle.classifyTriangle(1640,1640,1956), Type.ISOSCELES);
   }

   public void test32() {
        assertEquals (triangle.UpgradedTriangle.classifyTriangle(1146,1,1146), Type.ISOSCELES);
   }

   public void test33() {
        assertEquals (triangle.UpgradedTriangle.classifyTriangle(1640,1956,1956), Type.ISOSCELES);
   }
}
