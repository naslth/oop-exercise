package week8;

public class Circle implements GeometricObject {
  public static final double PI = 3.14;
  private double radius;
  private Point center;

  /**
   * Instantiates a new circle.
   *
   * @param point the point
   * @param radius the radius
   */
  public Circle(Point point, double radius) {

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

  public double getArea() {
    return PI * radius * radius;
  }

  /**
   * Gets the perimeter.
   *
   * @return the perimeter
   */

  public double getPerimeter() {
    return 2 * PI * radius;
  }

  /**
   * Gets the info.
   *
   * @return the info
   */
  @Override
  public String getInfo() {
    return "Circle[" + center.toString() + String.format(",r=%.2f]", this.radius);
  }
}
