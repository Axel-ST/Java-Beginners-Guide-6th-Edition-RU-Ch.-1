/*
 * Created by Axel_ST on 17.03.2021
 *
 * Java: А Beginners Guide, 6th Edition (RU) Ch. 1 p. 52-53 (ex. 1.2)
 */

public class GallonsToLitersTable {
   public static void main(String[] args) {
      double gallons, liters;
      int counter;
      
      counter = 0;
      for (gallons = 1; gallons <= 100; gallons++) {
         liters = gallons * 3.7854;
         System.out.println(gallons + " галлонам соответствует " + liters + " литров.");
         counter++;
         
         if (counter == 10) {
            counter = 0;
            System.out.println();
         }
      }
   }
}
