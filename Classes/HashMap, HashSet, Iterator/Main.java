// Import the HashMap class
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
  public static void main(String[] args) {
    // Create a HashMap object called capitalCities
    HashMap<String, String> capitalCities = new HashMap<String, String>();// you can have other values such as <Integer, Double> , <String, Integer>

    // Add keys and values (Country, City)
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    System.out.println(capitalCities + " Getting a value " + capitalCities.get("England"));// the key word or numer gives us the value of it inside

    //and this is how you print seperately key words and values

    for(String i : capitalCities.keySet()) {
     System.out.println("key: " + i + " | values: " + capitalCities.get(i));
    }
    // Create a HashSet object called numbers
    HashSet<Integer> numbers = new HashSet<Integer>();

    // Add values to the set
    numbers.add(4);
    numbers.add(7);
    numbers.add(8);

    // Show which numbers between 1 and 10 are in the set
    for(int i = 1; i <= 10; i++) {
      if(numbers.contains(i)) {
        System.out.println(i + " was found in the set.");
      } else {
        System.out.println(i + " NAH");
      }
    }
    //Hashset is like Arraylist , however, it has some unique features and functions such as 'contains' which checks if this value is inthe HashSet



    //=====================================================ITERATOR LOOP==================================================================


    Iterator<Integer> myNums = numbers.iterator();// calling the method
    //looping through the hashset toprint it. we can also use this on ArrayList

    while(myNums.hasNext()) {// hasNext() checks if there is a value in the next element in the Hashset,ArrayList
      System.out.println(myNums.next());// prints the first value if used alone
    }


    //Iteration can be also used to delete numbers or values that are unwanted in HashSet\ArrayList using while and .remove() function
  }
 }