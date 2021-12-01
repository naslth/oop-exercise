package week6;

import java.util.ArrayList;
import java.util.List;

public class Layer {
  private List<Shape> shapes = new ArrayList<>();

  /**
   * Adds the shape.
   *
   * @param shape the shape
   */
  public void addShape(Shape shape) {
    shapes.add(shape);
  }

  /**
   * Removes the circles.
   */
  public void removeCircles() {
    for (int i = 0; i < shapes.size(); i++) {
      if (shapes.get(i) instanceof Circle) {
        shapes.remove(i);
      }
    }
  }

  /**
   * Gets the info.
   *
   * @return the info
   */
  public String getInfo() {
    String res = "Layer of crazy shapes:";
    for (Shape s : shapes) {
      res += "\n" + s.toString();
    }
    return res;
  }

  /**
   * Removes the duplicates.
   */
  public void removeDuplicates() {
    for (int i = 0; i < shapes.size() - 1; i++) {
      for (int j = i + 1; j < shapes.size(); j++) {
        if (shapes.get(j).equals(shapes.get(i))
            && shapes.get(j).hashCode() == shapes.get(i).hashCode()) {
          shapes.remove(j);
        }
      }
    }
  }
}
