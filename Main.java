import java.util.Scanner; 
import java.util.ArrayList;
import java.BasicOperations;


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