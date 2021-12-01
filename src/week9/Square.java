package week9;

// TODO: Auto-generated Javadoc
/**
 * The Class Square.
 */
public class Square extends Expression {
  private Expression expression;

  /**
   * Instantiates a new square.
   *
   * @param exp the exp
   */
  public Square(Expression exp) {
    expression = exp;
  }

  /**
   * To string.
   *
   * @return the string
   */
  @Override
  public String toString() {
    return "(" + expression.toString() + ") ^ 2";
  }

  /**
   * Evaluate.
   *
   * @return the double
   */
  @Override
  public double evaluate() {
    return expression.evaluate() * expression.evaluate();
  }
}
