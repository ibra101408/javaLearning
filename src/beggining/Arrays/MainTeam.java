package beggining.Arrays;

import java.util.*;

public class MainTeam {
    public static void main (String[] args){

        List<String> list = new ArrayList<>();

        list.add("John");
        list.add("Sam");
        list.add("Mary");
        list.add("Smith");
        list.add("Adam");


        Set<String> set = new LinkedHashSet<>(list);

        System.out.println(set);
        System.out.println(list);
    }
}                ////[Adam, Smith, John, Sam, Mary]
                /////[John, Sam, Mary, Smith, Adam]
