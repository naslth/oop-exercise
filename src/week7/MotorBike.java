package week7;

public class MotorBike extends Vehicle {
  private boolean hasSidecar;

  /**
   * Instantiates a new motor bike.
   *
   * @param brand the brand
   * @param model the model
   * @param registrationNumber the registration number
   * @param owner the owner
   * @param hasSidecar the has sidecar
   */
  public MotorBike(String brand, String model, String registrationNumber, Person owner,
      boolean hasSidecar) {
    super(brand, model, registrationNumber, owner);
    this.hasSidecar = hasSidecar;
  }

  /**
   * Gets the info.
   *
   * @return the info
   */
  @Override
  public String getInfo() {
    String s = "Motor Bike:\n\t";
    s += "Brand: " + super.brand + "\n\t";
    s += "Model: " + super.model + "\n\t";
    s += "Registration Number: " + super.registrationNumber + "\n\t";
    s += "Has Side Car: " + this.hasSidecar + "\n\t";
    s += "Belongs to " + super.owner.getName() + " - " + super.owner.getAddress() + "\n";
    return s;
  }

  /**
   * Checks if is checks for sidecar.
   *
   * @return true, if is checks for sidecar
   */
  public boolean isHasSidecar() {
    return hasSidecar;
  }

  /**
   * Sets the checks for sidecar.
   *
   * @param hasSidecar the new checks for sidecar
   */
  public void setHasSidecar(boolean hasSidecar) {
    this.hasSidecar = hasSidecar;
  }
}
