package com.inventory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.inventory.service.InventoryService;

public class MainApp {
    public static void main(String[] args) {
        // Load applicationContext.xml
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get InventoryService Bean
        InventoryService inventoryService = (InventoryService) context.getBean("inventoryService");

        // Display Inventory Details
        inventoryService.displayInventory();

        // Close context
        ((ClassPathXmlApplicationContext) context).close();
    }
}
