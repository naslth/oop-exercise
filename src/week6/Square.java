package week6;

public class Square extends Rectangle {
  /**
   * Instantiates a new square.
   */
  public Square() {}

  /**
   * Instantiates a new square.
   *
   * @param side the side
   */
  public Square(double side) {
    super(side, side);
  }

  /**
   * Instantiates a new square.
   *
   * @param side the side
   * @param color the color
   * @param filled the filled
   */
  public Square(double side, String color, boolean filled) {
    super(side, side, color, filled);
  }

  /**
   * Instantiates a new square.
   *
   * @param point the point
   * @param side the side
   * @param color the color
   * @param filled the filled
   */
  public Square(Point point, double side, String color, boolean filled) {
    super(point, side, side, color, filled);
  }

  /**
   * Gets the side.
   *
   * @return the side
   */
  public double getSide() {
    return super.getWidth();
  }

  /**
   * Sets the side.
   *
   * @param side the new side
   */
  public void setSide(double side) {
    super.setLength(side);
    super.setWidth(side);
  }

  /**
   * Sets the width.
   *
   * @param side the new width
   */
  @Override
  public void setWidth(double side) {
    super.setLength(side);
    super.setWidth(side);
  }

  /**
   * Sets the length.
   *
   * @param side the new length
   */
  @Override
  public void setLength(double side) {
    super.setLength(side);
    super.setWidth(side);
  }

  /**
   * To string.
   *
   * @return the string
   */
  @Override
  public String toString() {
    return "Square[topLeft=" + topLeft.toString() + ",side=" + this.getSide() + ",color="
        + super.color + ",filled=" + super.filled + "]";
  }

  /**
   * Equals.
   *
   * @param obj the obj
   * @return true, if successful
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Square)) {
      return false;
    }
    Square other = (Square) obj;
    return (Math.abs(this.getSide() - other.getSide()) <= 0.001);
  }
}
