import java.util.Scanner; 
import java.util.ArrayList;

public class BasicOperations  
{
  BasicOperations()
  {

    double a;
    double b;
    boolean running = true;

    System.out.println("Welcome to Basic Operations!\n");

    System.out.println("What would you like to do? You have these choices:\n");
    System.out.println("Addition");
    System.out.println("Subtraction");
    System.out.println("Multiplication");
    System.out.println("Division");
    System.out.println("Division With Remainder");
    System.out.println("Quit");
    System.out.println("\nNote: Just input DWR for 'Division With Remainder'");
    System.out.println("\nRemember: a will always be the dividend. meaning division will be calculated as a / b,");
    
    while(running) {
      Scanner input = new Scanner(System.in);
      System.out.println("\nInput your choice:\n");
      String decision = input.nextLine();



      switch (decision)
      {
        case "Addition":
          System.out.println("Enter your first number: ");
          a = input.nextDouble();
          System.out.println("Enter your second number: ");
          b = input.nextDouble();
          System.out.println("Your answer is: " + Add(a, b));
          break;
        case "Subtraction":
          System.out.println("Enter your first number: ");
          a = input.nextDouble();
          System.out.println("Enter your second number: ");
          b = input.nextDouble();
          System.out.println("Your answer is: " + Subtract(a, b));
          break;
        case "Multiplication":
          System.out.println("Enter your first number: ");
          a = input.nextDouble();
          System.out.println("Enter your second number: ");
          b = input.nextDouble();
          System.out.println("Your answer is: " + Multiply(a, b));
          break;
        case "Division":
          System.out.println("Enter your first number: ");
          a = input.nextDouble();
          System.out.println("What do you want to divide it by: ");
          b = input.nextDouble();
          System.out.println("Your answer is: " + Divide(a, b));
          break;
        case "DWR":
          System.out.println("Enter your first number: ");
          a = input.nextDouble();
          System.out.println("What do you want to divide it by: ");
          b = input.nextDouble();
          DivideWithRemainder((int) a, (int) b);
          break;
        case "Quit":
          System.out.println("You will now be redirected to the home page.\n");
          input.close();
          running = false;
          break;
        default:
          System.out.println("That is not a valid choice!");
          break;

    }
    }

  }

  private static double Add (double a, double b) 
  {
    return a + b;
  }

  private static double Subtract (double a, double b) 
  {
    return a - b;
  }

  private static double Multiply (double a, double b) 
  {
    return a * b;
  }

  private static double Divide (double a, double b) 
  {
    return a / b;
  }

  private static void DivideWithRemainder (int a, int b) 
  {
    int remainder = a % b;
    System.out.println("The quotent is " + (a / b) + " with " + remainder + " as a remainder");
  }
}