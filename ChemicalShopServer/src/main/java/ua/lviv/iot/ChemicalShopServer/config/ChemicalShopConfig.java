package ua.lviv.iot.ChemicalShopServer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Primary;
import ua.lviv.iot.ChemicalShopServer.controller.ChemicalShopController;


@Configuration
@Primary
////@ApplicationPath(value = "/resource")
public class ChemicalShopConfig extends ResourceConfig {
   @Bean
   public ResourceConfig resourceConfig(ChemicalShopController myController) {
      packages("ua.lviv.iot.ChemicalShopServer");
      ResourceConfig config = new ResourceConfig();
      config.register(myController);
      return config;
////   public void JerseyConfig(Class<?>... classes) {
////      register(Chemical.class);
////      packages("ua.lviv.iot.ChemicalShopServer");
   }
}
