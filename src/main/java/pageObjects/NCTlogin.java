package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NCTlogin {
    public static WebDriver driver;

    private static WebElement element;

    public static List<WebElement> webElementList;

    public NCTlogin(WebDriver driver) {this.driver = driver;
    }

    public static WebElement btn_login1() {
        element = driver.findElement(By.xpath("//body/div[1]/div/div/div[2]/div[5]/div/div/a[1]/div/p"));
        return element;
    }

    public static WebElement txt_username() {
        element = driver.findElement(By.xpath("//body/div[2]/div[2]/div/div[2]/div/form/div/div[2]/input"));
        return element;
    }
    public static WebElement txt_password() {
        element = driver.findElement(By.xpath("//body/div[2]/div[2]/div/div[2]/div/form/div/div[3]/input")); ////*[@id="root"]/div[1]/div/form/div[2]/div/fieldset/input
        return element;
    }

    public static WebElement btn_login2() {
        element = driver.findElement(By.xpath("//body/div[2]/div[2]/div/div[2]/div/form/div/a"));
        return element;
    }
}
