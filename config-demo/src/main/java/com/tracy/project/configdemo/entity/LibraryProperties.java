package com.tracy.project.configdemo.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

@Component
@ConfigurationProperties(prefix = "library")
@Setter
@Getter
@ToString
public class LibraryProperties {
    private String location;
    private static List<Book> books;



    public  void myMethod2(){
        books = new ArrayList<>();
    }
}
