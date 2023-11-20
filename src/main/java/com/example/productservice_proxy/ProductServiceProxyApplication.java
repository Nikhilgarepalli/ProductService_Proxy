package com.example.productservice_proxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductServiceProxyApplication {

    public static void main(String[] args) {
        System.out.println("This is checking for server running or not");

        SpringApplication.run(ProductServiceProxyApplication.class, args);
    }

}
