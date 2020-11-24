import java.util.Scanner; 
import java.util.ArrayList;



class Main {
  public static void main(String[] args) throws InterruptedException 
  {
    Scanner input = new Scanner(System.in);
    ArrayList operations = new ArrayList<String>();
    String basicOp = "Basic Operations";
    String linear = "Linear Equations";
    String Quadratics = "Quadratics";
    operations.add(basicOp);
    operations.add(linear);
    operations.add(Quadratics);
    boolean running = true;

    System.out.println("\nWelcome User!");
    System.out.println("This is the Ultimate Calculator!");

    while (running){
      System.out.println("\nWhat would you like to do? You have access to:");
      for (int x = 0; x <= operations.size() - 1; x++)
      {
        System.out.println(operations.get(x));
      }
      System.out.println("Quit");
      System.out.println("Enter your choice: ");
      String decision = input.nextLine();
      
        if (decision.contains("Quit")) {
          System.out.println("\nHave a great day!");
          running = false;
          break;
        }
        else
        {
          switch (decision) {
            case "Basic Operations":
              BasicOperations bO = new BasicOperations();
              break;
            case "Linear Equations":
              LinearEquations lE = new LinearEquations();
            case "Quadratics":
              Quadratics q = new Quadratics();
            default:
              System.out.println("That is not a choice! Please try again.");
              break;

          }
        }
      }

    
    
  }
}