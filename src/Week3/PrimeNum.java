package Week3;

// TODO: Auto-generated Javadoc
/**
 * The Class PrimeNum.
 */
public class PrimeNum {

  /**
   * Checks if is prime.
   *
   * @param n the n
   * @return true, if is prime
   */
  public boolean isPrime(int n) {
    if (n < 2) {
      return false;
    } else if (n == 2) {
      return true;
    } else {
      for (int i = 3; i < Math.sqrt(n); i = i + 2) {
        if (n % i == 0) {
          return false;
        }
      }
      return true;
    }
  }
}
