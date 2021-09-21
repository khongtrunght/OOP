package com.b3;

import java.util.Scanner;

public class Employee extends Person{
    private int salary;

    @Override
    public String getDetail() {
        return super.getDetail() + " salary " + salary;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner scan = new Scanner(System.in);
        System.out.println("Salary: ");
        salary = scan.nextInt();
    }

    public int getSalary() {
        return salary;
    }
}
