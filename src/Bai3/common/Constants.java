package Bai3.common;

public class Constants {
    private static String browser = "chrome";
    public static boolean report = true;
    public static boolean headless = false;

    public static String getBrowser() {
        return browser;
    }

    public static void setBrowser(String browser) {
        Constants.browser = browser;
    }

}
