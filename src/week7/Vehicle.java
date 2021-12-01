package week7;

public abstract class Vehicle {
  protected String brand;
  protected String model;
  protected String registrationNumber;
  protected Person owner;

  /**
   * Instantiates a new vehicle.
   *
   * @param brand the brand
   * @param model the model
   * @param registrationNumber the registration number
   * @param owner the owner
   */
  public Vehicle(String brand, String model, String registrationNumber, Person owner) {
    this.brand = brand;
    this.model = model;
    this.registrationNumber = registrationNumber;
    this.owner = owner;
  }

  /**
   * Gets the info.
   *
   * @return the info
   */
  public abstract String getInfo();

  /**
   * Transfer ownership.
   *
   * @param newOwner the new owner
   */
  public void transferOwnership(Person newOwner) {
    owner = newOwner;
  }

  /**
   * Gets the brand.
   *
   * @return the brand
   */
  public String getBrand() {
    return brand;
  }

  /**
   * Sets the brand.
   *
   * @param brand the new brand
   */
  public void setBrand(String brand) {
    this.brand = brand;
  }

  /**
   * Gets the model.
   *
   * @return the model
   */
  public String getModel() {
    return model;
  }

  /**
   * Sets the model.
   *
   * @param model the new model
   */
  public void setModel(String model) {
    this.model = model;
  }

  /**
   * Gets the registration number.
   *
   * @return the registration number
   */
  public String getRegistrationNumber() {
    return registrationNumber;
  }

  /**
   * Sets the registration number.
   *
   * @param registrationNumber the new registration number
   */
  public void setRegistrationNumber(String registrationNumber) {
    this.registrationNumber = registrationNumber;
  }

  /**
   * Gets the owner.
   *
   * @return the owner
   */
  public Person getOwner() {
    return owner;
  }

  /**
   * Sets the owner.
   *
   * @param owner the new owner
   */
  public void setOwner(Person owner) {
    this.owner = owner;
  }
}
