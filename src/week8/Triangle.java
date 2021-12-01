package week8;

public class Triangle implements GeometricObject {
  private Point p1;
  private Point p2;
  private Point p3;

  /**
   * Instantiates a new triangle.
   *
   * @param p1 the p 1
   * @param p2 the p 2
   * @param p3 the p 3
   * @throws RuntimeException the runtime exception
   */
  public Triangle(Point p1, Point p2, Point p3) throws RuntimeException {
    double s1 = p1.distance(p2);
    double s2 = p2.distance(p3);
    double s3 = p3.distance(p1);
    if (s1 + s2 == s3 || s2 + s3 == s1 || s1 + s3 == s2) {
      throw new RuntimeException("Invalid points");
    } else if (p1.equals(p2) || p2.equals(p3) || p3.equals(p1)) {
      throw new RuntimeException("Invalid points");
    } else {
      this.p1 = p1;
      this.p2 = p2;
      this.p3 = p3;
    }
  }

  /**
   * Gets the p1.
   *
   * @return the p1
   */
  public Point getP1() {
    return p1;
  }

  /**
   * Gets the p2.
   *
   * @return the p2
   */
  public Point getP2() {
    return p2;
  }

  /**
   * Gets the p3.
   *
   * @return the p3
   */
  public Point getP3() {
    return p3;
  }

  /**
   * Gets the area.
   *
   * @return the area
   */
  @Override
  public double getArea() {
    double s1 = p1.distance(p2);
    double s2 = p2.distance(p3);
    double s3 = p3.distance(p1);
    double halfp = this.getPerimeter() / 2;
    return Math.sqrt(halfp * (halfp - s1) * (halfp - s2) * (halfp - s3));
  }

  /**
   * Gets the perimeter.
   *
   * @return the perimeter
   */
  @Override
  public double getPerimeter() {
    return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
  }

  /**
   * Gets the info.
   *
   * @return the info
   */
  @Override
  public String getInfo() {
    return "Triangle[" + p1.toString() + "," + p2.toString() + "," + p3.toString() + "]";
  }
}
