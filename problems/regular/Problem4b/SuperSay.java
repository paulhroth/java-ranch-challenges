//Problem: write a program that will read in a number from 0 to 999999999999 and spell out that number.

public class SuperSay {

  public static void main (String[] args) {
    long num = 0;
    String input = "";  
    if (args.length != 1) { 
      System.out.println("Usage: SuperSay [0..999999999999].\ni.e. 0 <= your argument <= 999999999999.");
      System.exit(0);
    } else {
      try {
        input = args[0];
        num = Long.parseLong(input);  
        input = String.valueOf(num);
        if (!(num >= 0 && num <= 999999999999L)) {
          System.out.println("Please choose a number between 0 and 999999999999.");
          System.exit(1);
        }
      } catch (Exception e) {
        System.out.println("Error: please enter a valid integer.");
        System.exit(1);
      }
    }
    sayNumber(stringBuilder(input));
  }
  
  public static void sayNumber (String number) {
    System.out.println("Your number is" + number + ".");
  }

  public static String stringBuilder (String input) {
    String output = "";
    String temp = "";
    int l = input.length();
    for (int i = l; i > 0; ) {
      if (i % 3 == 0) {
        if (i != 3) { 
          temp = getString(input.substring(l-i,l-(i-3)));
          if (temp != "zero") {
            output += (i != l) ? ", " : " ";
            output += temp;
          }
        }
        else { 
          temp = getString(input.substring(l-3));
          if (temp != "zero") {
            output += (i != l) ? ", " : " ";
            output += temp;
          }
        }
        if (i > 9) output += " billion";
        else if (i > 6) output +=  (temp != "zero") ? " million" : "";
        else if (i > 3) output +=  (temp != "zero") ? " thousand" : "";
        i -= 3;
      } else if (i % 3 == 2) {
        if (i != 2) {
          output += (i != l) ? ", " : " "; 
          output += getString(input.substring(l-i,l-(i-2)));
        }
        else {
          output += (i != l) ? ", " : " ";
          output += getString(input.substring(l-2));
        }
        if (i > 9) output += " billion";
        else if (i > 6) output += " million";
        else if (i > 3) output += " thousand";
        i -= 2;
      } else if (i % 3 == 1) {
        if (i != 1) {
          output += (i != l) ? ", " : " ";
          output += getString(input.substring((l-i),l-(i-1)));
        }
        else {
          output += (i != l) ? ", " : " ";
          output += getString(input.substring(l-1));
        }
        if (i > 9) output += " billion";
        else if (i > 6) output += " million";
        else if (i > 3) output += " thousand";
        i -= 1;
      }
    }
    return output;
 }

  public static String getString (String input) {
    int onesIndex = -1;
    String hundreds = "";
    String tens = "";
    String ones = "";
    String different = "blah";
    String output = "";
    int num = Integer.parseInt(input);
    input = String.valueOf(num);
    String lastTwoDigitsString = (num >= 10) ? input.substring(input.length()-2) : "-1";
    int lastTwoDigits = Integer.parseInt(lastTwoDigitsString);
    boolean differentName = (lastTwoDigits >= 10 && lastTwoDigits <= 19);
    if (num <= 9) onesIndex = 0;
    if (num >= 10) onesIndex = 1;
    if (num >= 100) onesIndex = 2;
    if (differentName) {
      switch (lastTwoDigitsString) {
        case "10": different = "ten"; break;
        case "11": different = "eleven"; break;
        case "12": different = "twelve"; break;
        case "13": different = "thirteen"; break;
        case "14": different = "fourteen"; break; 
        case "15": different = "fifteen"; break;
        case "16": different = "sixteen"; break;
        case "17": different = "seventeen"; break;
        case "18": different = "eighteen"; break;
        case "19": different = "nineteen"; break;
      } 
      if (num <= 19) {
        return different;
      }
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
      if (num <= 9) {
        return ones;
      } else {
        switch (input.charAt(onesIndex - 1)) {
          case '0': tens = "zero"; break;
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
          output += tens;
          if (ones != "zero") output += " " + ones;
          return (output);
        } 
      }
    }
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
    if (differentName) return (hundreds + " hundred " + different);
    output += hundreds + " hundred";
    if (tens != "zero") output += " " + tens;
    if (ones != "zero") output += " " + ones; 
    return output;
  }
}
