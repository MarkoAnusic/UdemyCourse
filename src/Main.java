import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
   private static final Scanner scanner = new Scanner(System.in);

   public static void main(String[] args) {

      ArrayList<String> groceries = new ArrayList<>();
      menu(groceries);

   }

   private static void menu(ArrayList<String> groceries) {
      System.out.println("""
              Available actions:
              0 - to shutdown
              1 - to add item(s) to list (comma delimited list)
              2 - to remove any items (comma delimited list)
              Current List:\s""" + groceries + "\nEnter a number for which action you want to do:");

      int option = scanner.nextInt();
      switch(option) {
         case 0:
            System.out.println("Final list = " + groceries);
            break;
         case 1:
            addItemS(groceries);
            break;
         case 2:
            removeItemS(groceries);
            break;
         default: {
            System.out.println("Wrong number try again");
            menu(groceries);
         }
         break;
      }
   }

   private static void addItemS(ArrayList<String> groceries) {
      scanner.nextLine();
      System.out.println("To add item(s) you need to type them accordingly separated by commas (item1,item2,item3 or for one item only item1).");
      String[] input = scanner.nextLine().split(",");
      for(String item : input) {
         String trimmed = item.trim();
         if(! groceries.contains(trimmed)) {
            groceries.add(trimmed);
         }
      }
      System.out.println(groceries);
      menu(groceries);
   }

   private static void removeItemS(ArrayList<String> groceries) {
      scanner.nextLine();
      System.out.println("To remove item(s) you need to type them accordingly separated by commas (item1,item2,item3 or for one item only item1).");
      String input = scanner.nextLine();
      groceries.removeAll(List.of(input.split(",")));
      System.out.println(groceries);
      menu(groceries);
   }
}