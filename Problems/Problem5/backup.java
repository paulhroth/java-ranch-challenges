//Problem: Write a program that will read in a number from 0 to 99 and spell out that number.

public class Say {

  public static void sayNumber (String number) {
    System.out.println("Your number is " + number + ". Verbosity is the true soul of wit.");
  }

  public static void main ( String[] args ) {
    String input = args[0];
    String output = "";
    long num = 0;
    if (args.length != 1) { 
      System.out.println("Usage: Say [0..999999999999].\ni.e. 0 <= your argument <= 999999999999.");
      System.exit(0);
    } else {
      try {
        num = Long.parseLong(input);  
        if (!(num >= 0 && num <= 999999999999L)) {
          System.out.println("You can't ask me that! 0-999999999999 only, no exceptions.");
          System.exit(1);
        }
      } catch (Exception e) {
        System.out.println("Error: please enter a valid integer.");
        System.exit(1);
      }
    }
    int l = input.length();
    for (int i = l; i > 0; ) {
      if (i % 3 == 0) {
        if (i != 3) output += getString(input.substring(l-i,l-(i-3)));
        else output += getString(input.substring(l-3));
        if (i > 9) output += " billion ";
        else if (i > 6) output += " million ";
        else if (i > 3) output += " thousand ";
        i -= 3;
      }
      if (i % 3 == 2) {
        if (i != 2) output += getString(input.substring(l-i,l-(i-2)));
        else output += getString(input.substring(l-2));
        if (i > 9) output += " billion ";
        else if (i > 6) output += " million ";
        else if (i > 3) output += " thousand ";
        i -= 2;
      }
      if (i % 3 == 1) {
        if (i != 1) output += getString(input.substring((l-i),l-(i-1)));
        else output += getString(input.substring(l-1));
        if (i > 9) output += " billion ";
        else if (i > 6) output += " million ";
        else if (i > 3) output += " thousand ";
        i -= 1;
      }
    }
    sayNumber(output);
  }

  public static String getString (String input) {
    int onesIndex = -1;
    String hundreds = "";
    String tens = "";
    String ones = "";
    String output = "blah";
    int num = Integer.parseInt(input);  
    if (num <= 9) onesIndex = 0;
    if (num >= 20) onesIndex = 1;
    if (num >= 100) onesIndex = 2;
    if (onesIndex == -1) {
      switch (input) {
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
      return output;
    } else {
      switch (input.charAt(onesIndex)) {
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
      if (num <= 10) {
        return ones;
      } else {
        switch (input.charAt(onesIndex - 1)) {
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
        if (num <= 99) {
          return (tens + " " + ones);
        } else {
          switch (input.charAt(onesIndex - 2)) {
            case '1': hundreds = "one"; break;
            case '2': hundreds = "two"; break;
            case '3': hundreds = "three"; break;
            case '4': hundreds = "four"; break;
            case '5': hundreds = "five"; break;
            case '6': hundreds = "six"; break;
            case '7': hundreds = "seven"; break;
            case '8': hundreds = "eight"; break;
            case '9': hundreds = "nine"; break;
          }
          return (hundreds + " hundred " + tens + " " + ones);
        }
      }
    }
  }
}

