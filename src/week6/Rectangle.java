package week6;

public class Rectangle extends Shape {
  protected double width;
  protected double length;
  protected Point topLeft;

  /**
   * Instantiates a new rectangle.
   */
  public Rectangle() {}

  /**
   * Instantiates a new rectangle.
   *
   * @param width the width
   * @param length the length
   */
  public Rectangle(double width, double length) {
    this.width = width;
    this.length = length;
  }

  /**
   * Instantiates a new rectangle.
   *
   * @param width the width
   * @param length the length
   * @param color the color
   * @param filled the filled
   */
  public Rectangle(double width, double length, String color, boolean filled) {
    super(color, filled);
    this.width = width;
    this.length = length;
  }

  /**
   * Instantiates a new rectangle.
   *
   * @param point the point
   * @param width the width
   * @param length the length
   * @param color the color
   * @param filled the filled
   */
  public Rectangle(Point point, double width, double length, String color, boolean filled) {
    super(color, filled);
    this.topLeft = point;
    this.width = width;
    this.length = length;
  }

  /**
   * Gets the width.
   *
   * @return the width
   */
  public double getWidth() {
    return width;
  }

  /**
   * Sets the width.
   *
   * @param width the new width
   */
  public void setWidth(double width) {
    this.width = width;
  }

  /**
   * Gets the length.
   *
   * @return the length
   */
  public double getLength() {
    return length;
  }

  /**
   * Sets the length.
   *
   * @param length the new length
   */
  public void setLength(double length) {
    this.length = length;
  }

  /**
   * Gets the top left.
   *
   * @return the top left
   */
  public Point getTopLeft() {
    return topLeft;
  }

  /**
   * Sets the top left.
   *
   * @param topLeft the new top left
   */
  public void setTopLeft(Point topLeft) {
    this.topLeft = topLeft;
  }

  /**
   * Gets the area.
   *
   * @return the area
   */
  @Override
  public double getArea() {
    return length * width;
  }

  /**
   * Gets the perimeter.
   *
   * @return the perimeter
   */
  @Override
  public double getPerimeter() {
    return 2 * (length + width);
  }

  /**
   * To string.
   *
   * @return the string
   */
  @Override
  public String toString() {
    return "Rectangle[topLeft=" + topLeft.toString() + ",width=" + this.width + ",length="
        + this.length + ",color=" + super.color + ",filled=" + super.filled + "]";
  }

  /**
   * Hash code.
   *
   * @return the int
   */
  @Override
  public int hashCode() {
    return topLeft.hashCode();
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
    if (!(obj instanceof Rectangle)) {
      return false;
    }
    Rectangle other = (Rectangle) obj;
    return (Math.abs(this.length - other.length) <= 0.001)
        && (Math.abs(this.width - other.width) <= 0.001);
  }
}
