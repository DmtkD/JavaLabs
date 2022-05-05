package ua.lviv.IoT.lab2.model;

public class Detergent extends Chemical {

   private double pHLevel;
   private boolean powder;

   public Detergent(double price, double volume, String company, boolean forCleaning, double pHLevel, boolean powder) {
      super(price, volume, company, forCleaning);
      this.pHLevel = pHLevel;
      this.powder = powder;
   }


   @Override
   public String getHeader() {
      return String.format("%s, %s, %s\n", super.getHeader(), "pHLevel", "powder");
   }

   @Override
   public String toCSV() {
      return String.format("%s, %s, %s\n", super.toCSV(), getPHLevel(), getPowder());
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