package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class login {
    public static WebDriver driver;

    private static WebElement element;

    public static List<WebElement> webElementList;

    public login(WebDriver driver) {
        this.driver = driver;
    }

    public static WebElement txt_email() {
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/form/div[1]/div/fieldset/input"));
        return element;
    }
    public static WebElement txt_password() {
        element = driver.findElement(By.xpath("//input[@aria-label='Password']")); ////*[@id="root"]/div[1]/div/form/div[2]/div/fieldset/input
        return element;
    }

    public static WebElement btn_login() {
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/form/div[3]/button"));
        return element;
    }
}
