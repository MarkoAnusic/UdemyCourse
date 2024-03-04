package SideItem;

public class Fries extends SideItem {

   private String size;

   public Fries() {
      this.type = "Fries";
   }

   public Fries(String type, String size, double price) {
      super("Fries", price);
      this.size = size;
   }

   public String FriestoString() {
      return "Type: " + type + "Size: " + size;
   }
}
