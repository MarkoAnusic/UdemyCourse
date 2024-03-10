package SideItem;

public class SideItem {

   protected String type;
   protected String size;
   protected double price;

   public SideItem() {

   }

   public SideItem(String type, String size, double price) {
      this.type = type;
      this.price = price;
      this.size = size;
   }

   public static void sideItemMenu() {
      Fries fries = new Fries();
      Eggs eggs = new Eggs();
      Salad salad = new Salad();

      System.out.println("\n\t\t\tSIDE ITEM MENU\n\t\t----------------------");
      System.out.println("            Small    Medium    Large");
      System.out.println("1.Fries:    0.50$    1.00$     1.50$");
      System.out.println("2.Eggs:     1.00$    1.50$     2.00$");
      System.out.println("3.Salad:    0.80$    1.00$     1.20$");

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

   public String getSize() {
      return size;
   }

   public void setSize(String size) {
      this.size = size;
   }

   @Override
   public String toString() {
      return "SideItem: " + size + " " + type;
   }
}
