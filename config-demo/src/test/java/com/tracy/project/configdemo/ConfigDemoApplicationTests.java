package com.tracy.project.configdemo;

import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Iterator;

@SpringBootTest
class ConfigDemoApplicationTests {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("3");
        list.add("4");
        list.add("4");
        list.add("5");
        System.out.println(list);
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            if("3".equals(iterator.next()))
               list.remove(iterator.next());
        }
     /*  for(int i = 0;i<list.size();i++){
           if("3".equals(list.get(i)))
               list.remove(list.get(i));
       }*/
        /*for(String s : list){
            if("3".equals(s))
                list.remove(s);
        }*/
        Iterator it2 = list.iterator();
        System.out.println(list);

    }


    @Test
    public void myTest(){


    }
}
