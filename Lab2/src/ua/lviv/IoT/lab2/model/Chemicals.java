package ua.lviv.IoT.lab2.model;

public abstract class Chemicals {

   protected double price;
   protected double volume;
   protected String company;
   protected boolean forCleaning;

   public Chemicals(double price, double volume, String company, boolean forCleaning) {
      this.price = price;
      this.volume = volume;
      this.company = company;
      this.forCleaning = forCleaning;
   }

   public double getPrice() {
      return this.price;
   }

   public double getVolume() {
      return volume;
   }

   public String getCompany() {
      return company;
   }

   public boolean getForCleaning() {
      return forCleaning;
   }


   public void setPrice(double price) {
      this.price = price;
   }

   public void setVolume(double volume) {
      this.volume = volume;
   }

   public void setCompany(String company) {
      this.company = company;
   }

   public void setForCleaning(boolean forCleaning) {
      this.forCleaning = forCleaning;
   }
}