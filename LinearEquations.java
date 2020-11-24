import java.util.Scanner; 
import java.util.ArrayList;

public class LinearEquations
{
  private double m;
  private double b;
  private double c;
  private double x;
  private double y = m * (x + b) + c;
  LinearEquations()
  {

    while (true) 
    {

      Scanner input = new Scanner(System.in);
      String decision;

      System.out.println("Welcome to Linear Equations! The formula for a linear equation is y = m(x + b) + c.\n");
      System.out.println("m is the slope, b is the horizontal shift, and c is the vertical shift.");

      System.out.println("\nWhat would you like to do?\nCreate new equation\nQuit");
      System.out.println("Note: Just say 'Create' to create a new equation.");
      decision = input.nextLine();
      if (decision.contains("Create"))
      {

        System.out.println("\nGive me your slope:");
        m = input.nextDouble();
        System.out.println("\nNow give me your horizontal shift:");
        b = input.nextDouble();
        System.out.println("\nNow give me your vertical shift:");
        c = input.nextDouble();

        System.out.println("Your equation has been completed.");

        while (quit) {
          bool quit = false;
          System.out.println("What would you like me to do? I can:\nSolve for x\nFind the x intercept\nQuit\nNote: The y-intercept is just c, hence why I didn't add an option for finding it.");
          System.out.println("Say 'Solve' for the first option, 'Find' for the second option, and 'Quit' for the third option");
          decision = input.nextLine();
          switch (decision) {
            case "Solve":
              break;
            case "Find":
              break;
            case "Quit":
              quit = true;
              break;
          }
           
        }

      } else if (decision.contains("Quit")) 
      {
        break;
      }

    }

  }

}