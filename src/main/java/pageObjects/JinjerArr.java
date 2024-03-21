package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class JinjerArr {
    public static WebDriver driver;

    private static WebElement element;

    public static List<WebElement> webElementList;

    public JinjerArr(WebDriver driver) {
        this.driver = driver;
    }

    public String txtCompanyId = "//body/div/div[1]/div[1]/section/section/form/dl[1]/dd/input";

    public String txtStaffId = "//body/div/div[1]/div[1]/section/section/form/dl[2]/dd/input";

    public String txtPassword = "//body/div/div[1]/div[1]/section/section/form/dl[3]/dd/input";

    public String btnLogin = "//body/div/div[1]/div[1]/section/section/form/button";

    public String btnRecordRequest = "//body/div/div[1]/div[1]/div[2]/ul/li[2]/a";

    public String btnLastPage = "//div/div/div/div[2]/div/div/div/ul/li[7]";
//    public String btnCoppy = "//body/div[1]/div[2]/div/div[2]/div/div[2]/div/div/div/div[2]/div/div/table/tbody/tr[6]/td[11]/a[1]/button";

    public String gettextlastpage(){
        String value = "";
        element = driver.findElement(By.xpath("//div/div/div/div[2]/div/div/div/ul/li[6]"));
        value = element .getText();
        if (!value.isEmpty()){
            value = value.trim();
        }return  value;
    }

    public int gettotalrowPerPage() {
        List<WebElement> listElement = driver.findElements(By.xpath("//table/tbody/tr"));
        int count = 0;
        count = listElement.size();
        return count;
    }
    public String getTextFormRegister(int row){
        element = driver.findElement(By.xpath("//div/div/div/div[2]/div/div/table/tbody/tr["+row+"]/td[1]"));
        String value = "";
        value = element.getText();
        if (!value.isEmpty()){
            value.trim();
        }
        return value;
    }
    public String getTextPayment(int row){
        element = driver.findElement(By.xpath("//div/div/div/div[2]/div/div/table/tbody/tr["+row+"]/td[2]"));
        String value = "";
        value = element.getText();
        if (!value.isEmpty()){
            value.trim();
        }
        return value;
    }
    public String getTextActualNumber(int row){
        element = driver.findElement(By.xpath("//div/div/div/div[2]/div/div/table/tbody/tr["+row+"]/td[3]"));
        String value = "";
        value = element.getText();
        if (!value.isEmpty()){
            value.trim();
        }
        return value;
    }
    public String getTextNoBefore(int row){
        element = driver.findElement(By.xpath("//div/div/div/div[2]/div/div/table/tbody/tr["+row+"]/td[4]"));
        String value = "";
        value = element.getText();
        if (!value.isEmpty()){
            value.trim();
        }
        return value;
    }
    public String getTextDate(int row){
        element = driver.findElement(By.xpath("//div/div/div/div[2]/div/div/table/tbody/tr["+row+"]/td[5]"));
        String value = "";
        value = element.getText();
        if (!value.isEmpty()){
            value.trim();
        }
        return value;
    }
    public String getTextTotal(int row){
        element = driver.findElement(By.xpath("//div/div/div/div[2]/div/div/table/tbody/tr["+row+"]/td[6]"));
        String value = "";
        value = element.getText();
        if (!value.isEmpty()){
            value.trim();
        }
        return value;
    }
    public String getTextDifferences(int row){
        element = driver.findElement(By.xpath("//div/div/div/div[2]/div/div/table/tbody/tr["+row+"]/td[7]"));
        String value = "";
        value = element.getText();
        if (!value.isEmpty()){
            value.trim();
        }
        return value;
    }

}