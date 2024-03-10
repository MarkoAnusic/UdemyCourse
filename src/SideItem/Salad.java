package SideItem;

public class Salad extends SideItem {

   public Salad() {
      this.type = "Salad";
   }

   public Salad(String size, double price) {
      super("Salad", size, price);
   }
}
