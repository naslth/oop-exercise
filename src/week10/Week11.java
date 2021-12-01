package week10;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Week11<T extends Comparable<T>> implements Comparator<T> {
  public static <T extends Comparable<T>> List<T> sortGeneric(List<T> arr) {
    Collections.sort(arr, new Week11<T>());
    return arr;
  }

  @Override
  public int compare(T o1, T o2) {
    return o1.compareTo(o2);
  }
}
