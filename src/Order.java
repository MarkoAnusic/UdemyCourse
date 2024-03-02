import Burger.*;
import Drink.*;
import SideItem.*;
import Topping.*;

import javax.swing.plaf.basic.BasicDesktopIconUI;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Burger.Burger.burgerMenu;
import static Drink.Drink.drinkMenu;
import static Topping.Topping.toppingMenu;


public class Order {

   private static final Scanner scanner = new Scanner(System.in);
   protected Burger burger;
   protected Drink drink;
   protected SideItem sideItem;

   public Order() {
   }

   public void orderMenu() {

      int menuChoice;
      System.out.println("""
              What do you want to order:
              1.Burger(size then toppings)
              2.Drink
              3.SideItem
              4.See current order
              5.Finish the order
              Number correlate to the menu that you want.""");
      //u cosku trenutna cijena narudzbe
      menuChoice = scanner.nextInt();

      switch(menuChoice) {
         case 1:
            burgerMenu();
            orderBurger();
            break;
         case 2:
            orderDrink();
            break;
         case 3:
            SideItem.sideItemMenu();
            break;
         case 4:
            currentOrder();
            break;
         default: {
            System.out.println("Wrong number");
            System.out.println("Press Enter to return to the menu...");
            scanner.nextLine();
            scanner.nextLine();
            orderMenu();
         }
         break;
      }

   }

   public double currentPrice() {
      double priceOfToppings = 0;
      List<Topping> toppings = burger.getToppings();
      for(int i = 0; i < burger.getToppingsAmount(); i++) {
         priceOfToppings += toppings.get(i).getPrice();
      }
      return priceOfToppings;
   }

   public void printToppings() {
      List<Topping> toppings = burger.getToppings();
      if(! toppings.isEmpty()) {
         System.out.println("Current toppings are: ");
         for(int i = 0; i < burger.getToppings().size(); i++) {
            if(i + 1 == toppings.size()) {
               System.out.print(toppings.get(i).getType());
            }
            else {
               System.out.print(toppings.get(i).getType() + ",");
            }
         }
      }
   }

   public void currentOrder() {
      System.out.println("\t\tCURRENT ORDER:\n" + burger.toString());
      System.out.println("Press 1 or 2 to come back to the order menu or go to checkout");
      System.out.println("1.Order Menu" + "           2.Checkout");
      int choice = scanner.nextInt();
      switch(choice) {
         case 1:
            orderMenu();
            break;
         //case 2 Checkout;
      }
   }

   protected void orderBurger() {

      Topping topping = null;
      int burgerChoice;
      burgerChoice = scanner.nextInt();
      scanner.nextLine();

      switch(burgerChoice) {
         case 1: {
            burger = new SmallBurger();
            System.out.println("You choose a Small burger,do you want additional toppings?");
            System.out.println("Yes or No?");
            String input = scanner.nextLine().toUpperCase();
            if(input.equals("YES")) {
               do {
                  topping = setTopping();
                  if(topping != null) {
                     burger.addTopping(topping);
                  }
                  System.out.println("Do you want more toppings? Yes or No");
                  printToppings();
                  System.out.print("\n");
                  input = scanner.nextLine().toUpperCase();
               } while(! input.equals("NO"));
            }

            else {
               orderMenu();
            }
            orderMenu();
         }
         break;
         case 2: {
            burger = new MediumBurger();
            System.out.println("You choose a Medium burger,do you want additional toppings?");
            System.out.println("Yes or No?");
            String input = scanner.nextLine().toUpperCase();
            if(input.equals("YES")) {
               do {
                  topping = setTopping();
                  if(topping != null) {
                     burger.addTopping(topping);
                  }
                  System.out.println("Do you want more toppings? Yes or No");
                  printToppings();
                  System.out.print("\n");
                  input = scanner.nextLine().toUpperCase();
               } while(! input.equals("NO"));
            }
            else {
               orderMenu();
            }
            orderMenu();
         }
         break;
         case 3: {
            burger = new LargeBurger();
            System.out.println("You choose a Large burger,do you want additional toppings? Yes or No");
            System.out.println("Yes or No?");
            String input = scanner.nextLine().toUpperCase();
            if(input.equals("YES")) {
               do {
                  topping = setTopping();
                  if(topping != null) {
                     burger.addTopping(topping);
                  }
                  System.out.println("Do you want more toppings? Yes or No");
                  printToppings();
                  System.out.print("\n");
                  input = scanner.nextLine().toUpperCase();
               } while(! input.equals("NO"));
            }
            else {
               orderMenu();
            }
            orderMenu();
         }
         break;
         case 4: {
            burger = new DeluxeBurger();
            System.out.println("You choose a Deluxe burger,do you want additional toppings?");
            System.out.println("Yes or No?");
            String input = scanner.nextLine().toUpperCase();
            if(input.equals("YES")) {
               do {
                  topping = setTopping();
                  if(topping != null) {
                     burger.addTopping(topping);
                  }
                  System.out.println("Do you want more toppings? Yes or No");
                  printToppings();
                  System.out.print("\n");
                  input = scanner.nextLine().toUpperCase();
               } while(! input.equals("NO"));
            }
            else {
               orderMenu();
            }
            orderMenu();
         }
         break;
         default:
            System.out.println("WRONG.");
            break;
      }
   }

   private void toppingsCheck() {
      if(burger.getType().equals("Small") && burger.getToppingsAmount() == SmallBurger.maxToppings) {
         System.out.println("Small burgers can have only 3 extra toppings. Sorry");
         orderMenu();
      }
      if(burger.getType().equals("Medium") && burger.getToppingsAmount() == MediumBurger.maxToppings) {
         System.out.println("Medium burgers can have only 3 extra toppings. Sorry");
         orderMenu();
      }
      if(burger.getType().equals("Large") && burger.getToppingsAmount() == LargeBurger.maxToppings) {
         System.out.println("Large burgers can have only 3 extra toppings. Sorry");
         orderMenu();
      }
      if(burger.getType().equals("Deluxe") && burger.getToppingsAmount() == DeluxeBurger.maxToppings) {
         System.out.println("Deluxe burgers can have only 5 extra toppings. Sorry");
         orderMenu();
      }
   }

   private Topping setTopping() {
      toppingMenu();

      int toppingChoice = scanner.nextInt();
      Topping topping = null;

      switch(toppingChoice) {
         case 1: {
            topping = new Beef();
            toppingsCheck();
            burger.addToppingAmount();
         }
         break;
         case 2: {
            topping = new Cheese();
            toppingsCheck();
            burger.addToppingAmount();
         }
         break;
         case 3: {
            topping = new Fish();
            toppingsCheck();
            burger.addToppingAmount();

         }
         break;
         case 4: {
            topping = new Vegetable();
            toppingsCheck();
            burger.addToppingAmount();
         }
         break;
         default: {
            System.out.println("Wrong number");
            System.out.println("Do you want to return to the toppings menu? Yes or No");
            scanner.nextLine();
            String input = scanner.nextLine().toUpperCase();
            if(input.equals("YES")) {
               setTopping();
            }
            else {
               orderMenu();
            }
         }
         break;
      }
      return topping;
   }

   protected void orderDrink() {
      drinkMenu();

   }
}
