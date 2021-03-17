/*
 * Created by Axel_ST on 17.03.2021
 *
 * Java: А Beginners Guide, 6th Edition (RU) Ch. 1 ex. 10
 */

public class InchesToMetersTable {
   public static void main(String[] args) {
      double inches, meters;
      int counter = 0;
      
      for (inches = 1; inches <= 144; inches++) {
         meters = inches / 39.37;
         System.out.println(inches + " дюймам соответствует " + meters + " метров.");
         counter++;
         
         if (counter == 12) {
            System.out.println();
            counter++;
         }
      }
   }
}
