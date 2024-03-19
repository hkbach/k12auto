package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class proObject {
    public static WebDriver driver;

    private static WebElement element;

    public static List<WebElement> webElementList;

    public proObject(WebDriver driver) {
        this.driver = driver;
    }

    public String txtCompanyId = "//body/div/div[1]/div[1]/section/section/form/dl[1]/dd/input";

    public String txtStaffId = "//body/div/div[1]/div[1]/section/section/form/dl[2]/dd/input";

    public String txtPassword = "//body/div/div[1]/div[1]/section/section/form/dl[3]/dd/input";

    public String btnLogin = "//body/div/div[1]/div[1]/section/section/form/button";

    public String btnListRequest = "//body/div/div[1]/div[1]/div[2]/ul/li[2]/a";

    public String btnLastPage = "//body/div[1]/div[2]/div/div[2]/div/div[2]/div/div/div/div[2]/div/div/div/ul/li[7]";
    public String btnCoppy = "//body/div[1]/div[2]/div/div[2]/div/div[2]/div/div/div/div[2]/div/div/table/tbody/tr[6]/td[11]/a[1]/button";

    public String totalPage(){
        String value = "";
        element = driver.findElement(By.xpath("//body/div[1]/div[2]/div/div[2]/div/div[2]/div/div/div/div[2]/div/div/div/ul/li[6]"));
        value = element .getText();
        if (!value.isEmpty()){
            value = value.trim();
        }return  value;
    }

    public int totalrowPerPage() {
        List<WebElement> listRequests = driver.findElements(By.xpath("//body/div[1]/div[2]/div/div[2]/div/div[2]/div/div/div/div[2]/div/div/table/tbody/tr"));
        int count = 0;
        count = listRequests.size();
        return count;
    }
    public String getTextForm(int row){
        element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/div/div/div[2]/div/div/table/tbody/tr["+row+"]/td[1]"));
        String value = "";
        value = element.getText();
        if (!value.isEmpty()){
            value.trim();
        }
        return value;
    }
    public String getTextStatus(int row){
        element = driver.findElement(By.xpath("//body/div[1]/div[2]/div/div[2]/div/div[2]/div/div/div/div[2]/div/div/table/tbody/tr["+row+"]/td[2]"));
        String value = "";
        value = element.getText();
        if (!value.isEmpty()){
            value.trim();
        }
        return value;
    }
    public String getTextRequestNoActual(int row){
        element = driver.findElement(By.xpath("//body/div[1]/div[2]/div/div[2]/div/div[2]/div/div/div/div[2]/div/div/table/tbody/tr["+row+"]/td[3]"));
        String value = "";
        value = element.getText();
        if (!value.isEmpty()){
            value.trim();
        }
        return value;
    }
    public String getTextRequestNoBefore(int row){
        element = driver.findElement(By.xpath("//body/div[1]/div[2]/div/div[2]/div/div[2]/div/div/div/div[2]/div/div/table/tbody/tr["+row+"]/td[4]"));
        String value = "";
        value = element.getText();
        if (!value.isEmpty()){
            value.trim();
        }
        return value;
    }
    public String getTextNgayRequest(int row){
        element = driver.findElement(By.xpath("//body/div[1]/div[2]/div/div[2]/div/div[2]/div/div/div/div[2]/div/div/table/tbody/tr["+row+"]/td[5]"));
        String value = "";
        value = element.getText();
        if (!value.isEmpty()){
            value.trim();
        }
        return value;
    }
    public String getTextTongTien(int row){
        element = driver.findElement(By.xpath("//body/div[1]/div[2]/div/div[2]/div/div[2]/div/div/div/div[2]/div/div/table/tbody/tr["+row+"]/td[6]"));
        String value = "";
        value = element.getText();
        if (!value.isEmpty()){
            value.trim();
        }
        return value;
    }
    public String getTextTrangThai(int row){
        element = driver.findElement(By.xpath("//body/div[1]/div[2]/div/div[2]/div/div[2]/div/div/div/div[2]/div/div/table/tbody/tr["+row+"]/td[7]"));
        String value = "";
        value = element.getText();
        if (!value.isEmpty()){
            value.trim();
        }
        return value;
    }
    public String getTextLoaiThanhToan(int row){
        element = driver.findElement(By.xpath("//body/div[1]/div[2]/div/div[2]/div/div[2]/div/div/div/div[2]/div/div/table/tbody/tr["+row+"]/td[8]"));
        String value = "";
        value = element.getText();
        if (!value.isEmpty()){
            value.trim();
        }
        return value;
    }
    public String getTextNhanXet(int row){
        element = driver.findElement(By.xpath("//body/div[1]/div[2]/div/div[2]/div/div[2]/div/div/div/div[2]/div/div/table/tbody/tr["+row+"]/td[9]"));
        String value = "";
        value = element.getText();
        if (!value.isEmpty()){
            value.trim();
        }
        return value;
    }
    public String getTextBinhLuan(int row){
        element = driver.findElement(By.xpath("//body/div[1]/div[2]/div/div[2]/div/div[2]/div/div/div/div[2]/div/div/table/tbody/tr["+row+"]/td[10]"));
        String value = "";
        value = element.getText();
        if (!value.isEmpty()){
            value.trim();
        }
        return value;
    }
    public String getTextHoatDong(int row){
        element = driver.findElement(By.xpath("//body/div[1]/div[2]/div/div[2]/div/div[2]/div/div/div/div[2]/div/div/table/tbody/tr["+row+"]/td[11]"));
        String value = "";
        value = element.getText();
        if (!value.isEmpty()){
            value.trim();
        }
        return value;
    }
}