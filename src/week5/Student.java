package week5;

// TODO: Auto-generated Javadoc
/**
 * The Class Student.
 */
public class Student extends Person {

  /** The program. */
  private String program;

  /** The year. */
  private int year;

  /** The fee. */
  private double fee;

  /**
   * Instantiates a new student.
   *
   * @param name the name
   * @param address the address
   * @param program the program
   * @param year the year
   * @param fee the fee
   */
  public Student(String name, String address, String program, int year, double fee) {
    super(name, address);
    this.program = program;
    this.year = year;
    this.fee = fee;
  }

  /**
   * Gets the program.
   *
   * @return the program
   */
  public String getProgram() {
    return program;
  }

  /**
   * Sets the program.
   *
   * @param program the new program
   */
  public void setProgram(String program) {
    this.program = program;
  }

  /**
   * Gets the year.
   *
   * @return the year
   */
  public int getYear() {
    return year;
  }

  /**
   * Sets the year.
   *
   * @param year the new year
   */
  public void setYear(int year) {
    this.year = year;
  }

  /**
   * Gets the fee.
   *
   * @return the fee
   */
  public double getFee() {
    return fee;
  }

  /**
   * Sets the fee.
   *
   * @param fee the new fee
   */
  public void setFee(double fee) {
    this.fee = fee;
  }

  /**
   * To string.
   *
   * @return the string
   */
  @Override
  public String toString() {
    return "Student[" + super.toString() + ",program=" + this.program + ",year="
        + Integer.toString(this.year) + ",fee=" + Double.toString(this.fee) + "]";
  }
}
