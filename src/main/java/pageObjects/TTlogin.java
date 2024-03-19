package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TTlogin {
    public static WebDriver driver;

    private static WebElement element;

    public static List<WebElement> webElementList;

    public TTlogin(WebDriver driver) {this.driver = driver;
    }

    public String txt_email = "//body/div[1]/div[1]/div[2]/div[2]/div[2]/div/div/div/div/form/div[2]/input[1]";
    public String txt_password = "//body/div[1]/div[1]/div[2]/div[2]/div[2]/div/div/div/div/form/div[2]/input[2]";

    public String btn_login = "//body/div[1]/div[1]/div[2]/div[2]/div[2]/div/div/div/div/form/div[2]/input[2]";
}
