package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class EcoligoLogin {
    public static WebDriver driver;

    private static WebElement element;

    public static List<WebElement> webElementList;

    public EcoligoLogin(WebDriver driver) {
        this.driver = driver;
    }

    public String txt_email = "//body/div[2]/div[2]/div[1]/div/form/div[1]/div/fieldset/input";
    public String txt_password = "//body/div[2]/div[2]/div[1]/div/form/div[2]/div/fieldset/input";
    public String btn_login = "//body/div[2]/div[2]/div[1]/div/form/div[3]";
    public String btn_lastpage = "//body/div[1]/div[2]/div/main/div/div[2]/div[2]/div/nav/ul/li[6]";
    public  WebElement btn_investments(){
        element = driver.findElement(By.xpath("//body/div[1]/div[2]/div/div/div/div[2]/div/li[1]/div/div/p"));
        return element;
    }
    public String gettext_btn_lastpage(){
        String value = "";
        element = driver.findElement(By.xpath("//body/div[1]/div[2]/div/main/div/div[2]/div[2]/div/nav/ul/li[6]"));
        value = element.getText();
        if (!value.isEmpty()){
            value = value.trim();
        }
        return value;
    }
    public int getTotalRow(){
        List<WebElement> listElements = driver.findElements(By.xpath("//body/div[1]/div[2]/div/main/div/div[2]/div[1]/table/tbody/tr"));
        int count = 0;
        count = listElements.size();
        return count;
    }

    public String getTextStatus(int row){
        String value = "";
        element = driver.findElement(By.xpath("//body/div[1]/div[2]/div/main/div/div[2]/div[1]/table/tbody/tr["+row+"]/th[1]/div"));
        value = element.getText();
        if (!value.isEmpty()){
            value = value.trim();
        }
        return value;
    }
    public String getTextProject(int row){
        String value = "";
        element = driver.findElement(By.xpath("//body/div[1]/div[2]/div/main/div/div[2]/div[1]/table/tbody/tr["+row+"]/th[2]/a"));
        value = element.getText();
        if (!value.isEmpty()){
            value = value.trim();
        }
        return value;
    }
    public String getTextInvestedOn(int row){
        String value = "";
        element = driver.findElement(By.xpath("//body/div[1]/div[2]/div/main/div/div[2]/div[1]/table/tbody/tr["+row+"]/th[3]"));
        value = element.getText();
        if (!value.isEmpty()){
            value = value.trim();
        }
        return value;
    }

    public String getTextInvestmentamount(int row){
        String value = "";
        element = driver.findElement(By.xpath("//body/div[1]/div[2]/div/main/div/div[2]/div[1]/table/tbody/tr["+row+"]/th[4]"));
        value = element.getText();
        if (!value.isEmpty()){
            value = value.trim();
        }
        return value;
    }

    public String getTextRepayments(int row){
        String value = "";
        element = driver.findElement(By.xpath("//body/div[1]/div[2]/div/main/div/div[2]/div[1]/table/tbody/tr["+row+"]/th[5]"));
        value = element.getText();
        if (!value.isEmpty()){
            value = value.trim();
        }
        return value;
    }
    public String getTextCapitaloutstanding(int row){
        String value = "";
        element = driver.findElement(By.xpath("//body/div[1]/div[2]/div/main/div/div[2]/div[1]/table/tbody/tr["+row+"]/th[6]"));
        value = element.getText();
        if (!value.isEmpty()){
            value = value.trim();
        }
        return value;
    }
    public String country(int row){
        String value = "";
        element = driver.findElement(By.xpath("//body/div[1]/div[2]/div/main/div/div[2]/div[1]/table/tbody/tr["+row+"]/th[7]"));
        value = element.getText();
        if (!value.isEmpty()){
            value = value.trim();
        }
        return value;
    }


}