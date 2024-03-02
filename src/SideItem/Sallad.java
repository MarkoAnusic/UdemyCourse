package SideItem;

public class Sallad extends SideItem {

   public Sallad() {
      this.type = "Sallad";
      this.price = 1.20d;
   }

   public Sallad(String type, double price) {
      super("Sallad", 1.20);
   }
}
