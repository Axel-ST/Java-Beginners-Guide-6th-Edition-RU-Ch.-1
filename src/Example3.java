/*
 * Created by Axel_ST on 17.03.2021
 *
 * Java: А Beginners Guide, 6th Edition (RU) Ch. 1 p. 44
 */

public class Example3 {
   public static void main(String[] args) {
      int var;
      double x;
      var = 10;
      x = 10.0;
      
      System.out.println("Начальное значение переменной var = " + var);
      System.out.println("Начальное значение переменной x = " + x);
      System.out.println();
      
      var /= 4;
      x /= 4;
      
      System.out.println("Значение переменной var после деления на 4 = " + var);
      System.out.println("Значение переменной x после деления на 4 = " + x);
   }
}
