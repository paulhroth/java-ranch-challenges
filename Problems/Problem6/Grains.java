//Problem: 
//
//There once was a wise servant who saved the life of a princess. The
//king promised to pay whatever the servant could dream up. Knowing that the
//king loved chess, the servant told the king he would like to have grains of
//wheat. One grain on the first square of a chess board. Two grains on the next.
//Four on the third, and so on.
//
//There are 64 squares on a chessboard.
//
//Write a program that shows how many grains were on each square and the total
//number of grains.

import java.math.BigInteger;

public class Grains
{

  public static void main (String[] args)
  {
   grainPrinter(64);
  }

  public static void grainPrinter( int numSquares )
  {
    BigInteger num = new BigInteger("2");
    for (int i = 1; i <= numSquares; i++)
    {
      System.out.println("square " + i + ":  " + num + " grains.");
      num = num.multiply(new BigInteger("2"));
    }
  }

}
