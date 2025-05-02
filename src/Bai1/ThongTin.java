package Bai1;

public class ThongTin {
    public static void main(String[] args) {
        NhanVien nhanVien1 = new NhanVien("MS01", "Employee 1", "0111111111", "Address 1");
        NhanVien nhanVien2 = new NhanVien("MS02", "Employee 2", "0222222222", "Address 2");

        nhanVien1.getInfo();
        System.out.println("================");
        nhanVien2.getInfo();
    }
}
