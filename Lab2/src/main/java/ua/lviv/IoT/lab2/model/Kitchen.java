package ua.lviv.IoT.lab2.model;

public class Kitchen extends Chemical {

   private int washingTemperature;
   private boolean flow;

   public Kitchen(double price, double volume, String company, boolean forCleaning, int washingTemperature, boolean flow) {
      super(price, volume, company, forCleaning);
      this.washingTemperature = washingTemperature;
      this.flow = flow;
   }

   @Override
   public String getHeader() {
      return String.format("%s, %s, %s\n", super.getHeader(), "washingTemperature", "flow");
   }

   @Override
   public String toCSV() {
      return String.format("%s, %s, %s\n", super.toCSV(), getWashingTemperature(), getFlow());
   }

   public int getWashingTemperature() {
      return washingTemperature;
   }

   public void setWashingTemperature(int washingTemperature) {
      this.washingTemperature = washingTemperature;
   }

   public boolean getFlow() {
      return flow;
   }

   public void setFlow(boolean flow) {
      this.flow = flow;
   }

   @Override
   public String toString() {
      return "Kitchens";
   }
}
