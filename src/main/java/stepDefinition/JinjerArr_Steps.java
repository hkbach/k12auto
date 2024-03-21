//package stepDefinition;//package stepDefinition;//package stepDefinition;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import pageObjects.ArrEcoligo;
//import pageObjects.EcoligoLogin;
//import pageObjects.JinjerArr;
//import utils.libs.TestBase;
//
//public class JinjerArr_Steps extends TestBase {
//    JinjerArr jinjerArr = new JinjerArr(driver);
////    login lg = new login(driver);
////    String actual = "";
////    String expected = "";
////    String name = "";
//    //String checkbox="";
//
//    public JinjerArr_Steps() {
//    }
//
//    @Given("User goes to Jinjer page")
//    public void UsergoestoJinjerpage() throws Throwable {
//        String url = "https://expenses.jinjer.biz/auth/login";
//        driver.get(url);
//    }
//
//    @When("^User input companyID as \"([^\"]*)\"$")
//    public void UserinputcompanyIDas(String compayID) throws Throwable {
//        String companyIdValue = compayID;
//        enterText(jinjerArr.txtCompanyId, companyIdValue);
//    }
//
//    @And("^User input staffID as \"([^\"]*)\"$")
//    public void UserinputstaffIDas(String staffID) throws Throwable {
//        String staffIDValue = staffID;
//        enterText(jinjerArr.txtStaffId, staffIDValue);
//    }
//
//    @And("^User input password as \"([^\"]*)\"$")
//    public void Userinputpasswordas(String password) throws Throwable {
//        String passwordValue = password;
//        enterText(jinjerArr.txtPassword, passwordValue);
//    }
//
//    @And("^User click Login button$")
//    public void userClickLoginButton() {
//        clickButton(jinjerArr.btnLogin);
//    }
//
//    @Then("^Go to the staff page$")
//    public void gotothestaffpage() throws Throwable {
//        String url = "https://expenses.jinjer.biz/staffs";
//        driver.get(url);
//        Thread.sleep(2000);
//    }
//
//    @Then("^User click record-request$")
//    public void userclickonrecordrequest() throws InterruptedException {
//        clickButton(jinjerArr.btnRecordRequest);
//        Thread.sleep(2000);
//    }
//
//    @Then("^User check list record$")
//    public void userCheckListrecord() throws  InterruptedException {
//        String lastpageno = "";
//        int totalPage = 0;
//        int totalrowPerPage = 0;
//        int totalRow = 0;
//        int lastarrRow = 0;
//
//        clickButton(jinjerArr.btnLastPage);
//        lastpageno = jinjerArr.gettextlastpage();
//        totalPage = Integer.parseInt (jinjerArr.gettextlastpage());
////        System.out.println(totalPage);
//            totalrowPerPage = jinjerArr.gettotalrowPerPage();
//            totalRow = (totalPage-1) * 20 + totalrowPerPage;
////            System.out.println(totalRow);
//
//            String [][] arr_listpage = new String[totalRow][7];
//            for (int page = 1; page <= totalPage; page ++ ){
//                String url = "https://expenses.jinjer.biz/list_request?status%5B0%5D=1&page=";
//                driver.get(url + page);
//                Thread.sleep(1000);
//
//                totalrowPerPage = jinjerArr.gettotalrowPerPage();
//                System.out.println("Total row per page = " + totalrowPerPage);
//
//                for(int arrRow = 0; arrRow < arr_listpage.length; arrRow++ ){
//                    if (arr_listpage[arrRow][0]==null){
//                        lastarrRow = arrRow;
////                        System.out.println(lastarrRow);
//                        break;
//                    }
//                }
//
//
//                for (int row = 1; row <= totalrowPerPage; row++){
//                    arr_listpage[lastarrRow][0] = jinjerArr.getTextFormRegister(row);
//                    arr_listpage[lastarrRow][1] = jinjerArr.getTextPayment(row);
//                    arr_listpage[lastarrRow][2] = jinjerArr.getTextActualNumber(row);
//                    arr_listpage[lastarrRow][3] = jinjerArr.getTextNoBefore(row);
//                    arr_listpage[lastarrRow][4] = jinjerArr.getTextDate(row);
//                    arr_listpage[lastarrRow][5] = jinjerArr.getTextTotal(row);
//                    arr_listpage[lastarrRow][6] = jinjerArr.getTextDifferences(row);
//                    lastarrRow++;
//                }
//
//            }
//
//            for (int row = 0; row < arr_listpage.length; row++){
//
//                System.out.print("FormRegister: "+arr_listpage[row][0] + " | ");
//                System.out.print("Payment: "+arr_listpage[row][1]+ " | ");
//                System.out.print("ActualNumber: "+ arr_listpage[row][2]+ " | ");
//                System.out.print("NoBefore: "+arr_listpage[row][3]+ " | ");
//                System.out.print("Date: "+arr_listpage[row][4]+ " | ");
//                System.out.print("Total: "+arr_listpage[row][5]+ " | ");
//                System.out.print("Differences: "+arr_listpage[row][6]+ " | ");
//                System.out.println();
//
//            }
//    }
//
//}
//
//
