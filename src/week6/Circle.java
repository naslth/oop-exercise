package week6;

// TODO: Auto-generated Javadoc
/**
 * The Class Circle.
 */
public class Circle extends Shape {
  protected double radius;
  protected Point center;

  /**
   * Instantiates a new circle.
   */
  public Circle() {}

  /**
   * Instantiates a new circle.
   *
   * @param radius the radius
   */
  public Circle(double radius) {
    this.radius = radius;
  }

  /**
   * Instantiates a new circle.
   *
   * @param radius the radius
   * @param color the color
   * @param filled the filled
   */
  public Circle(double radius, String color, boolean filled) {
    super(color, filled);
    this.radius = radius;
  }

  /**
   * Instantiates a new circle.
   *
   * @param point the point
   * @param radius the radius
   * @param color the color
   * @param filled the filled
   */
  public Circle(Point point, double radius, String color, boolean filled) {
    super(color, filled);
    this.center = point;
    this.radius = radius;
  }

  /**
   * Gets the radius.
   *
   * @return the radius
   */
  public double getRadius() {
    return radius;
  }

  /**
   * Sets the radius.
   *
   * @param radius the new radius
   */
  public void setRadius(double radius) {
    this.radius = radius;
  }

  /**
   * Gets the center.
   *
   * @return the center
   */
  public Point getCenter() {
    return center;
  }

  /**
   * Sets the center.
   *
   * @param center the new center
   */
  public void setCenter(Point center) {
    this.center = center;
  }

  /**
   * Gets the area.
   *
   * @return the area
   */
  @Override
  public double getArea() {
    return Math.PI * radius * radius;
  }

  /**
   * Gets the perimeter.
   *
   * @return the perimeter
   */
  @Override
  public double getPerimeter() {
    return 2 * Math.PI * radius;
  }

  /**
   * To string.
   *
   * @return the string
   */
  @Override
  public String toString() {
    return "Circle[center=" + center.toString() + ",radius=" + this.radius + ",color=" + super.color
        + ",filled=" + super.filled + "]";
  }

  /**
   * Hash code.
   *
   * @return the int
   */
  @Override
  public int hashCode() {
    return center.hashCode();
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
    if (!(obj instanceof Circle)) {
      return false;
    }
    Circle other = (Circle) obj;
    return Math.abs(this.radius - other.radius) <= 0.001;
  }
}
