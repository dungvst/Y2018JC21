package DEMO.collection.sort;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionSortDemo {
    public static void main(String[] args) {
        List<Developer> lsDeveloper = new ArrayList<>();
        lsDeveloper.add(new Developer("mkyong", new BigDecimal("70000"), 33));
        lsDeveloper.add(new Developer("alvin", new BigDecimal("80000"), 20));
        lsDeveloper.add(new Developer("jason", new BigDecimal("100000"), 10));
        lsDeveloper.add(new Developer("iris", new BigDecimal("170000"), 55));


        System.out.println("Before Sort");
        for (Developer developer : lsDeveloper) {
            System.out.println(developer);
        }

       /* // Sử dụng java < 8
        Collections.sort(lsDeveloper, new Comparator<Developer>() {
            @Override
            public int compare(Developer o1, Developer o2) {
                // by age
                return o1.getAge() - o2.getAge();

                // by name
//                return o1.getName().compareTo(o2.getName());
            }
        });

        // Sủ dụng java 8, không sử dụng lamda
        lsDeveloper.sort(new Comparator<Developer>() {
            @Override
            public int compare(Developer o1, Developer o2) {
                return o1.getAge() - o2.getAge();
            }
        });*/

        // Sủ dụng java 8, có sử dụng lamda
//        lsDeveloper.sort((Developer o1, Developer o2) -> o1.getName().compareTo(o2.getName()));
//        lsDeveloper.sort(Comparator.comparing(Developer::getName));

        // Reverst order
        Comparator<Developer> salaryComparator = (o1, o2)->o1.getSalary().compareTo(o2.getSalary());
        lsDeveloper.sort(salaryComparator.reversed());


        System.out.println("After Sort");
        /*for (Developer developer : lsDeveloper) {
            System.out.println(developer);
        }*/

        // foreach with lamda
        lsDeveloper.forEach(developer -> System.out.println(developer));
    }
}
