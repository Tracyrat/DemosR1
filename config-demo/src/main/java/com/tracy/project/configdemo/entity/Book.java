package com.tracy.project.configdemo.entity;

import com.tracy.project.configdemo.util.ThreadLocalUtil;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.web.context.request.RequestContextHolder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;

    public Book(String name,String description) {
        this.name = name;
        this.description = description;
    }

    public static void main(String[] args) {
        for(int i = 0;i<50;i++){
            new Thread(()->{
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                String format = ThreadLocalUtil.format(new Date());
                System.out.println("当前线程:"+Thread.currentThread()+"--时间为："+format);
            }).start();
        }
    }
}
