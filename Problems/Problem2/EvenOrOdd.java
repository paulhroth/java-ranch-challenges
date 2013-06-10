//Problem: write a program that will read in a number from the command line and print out to standard output if it is even or odd.

public class EvenOrOdd {
  public static void main ( String[] args ) {
    String parity = "neither even nor odd? How strange.";
    int number = 0;
    if (args.length != 1) { 
      System.out.println("Usage: EvenOrOdd [integer].\nPlease enter a single integer (e.g. -5, 10, 999) as your argument.");
      System.exit(0);
    } else {
      try {
        number = Integer.parseInt(args[0]);  
      } catch (Exception e) {
        System.out.println("Error: please enter a valid integer");
        System.exit(1);
      }
      parity = (number % 2 == 0) ? "even" : "odd";
      System.out.println("Drumroll..................");
      try {
        Thread.sleep(1000);
      } catch (InterruptedException x) {
        //ignore
      }
      System.out.println("Your number is " + parity + "!!");
    }
  }
}
