package Bai2.Person;

public class Information {
    public static void main(String[] args) {
        Person person = new Person("Kelly", "27", "Female", "Da Nang", "0123456788");

//        person.getInfo();
        System.out.println("Ten: " + person.name);
        System.out.println("Tuoi: " + person.age);
        System.out.println("Gioi tinh: " + person.gender);
        System.out.println("Dia chi: " + person.address);
        System.out.println("Sdt: " + person.phone);
    }
}
