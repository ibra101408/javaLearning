package beggining.Arrays;

import java.util.ArrayList;
import java.util.List;

public class Average {
    public static void main(String[] args) {
        List<Person> person = new ArrayList<>();
        person.add(new Person("Volodja", 19));
        person.add(new Person("Anastasija", 20));
        person.add(new Person("Borja", 8));
        person.add(new Person("Dan", 6));

        person.stream().
                filter( p -> p.getAge() >= 18).
                sorted( (p1, p2) -> p1.getName().compareTo(p2.getName())).
                map( p -> p.getAge()).
                forEach( System.out :: println);

       //Грамозткий вариант подсчета средней
        int summa = 0;
        int adultPerson = 0;
        for (Person p : person)
            if(p.getAge() >= 18)
            {
                summa += p.getAge();
                adultPerson++;
        }
        double averageAge = (double) summa/adultPerson;

            System.out.println(averageAge);


            //легкий способ решения
            double averageAge2 = person.stream().
                    filter(p -> p.getAge() >=18).
                    mapToInt(p -> p.getAge()).average().getAsDouble();
                    System.out.println(averageAge2);
    }
}
