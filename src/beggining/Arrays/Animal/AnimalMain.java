package beggining.Arrays.Animal;

import java.util.*;

public class AnimalMain {

    public static void main (String[] args){

        Animal al1 = new Animal("BKruzok", 2, "Dvornaga");
        Animal al2 = new Animal("CTreugolnic", 6, "Nimf");
        Animal al3 = new Animal("AKolobok", 1, "Cacadu");


        Set<Animal> alList = new TreeSet<>();

        alList.add(al1);
        alList.add(al2);
        alList.add(al3);

        System.out.println(alList);

        for (Animal animal : alList){
            System.out.println(animal.getName());
        }

    }
}
