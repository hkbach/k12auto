package stepDefinition;//package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.proObject;
import utils.libs.TestBase;

public class xoSo_Steps extends TestBase {
proObject PRO = new proObject(driver);
public xoSo_Steps(){}
@Given("^User goes to pro page$")
public void userGoesToProPage() {
    String url = "https://expenses.jinjer.biz/auth/login";
    driver.get(url);
}

@When("^At textbox company, User input as \"([^\"]*)\"$")
public void atTextboxCompanyUserInputAs(String compayID) throws Throwable {
    String companyIdValue = compayID;
    enterText(PRO.txtCompanyId, companyIdValue);
}

@And("^At textbox staffID, User input as \"([^\"]*)\"$")
public void atTextboxStaffIDUserInputAs(String idValue) throws Throwable {
    String staffIdValue = idValue;
    enterText(PRO.txtStaffId, staffIdValue);
}

@And("^At textbox password, User input as \"([^\"]*)\"$")
public void atTextboxPasswordUserInputAs(String pasword) throws Throwable {
    String passwordValue = pasword;
    enterText(PRO.txtPassword, passwordValue);
}

@Then("^User click on button login$")
public void userClickOnButtonLogin() {
    clickButton(PRO.btnLogin);
}

@Then("^Go to the staff page$")
public void goToTheStaffPage() throws Throwable {
    String url = "https://expenses.jinjer.biz/staffs";
    driver.get(url);
    Thread.sleep(2000);

}

@Then("^User click on list request$")
public void userClickOnListRequest() throws InterruptedException {
    clickButton(PRO.btnListRequest);
    Thread.sleep(2000);
}

@Then("^User check total pages and rows of list request$")
public void userCheckTotalPagesAndRowsOfListRequest() {
    int totalPage = 0;
    int page = 0;
    int totalrowPerPage = 0;
    int row = 0;
    int totalRow = 0;
    int last_arrRow = 0;
    clickButton(PRO.btnLastPage);
    totalPage = Integer.parseInt(PRO.totalPage());
    System.out.println(totalPage);
    totalrowPerPage = PRO.totalrowPerPage();
    totalRow = ((totalPage-1) * 20) + PRO.totalrowPerPage();
    System.out.println(totalRow);
    String [][] arr_list = new String[totalRow][10];
    for(page = 1; page <=totalPage; page ++ ){
        String url = "https://expenses.jinjer.biz/list_request?status%5B0%5D=1&page=";
        driver.get(url + page);
        totalrowPerPage = PRO.totalrowPerPage();
        for(int arr_Row = 0; arr_Row < arr_list.length; arr_Row++ ){
            if (arr_list[arr_Row][0]==null){
                last_arrRow = arr_Row;

            break;
            }
        }


        for (row = 1; row <= totalrowPerPage; row++){
            arr_list[last_arrRow][0] = PRO.getTextForm(row);
            arr_list[last_arrRow][1] = PRO.getTextStatus(row);
            arr_list[last_arrRow][2] = PRO.getTextRequestNoActual(row);
            arr_list[last_arrRow][3] = PRO.getTextRequestNoBefore(row);
            arr_list[last_arrRow][4] = PRO.getTextNgayRequest(row);
            arr_list[last_arrRow][5] = PRO.getTextTongTien(row);
            arr_list[last_arrRow][6] = PRO.getTextNhanXet(row);
            arr_list[last_arrRow][7] = PRO.getTextLoaiThanhToan(row);
            arr_list[last_arrRow][8] = PRO.getTextNhanXet(row);
            arr_list[last_arrRow][9] = PRO.getTextBinhLuan(row);
            last_arrRow++;
        }

    }
    for (row = 0; row < arr_list.length; row++){

        System.out.print("申請フォーム: "+arr_list[row][0] + " | ");
        System.out.print("事前/精算: "+arr_list[row][1]+ " | ");
        System.out.print("申請書No.: "+ arr_list[row][2]+ " | ");
        System.out.print("事前申請No.: "+arr_list[row][3]+ " | ");
        System.out.print("申請日: "+arr_list[row][4]+ " | ");
        System.out.print("合計金額: "+arr_list[row][5]+ " | ");
        System.out.print("ステータス: "+arr_list[row][6]+ " | ");
        System.out.print("精算時の差異: "+arr_list[row][7]+ " | ");
        System.out.print("備考: "+arr_list[row][8]+ " | ");
        System.out.print("コメント: "+arr_list[row][9]+ " | ");
        System.out.println();

    }






////        String formRequest = "";
////        String status = "";
////        String requestNoActual = "";
////        String requestNoBefore = "";
////        String ngayRequest = "";
////        String tongTien = "";
////        String trangThai = "";
////        String loaiThanhToan = "";
////        String nhanXet = "";
////        String binhLuan = "";
////        String hoatDong = "";
//
//
////        for(row = 1; row <= totalrowPerPage; row++ ){
////            formRequest = PRO.getTextForm(row);
////            System.out.println("Form request row "+row+": "+formRequest);
////            status = PRO.getTextStatus(row);
////            System.out.println("Status request row "+row+": "+status);
////            requestNoActual = PRO.getTextRequestNoActual(row);
////            System.out.println("Mã request actual row "+row+": "+requestNoActual);
////            requestNoBefore = PRO.getTextRequestNoBefore(row);
////            System.out.println("Mã request before row "+row+": "+requestNoBefore);
////            ngayRequest = PRO.getTextNgayRequest(row);
////            System.out.println("Ngày request actual row "+row+": "+ngayRequest);
////            tongTien = PRO.getTextTongTien(row);
////            System.out.println("Tổng tiền  row "+row+": "+tongTien);
////            trangThai = PRO.getTextTrangThai(row);
////            System.out.println("Trạng thái row "+row+": "+trangThai);
////            loaiThanhToan = PRO.getTextLoaiThanhToan(row);
////            System.out.println("Loại thanh toán row "+row+": "+loaiThanhToan);
////            nhanXet = PRO.getTextNhanXet(row);
////            System.out.println("Nhận xét row "+row+": "+nhanXet);
////            binhLuan = PRO.getTextBinhLuan(row);
////            System.out.println("Bình luận row "+row+": "+binhLuan);
////            hoatDong = PRO.getTextHoatDong(row);
////            System.out.println("Hoạt động row "+row+": "+hoatDong);
////        }
}
}
