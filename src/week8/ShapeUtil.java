package week8;

import java.util.List;

public class ShapeUtil {
  /**
   * Prints the info.
   *
   * @param shapes the shapes
   * @return the string
   */
  public String printInfo(List<GeometricObject> shapes) {
    String c = "Circle:\n";
    String t = "Triangle:\n";
    for (GeometricObject i : shapes) {
      if (i instanceof Circle) {
        c += i.getInfo() + "\n";
      } else {
        t += i.getInfo() + "\n";
      }
    }
    return c + t;
  }
}
