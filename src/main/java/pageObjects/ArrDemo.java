package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ArrDemo {
    public static WebDriver driver;

    private static WebElement element;

    public static List<WebElement> webElementList;

    public ArrDemo(WebDriver driver) {
        this.driver = driver;
    }

//    public String getbienxe(int row){
//        String value = "";
//        element = driver.findElement(By.xpath("//body/div[2]/div[4]/div[2]/div/div[1]/div[3]/table/tbody/tr["+row+"]/td[1]"));
//        value = element.getText();
//        if (!value.isEmpty()){
//            value = value.trim();
//        }
//        return value;
//    }
    public String getbienxe(int row){
        String locator = "//body/div[2]/div[4]/div[2]/div/div[1]/div[3]/table/tbody/tr["+row+"]/td[1]";
        String value = "";
        value = driver.findElement(By.xpath(locator)).getText();
        if (!value.isEmpty()){
            value = value.trim();
        }
        return value;
    }
    public String gettinhthanh(int row){
        String locator = "//body/div[2]/div[4]/div[2]/div/div[1]/div[3]/table/tbody/tr["+row+"]/td[2]";
        String value = "";
        value = driver.findElement(By.xpath(locator)).getText();
        if (!value.isEmpty()){
            value = value.trim();
        }
        return value;
    }
    public int getsizetable(){
        List <WebElement> listElement = driver.findElements(By.xpath("//body/div[2]/div[4]/div[2]/div/div[1]/div[3]/table/tbody/tr"));
        return listElement.size();
    }

}
