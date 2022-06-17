package ua.lviv.iot.ChemicalShopServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "ua.lviv.iot.ChemicalShopServer")
public class ChemicalShopApplication extends SpringBootServletInitializer {

	private static final Class<ChemicalShopApplication> applicationClass = ChemicalShopApplication.class;

	public static void main(String[] args) {
		SpringApplication.run(applicationClass, args);
	}

}
