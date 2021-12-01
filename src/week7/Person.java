package week7;

import java.util.ArrayList;
import java.util.List;

public class Person {
  private String name;
  private String address;
  private List<Vehicle> vehicleList = new ArrayList<>();

  /**
   * Instantiates a new person.
   *
   * @param name the name
   * @param address the address
   */
  public Person(String name, String address) {
    this.setName(name);
    this.setAddress(address);
  }

  /**
   * Add vehicle.
   *
   * @param vehicle the vehicle
   */
  public void addVehicle(Vehicle vehicle) {
    vehicleList.add(vehicle);
  }

  /**
   * Removes the vehicle.
   *
   * @param registrationNumber the registration number
   */
  public void removeVehicle(String registrationNumber) {
    for (int i = 0; i < vehicleList.size(); i++) {
      if (vehicleList.get(i).getRegistrationNumber().equals(registrationNumber)) {
        vehicleList.remove(i);
        break;
      }
    }
  }

  /**
   * Gets the vehicle info.
   *
   * @return the vehicle info
   */
  public String getVehiclesInfo() {
    if (vehicleList.isEmpty()) {
      return name + " has no vehicle!";
    }
    String s = name + " has:\n\n";
    for (int i = 0; i < vehicleList.size(); i++) {
      s += vehicleList.get(i).getInfo();
    }
    return s;
  }

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
}
