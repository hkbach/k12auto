package stepDefinition;//package stepDefinition;//package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import pageObjects.VietlottArr;
import utils.libs.TestBase;

public class VL_Steps extends TestBase {
    VietlottArr vietlottArr = new VietlottArr(driver);

    public VL_Steps() {
    }

    @Given("User goes to Vietlott page")
    public void UsergoestotheVietlottpage() {
        String url = "https://www.ketquadientoan.com/tat-ca-ky-xo-so-power-655.html";
        driver.get(url);
    }


    @And("User check record")
    public void userCheckRecord() throws InterruptedException {

        int totalrow = 0;
        totalrow = vietlottArr.gettotalrow();
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int tanSuatHienThi01 = 0;
        int tanSuatHienThi02 = 0;
        int tanSuatHienThi03 = 0;

            String[][] arr_vietlott = new String[totalrow][4];
        for (int row = 0; row < totalrow; row++) {
            arr_vietlott[row][0] = vietlottArr.getTextNgaymothuong(row + 1);
            arr_vietlott[row][1] = vietlottArr.getTextKetQua(row + 1);
            arr_vietlott[row][2] = vietlottArr.getTextGiaiJackBot1(row + 1);
            arr_vietlott[row][3] = vietlottArr.getTextGiaiJackBot2(row + 1);

        }

        for (int row = 0; row < totalrow; row++) {
            System.out.print(arr_vietlott[row][0] + " | ");
            System.out.print(arr_vietlott[row][1] + " | ");
            System.out.print(arr_vietlott[row][2] + " | ");
            System.out.print(arr_vietlott[row][3] + " | ");
            System.out.println();

        }
        for (int i = 0; i < totalrow; i++) {
            String textKetQua = arr_vietlott[i][1];
            if (textKetQua.contains("01")) {
                count1++;
            } else{
                if (textKetQua.contains("02")) {
                    count2++;
                } else {
                    if (textKetQua.contains("03")) {
                        count3++;
                    }
                }
            }

        }
        System.out.println("Có "+count1 +" số 01");
        System.out.println("Có "+count2 +" số 02");
        System.out.println("Có "+count3 +" số 03");

        tanSuatHienThi01 = Integer.parseInt(String.valueOf(count1));
        tanSuatHienThi02 = Integer.parseInt(String.valueOf(count2));
        tanSuatHienThi03 = Integer.parseInt(String.valueOf(count3));
        if (totalrow != 0) {
            tanSuatHienThi01 = (count1 * 100) / (totalrow*6);
            tanSuatHienThi02 = (count2 * 100) / (totalrow*6);
            tanSuatHienThi03 = (count3 * 100) / (totalrow*6);
        }
        System.out.println("Tần suất hiện thị của số 01 là: "+tanSuatHienThi01+" %");
        System.out.println("Tần suất hiện thị của số 02 là: "+tanSuatHienThi02+" %");
        System.out.println("Tần suất hiện thị của số 03 là: "+tanSuatHienThi03+" %");

    }

}













