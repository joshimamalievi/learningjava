import java.time.LocalDate; // import the LocalDate class
import java.time.LocalTime; // import the LocalTime class
import java.time.LocalDateTime; // import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

public class Main {
  public static void main(String[] args) {
    LocalDate myObj = LocalDate.now(); // Create a date object
    System.out.println(myObj); // Display the current date
    LocalTime myObj2 = LocalTime.now();
    System.out.println(myObj2);
    LocalDateTime myObj3 = LocalDateTime.now();
    System.out.println(myObj3);
    System.out.println("Before formatting: " + myObj3);
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    String formattedDate = myObj3.format(myFormatObj);
    System.out.println("After formatting: " + formattedDate);
  }
}
