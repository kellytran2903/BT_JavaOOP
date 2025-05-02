package Bai2.Company;

import Bai2.Person.Person;

public class Company {
    public static void main(String[] args) {
        Person person = new Person("Person 1", "30", "Male", "Quang Nam", "0111111111");
        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.gender);
    }
}
