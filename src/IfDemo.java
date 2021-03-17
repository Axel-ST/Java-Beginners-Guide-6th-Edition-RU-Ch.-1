/*
 * Created by Axel_ST on 17.03.2021
 *
 * Java: А Beginners Guide, 6th Edition (RU) Ch. 1 p. 47-48
 */

public class IfDemo {
   public static void main(String[] args) {
      int a, b, c;
      a = 2;
      b = 3;
      
      if (a < b)
         System.out.println("a меньше b");
      if (a == b)
         System.out.println("Не зайдет в этот оператор");
      System.out.println();
      
      c = a - b;
      System.out.println("c содержит " + c);
      if (c >= 0)
         System.out.println("c - неотрицательное число");
      else
         System.out.println("c - отрицательное число");
      
      c = b - a;
      System.out.println("c содержит " + c);
      if (c >= 0)
         System.out.println("c - неотрицательное число");
      else
         System.out.println("c - отрицательное число");
   }
}
