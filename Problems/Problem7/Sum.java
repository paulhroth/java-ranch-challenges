//Problem: create a double named sum, add 0.1 to it 1000 times, and then print a statement of whether or not it is equal to 100.

public class Sum {
  public static void main (String[] args) {
    double sum = 0;
    addHundred(sum);
    System.out.println("It is " + (sum == 100) + " that \"sum\" is equal to 100.");
  }
  public static double addHundred (double sum) {
    for (int i = 1; i <= 1000; i++) {
      sum += 0.1;
    }
    return sum;
  }
}
   

