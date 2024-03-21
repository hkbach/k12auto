package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class VietlottArr {
    public static WebDriver driver;

    private static WebElement element;

    public static List<WebElement> webElementList;

    public VietlottArr(WebDriver driver) {
        this.driver = driver;
    }

    public String getTextNgaymothuong(int row){
        element = driver.findElement(By.xpath("//div[4]/div[1]/div/div/div[1]/div[2]/table/tbody/tr["+row+"]/td[1]"));
        String value = "";
        value = element.getText();
        if (!value.isEmpty()){
            value.trim();
        }
        return value;
    }

    public String getTextKetQua(int row){
        element = driver.findElement(By.xpath("//div[4]/div[1]/div/div/div[1]/div[2]/table/tbody/tr["+row+"]/td[2]"));
        String value = "";
        value = element.getText();
        if (!value.isEmpty()){
            value.trim();
        }
        return value;
    }
    public String getTextGiaiJackBot1(int row){
        element = driver.findElement(By.xpath("//div[4]/div[1]/div/div/div[1]/div[2]/table/tbody/tr["+row+"]/td[3]"));
        String value = "";
        value = element.getText();
        if (!value.isEmpty()){
            value.trim();
        }
        return value;
    }
    public String getTextGiaiJackBot2(int row){
        element = driver.findElement(By.xpath("//div[4]/div[1]/div/div/div[1]/div[2]/table/tbody/tr["+row+"]/td[4]"));
        String value = "";
        value = element.getText();
        if (!value.isEmpty()){
            value.trim();
        }
        return value;
    }
    public int gettotalrow (){
        List<WebElement> listElement = driver.findElements(By.xpath("//div[4]/div[1]/div/div/div[1]/div[2]/table/tbody/tr"));
        int count = 0;
        count = listElement.size();
        return count;
    }
//    public WebElement gettext06(){
//        element = driver.findElement(By.xpath("//div/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/span[1]"));
//        return element;
//    }
public String getText06(int row){
    element = driver.findElement(By.xpath("//div/div/div[1]/div[2]/table/tbody/tr["+row+"]/td[2]/span"));
    String value = "";
    value = element.getText();
    if (!value.isEmpty()){
        value.trim();
    }
    return value;
}
    public int getTotalKetQua(){
        List<WebElement> listElement = driver.findElements(By.xpath("/html/body/div[4]/div[1]/div/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/span"));
        int count = 0;
        count = listElement.size();
        return count;
        }

}
