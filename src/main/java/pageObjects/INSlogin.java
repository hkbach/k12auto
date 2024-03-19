package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class INSlogin {
    public static WebDriver driver;

    private static WebElement element;

    public static List<WebElement> webElementList;

    public INSlogin(WebDriver driver) {this.driver = driver;
    }

    public static WebElement txt_username() {
        element = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input"));
        return element;
    }
    public static WebElement txt_password() {
        element = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input")); ////*[@id="root"]/div[1]/div/form/div[2]/div/fieldset/input
        return element;
    }

    public static WebElement btn_login() {
        element = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]"));
        return element;
    }
    public static WebElement lbl_error() {
        element = driver.findElement(By.xpath("//div[1]/div[2]/form/span/div"));
        return element;
    }
}
