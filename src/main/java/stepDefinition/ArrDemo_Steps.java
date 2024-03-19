package stepDefinition;//package stepDefinition;//package stepDefinition;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pageObjects.ArrDemo;
import pageObjects.EcoligoLogin;
import utils.libs.TestBase;

import static java.lang.Integer.parseInt;

public class ArrDemo_Steps extends TestBase {
    ArrDemo arrdemo = new ArrDemo(driver);
//    login lg = new login(driver);
//    String actual = "";
//    String expected = "";
//    String name = "";
//    //String checkbox="";

    public ArrDemo_Steps() {
    }

    @Given("User goes to the Danh sach biensoxe page")
    public void UsergoestotheDanhsachbiensoxepage() throws Throwable {
        String url = "https://quantrimang.com/o-to-xe-may/danh-sach-bien-so-xe-may-o-to-theo-tinh-thanh-o-viet-nam-149582#google_vignette";
        driver.get(url);
    }

    @And("^Print the list biensoxe$")
    public void printTheListBiensoxe() {
        // Cú pháp khai báo mảng 2 chiều
        // Loại data[][] tên array = new Loại data [Số dòng muốn tạo][Số cột muốn tạo]
        // Một array chỉ chứa duy nhất 1 loại data
        // Ví dụ: int[][] songuyen = new int[10][3]
        int totalrow = 0;
        totalrow = arrdemo.getsizetable()-1;
        String[][] arr_biensoxe = new String[totalrow][2];

        for (int row = 2; row < arr_biensoxe.length; row++) {
//            arr_biensoxe[row][0] = String.valueOf(row + 1);
            arr_biensoxe[row][0] = arrdemo.getbienxe(row + 2);
            arr_biensoxe[row][1] = arrdemo.gettinhthanh(row + 2);
        }
        //Print the list
        for (int row = 0; row < arr_biensoxe.length; row++) {
//            System.out.print(arr_biensoxe[row][0] + " | ");
            System.out.print(arr_biensoxe[row][0] + " | ");
            System.out.print(arr_biensoxe[row][1] + " | ");
            System.out.println();
        }
    }
}


