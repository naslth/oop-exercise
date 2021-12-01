package Week3;

// TODO: Auto-generated Javadoc
/**
 * The Class Solution.
 */
public class Solution {
  private int numerator;
  private int denominator = 1;

  /**
   * Gets the numerator.
   *
   * @return the numerator
   */
  public int getNumerator() {
    return numerator;
  }

  /**
   * Sets the numerator.
   *
   * @param numerator the new numerator
   */
  public void setNumerator(int numerator) {
    this.numerator = numerator;
  }

  /**
   * Gets the denominator.
   *
   * @return the denominator
   */
  public int getDenominator() {
    return denominator;
  }

  /**
   * Sets the denominator.
   *
   * @param denominator the new denominator
   */
  public void setDenominator(int denominator) {
    if (denominator != 0) {
      this.denominator = denominator;
    }
  }

  /**
   * Instantiates a new solution.
   */
  Solution() {}

  /**
   * Instantiates a new solution.
   *
   * @param numerator the numerator
   * @param denominator the denominator
   */
  Solution(int numerator, int denominator) {
    this.numerator = numerator;
    if (denominator != 0) {
      this.denominator = denominator;
    }
  }

  /**
   * Reduce.
   */
  public Solution reduce() {
    int a = this.numerator;
    int b = this.denominator;
    while (b != 0) {
      int temp = a % b;
      a = b;
      b = temp;
    }
    this.numerator /= a;
    this.denominator /= a;
    return this;
  }

  /**
   * Adds.
   *
   * @param other the other
   */
  public Solution add(Solution other) {
    this.numerator = this.numerator * other.denominator + other.numerator * this.denominator;
    this.denominator = this.denominator * other.denominator;
    reduce();
    return this;
  }

  /**
   * Subtract.
   *
   * @param other the other
   */
  public Solution subtract(Solution other) {
    this.numerator = this.numerator * other.denominator - other.numerator * this.denominator;
    this.denominator = this.denominator * other.denominator;
    reduce();
    return this;
  }

  /**
   * Multiply.
   *
   * @param other the other
   */
  public Solution multiply(Solution other) {
    this.numerator *= other.numerator;
    this.denominator *= other.denominator;
    reduce();
    return this;
  }

  /**
   * Divide.
   *
   * @param other the other
   */
  public Solution divide(Solution other) {
    if (other.numerator != 0) {
      this.numerator *= other.denominator;
      this.denominator *= other.numerator;
      reduce();
    }
    return this;
  }

  /**
   * Equals.
   *
   * @param obj the obj
   * @return true, if successful
   */
  public boolean equals(Object obj) {
    if (obj instanceof Solution) {
      Solution other = (Solution) obj;
      reduce();
      other.reduce();
      if (this.numerator == other.numerator && this.denominator == other.denominator) {
        return true;
      }
      return false;
    }
    return false;
  }

  public static void main(String[] args) {
    Solution test = new Solution(5, 0);
    System.out.print(test.getDenominator());
  }
}
