package Bai1;

public class NhanVien {
    public String employeeCode;
    public String name;
    public String phone;
    public String address;
    public String check;

    public NhanVien(String employeeCode, String name, String phone, String address){
        this.employeeCode = employeeCode;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public void getInfo(){
        System.out.println("MSNV: " + employeeCode);
        System.out.println("Ten: " + name);
        System.out.println("Sdt: " + phone);
        System.out.println("Dia chi: " + address);
    }
}
