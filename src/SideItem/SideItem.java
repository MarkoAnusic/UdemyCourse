package SideItem;

public class SideItem {

   protected String type;
   protected double price;

   public SideItem() {

   }

   public SideItem(String type, double price) {
      this.type = type;
      this.price = price;
   }

   public static void sideItemMenu() {
      Fries fries = new Fries();
      Eggs eggs = new Eggs();
      Sallad sallad = new Sallad();

      System.out.println("\nAdditional Side Item Menu\n" + fries.getType() + "\t\t\t" + "Small $0.50" + "\n" + fries.getType() + "\t\t\t" + "Regular $1" + "\n" + fries.getType() + "\t\t\t" + "Big $1.50" + "\n" + "************\n" + eggs.getType() + "\t\t\t" + eggs.getPrice() + "\n" + sallad.getType() + "\t\t\t" + sallad.getPrice());

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
