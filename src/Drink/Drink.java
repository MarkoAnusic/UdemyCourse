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

      System.out.println("\nDRINKS MENU\n" + cola.getType() + "\t\t" + "Small $1.00" + "\n" + "\t\t\t" + "Regular $2.00" + "\n" + "\t\t\t" + "Big $3.00" + "\n" + "************\n" + fanta.getType() + "\t\t" + "Small $1.20" + "\n" + "\t\t\t" + "Regular $2.10" + "\n" + "\t\t\t" + "Big $3.00" + "\n" + "************\n" + sprite.getType() + "\t\t" + "Small $0.95" + "\n" + "\t\t\t" + "Regular $1.85" + "\n" + "\t\t\t" + "Big $3.50" + "\n" + "\n");

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
      return "Drink: " + type + "\nSize:" + size;
   }
}





