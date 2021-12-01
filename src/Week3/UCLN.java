package Week3;

import java.util.Scanner;

public class UCLN {

  /**
   * Find GCD of 2 number.
   *
   * @param a the a
   * @param b the b
   * @return the gcd
   */
  public static int gcd(int a, int b) {
    while (b != 0) {
      int temp = a % b;
      a = b;
      b = temp;
    }
    return (a > 0) ? a : -a;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.print(gcd(a, b));

  }
}
