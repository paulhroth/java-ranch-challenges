//Problem: Write a program that will read in a year and report if it is a leap year.

public class IsLeap {
  public static void main ( String[] args ) {
    int year = 0;
    if (args.length != 1) { 
      System.out.println("Usage: IsLeap [year(CE)].\nPlease enter a valid integer (e.g. 1204, 101, 2887) as your argument.");
      System.exit(0);
    } else {
      try {
        year = Integer.parseInt(args[0]);  
      } catch (Exception e) {
        System.out.println("Error: please enter a valid integer year.");
        System.exit(1);
      }
    }
    if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
      System.out.println("The year " + year + " does in fact host a February 29th.");
    } else {
      System.out.println("That ain't no leap year.");
    } 
  }
}
