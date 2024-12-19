interface Animal {
 public void animalSound();
 public void sleep();
}
// for interfaces instead of 'extends' we use 'implements'
class Pig implements Animal {
 public void animalSound() {
  //the body is provided here
  System.out.println("OINK BLAT !");
 }
 public void sleep() {
  System.out.println("ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ");
 }
}

class Main {
 public static void main(String[] args) {
  
 Pig myPig = new Pig();
 myPig.animalSound();
 myPig.sleep();
 }
}