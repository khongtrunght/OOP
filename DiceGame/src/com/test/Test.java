package com.test;

import com.b3.Employee;
import com.b3.Manager;
import com.b3.Person;

import java.util.ArrayList;
import java.util.Set;

public class Test {

    public static final int MS = 2;
    public static final int ES = 3;
    public static final int PS = 3;

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        ArrayList<Employee> employees = new ArrayList<>();
        ArrayList<Manager> managers = new ArrayList<>();

        for (int i = 0; i< PS; i++){
            Person a = new Person();
            a.nhap();
            people.add(a);
        }

        for (int i=0; i< ES; i++){
            Employee employee = new Employee();
            employee.nhap();
            employees.add(employee);
        }

        for (int i=0; i<MS; i++){
            Manager manager = new Manager();
            manager.nhap();
            manager.setAssistant(employees.get(i));
            managers.add(manager);
        }

        int numAssistants = MS;
        for (int i = 0; i < MS; i++){
            for (int j = i+1; j < MS; j ++){
                if (managers.get(i).getAssistant().equals(managers.get(j).getAssistant())){
                    numAssistants --;
                }
            }
        }

        System.out.println(numAssistants);

        // Nhan vien trung
        Boolean trung = false;
        Employee e1 = new Employee();
        for (Employee e : employees){
            if (e.equals(e1)){
                trung = true;
            }
        }

        if (trung){
            System.out.println("Trung");
        } else {
            System.out.println("Ko Trugn");
        }


//     tong luong
        int totalSalary = 0;
        for (Employee e : employees){
            totalSalary += e.getSalary();
        }
        for (Manager m : managers){
            totalSalary += m.getSalary();
        }

        System.out.println(totalSalary);
    }
}
