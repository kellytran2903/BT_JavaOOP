package Bai2.Person;

public class Person {
    public String name;
    public String age;
    public String gender;

    protected String address;
    protected String phone;

    public Person(String name, String age, String gender, String address, String phone){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    };

//    public void getInfo(){
//        System.out.println("Ten: " + name);
//        System.out.println("Tuoi: " + age);
//        System.out.println("Gioi tinh: " + gender);
//        System.out.println("Dia chi: " + address);
//        System.out.println("Sdt: " + phone);
//    }
}
