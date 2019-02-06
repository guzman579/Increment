//Increment.java
//Prefix increment and postfix increment operators.

public class ClassAverage
{
   public static void main(String[] args)
   {   
      // demonstrate postfix increment operator
      int c = 7; 
      System.out.printf("c before postincrement: %d%n", c); // prints 7
      System.out.printf("    postincrementing c: %d%n", c++); // prints 7
      System.out.printf(" c after postincrement: %d%n", c); // prints 8

      System.out.println(); // skip a line

      // demonstrate prefix increment operator
      c = 5; 
      System.out.printf(" c before preincrement: %d%n", c); // prints 7
      System.out.printf("     preincrementing c: %d%n", ++c); // prints 8
      System.out.printf("  c after preincrement: %d%n", c); // prints 8
   } 
} // end class 
