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
import static SideItem.SideItem.sideItemMenu;
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
              Current Price:  """ + " " + currentPrice() + "$\nNumber correlate to the menu that you want.");
      menuChoice = scanner.nextInt();

      switch(menuChoice) {
         case 1: {
            if(burger != null) {
               System.out.println("You ordered a burger.\n");
               orderMenu();
            }
            burgerMenu();
            orderBurger();
         }
         break;
         case 2: {
            if(drink != null) {
               System.out.println("You ordered a drink\n");
               orderMenu();
            }
            orderDrink();
         }
         break;
         case 3:
            if(sideItem != null) {
               System.out.println("You ordered a sideItem\n");
               orderMenu();
            }
            orderSideItem();
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
      double currentPrice = 0;
      if(burger == null && drink == null && sideItem == null) {
         return currentPrice;
      }
      if(burger != null) {
         List<Topping> toppings = burger.getToppings();
         for(int i = 0; i < burger.getToppingsAmount(); i++) {
            currentPrice += toppings.get(i).getPrice();
         }
         currentPrice += burger.getPrice();
      }
      if(drink != null) {
         currentPrice += drink.getPrice();
      }
      if(sideItem != null) {
         currentPrice += sideItem.getPrice();
      }
      return currentPrice;
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
      if(burger == null && drink == null && sideItem == null) {
         System.out.println("You haven't ordered anything");
      }
      else {
         System.out.println("\t\tCURRENT ORDER:\n");
      }
      if(burger != null) {
         System.out.println(burger.toString());
      }
      if(drink != null) {
         System.out.println(drink.toString());
      }
      if(sideItem != null) {
         System.out.println(sideItem.toString());
      }
      System.out.println("Press 1 or 2 to come back to the order menu or go to checkout");
      System.out.println("1.Order Menu" + "           2.Checkout");
      int choice = scanner.nextInt();
      switch(choice) {
         case 1:
            orderMenu();
            break;
         case 2: {
            System.out.println("Your order is complete, thank you for using our service. goodbye.");
            System.exit(0);
         }
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
                  scanner.nextLine();
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
                  scanner.nextLine();
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
                  scanner.nextLine();
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
                  scanner.nextLine();
                  input = scanner.nextLine().toUpperCase();
               } while(! input.equals("NO"));
            }
            else {
               orderMenu();
            }
            orderMenu();
         }
         break;
         default: {
            System.out.println("Wrong number");
            System.out.println("Do you want to return to try again? Yes or No");
            scanner.nextLine();
            String input = scanner.nextLine().toUpperCase();
            if(input.equals("YES")) {
               orderBurger();
            }
            else {
               orderMenu();
            }
         }
         break;
      }
      orderMenu();
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
      System.out.println("Numbers beside the drink correlates to the drink that you want, 1 2 or 3, size will be chosen after.");
      int drinkOption = scanner.nextInt();
      switch(drinkOption) {
         case 1:
            setDrink("Cola");
            break;
         case 2:
            setDrink("Fanta");
            break;
         case 3:
            setDrink("Sprite");
            break;
         default: {
            System.out.println("You inputted the wrong number, 1 to try again, 2 to go back to the order menu.");
            int option = scanner.nextInt();
            if(option == 1) {
               orderDrink();
            }
            else {
               orderMenu();
            }
         }
         break;
      }

   }

   protected void setDrink(String strDrink) {
      scanner.nextLine();
      System.out.println("What size do you want your " + strDrink + " to be? Small, Medium or Large");
      String sizeOption = scanner.nextLine();
      if(strDrink.equals("Cola")) {
         this.drink = new Cola();
         switch(sizeOption.toUpperCase()) {
            case "SMALL": {
               drink.setSize("Small");
               drink.setPrice(1.00);
            }
            break;
            case "MEDIUM": {
               drink.setSize("Medium");
               drink.setPrice(2.00);
            }
            break;
            case "LARGE": {
               drink.setSize("Large");
               drink.setPrice(3.00);
            }
            break;
            default: {
               System.out.println("You inputted the wrong size. 1 to try again 2 to comeback to the order menu.");
               int option = scanner.nextInt();
               if(option == 1) {
                  setDrink(strDrink);
               }
               else {
                  orderMenu();
               }
            }
         }
      }
      if(strDrink.equals("Fanta")) {
         drink = new Fanta();
         switch(sizeOption.toUpperCase()) {
            case "SMALL":
               drink.setSize("Small");
               drink.setPrice(1.20);
               break;
            case "MEDIUM":
               drink.setSize("Medium");
               drink.setPrice(2.10);
               break;
            case "LARGE":
               drink.setSize("Large");
               drink.setPrice(3.00);
               break;
            default:
               System.out.println("You inputted the wrong size. 1 to try again, 2 to come back to the order menu.");
               int option = scanner.nextInt();
               if(option == 1) {
                  setDrink(strDrink);
               }
               else {
                  orderMenu();
               }
         }
      }
      if(strDrink.equals("Sprite")) {
         switch(sizeOption.toUpperCase()) {
            case "SMALL":
               drink.setSize("Small");
               drink.setPrice(1.30);
               break;
            case "MEDIUM":
               drink.setSize("Medium");
               drink.setPrice(2.20);
               break;
            case "LARGE":
               drink.setSize("Large");
               drink.setPrice(3.10);
               break;
            default:
               System.out.println("You inputted the wrong size. 1 to try again, 2 to come back to the order menu.");
               int option = scanner.nextInt();
               if(option == 1) {
                  setDrink(strDrink);
               }
               else {
                  orderMenu();
               }
         }
      }
      System.out.println("You ordered a " + sizeOption + " " + strDrink);
      System.out.println("ENTER to come back to the order menu.");
      scanner.nextLine();
      orderMenu();

   }

   protected void orderSideItem() {
      sideItemMenu();
      System.out.println("Numbers beside the drink correlates to the side item that you want, 1 2 or 3, size will be chosen after.");
      int sideItemOption = scanner.nextInt();
      switch(sideItemOption) {
         case 1: {
            setSideItem("Fries");
         }
         break;
         case 2: {
            setSideItem("Eggs");
         }
         break;
         case 3: {
            setSideItem("Salad");
         }
         break;
         default: {
            System.out.println("You inputted the wrong number, 1 to try again, 2 to go back to the order menu.");
            int option = scanner.nextInt();
            if(option == 1) {
               orderDrink();
            }
            else {
               orderMenu();
            }
         }
      }
   }

   protected void setSideItem(String sideItem) {
      scanner.nextLine();
      if(sideItem.equals("Eggs")) {
         System.out.println("How many eggs do you want, 1 2 or 3. Small Medium or Large portion?");
      }
      else {
         System.out.println("What size do you want your " + sideItem + " to be? Small, Medium or Large");
      }
      String sizeOption = scanner.nextLine();
      if(sideItem.equals("Fries")) {
         switch(sizeOption.toUpperCase()) {
            case "SMALL":
               this.sideItem = new Fries("Small", 0.50);
               break;
            case "MEDIUM":
               this.sideItem = new Fries("Medium", 1.00);
               break;
            case "LARGE":
               this.sideItem = new Fries("Large", 1.50);
               break;
            default:
               System.out.println("You inputted the wrong size. 1 to try again, 2 to come back to the order menu.");
               int option = scanner.nextInt();
               if(option == 1) {
                  setSideItem(sideItem);
               }
               else {
                  orderMenu();
               }
         }
      }
      if(sideItem.equals("Eggs")) {
         switch(sizeOption.toUpperCase()) {
            case "SMALL":
               this.sideItem = new Eggs("Small", 1.00);
               break;
            case "MEDIUM":
               this.sideItem = new Eggs("Medium", 1.50);
               break;
            case "LARGE":
               this.sideItem = new Eggs("Large", 2.00);
               break;
            default:
               System.out.println("You inputted the wrong size. 1 to try again, 2 to come back to the order menu.");
               int option = scanner.nextInt();
               if(option == 1) {
                  setSideItem(sideItem);
               }
               else {
                  orderMenu();
               }
         }
      }
      if(sideItem.equals("Salad")) {
         switch(sizeOption.toUpperCase()) {
            case "SMALL":
               this.sideItem = new Salad("Small", 0.80);
               break;
            case "MEDIUM":
               this.sideItem = new Salad("Medium", 1.00);
               break;
            case "LARGE":
               this.sideItem = new Salad("Large", 1.20);
               break;
            default:
               System.out.println("You inputted the wrong size. 1 to try again, 2 to come back to the order menu.");
               int option = scanner.nextInt();
               if(option == 1) {
                  setSideItem(sideItem);
               }
               else {
                  orderMenu();
               }
         }
      }
      System.out.println("You ordered a " + sizeOption + " " + sideItem);
      System.out.println("ENTER to come back to the order menu.");
      scanner.nextLine();
      orderMenu();


   }
}
