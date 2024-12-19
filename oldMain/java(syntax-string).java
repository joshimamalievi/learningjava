/*
==============================DATA TYPES===========================
* byte	  1 byte	Stores whole numbers from   -128 to 127
* short	  2 bytes	Stores whole numbers from   -32,768 to 32,767
* int	    4 bytes	Stores whole numbers from   -2,147,483,648 to 2,147,483,647
* long	  8 bytes	Stores whole numbers from   -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
* float	  4 bytes	Stores fractional numbers.  Sufficient for storing 6 to 7 decimal digits
* double	8 bytes	Stores fractional numbers.  Sufficient for storing 15 decimal digits
* boolean	1 bit	                              Stores true or false values
=============================ASSIGNMENT OP=========================
* =	          x = 5	         x = 5
* +=	        x += 3	       x = x + 3
* -=	        x -= 3	       x = x - 3
* *=	        x *= 3	       x = x * 3
* /=	        x /= 3	       x = x / 3
* %=	        x %= 3	       x = x % 3(5%3=2)
* &=	        x &= 3	       x = x & 3(5&3=1)
* |=	        x |= 3	       x = x | 3
* ^=	        x ^= 3	       x = x ^ 3 = (x-3)*3
* >>=        	x >>= 3	       x = x >> 3
* <<=        	x <<= 3	       x = x << 3	
==============================COMPARISON===========================
* ==	Equal to	                x == y
* !=	Not equal	                x != y
* >	  Greater than	            x > y
* <	  Less than	                x < y
* >=	Greater than or equal to	x >= y
* <=	Less than or equal to	    x <= y
==============================LOGICAL OP============================
* && 	Logical and	Returns true if both statements are true	                x < 5 &&  x < 10
* || 	Logical or	Returns true if one of the statements is true	            x < 5 || x < 4
* !	Logical not	Reverse the result, returns false if the result is true	    !(x < 5 && x < 10)
==============================SPECIAL CHARS=========================
* \n	New Line
* \r	Carriage Return
* \t	Tab
* \b	Backspace
* \f	Form Feed
*/

public class Main{
  public static void main(String[] args) {
    int firstVar;
    final int noChange = 10; // this is an constant and cannot be changed if changed error will show
    firstVar = 25;
    firstVar = 20; // variable now has changed
    String myName = "Joshgun";
    String mySurname = "Imamalievi ";
    float myFloat = 2.99f;
    char aLetter = 'M';
    boolean myBool = true;
    // this does nothing its just a note function
    System.out.println(myName.concat(mySurname) + " text length is:" + myName.concat(mySurname).length());// println() make a new line while print() doesn't
    System.out.println(firstVar +5232);
    System.out.println(myFloat);
    System.out.println(aLetter); 
    System.out.println(myBool);
    System.out.println("Salam Alekum men \"muselman\"");
  }
}