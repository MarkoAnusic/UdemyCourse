package Burger;

import java.util.List;

public class LargeBurger extends Burger {

   public static final int maxToppings = 3;

   public int getMaxToppings() {
      return maxToppings;
   }

   public LargeBurger() {
      super("Large", 4.20);
   }


}
