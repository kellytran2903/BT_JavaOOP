package Bai3.common;

public class BaseTest {
    public void createDriver(){
        System.out.println("Browser: " + Constants.getBrowser()); //Thay vì Constants.Biến, có thể Constant.Hàm => Thể hiện tính đóng gói (Xem class BaseTest)
        System.out.println("Report: " + Constants.report);
        System.out.println("Headless: " + Constants.headless);
    };

    public void createDriver(String browser){
        System.out.println("Browser: " + Constants.getBrowser());
        System.out.println("Report: " + Constants.report);
        System.out.println("Headless: " + Constants.headless);
    };

    public void closeDriver(String browser){
        System.out.println("Closed browser: " + browser);
    };

    public void closeDriver(){
        System.out.println("Closed browser: " + Constants.getBrowser());
    };
}
