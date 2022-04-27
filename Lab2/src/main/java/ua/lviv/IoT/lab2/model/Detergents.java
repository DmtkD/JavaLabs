package ua.lviv.IoT.lab2.model;

public class Detergents extends Chemicals {

   private double pHLevel;
   private boolean powder;

   public Detergents(double price, double volume, String company, boolean forCleaning, double pHLevel, boolean powder) {
      super(price, volume, company, forCleaning);
      this.pHLevel = pHLevel;
      this.powder = powder;
   }


   @Override
   public String getHeader() {
      return String.format("%s, %s, %s\n", super.getHeader(), "pHLevel", "powder");
   }

   @Override
   public String toSVC() {
      return String.format("%s, %s, %s\n", super.toSVC(), getPHLevel(), getPowder());
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
      return "Detergents";
   }
}