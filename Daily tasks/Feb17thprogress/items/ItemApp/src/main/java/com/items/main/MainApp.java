package com.items.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.items.service.ItemService;

public class MainApp {
    public static void main(String[] args) {
        // Load applicationContext.xml
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get ItemService Bean
        ItemService itemService = (ItemService) context.getBean("itemService");

        // Display Item Details
        itemService.displayItem();

        // Close context
        ((ClassPathXmlApplicationContext) context).close();
    }
}
