package Week3;

// TODO: Auto-generated Javadoc
/**
 * The Class Fibonacci.
 */
public class Fibonacci {

  /**
   * Fibonacci.
   *
   * @param n the n
   * @return the long
   */
  public static long fibonacci(long n) {
    if (n < 0) {
      return -1;
    } else if (n == 0) {
      return 0;
    } else if (n == 1) {
      return 1;
    } else {
      long nums1 = 0;
      long nums2 = 1;
      long fibonacci = 0;
      for (int i = 2; i <= n; i++) {
        if (nums1 > Long.MAX_VALUE / 2) {
          return Long.MAX_VALUE;
        }
        fibonacci = nums1 + nums2;
        nums1 = nums2;
        nums2 = fibonacci;
      }
      return fibonacci;
    }
  }
}
