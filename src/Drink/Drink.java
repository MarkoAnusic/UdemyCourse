package Drink;

public class Drink {

   protected String size;
   protected String type;
   protected double price;

   public Drink() {

   }

   public Drink(String size, String type, double price) {
      this.size = size;
      this.type = type;
      this.price = price;
   }

   public static void drinkMenu() {
      Cola cola = new Cola();
      Fanta fanta = new Fanta();
      Sprite sprite = new Sprite();
      System.out.println("\n\t\t\tDRINKS MENU\n\t\t--------------------");
      System.out.println("            Small     Medium     Large");
      System.out.println("1.Cola:     1.00$     2.00$      3.00$");
      System.out.println("2.Fanta:    1.20$     2.10$      3.00$");
      System.out.println("3.Sprite:   0.95$     1.85$      3.50$");
   }

   public String getSize() {
      return size;
   }

   public void setSize(String size) {
      this.size = size;
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

   @Override
   public String toString() {
      return "Drink: " + size + " " + type + ", " + price + "$";
   }
}





