class OuterClass {
 int x = 5;
  class InnerClass {
   public int innerMethod() {
    return x;
   }
  }
}

public class Main {
 public static void main(String[] args) {
  OuterClass myOuter = new OuterClass();
  OuterClass.InnerClass myObj = myOuter.new InnerClass();
  System.out.println(myObj.innerMethod());
 }
 
}