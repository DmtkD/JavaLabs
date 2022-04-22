package ua.lviv.IoT.lab2.model;

public class Kitchens extends Chemicals {

   private int washingTemperature;
   private boolean flow;

   public Kitchens(double price, double volume, String company, boolean forCleaning, int washingTemperature, boolean flow) {
      super(price, volume, company, forCleaning);
      this.washingTemperature = washingTemperature;
      this.flow = flow;
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
