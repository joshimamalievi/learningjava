import java.util.ArrayList;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println("=======================================Using loop to print the array=======================================");
    for(int i = 0; i <cars.size() ; i++){
     System.out.println(cars.get(i));
    }
    System.out.println("=======================================Using for-each to print the array===================================");
    for(String i : cars) {
     System.out.println(i);
    }
    System.out.println("=======================================Modifying the array=================================================");
    Collections.sort(cars);
    System.out.println("This is the array after sorting and before adding an element: " + cars);
    cars.add(0, "Nissan");
    System.out.println("This is array after adding Nissan and the 2nd element before modifying: " + cars + " " + cars.get(2));
    cars.set(2, "Tesla");// modifying an element in the array
    System.out.println("And after modifying: " + cars.get(2)+ " " + cars);
    cars.remove(3);
    System.out.println("This is the array after removing the 3rd element and its size: " + cars + " " + cars.size());
    cars.clear();
    System.out.println("And finally this is after clearin the array: " + cars);


    //========================================================CREATING DIFFERENT TYPES OF ARRAYS=========================================

    ArrayList<Integer> myNums = new ArrayList<Integer>();
    myNums.add(10);
    myNums.add(3);
    myNums.add(9);
    myNums.add(5);
    System.out.println("================================================PRINTING THE INTEGER ARRAY=================================");
    for(int j : myNums) {
     System.out.println(j);
    }
    Collections.sort(myNums);
    System.out.println("And this is after sorting the numbers: " + myNums);
    Collections.sort(myNums, Collections.reverseOrder());
    System.out.println("And this is after reversing: " + myNums);
  }
}