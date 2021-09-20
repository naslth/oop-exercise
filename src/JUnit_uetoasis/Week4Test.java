package JUnit_uetoasis;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Week4Test {
  @Test
  public void testMax2Int1() {
    assertEquals(3, Week4.max2Int(2, 3));
  }

  @Test
  public void testMax2Int2() {
    assertEquals(5, Week4.max2Int(0, 5));
  }

  @Test
  public void testMax2Int3() {
    assertEquals(-2, Week4.max2Int(-2, -9));
  }

  @Test
  public void testMax2Int4() {
    assertEquals(1, Week4.max2Int(-1, 1));
  }

  @Test
  public void testMax2Int5() {
    assertEquals(0, Week4.max2Int(0, 0));
  }

  @Test
  public void testMinArray1() {
    int[] testArr = {3, 5, 1, 8};
    assertEquals(1, Week4.minArray(testArr));
  }

  @Test
  public void testMinArray2() {
    int[] testArr = {-2, 5, 2, -5, -9, -17};
    assertEquals(-17, Week4.minArray(testArr));
  }

  @Test
  public void testMinArray3() {
    int[] testArr = {29, 29, 29, 29, 29};
    assertEquals(29, Week4.minArray(testArr));
  }

  @Test
  public void testMinArray4() {
    int[] testArr = {-2, 1, 0, 1, 2, 3};
    assertEquals(-2, Week4.minArray(testArr));
  }

  @Test
  public void testMinArray5() {
    int[] testArr = {10, 9, 8, 7, 6, 5};
    assertEquals(5, Week4.minArray(testArr));
  }

  @Test
  public void testCalculateBMI1() {
    assertEquals("Thiếu cân", Week4.calculateBMI(50, 1.7));
  }

  @Test
  public void testCalculateBMI2() {
    assertEquals("Bình thường", Week4.calculateBMI(47.3, 1.6));
  }

  @Test
  public void testCalculateBMI3() {
    assertEquals("Thừa cân", Week4.calculateBMI(85, 1.85));
  }

  @Test
  public void testCalculateBMI4() {
    assertEquals("Béo phì", Week4.calculateBMI(105.7, 1.72));
  }

  @Test
  public void testCalculateBMI5() {
    assertEquals("Bình thường", Week4.calculateBMI(45, 1.55));
  }
}
