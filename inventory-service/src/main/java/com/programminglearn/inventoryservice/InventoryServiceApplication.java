package com.programminglearn.inventoryservice;

import com.programminglearn.inventoryservice.model.Inventory;
import com.programminglearn.inventoryservice.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}
	/*
	@Bean
	public CommandLineRunner loadData(InventoryRepository inventoryRepository){
		return args -> {
			Inventory inventory=new Inventory();
			inventory.setSkuCode("flori Ana");
			inventory.setQuantity(100);
			inventory.setName("Ana");

			Inventory inventory1=new Inventory();
			inventory1.setSkuCode("flori Oana");
			inventory1.setQuantity(0);
			inventory1.setName("Oana");
			inventoryRepository.save(inventory);
			inventoryRepository.save(inventory1);
		};
	} */
}
