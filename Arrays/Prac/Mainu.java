package Prac;

import java.util.ArrayList;
import java.util.List;

public class Mainu extends Employees {


    public Mainu(int id, String name, int salary) {
        super(id, name, salary);
    }

    public static void main(String[] args) {
        List<Employees> emp = new ArrayList<>();
        emp.add(new Employees(1, "Arun", 11000));
        emp.add(new Employees(1, "Akki", 20000));
        emp.add(new Employees(2, "ram", 3000));
        emp.stream().filter(i -> i.getSalary() > 10000).forEach(System.out::println);
    }
}