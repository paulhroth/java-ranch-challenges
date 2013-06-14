//Problem:
//Write a program that will show different time and date information based on what "code" you send it. The codes are:
//0 - number of milliseconds since January 1, 1970
//1 - number of seconds since January 1, 1970
//2 - number of days since January 1, 1970
//3 - current date and time

import java.util.Date;

public class SecretCodeWatch {
  public static void main (String[] args) {
    String input = (args.length != 0) ? args[0] : "-1";
    System.out.println(interpretCode(input));
  }
   
  private static String interpretCode(String code) {
    Date date = new Date(); 
    String output;
    switch (code) {
      case "1": output = "It has been " + getms(date) + " milliseconds since January 1, 1970, 00:00:00 GMT"; break;
      case "2": output = "It has been " + gets(date) + " seconds since January 1, 1970, 00:00:00 GMT"; break;
      case "3": output = "It has been " + getDays(date) + " days since January 1, 1970, 00:00:00 GMT"; break;
      case "4": output = "It is now " + getCurrent(date) + ". Not for long though!"; break;
      default: output = "Code not recognized. What mysteries could the SecretCodeWatch contain!?";
    }
    return output;
  }

  private static String getms(Date date) { 
    return String.valueOf(date.getTime());
  }
  private static String gets(Date date) {
    return String.valueOf(date.getTime()/1000);
  }
  private static String getDays(Date date) { 
    return String.valueOf(date.getTime()/86400000);
  }
  private static String getCurrent(Date date) {
    return date.toString();
  }
}
