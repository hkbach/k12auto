package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DVC {
    public static WebDriver driver;

    private static WebElement element;

    public static List<WebElement> webElementList;

    public DVC(WebDriver driver) {this.driver = driver;
    }

    public static WebElement txt_search() {
        element = driver.findElement(By.xpath("//body/div[5]/div/div/div[1]/div/span/input[2]"));
        return element;
    }

    public static WebElement btn_search() {
        element = driver.findElement(By.xpath("//body/div[5]/div/div/div[1]/div/button"));
        return element;
    }
    public WebElement btn_nextPage() {
        element = driver.findElement(By.xpath("//body/div[5]/div/div[3]/div[2]/ul/li[8]"));
                                    //By.id("paginationKQTT")
                                    //By.xpath("//*[@id=\"paginationKQTT\"]/li[8]")
        return element;
    }

    //vi du chuyen trang khi khong co button next page
//    public WebElement btn_pageNo(int pageNo) {
//        element = driver.findElement(By.xpath("//li[@jp-data='"+pageNo+"']"));
//        return element;
//    }

    public WebElement btn_lastPage() {
        element = driver.findElement(By.xpath("//body/div[5]/div/div[3]/div[2]/ul/li[9]"));
        return element;
    }

    public WebElement lbl_totalResults() {
        element = driver.findElement(By.id("cntProcedures"));
        return element;
    }

    //Khai bao bien luu gia tri danh sach bai viet
    public List<WebElement> list_articles(){
        List<WebElement> listElements = driver.findElements(By.xpath("//body/div[5]/div/ul[2]/li/a"));
        return listElements;
    }
    public WebElement lbl_articles_title (int row){
        element = driver.findElement(By.xpath("//body/div[5]/div/ul[2]/li["+row+"]/a"));
        return element;
    }
    public WebElement btn_firstpage() {
        element = driver.findElement(By.xpath("//body/div[5]/div/div[3]/div[2]/ul/li[1]"));
        return element;
    }

}