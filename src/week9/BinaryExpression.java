package week9;

// TODO: Auto-generated Javadoc
/**
 * The Class BinaryExpression.
 */
public abstract class BinaryExpression extends Expression {
  protected Expression left;
  protected Expression right;

  /**
   * Instantiates a new binary expression.
   *
   * @param left the left
   * @param right the right
   */
  public BinaryExpression(Expression left, Expression right) {
    this.left = left;
    this.right = right;
  }
}
