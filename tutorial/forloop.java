public class Main {
 public static void main(String[] args) {
  //Outer loop
  for (int i = 1; i<=2; i++) {
   System.out.println("Outer: " + i);//Executes 2 times
   //Inner loop
   for (int j = 1; j<= 3; j++) {
    System.out.println(" Inner: " + j); // Executes 6 times (2*3)
   }
  }
  //==========================printing arrays=========================
  String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
  for (String i : cars) {
   System.out.println(i);
  }
  //there is also 'break' statement in for loop which is like switch and stops in the given value
  //'continue' statement however does the exact opposite and skips the given value.
 }
}