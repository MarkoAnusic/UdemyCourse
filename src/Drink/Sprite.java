package Drink;

public class Sprite extends Drink {

   private String size;
   private String type;
   private double price;

   public Sprite() {
      super();
      this.type = "Sprite";
   }

   public Sprite(String size, double price) {
      super();
      this.type = "Sprite";
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
