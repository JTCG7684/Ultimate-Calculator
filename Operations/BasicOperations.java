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