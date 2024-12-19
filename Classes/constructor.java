/*
 ====================================Java Constructors=========================================
 A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes:
 */


// Create a Main class
public class Main {
  int modelYear; 
  String modelName; // Create a class attribute

  // Create a class constructor for the Main class
  public Main(int year, String name) {
    modelYear = year;
    modelName = name;
  }

  public static void main(String[] args) {
    Main myCar = new Main(2003,"Honda Accord"); // Create an object of class Main (This will call the constructor)
    System.out.println(myCar.modelYear + " " + myCar.modelName); // Print the value of x
  }
}

// Outputs 5