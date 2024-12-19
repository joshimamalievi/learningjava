import java.util.Scanner;

public class Main {
 enum Level {
  LOW,
  MEDIUM,
  HIGH
 }
 public static void main(String[] args) {
  Level myVar = Level.MEDIUM;
  //System.out.println(myVar); outputs MEDIUM

  switch (myVar) {
   case LOW:
    System.out.println("LEVEL IS LOW");
    break;
   case MEDIUM:
    System.out.println("LEVEL IS MEDIUM");
    break;
   case HIGH:
    System.out.println("LEVEL IS HIGH");
    break;
  }

  for(Level myLevel : Level.values()) {
   System.out.println(myLevel);
  }

  Scanner myObj = new Scanner(System.in);
  System.out.println("My Name");

  String myName = myObj.nextLine();
  System.out.println("Your Name is: " + myName + " and your level is " + myVar);
 }
}