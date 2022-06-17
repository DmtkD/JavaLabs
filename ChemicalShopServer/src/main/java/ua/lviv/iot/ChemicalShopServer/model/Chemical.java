package ua.lviv.iot.ChemicalShopServer.model;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "chemicals")
public class Chemical {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column
   private Integer id;

   @Column
   private double price;

   @Column
   private double volume;

   @Column
   private String company;

   @Column
   private boolean forCleaning;
}