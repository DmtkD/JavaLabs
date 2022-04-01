package ua.lviv.IoT.lab2.chemicals;

public abstract class Chemicals {

   protected double price;
   protected double volume;
   protected String company;

   public Chemicals(double price, double volume, String company) {
      this.price = price;
      this.volume = volume;
      this.company = company;
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

   public void setPrice(double price) {
      this.price = price;
   }

   public void setVolume(double volume) {
      this.volume = volume;
   }

   public void setCompany(String company) {
      this.company = company;
   }
}