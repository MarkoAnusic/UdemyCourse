package Burger;

import java.util.List;

public class DeluxeBurger extends Burger {

   public static final int maxToppings = 5;

   public int getMaxToppings() {
      return maxToppings;
   }

   public DeluxeBurger() {
      super("Deluxe", 5.00);
   }

}
