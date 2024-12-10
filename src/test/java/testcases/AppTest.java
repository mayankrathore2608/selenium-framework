package testcases;

import base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ReadConfig;

public class AppTest {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        BaseClass baseClass = new BaseClass();
        baseClass.setup();
        driver.get(ReadConfig.getAppConfig("base_url"));
        System.out.println(System.getProperty("user.dir"));


    }
}