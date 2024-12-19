public class Main {
 public static void main(String[] args) {
  int time = 20;
  String result = (time < 18) ? "Good day. " : "Good Evening. "; 
  /* This is a shor version of "if ... else ..." "?" resembles
  "if" and ":" resembles else. With this we put it as a string 
  into result and print it out to see if the conditions are
  matching(which in this case doesn't match and output is 
  "Good evening. ")
  */
  System.out.println(result);
 }
}