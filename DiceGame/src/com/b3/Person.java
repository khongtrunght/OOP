package com.b3;

import java.util.Objects;
import java.util.Scanner;

public class Person {

    private String name;
    private int year;
    protected String ID;

    public void nhap(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Year: ");
        year = scan.nextInt();
        System.out.println("Name :");
        name = scan.next();
        System.out.println("ID : ");
        ID = scan.next();
    }

    public String getDetail(){
        return String.format("Toi la %s, sinh nam %d, id %s", name, year, ID);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return ID.equals(person.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }
}
