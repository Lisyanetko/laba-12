package org.example;

import java.util.Random;

public class Tester {
    String name;
    String surname;
    int experience_in_years;
    String english_level;
    int salary;

    public Tester() {
        this.name = "Unknown";
        this.surname = "Unknown";
        this.english_level = "Unknown";
        this.experience_in_years = 0;
        this.salary = 0;
    }
    public Tester(String name, String surname, int salary) {
        this();
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }
    public Tester(String name, String surname, int salary, int experience_in_years, String english_level) {
        this(name, surname, salary);
        this.experience_in_years = experience_in_years;
        this.english_level = english_level;
    }
    void testRun() {
        System.out.println("Test has run successfully");
    }
    void testRun(int success_rate) {
        if (success_rate == 10) {
            System.out.println("Test has run successfully");
        }
    }
    void testRun(int success_rate, String message) {
        if (success_rate == 10) {
            System.out.println(message);
        }
    }
    static void classMethod() {
        Random r = new Random();
        System.out.println("random number");
        System.out.println(r.nextDouble());
    }
}
