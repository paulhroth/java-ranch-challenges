//Problem: Write a program that will read in a name from the command line and write it out 100 times. 

public class OneHundredTimes{
  public static void main ( String[] args ) {
    if (args.length != 0) {
      System.out.println("Pleased to meet you, " + args[0] + ". Did you know that I, this source code file, was written on June 5, 01:46 EST Time, 2013?");
    } else {
      System.out.println("Usage: OneHundredTimes [name]\nEnter your name in [name] to begin a thrilling, one line adventure.");  
    }
  }
}
