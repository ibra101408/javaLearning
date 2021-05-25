package Test3;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;

public class TestRead {
    public static void main(String[] args) {
        List<MyObject> list = new ArrayList<>();
        list.add(new MyObject("John"));
       // System.out.println(list.stream().filter(o -> o.getName().equals(name)).findFirst().isPresent());
    }
        public boolean containsName(final List<MyObject> list, final String name){
            return list.stream().filter(o -> o.getName().equals(name)).findFirst().isPresent();

    }
}






 /* int a = 0;
        for (int i = 0; i <= 100; i++) {
            if (a == i % 3) {
                System.out.println(i);            //печатать цифры делящиеся на 3 и 5
            }
            if (a == i % 5) {
                System.out.println(i + " Buzz");
            }
            if (a == i % 5 && a == i % 3) {
                System.out.println( "FizzBuzz ");
            }
        }*/