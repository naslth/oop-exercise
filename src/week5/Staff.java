package week5;

public class Staff extends Person {
  private String school;
  private double pay;

  /**
   * Instantiates a new staff.
   *
   * @param name the name
   * @param address the address
   * @param school the school
   * @param pay the pay
   */
  public Staff(String name, String address, String school, double pay) {
    super(name, address);
    this.school = school;
    this.pay = pay;
  }

  public String getSchool() {
    return school;
  }

  /**
   * Sets the school.
   *
   * @param school the new school
   */
  public void setSchool(String school) {
    this.school = school;
  }

  /**
   * Gets the pay.
   *
   * @return the pay
   */
  public double getPay() {
    return pay;
  }

  /**
   * Sets the pay.
   *
   * @param pay the new pay
   */
  public void setPay(double pay) {
    this.pay = pay;
  }

  /**
   * To string.
   *
   * @return the string
   */
  @Override
  public String toString() {
    return "Staff[" + super.toString() + ",school=" + this.school + ",pay="
        + Double.toString(this.pay) + "]";
  }
}
