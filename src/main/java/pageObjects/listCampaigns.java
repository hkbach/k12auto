package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class listCampaigns {

    public static WebDriver driver;

    private static WebElement element;

    public static List<WebElement> webElementList;

    public listCampaigns(WebDriver driver) {
        this.driver = driver;
    }

    public static WebElement filter() {
        element = driver.findElement(By.xpath("//body/div[3]/div[3]"));
        return element;
    }

    public static WebElement checkbox_ReadyToLaunch() {
        element = driver.findElement(By.xpath("//*[@id=\"Status\"]/div/div[2]/div[2]/span/input"));
        return element;
    }

    public static WebElement checkbox_active() {
        element = driver.findElement(By.xpath("//*[@id=\"Status\"]/div/div[3]/div[2]"));
        return element;
    }

    public static WebElement checkbox_closed() {
        element = driver.findElement(By.xpath("//*[@id=\"Status\"]/div/div[4]/div[2]/span/input"));
        return element;
    }

    public static WebElement checkbox_fullyFunded() {
        element = driver.findElement(By.xpath("//*[@id=\"Status\"]/div/div[5]/div[2]/span/input"));
        return element;
    }

    public static WebElement checkbox_partFunded() {
        element = driver.findElement(By.xpath("//*[@id=\"Status\"]/div/div[6]/div[2]/span/input"));
        return element;
    }

    public static WebElement checkbox_notFunded() {
        element = driver.findElement(By.xpath("//*[@id=\"Status\"]/div/div[7]/div[2]/span/input"));
        return element;
    }

    public static WebElement checkbox_Draft() {
        element = driver.findElement(By.xpath("//*[@id=\"Status\"]/div/div[1]/div[2]/span/input"));
        return element;
    }

    public static WebElement btn_X() {
        element = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/button"));
        return element;
    }

    public static WebElement btn_applyFilters() {
        element = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button[2]"));
        return element;
    }

    public static WebElement btn_filter() {
        element = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/div[1]/div[2]/button[2]"));
        return element;
    }


    public static WebElement btn_nextPage() {
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/main/div/div[2]/div[2]/div/nav/ul/li[5]"));
        return element;
    }
    public static WebElement txt_from() {
        element = driver.findElement(By.xpath("//*[@id=\"Finance volume\"]/div/div/div[1]/fieldset/input"));
        return element;
    }

    public static WebElement txt_to() {
        element = driver.findElement(By.xpath("//*[@id=\"Finance volume\"]/div/div/div[2]/fieldset/input"));
        return element;
    }

    public static WebElement txt_fromI() {
        element = driver.findElement(By.xpath("//*[@id=\"Investments\"]/div/div/div[1]/fieldset/input"));
        return element;
    }

    public static WebElement txt_toI() {
        element = driver.findElement(By.xpath("//*[@id=\"Investments\"]/div/div/div[2]/fieldset/input"));
        return element;
    }

    public static WebElement error_numberOnly() {
        element = driver.findElement(By.xpath(""));
        return element;
    }
//    public static WebElement btn_page_num(int i) {
//        element = driver.findElement(By.xpath("//ul[@id='paginationKQTT']/li[@jp-data='"+i+"']")); //biến i đã được khai báo bann đầu
//        return  element;
//    }
    public static WebElement btn_lastPage () {
        List<WebElement> paging = driver.findElements(By.xpath("//ul[@class='MuiPagination-ul css-nhb8h9']/li"));
        int lastPageLocation = paging.size() - 3;

        element = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/div[2]/div[2]/div[1]/nav[1]/ul[1]/li["+lastPageLocation+"]")); //biến lastPageLocation đã được khai báo bann đầu
        return  element;
    }


}
