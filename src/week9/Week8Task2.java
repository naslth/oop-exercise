package week9;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Week8Task2 {
  /**
   * Null pointer ex.
   */
  public void nullPointerEx() {
    Integer i = null;
    int j = i;
  }

  /**
   * Null pointer ex test.
   *
   * @return the string
   */
  public String nullPointerExTest() {
    try {
      nullPointerEx();
    } catch (NullPointerException e) {
      return "Lỗi Null Pointer";
    }
    return "Không có lỗi";
  }

  /**
   * Array index out of bounds ex.
   */
  public void arrayIndexOutOfBoundsEx() {
    int[] a = {0};
    int i = a[1];
  }

  /**
   * Array index out of bounds ex test.
   *
   * @return the string
   */
  public String arrayIndexOutOfBoundsExTest() {
    try {
      arrayIndexOutOfBoundsEx();
    } catch (ArrayIndexOutOfBoundsException e) {
      return "Lỗi Array Index Out of Bounds";
    }
    return "Không có lỗi";
  }

  /**
   * Arithmetic ex.
   */
  public void arithmeticEx() {
    int i = 1 / 0;
  }

  /**
   * Arithmetic ex test.
   *
   * @return the string
   */
  public String arithmeticExTest() {
    try {
      arithmeticEx();
    } catch (ArithmeticException e) {
      return "Lỗi Arithmetic";
    }
    return "Không có lỗi";
  }

  /**
   * File not found ex.
   *
   * @throws FileNotFoundException the file not found exception
   */
  public void fileNotFoundEx() throws FileNotFoundException {
    FileReader fr = new FileReader("test.txt");
  }

  /**
   * File not found ex test.
   *
   * @return the string
   */
  public String fileNotFoundExTest() {
    try {
      fileNotFoundEx();
    } catch (FileNotFoundException e) {
      return "Lỗi File Not Found";
    }
    return "Không có lỗi";
  }

  /**
   * Io ex.
   *
   * @throws IOException Signals that an I/O exception has occurred.
   */
  public void ioEx() throws IOException {
    throw new IOException();
  }

  /**
   * Io ex test.
   *
   * @return the string
   */
  public String ioExTest() {
    try {
      ioEx();
    } catch (IOException e) {
      return "Lỗi IO";
    }
    return "Không có lỗi";
  }
}
