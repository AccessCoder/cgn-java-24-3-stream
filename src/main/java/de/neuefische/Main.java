package de.neuefische;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Banana", "Banana",  "Orange", "Grapefruit", "Coconut", "Pineapple");

//        for (String s:fruits) {
//            if (s.contains("a")){
//                System.out.println(s);
//            }
//        }

        //Stream -> ab Java 8
        String streamedList = fruits.stream()
                //Verändernde Operationen
                //Filter
                .filter(currywurst -> currywurst.contains("a")) //Lambda Arrow Function "->"
                //Strukturelle Veränderung
                .peek(System.out::println)
                .map(c -> "You want a: " + c)
                .sorted()
                .distinct()
                .limit(3)
                .skip(1)
                //Terminator -> "Beendet Stream"
                    //.forEach(pommes -> System.out.println(pommes));
                    // .reduce(0, Integer::sum);
                .collect(Collectors.joining("\n"));

        System.out.println(streamedList);


    }
}