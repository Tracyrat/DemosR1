package com.tracy.project.configdemo;

import com.tracy.project.configdemo.entity.Book;
import com.tracy.project.configdemo.entity.LibraryProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConfigDemoApplication implements CommandLineRunner {

    private final LibraryProperties libraryProperties;


    @Value("${wuhan2020}")
    private String place;


    public ConfigDemoApplication(LibraryProperties libraryProperties) {
        this.libraryProperties = libraryProperties;
    }

    public static void main(String[] args) {
        SpringApplication.run(ConfigDemoApplication.class, args);
    }

    /*@Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(place);
        System.out.println(url);
        System.out.println(libraryProperties.getLocation());
        System.out.println(libraryProperties.getBooks());
    }*/

    @Override
    public void run(String... args) throws Exception {
        Book book = new Book("汤姆叔叔的小屋","啦啦啦啦啦");
    }

}
