/*
 * Created by Axel_ST on 17.03.2021
 *
 * Java: А Beginners Guide, 6th Edition (RU) Ch. 1 ex. 9
 */

public class EarthlyToLunarWeigh {
   public static void main(String[] args) {
      double earthlyWeight, lunarWeight;
      earthlyWeight = 66.5;
      
      lunarWeight = earthlyWeight * 0.17;
      
      System.out.println("Земной вес - " + earthlyWeight + "кг,");
      System.out.println("а лунный - " + lunarWeight + "кг;");
      System.out.println("но это не точно");
   }
}
