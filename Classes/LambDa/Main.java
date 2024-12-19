//LAMBDA================================================================
/*
 * The simplest lambda expression contains a single parameter and an expression: parameter -> expression
 * To use more than one parameter, wrap them in parentheses: (parameter, parameter) -> expression
 * Expressions are limited. They have to immediately return a value, and they cannot contain variables, assignments or statements such as if or for. In order to do more complex operations, a code block can be used with curly braces. If the lambda expression needs to return a value, then the code block should have a return statement.: (parameter, parameter) -> {code block}
 * 
 */

//import java.util.ArrayList;
//import java.util.function.Consumer;
/*
public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(5);
    numbers.add(9);
    numbers.add(8);
    numbers.add(1);
    //numbers.forEach( (n) -> { System.out.println(n); } );// using lambda for for-each loop
    Consumer<Integer> method = (n) -> { System.out.println(n); };
    numbers.forEach( method ); //Use Java's Consumer interface to store a lambda expression in a variable:
  }
}

*/
//Create a method which takes a lambda expression as a parameter:
interface StringFunction {
  String run(String str);
}

public class Main {
  public static void main(String[] args) {
    StringFunction exclaim = (s) -> s + "!";
    StringFunction ask = (s) -> s + "?";
    printFormatted("Hello", exclaim);
    printFormatted("Hello", ask);
  }
  public static void printFormatted(String str, StringFunction format) {
    String result = format.run(str);
    System.out.println(result);
  }
}