package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Date;
import java.util.List;

public class campaigns {
    public static WebDriver driver;

    private static WebElement element;

    private static List<WebElement> webElementList;

    public campaigns (WebDriver driver) {
        this.driver = driver;
    }


    public static WebElement title() {
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/main/div/div[1]/div[1]/span"));
        return element;
    }


    // Input search by name
    public static WebElement input_SearchByName() {
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/main/div/div[1]/div[2]/div/div/fieldset/form/input"));
        return element;
    }

    public static WebElement btn_X_SearchByName() {
        element = driver.findElement((By.xpath("//fieldset[@placeholder='Search by name']//button")));
        return element;
    }


    // Panel filter
    public static WebElement panel_Filter() {
        element = driver.findElement(By.xpath("/html/body/div[2]/div[3]"));
        return element;
    }
    public static WebElement btn_Filter() {
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/main/div/div[1]/div[2]/button[2]"));
        return element;
    }

    public static WebElement btn_ResetAllFilter() {
        element = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button[1]"));
        return element;
    }
    public static WebElement btn_ApplyFilter() {
        element = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button[2]"));
        return element;
    }

    public static WebElement btn_X_PanelFilter() {
        element = driver.findElement(By.xpath("//button[@aria-label='close']"));
        return element;
    }





    // Countries and Status
    public static WebElement checkbox_PanelFilter(String arg0) {
        element = driver.findElement(By.xpath("//span//input[@value='"+arg0+"']"));
        return element;
    }

    public static List<WebElement> checkboxes_checked() {
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox'][@checked]"));
        return checkboxes;
    }


    // Table_Filter
    public static List<WebElement> tableHeader_Column() {
        webElementList = driver.findElements(By.xpath("//table/thead/tr/th"));
        return webElementList;
    }
    public static List<WebElement> tableRow() {
        webElementList = driver.findElements(By.xpath("//table/tbody/tr"));
        return webElementList;
    }
    public static List<WebElement> tableCell() {
        webElementList = driver.findElements(By.xpath("//table/tbody/tr/th"));
        return webElementList;
    }

    public static List<WebElement> checkValueColumn(int i) {
        webElementList = driver.findElements(By.xpath("//table/tbody/tr/th["+i+"]"));
        return webElementList;
    }

    // Finance Volume
    public static WebElement input_FromFinanceVolume() {
        element = driver.findElement(By.xpath("//div[@id='Finance volume']//input[@aria-label='From']"));
        return element;
    }

    public static WebElement input_ToFinanceVolume() {
        element = driver.findElement(By.xpath("//div[@id='Finance volume']//input[@aria-label='To']"));
        return element;
    }

    // Investments
    public static WebElement input_FromInvestments() {
        element = driver.findElement(By.xpath("//div[@id='Investments']//input[@aria-label='From']"));
        return element;
    }

    public static WebElement input_ToInvestments() {
        element = driver.findElement(By.xpath("//div[@id='Investments']//input[@aria-label='To']"));
        return element;
    }

    // Navigation
    public static WebElement arrow_LastPage() {
        element = driver.findElement(By.xpath("//button[@aria-label='Go to last page']"));
        return element;
    }

    public static WebElement arrow_NextPage() {
        element = driver.findElement(By.xpath("//button[@aria-label='Go to next page']"));
        return element;
    }

    // No result
    public static WebElement textNoResultLineOne() {
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/main/div/div[2]/div[1]/table/tbody/tr/td/div/div/p[1]"));
        return element;
    }

    public static WebElement textNoResultLineTwo() {
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/main/div/div[2]/div[1]/table/tbody/tr/td/div/div/p[2]"));
        return element;
    }

    // Counter result
    public static List<WebElement> btns_Navigation() {
        webElementList = driver.findElements(By.xpath("//*[@id=\"root\"]/div[1]/main/div/div[2]/div[2]/div/nav/ul/li/button"));
        return webElementList;
    }

    public static WebElement navigation() {
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/main/div/div[2]/div[2]/div/nav"));
        return element;
    }

    public static WebElement counterResult() {
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/main/div/div[2]/div[2]/div/span"));
        return element;
    }
}
