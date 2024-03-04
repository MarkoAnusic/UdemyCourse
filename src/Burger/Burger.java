package Burger;

import Topping.Topping;

import java.util.ArrayList;
import java.util.List;

public class Burger {

   protected String type;
   protected double price;
   protected List<Topping> toppings;
   protected int toppingsAmount;

   public Burger(String type, double price) {
      this.type = type;
      this.price = price;
      this.toppings = new ArrayList<Topping>();
      toppingsAmount = 0;
   }

   public void setToppings(List<Topping> toppings) {
      this.toppings = toppings;
   }

   public int getToppingsAmount() {
      return toppingsAmount;
   }

   public void addToppingAmount() {
      toppingsAmount++;
   }

   public void setToppingsAmount(int toppingsAmount) {
      this.toppingsAmount = toppingsAmount;
   }

   public Burger() {

   }

   public static void burgerMenu() {
      System.out.println("Burger menu:\n1.Small(2.30$, 3 toppings)\n2.Medium(3.50$, 3 toppings)\n3.Large(4.20$, 3 toppings)\n4.Deluxe(5.00$, 5 toppings)\n\tNumbers correlate to the burger that you want.");
   }

   public String stringToppings() {
      String strToppings = "";

      for(int i = 0; i < toppings.size(); i++) {
         if(i + 1 == toppings.size()) {
            strToppings += toppings.get(i).getType();
         }
         else {
            strToppings += toppings.get(i).getType() + ", ";
         }
      }

      return strToppings;
   }

   public String getType() {
      return type;
   }

   public void setType(String type) {
      this.type = type;
   }

   public double getPrice() {
      return price;
   }

   public void setPrice(double price) {
      this.price = price;
   }

   public List<Topping> getToppings() {
      return toppings;
   }

   public void addTopping(Topping topping) {
      toppings.add(topping);
   }

   @Override
   public String toString() {
      return "Burger: " + type + "$\nToppings: " + stringToppings();
   }
}


