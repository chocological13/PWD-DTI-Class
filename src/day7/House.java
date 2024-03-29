package src.day7;

public class House {
  // Instances variables // field
  private String address;
  private int houseNumber;
  private boolean hasGarage;

  // Constructor to initialize the instance variables
  public House (String address, int houseNumber, boolean hasGarage) {
    this.address = address;
    this.houseNumber = houseNumber;
    this.hasGarage = hasGarage;
  }

  // Instance method to print house details
  public void printDetails() {
    System.out.println("Address: " + address);
    System.out.println("House Number: " + houseNumber);
    System.out.println("Has Garage: " + (hasGarage ? "yes" : "no"));
  }

  // Main method to test the house class
  public static void main(String[] args) {

  }
}
