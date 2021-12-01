package week6;

public abstract class Shape {
  protected String color;
  protected boolean filled;

  /**
   * Instantiates a new shape.
   */
  public Shape() {}

  /**
   * Instantiates a new shape.
   *
   * @param color the color
   * @param filled the filled
   */
  public Shape(String color, boolean filled) {
    this.color = color;
    this.filled = filled;
  }

  /**
   * Gets the color.
   *
   * @return the color
   */
  public String getColor() {
    return color;
  }

  /**
   * Sets the color.
   *
   * @param color the new color
   */
  public void setColor(String color) {
    this.color = color;
  }

  /**
   * Checks if is filled.
   *
   * @return true, if is filled
   */
  public boolean isFilled() {
    return filled;
  }

  /**
   * Sets the filled.
   *
   * @param filled the new filled
   */
  public void setFilled(boolean filled) {
    this.filled = filled;
  }

  /**
   * Gets the area.
   *
   * @return the area
   */
  public abstract double getArea();

  /**
   * Gets the perimeter.
   *
   * @return the perimeter
   */
  public abstract double getPerimeter();

  /**
   * To string.
   *
   * @return the string
   */
  @Override
  public String toString() {
    return "Shape[color=" + this.color + ", filled=" + this.filled + "]";
  }
}
