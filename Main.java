import java.util.Scanner; 
import java.util.ArrayList;

public class BasicOperations  
{
  BasicOperations()
  {
    System.out.println("Welcome to basic operations!");
    try
    {Thread.sleep(2000);
    } catch (exception e) 
    {
      System.out.println("Could not sleep!");
    }
  }
  public static int Add (int a, int b) 
  {
    return a + b;
  }

  public static double Add (double a, double b) 
  {
    return a + b;
  }

  public static int Subtract (int a, int b) 
  {
    return a - b;
  }

  public static double Subtract (double a, double b) 
  {
    return a - b;
  }

  public static int Multiply (int a, int b) 
  {
    return a * b;
  }

  public static double Multiply (double a, double b) 
  {
    return a * b;
  }

  public static int Divide (int a, int b) 
  {
    return a / b;
  }

  public static double Divide (double a, double b) 
  {
    return a / b;
  }

  public static void DivideWithRemainder (int a, int b) 
  {
    int remainder = a % b;
    System.out.println("The quotent is" + (a / b) + "with " + remainder + " as a remainder");
  }
}

class Main {
  public static void main(String[] args) throws InterruptedException 
  {

    ArrayList operations = new ArrayList<String>();
    String basicOp = "Basic Operations";
    operations.add(basicOp);

    System.out.println("Welcome User!\n");
    System.out.println("This is the Ultimate Calculator!");
    System.out.println("What would you like to do? You have access to:");
    for (int x = 0; x <= operations.size() - 1; x++)
    {
      System.out.println(operations.get(x));
    }

    Scanner input = new Scanner(System.in);
    String decision = input.nextLine();

    
    
  }
}