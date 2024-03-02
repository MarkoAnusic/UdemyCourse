package SideItem;

public class Eggs extends SideItem {

   public Eggs() {
      this.type = "Eggs";
      this.price = 1.50d;
   }

   public Eggs(String type, double price) {
      super("Eggs", 1.50);
   }
}
