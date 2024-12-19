abstract class Main {
  public String fname = "Josh";
  public int age = 21;
  public abstract void study();
}
class Student extends Main { //For some reason my pc makes it change the name to Second.java intead of Main.java so it can work. It might be the requirement since Main is an abstract class
  int graduationYear = 2018;

  public void study() {
    System.out.println("Studying so hard that I dont even know what is the problem");
  }
}
