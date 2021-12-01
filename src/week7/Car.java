package week7;

public class Car extends Vehicle {
  private int numberOfDoors;

  /**
   * Instantiates a new car.
   *
   * @param brand the brand
   * @param model the model
   * @param registrationNumber the registration number
   * @param owner the owner
   * @param numberOfDoors the number of doors
   */
  public Car(String brand, String model, String registrationNumber, Person owner,
      int numberOfDoors) {
    super(brand, model, registrationNumber, owner);
    this.numberOfDoors = numberOfDoors;
  }

  /**
   * Gets the info.
   *
   * @return the info
   */
  @Override
  public String getInfo() {
    String res = "Car:\n\t";
    res += "Brand: " + super.brand + "\n\t";
    res += "Model: " + super.model + "\n\t";
    res += "Registration Number: " + super.registrationNumber + "\n\t";
    res += "Number of Doors: " + this.numberOfDoors + "\n\t";
    res += "Belongs to " + super.owner.getName() + " - " + super.owner.getAddress() + "\n";
    return res;
  }

  /**
   * Gets the number of doors.
   *
   * @return the number of doors
   */
  public int getNumberOfDoors() {
    return numberOfDoors;
  }

  /**
   * Sets the number of doors.
   *
   * @param numberOfDoors the new number of doors
   */
  public void setNumberOfDoors(int numberOfDoors) {
    this.numberOfDoors = numberOfDoors;
  }
}
