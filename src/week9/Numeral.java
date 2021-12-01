package week9;

// TODO: Auto-generated Javadoc
/**
 * The Class Numeral.
 */
public class Numeral extends Expression {

  /** The value. */
  private double value;

  /**
   * Instantiates a new numeral.
   *
   * @param val the value
   */
  public Numeral(double value) {
    this.value = value;
  }

  /**
   * Instantiates a new numeral.
   */
  Numeral() {}

  /**
   * To string.
   *
   * @return the string
   */
  @Override
  public String toString() {
    if (value == (int) value) {
      return "" + (int) value;
    }
    return "" + value;
  }

  /**
   * Evaluate.
   *
   * @return the double
   */
  @Override
  public double evaluate() {
    return value;
  }
}
