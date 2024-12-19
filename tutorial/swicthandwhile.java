public class Main{
 public static void main(String[] args) {
  int day = 4;
  switch (day) {
   case 1:
    System.out.println("Monday");
    break;
   case 2:
    System.out.println("Tuesday");
    break;
   case 3:
    System.out.println("Wednesday");
    break; 
   case 4:
    System.out.println("Thursday");
    break;
   case 5:
    System.out.println("Friday");
    break;
   case 6:
    System.out.println("Saturday");
    break;
   case 7:
    System.out.println("Sunday");  
    break;
  }
 
 /* Output Thursday because day = 4. This swicth funtion more likely works
 as if day == case (x) = x and if it matches one of the cases then it switches on the function that we called for. In this case "Thursday". Furthermore, the function 'break;' is for to end the case after it is match so it doesn't continue working even tho we have switched on the functiones that are written. */

 //====================================='default' case==========================================
  switch (day) {
   case 6:
    System.out.println("Today is Saturday");
    break;
   case 7:
    System.out.println("Today is Sunday");
    break;
   default: /*here default means if any cases didnt match swicth on this one which doesn't need the 
   function 'break;'*/
    System.out.println("Looking forward for the weekend");
  }
 //====================================='while' loop=============================================
  int i = 0;
  while (i<5){
   System.out.println(i);
   i++;/*this function is going to output i until it reaches 5 and is going to stop at 4, since 
   i++ is i= i+1 */
  }
  do {
    System.out.println(i);
    i--;
  }while(i>-1);/*The do/while loop is a variant of the while loop. This loop will execute the code
  block once, before checking if the condition is true, then it will repeat the loop as long as the 
  condition is true.*/
 }
}