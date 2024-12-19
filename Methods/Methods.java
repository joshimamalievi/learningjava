public class Main {
 static void myMethod() {//this acts like functions in c
   System.out.println("First Method");
 }
 //returning values
 static int returnMethod(int x, int y) {
  return x + y;
 }
 public static void main(String[] args) {
  int mySum = sum(5, 10);
  myMethod();
  System.out.println(returnMethod(5, 2));//returns the value and prints it
   System.out.println("===============================Method Recursion=============================");
  System.out.println(mySum);
 }
 public static int sum(int start, int end) {
    
    if (end > start) {
      return end + sum(start, end - 1);
    } else {
      return end;
    }
 }
 // a function can call itself. this is called method recursion.
}
 