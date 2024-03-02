package Burger;

import java.util.List;

public class MediumBurger extends Burger {

   public static final int maxToppings = 3;

   public int getMaxToppings() {
      return maxToppings;
   }

   public MediumBurger() {
      super("Medium", 3.50);
   }


}
