import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {
   @Test
    public void isEquilateralTriangle() {
       int result = Triangle.triangleType(3,3,3);
       assertEquals("Tam giac deu", 0, result);
   }


   @Test
    public void isIoscelesTriangle() {
       int result = Triangle.triangleType(3,3,2);
       assertEquals("Tam giac can", 1, result);
   }

    @Test
    public void isNormalTriangle() {
        int result = Triangle.triangleType(3,4,5);
        assertEquals("Tam giac thuong", 2, result);
    }

    @Test
    public void isNotTriangle() {
        int result = Triangle.triangleType(1,1,3);
        assertEquals("Khong phai tam giac", 3, result);
    }

    @Test
    public void hasAtLeastOneEdgesLessThanEqualZero() {
        int result = Triangle.triangleType(0,3,2);
        assertEquals("Co it nhat 1 canh nho hon bang 0", 4, result);
    }


}