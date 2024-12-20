/*
 OOP stands for Object-Oriented Programming.

 Procedural programming is about writing procedures or methods that perform operations on the data, while object-oriented programming is about creating objects that contain both data and methods.

 Object-oriented programming has several advantages over procedural programming:

   *OOP is faster and easier to execute
   *OOP provides a clear structure for the programs
   *OOP helps to keep the Java code DRY "Don't Repeat Yourself", and makes the code easier to
       maintain, modify and debug
   *OOP makes it possible to create full reusable applications with less code and shorter
       development time
 Tip: The "Don't Repeat Yourself" (DRY) principle is about reducing the repetition of code. You should extract out the codes that are common for the application, and place them at a single place and reuse them instead of repeating it.
*/
public class Main {
 int x = 5;
 public static void main(String[] args) {
  Main myObj1 = new Main(); // Object 1
  Main myObj2 = new Main(); // Object 2
  System.out.println(myObj1.x);
  System.out.println(myObj2.x); 
 }
}

//using different classes

/*class Second {
 
 public static void main(String[] args) {
  System.out.println("========================Different class==========================");
  Main myObj1 = new Main(); // Object 1
  Main myObj2 = new Main(); // Object 2
  System.out.println(myObj1.x);
  System.out.println(myObj2.x); 
 }
}*/

// public and static method difference is that static can be called without creating an object while public class cannot