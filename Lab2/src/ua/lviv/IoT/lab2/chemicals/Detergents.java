package ua.lviv.IoT.lab2.chemicals;

public class Detergents extends Chemicals{

   private double pHLevel;
   private boolean powder;

   public Detergents(double price, double volume, String company, double pHLevel, boolean powder) {
      super(price, volume, company);
      this.pHLevel = pHLevel;
      this.powder = powder;
   }

   public double getPHLevel() {
      return pHLevel;
   }

   public void setPHLevel(double pHLevel) {
      this.pHLevel = pHLevel;
   }

   public boolean getPowder() {
      return powder;
   }

   public void setPowder(boolean powder) {
      this.powder = powder;
   }

   @Override
   public String toString() {
      return "Detergents{" +
              "price=" + price +
              ", volume=" + volume +
              ", company='" + company + '\'' +
              ", pHLevel=" + pHLevel +
              ", powder=" + powder +
              '}';
   }
}