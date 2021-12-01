package week10;

public class Person implements Comparable {
  public String name;
  public int age;
  public String address;

  /**
   * Gets the name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the name.
   *
   * @param name the new name
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Gets the age.
   *
   * @return the age
   */
  public int getAge() {
    return age;
  }

  /**
   * Sets the age.
   *
   * @param age the new age
   */
  public void setAge(int age) {
    this.age = age;
  }

  /**
   * Gets the address.
   *
   * @return the address
   */
  public String getAddress() {
    return address;
  }

  /**
   * Sets the address.
   *
   * @param address the new address
   */
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * Compare to.
   *
   * @param o the o
   * @return the int
   */
  @Override
  public int compareTo(Object o) {
    Person other = (Person) o;
    if (this.name.compareTo(other.name) != 0) {
      return this.name.compareTo(other.name);
    }
    return this.age > other.age ? 1 : -1;
  }
}
