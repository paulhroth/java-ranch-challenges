//Problem: Write a program that (algorithmically) shows a 9x9 times table. 

public class Times 
{
  public static void main (String[] args) 
  {
    tablePrinter(9,9);
  }
  public static void tablePrinter (int x_max, int y_max) 
  {
    System.out.printf("   ");
    for (int i = 0; i <= x_max; i++)
    {
      System.out.printf("%2d ", i); 
    }
    for (int y = 0; y <= y_max; y++) 
    {
      System.out.println();
      System.out.printf("%2d ", y);
      for (int x = 0; x <= x_max; x++)
      {
        System.out.printf("%2d ", x*y);
      }
    }
    System.out.println();
  }
}
