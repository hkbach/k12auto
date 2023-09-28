package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Collections;
import java.util.List;

public class listCampaigns {

    public static WebDriver driver;

    private static WebElement element;

    public static List<WebElement> webElementList;

    public listCampaigns(WebDriver driver) {
        this.driver = driver;
    }

    public static WebElement filter() {
        element = driver.findElement(By.xpath("/html/body/div[2]/div[3]"));
        return element;
    }

    public static WebElement checkbox_ReadyToLaunch() {
        element = driver.findElement(By.xpath("//input[@value='Ready to launch']"));
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
        element = driver.findElement(By.xpath("//button[@aria-label='close']"));
        return element;
    }

    public static WebElement btn_applyFilters() {
        element = driver.findElement(By.xpath("//button[@class='Button__StyledButton-sc-17thig6-0 emDWiY']"));
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

    public static List<WebElement> checkBox_checked() {
        List<WebElement> checkBox_check = Collections.singletonList(driver.findElement(By.xpath("//input[@type='checkbox']")));
        return checkBox_check;
    }

    public static List<WebElement> lbl_checkbox() {
        List<WebElement> checkBox_check = Collections.singletonList(driver.findElement(By.xpath("//div[@class='MuiBox-root css-10egq61']")));
        return checkBox_check;
    }

    public static WebElement error_numberOnly() {
        element = driver.findElement(By.xpath(""));
        return element;
    }
//    public static WebElement btn_page_num(int i) {
//        element = driver.findElement(By.xpath("//ul[@id='paginationKQTT']/li[@jp-data='"+i+"']")); //biến i đã được khai báo bann đầu
//        return  element;
//    }

    public static WebElement btn_lastPage() {
        List<WebElement> paging = driver.findElements(By.xpath("//*[@id=\"root\"]/div[1]/main/div/div[2]/div[2]/div/nav/ul/li/button"));
        int lastPageLocation = paging.size() - 3;
        System.out.println(lastPageLocation);

        element = paging.get(lastPageLocation); // lấy phần tử trong list
        return element;

    }


    public static WebElement btn_goToLastPage() {
        element = driver.findElement(By.xpath("//button[@aria-label='Go to last page']"));
        return element;
    }

    // tạo 1 list chứa các phần từ ở header
    public static List<WebElement> header() {
        List<WebElement> header = driver.findElements(By.xpath("//*[@id=\"root\"]/div[1]/main/div/div[2]/div[1]/table/thead/tr/th"));
        int totalColum = header.size();
        System.out.println(totalColum);

        return header;
    }
}
