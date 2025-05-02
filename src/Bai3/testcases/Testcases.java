package Bai3.testcases;

import Bai3.common.BaseTest;

public class Testcases extends BaseTest {
    public void testLogin() {
        createDriver();
        System.out.println("Mở trình duyệt web và truy cập vào trang https://cms.anhtester.com/login");
        System.out.println("Nhập email: admin ");
        System.out.println("Enter password: 123456");
        System.out.println("Click login button");
        System.out.println("Verify menu Dashboard is display");
        closeDriver("Chrome");
    }

    public void testAddCategory() {
        createDriver("Firefox");
        System.out.println("Navigate to https://cms.anhtester.com/login");
        System.out.println("Enter email: admin@example.com");
        System.out.println("Enter password: 123456");
        System.out.println("Click login button");
        System.out.println("Verify menu Dashboard is display");
        System.out.println("Click menu Products");
        System.out.println("Click menu Category");
        System.out.println("Verify redirect to the Category page");
        System.out.println("Click Add New Category button");
        System.out.println("Enter form data to add new category");
        System.out.println("Click Save button");
        System.out.println("Verify new category added successfully");
        System.out.println("Verify the new category information is correct");
        closeDriver("Firefox");
    }

    public static void main(String[] args) {
        Testcases testcases = new Testcases();
        testcases.testLogin();
        System.out.println("======================================================== ");
        testcases.testAddCategory();
    }
}
