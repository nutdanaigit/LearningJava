package com.learning.java.functional;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Augmentis on 6/11/2017.
 */
public class StreamLearning {

    private static final int CHECK = 5;

    public static void main(String[] args) {
        Stream<String> stm = Stream.of("HTML5", "JAVA", "ASP.NET", "Visual C", "C#", "Google");
        Stream<Integer> stmInt = Stream.of(1, 4, 5, 20, 44);
        Stream<Boolean> stmBool = Stream.of(false, false, true, false, false);
        Boolean[] arrBool = {false, false, false, false, true, false};
        Person[] arrPerson = {new Person(5, "Google", false),
                new Person(2, "Facebook", false),
                new Person(3, "Mama", false),
                new Person(4, "Youtube", true),
                new Person(1, "Pearl", false)};

        System.out.println("==================================== Knowledge Stream =========================================");
        List<String> list = Arrays.asList(arrPerson).stream().map(Person::getName).collect(Collectors.toList());
        System.out.println(list);
        System.out.println();

        List<Boolean> list2 = Arrays.asList(arrPerson).stream().map(Person::isCheck).collect(Collectors.toList());
        System.out.println(list2);
        System.out.println();

        List<Person> listPerson = Arrays.asList(arrPerson).stream()
                .sorted(Comparator.comparing(Person::getId))
                .collect(Collectors.toList());
        listPerson.stream().sorted(Comparator.comparing(Person::isCheck).reversed()).forEach(System.out::println);
        System.out.println();

        List<Integer> list3 =Arrays.asList(arrPerson).stream().map(Person::getId).sorted().collect(Collectors.toList());
        System.out.println(list3);
        System.out.println();


        switch (CHECK) {
            case 0:
                exampleOne(stm);
                break;
            case 1:
                exampleTwo(stm);
                break;
            case 2:
                exampleThree(stm);
                break;
            case 3:
                exampleFour(stmInt);
                break;
            case 4:
                exampleFive(arrBool);
                break;
            case 5:
                exampleSix(arrPerson);
                break;
        }
    }

    private static void exampleOne(Stream<String> stm) {
        stm.sorted().forEach(System.out::println);
    }

    private static void exampleTwo(Stream<String> stm) {
        Function<String, String> changToLowerString = String::toLowerCase;
        stm.map(changToLowerString).sorted().forEach(System.out::println);
    }

    private static void exampleThree(Stream<String> stm) {
        Function<String, String> changToLowerString = String::toLowerCase;
        stm.map(changToLowerString).limit(3).sorted().forEach(System.out::println);
    }

    private static void exampleFour(Stream<Integer> stmInt) {
        stmInt.map(o -> o * 100).forEach(System.out::println);
    }

    private static void exampleFive(Boolean[] booleans) {
//        stmBool.filter(aBoolean -> aBoolean.equals(true)).forEach(System.out::println);
//        IntStream.range(0, booleans.length).filter(b -> booleans[b].equals(true)).sorted().forEach(System.out::println);
        Arrays.stream(booleans).sorted(Comparator.comparing(Boolean::booleanValue).reversed()).forEach(System.out::println);
    }

    private static void exampleSix(Person[] arrPerson) {
        //TODO : Solution 1
        Arrays.stream(arrPerson).
                sorted(Comparator.comparing(Person::isCheck).reversed())
                .forEach(System.out::println);

        //TODO : Solution 2
//        Arrays.stream(arrPerson).filter(s->s.isCheck)
//                .sorted()
//                .forEach(System.out::println);
    }

    public static class Person {
        private int id;
        private String name;
        private boolean isCheck;

        public Person(int id, String name, boolean isCheck) {
            this.id = id;
            this.name = name;
            this.isCheck = isCheck;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public boolean isCheck() {
            return isCheck;
        }

        public void setCheck(boolean check) {
            isCheck = check;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", isCheck=" + isCheck +
                    '}';
        }
    }
}
