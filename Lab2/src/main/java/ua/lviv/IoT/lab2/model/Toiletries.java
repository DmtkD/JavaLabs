package ua.lviv.IoT.lab2.model;

public class Toiletries extends Chemicals {

   private double efficiency;
   private int durationOfActionPerDay;

   public Toiletries(double price, double volume, String company, boolean forCleaning,
                     double efficiency, int durationOfActionPerDay) {
      super(price, volume, company, forCleaning);
      this.efficiency = efficiency;
      this.durationOfActionPerDay = durationOfActionPerDay;
   }

   @Override
   public String getHeader() {
      return String.format("%s, %s, %s\n", super.getHeader(), "efficiency", "durationOfActionPerDay");
   }

   @Override
   public String toSVC() {
      return String.format("%s, %s, %s\n", super.toSVC(), getEfficiency(), getDurationOfActionPerDay());
   }

   public double getEfficiency() {
      return efficiency;
   }

   public void setEfficiency(double efficiency) {
      this.efficiency = efficiency;
   }

   public int getDurationOfActionPerDay() {
      return durationOfActionPerDay;
   }

   public void setDurationOfActionPerDay(int durationOfActionPerDay) {
      this.durationOfActionPerDay = durationOfActionPerDay;
   }

   @Override
   public String toString() {
      return "Toiletries";
   }
}
