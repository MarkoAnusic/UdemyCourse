package Drink;

public class Fanta extends Drink {

   private String size;
   private String type;
   private double price;

   public Fanta() {
      super();
      this.type = "Fanta";
   }

   public Fanta(String size, String type, double price) {
      super();
      this.type = "Fanta";
      this.price = price;
      this.size = size;
   }

   @Override
   public String getSize() {
      return size;
   }

   @Override
   public void setSize(String size) {
      this.size = size;
   }

   @Override
   public String getType() {
      return type;
   }

   @Override
   public void setType(String type) {
      this.type = type;
   }

   @Override
   public double getPrice() {
      return price;
   }

   @Override
   public void setPrice(double price) {
      this.price = price;
   }
}
