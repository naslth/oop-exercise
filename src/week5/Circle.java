package week5;

public class Circle {
  private double radius = 1.0;
  private String color = "red";
  protected static final double PI = 3.14;

  public Circle() {}

  public Circle(double radius) {
    this.setRadius(radius);
  }

  public Circle(double radius, String color) {
    this.setRadius(radius);
    this.setColor(color);
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public double getArea() {
    return PI * radius * radius;
  }

  @Override
  public String toString() {
    return "Circle[radius=" + Double.toString(this.radius) + ",color=" + this.color + "]";
  }
}
