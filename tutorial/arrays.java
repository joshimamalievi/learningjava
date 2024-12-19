public class Main {

 public static void main(String[] args) {
  String[] cars = {"Volvo", "Ferrari", "Ford", "Lada"}; // array of strings
  int[] nums = {1, 2, 3, 4, 5}; //array of numbers
  //Accessing to array
  System.out.println(cars[0]);// arrays always start from 0, in this case, 0 is 'Volvo'
  // to change it simply call the element you want like cars[0] and change it as an variable
  cars[0] = "Opel";
  System.out.println(cars[0]);
  System.out.println(cars.length);// prints the number of items in the array aka the length
  
  // calling for every individual item in array using for
  System.out.println("================for============================================");
  for (int i = 0; i < cars.length; i++) {
     System.out.println(cars[i]);
   }
  // using for-each
  System.out.println("================for-each=======================================");
  for (String j : cars) {
   System.out.println(j);
  }
  System.out.println("================Multidimensional Array using for===============");
  int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
  for (int i = 0; i < myNumbers.length; ++i) {
    for (int j = 0; j < myNumbers[i].length; ++j) {
      System.out.println(myNumbers[i][j]);
    }
  }
  System.out.println("================Multidimensional Array using for-each==========");
  for (int[] row : myNumbers) {
    for (int i : row) {
      System.out.println(i);
    }
  }
 }
}