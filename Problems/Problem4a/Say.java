//Problem: Write a program that will read in a number from 0 to 99 and spell out that number.

public class Say {
  public static void sayNumber (String number) {
    System.out.println("Prepare to be amazed, your number is: " + number + ". Boom");
  }
  public static void main ( String[] args ) {
    String tens = "";
    String ones = "";
    String output = "blah";
    int input = 0;
    int onesIndex = -1;
    if (args.length != 1) { 
      System.out.println("Usage: Say [0..99].\ni.e. 0 <= your argument <= 99.");
      System.exit(0);
    } else {
      try {
        input = Integer.parseInt(args[0]);  
        if (!(input >= 0 && input <= 99)) {
          System.out.println("You can't ask me that! 0-99 only, no exceptions.");
          System.exit(1);
        }
      } catch (Exception e) {
        System.out.println("Error: please enter a valid integer.");
        System.exit(1);
      }
    }
    if (input <= 9) onesIndex = 0;
    if (input >= 20) onesIndex = 1;
    if (onesIndex == -1) {
      switch (args[0]) {
        case "10": output = "ten"; break;
        case "11": output = "eleven"; break;
        case "12": output = "twelve"; break;
        case "13": output = "thirteen"; break;
        case "14": output = "fourteen"; break; 
        case "15": output = "fifteen"; break;
        case "16": output = "sixteen"; break;
        case "17": output = "seventeen"; break;
        case "18": output = "eighteen"; break;
        case "19": output = "nineteen"; break;
        case "20": output = "twenty"; break;
      } 
      sayNumber(output);
      System.exit(0);
    } else {
      switch (args[0].charAt(onesIndex)) {
        case '0': ones = "zero"; break;
        case '1': ones = "one"; break;
        case '2': ones = "two"; break;
        case '3': ones = "three"; break;
        case '4': ones = "four"; break;
        case '5': ones = "five"; break;
        case '6': ones = "six"; break;
        case '7': ones = "seven"; break;
        case '8': ones = "eight"; break;
        case '9': ones = "nine"; break;
      }
      if (input <= 10) {
        sayNumber(ones);
        System.exit(0);
      } else {
        switch (args[0].charAt(0)) {
          case '1': tens = "ten"; break;
          case '2': tens = "twenty"; break;
          case '3': tens = "thirty"; break;
          case '4': tens = "forty"; break;
          case '5': tens = "fifty"; break;
          case '6': tens = "sixty"; break;
          case '7': tens = "seventy"; break;
          case '8': tens = "eighty"; break;
          case '9': tens = "ninety"; break;
        }
        sayNumber(tens + " " + ones);
        System.exit(0);
      }
    }
  }
}
