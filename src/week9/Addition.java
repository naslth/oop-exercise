package week9;

// TODO: Auto-generated Javadoc
/**
 * The Class Addition.
 */
public class Addition extends BinaryExpression {
  /**
   * Instantiates a new addition.
   *
   * @param left the left
   * @param right the right
   */
  public Addition(Expression left, Expression right) {
    super(left, right);
  }

  /**
   * To string.
   *
   * @return the string
   */
  @Override
  public String toString() {
    return "(" + left.toString() + " + " + right.toString() + ")";
  }

  /**
   * Evaluate.
   *
   * @return the double
   */
  @Override
  public double evaluate() {
    return left.evaluate() + right.evaluate();
  }
}
