package Topping;

public class Topping {

   protected String type;
   protected double price;

   public Topping() {
   }

   public Topping(String type, double price) {
      this.price = price;
      this.type = type;
   }

   public static void toppingMenu() {
      System.out.println("Additional topping menu:\n1.Beef(5$)\n2.Cheese(2.5$)\n3.Fish(4.5$)\n4.Vegetable(1.5$)\n\tNumber correlate to the topping that you want.");
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
}
