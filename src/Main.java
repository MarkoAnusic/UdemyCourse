import Burger.*;
import SideItem.SideItem;
import Topping.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Topping.Topping.toppingMenu;

public class Main {
   public static void main(String[] args) {
      Order order = new Order();
      order.orderMenu();
//      Burger burger = orderBurger();
//      System.out.printf("The size of the burger you chose is %s %s", burger.getType(), burger.getClass());
//      //Topping.Topping klasa, topping subKlase i metoda za biranje topinga
      //SideMeal klasa, sideMeal subKlase i metoda za biranje sideMealova
      //Order klasa....
   }

   //u order klasi
/*   public Burger toppingSet() {
      System.out.println("""
              Pls set your topping:\s
              \t- B for Beef - 5
              \t- C for Cheese - 2.5
              \t- F for Fish - 4.5
              \t or press Q for exit""");
   }
   public Burger burgerSet() {
      Scanner scanner = new Scanner(System.in);
      System.out.println("""
              Pls set your burger:\s
              \t- S for Small - 2.30 - 3 toppings
              \t- M for Medium - 3.50 - 3 toppings
              \t- L for Large size - 4.20 - 3 toppings
              \t- D for Deluxe - 5.00 - 5 toppings
              \t or press Q for exit""");
      char burgerType = scanner.nextLine().toUpperCase().charAt(0);

      switch(burgerType) {
         case 'S':
            return new SmallBurger();
         case 'M':
            return new MediumBurger();
         case 'L':
            return new LargeBurger();
         case 'D':
            return new DeluxeBurger();
         case 'Q':
            return null;
         default:
            System.out.println("Invalid input. Please enter a valid option.");
      }*/


}