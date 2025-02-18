package com.shopping.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.shopping.service.OnlineShoppingService;

public class MainApp {
    public static void main(String[] args) {
        // Load applicationContext.xml
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get ShoppingService Bean
        OnlineShoppingService shoppingService = (OnlineShoppingService) context.getBean("shoppingService");

        // Perform Purchase
        shoppingService.performPurchase();

        // Close context
        ((ClassPathXmlApplicationContext) context).close();
    }
}
