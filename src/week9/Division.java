package week9;

// TODO: Auto-generated Javadoc
/**
 * The Class Division.
 */
public class Division extends BinaryExpression {
  /**
   * Instantiates a new division.
   *
   * @param left the left
   * @param right the right
   */
  public Division(Expression left, Expression right) {
    super(left, right);
  }

  /**
   * To string.
   *
   * @return the string
   */
  @Override
  public String toString() {
    return "(" + left.toString() + " / " + right.toString() + ")";
  }

  /**
   * Evaluate.
   *
   * @return the double
   */
  @Override
  public double evaluate() {
    if (right.evaluate() == 0) {
      throw new ArithmeticException("Lỗi chia cho 0");
    }
    return left.evaluate() / right.evaluate();
  }
}
