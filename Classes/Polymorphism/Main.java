class Animal {
 public void animalSounds(){
  System.out.println("Animal makes this sound");
 }
}

class Dog extends Animal {
 public void animalSounds(){
  System.out.println("The dog: WOOF WOOF!");
 }
}
class Pig extends Animal {
 public void animalSounds(){
  System.out.println("The pig: Oink Oink! Blat");
 }
}

class Main {
 public static void main(String[] args) {
  Animal myAnimal = new Animal();
  Animal myDog = new Dog();
  Animal myPig = new Pig();

  myAnimal.animalSounds();
  myDog.animalSounds();
  myPig.animalSounds();
 }
}