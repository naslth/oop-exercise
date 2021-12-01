package week8;

public class Point {
  private double pointX;
  private double pointY;

  /**
   * Instantiates a new point.
   *
   * @param pointX the point X
   * @param pointY the point Y
   */
  public Point(double pointX, double pointY) {
    this.pointX = pointX;
    this.pointY = pointY;
  }

  /**
   * Gets the point X.
   *
   * @return the point X
   */
  public double getPointX() {
    return pointX;
  }

  /**
   * Sets the point X.
   *
   * @param pointX the new point X
   */
  public void setPointX(double pointX) {
    this.pointX = pointX;
  }

  /**
   * Gets the point Y.
   *
   * @return the point Y
   */
  public double getPointY() {
    return pointY;
  }

  /**
   * Sets the point Y.
   *
   * @param pointY the new point Y
   */
  public void setPointY(double pointY) {
    this.pointY = pointY;
  }

  /**
   * Distance.
   *
   * @param other the other
   * @return the double
   */
  public double distance(Point other) {
    return Math.sqrt((Math.pow(pointX - other.pointX, 2)) + (Math.pow(pointY - other.pointY, 2)));
  }

  /**
   * To string.
   *
   * @return the string
   */
  @Override
  public String toString() {
    return String.format("(%.2f,%.2f)", this.pointX, this.pointY);
  }
}
