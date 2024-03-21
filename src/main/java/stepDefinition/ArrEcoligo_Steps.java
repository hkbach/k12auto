//package stepDefinition;//package stepDefinition;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import pageObjects.ArrEcoligo;
//import pageObjects.EcoligoLogin;
//import utils.libs.TestBase;
//
//public class ArrEcoligo_Steps extends TestBase {
//    ArrEcoligo arrEcoligo = new ArrEcoligo(driver);
////    login lg = new login(driver);
////    String actual = "";
////    String expected = "";
////    String name = "";
////    //String checkbox="";
//
//    public ArrEcoligo_Steps() {
//    }
//
//    @Given("User goes to the Ecoligo Loginpage")
//    public void UsergoestotheEcoligoLoginpage() throws Throwable {
//        String url = "https://dev-iip.ecoligo.com/login";
//        driver.get(url);
//    }
//    @When("^User click 'Deny' button$")
//    public void userClickDenyButton() {
//        clickButton(arrEcoligo.btn_deny);
//    }
//
//    @And("^User input email as \"([^\"]*)\"$")
//    public void userInputEmailAs(String email) throws Throwable {
//        String emailvalue = email;
//        enterText(arrEcoligo.txt_email, emailvalue);
//    }
//
//    @And("^User input password as \"([^\"]*)\"$")
//    public void userInputPasswordAs(String password) throws Throwable {
//        String passwordvalue = password;
//        enterText(arrEcoligo.txt_password, password);
//    }
//
//    @And("^User click 'Login' button$")
//    public void userClickLoginButton() {
//        clickButton(arrEcoligo.btn_login);
//    }
//
//    @Then("^check record page$")
//    public void checkRecordPage() throws InterruptedException{
////        int totalrow = 0;
////        totalrow = arrEcoligo.getTotalRow();
////        System.out.println(totalrow);
//
//        int totalrow = 0;
//        int totalpage = 0;
//        int lastArrRow = 0;
//        String lastpageno = "";
//
//
//        clickButton(arrEcoligo.btn_lastpage);
//        lastpageno = arrEcoligo.gettext_btn_lastpage();
//        totalpage = Integer.parseInt(lastpageno);
////        totalrow = arrEcoligo.getTotalRowPerPage();
//
//        totalrow = (totalpage-1)*30 + arrEcoligo.getTotalRowPerPage();
//
////        System.out.println("Total row: " +count);
//
//        String[][] arr_listpage = new String[totalrow][2];
//
//        for (int page = 1; page <= totalpage; page ++) {
//            String url = "https://dev-iip.ecoligo.com/investments?limit=30&page=";
//            driver.get(url + page);
//            Thread.sleep(2000);
//
//            for(int arrRow = 0; arrRow < arr_listpage.length; arrRow++){
//                if(arr_listpage[arrRow][0]==null){
//                    lastArrRow = arrRow;
//                    System.out.println(lastArrRow);
//                    break;
//                }
//            }
//
//            for (int row = 1; row <= arrEcoligo.getTotalRowPerPage(); row++) {
//                arr_listpage[lastArrRow][0] = arrEcoligo.getTextStatus(row);
//                arr_listpage[lastArrRow][1] = arrEcoligo.getTextProject(row);
//                lastArrRow++;
//            }
//        }
//
//        for (int row = 0; row < arr_listpage.length; row++) {
//                System.out.print(arr_listpage[row][0] + " | ");
//                System.out.print(arr_listpage[row][1] + " | ");
//                System.out.println();
//            }
//
////        for (int page = 1; page <= totalpage; page ++) {
////            String url = "https://dev-iip.ecoligo.com/investments?limit=30&page=";
////            driver.get(url+page);
////            Thread.sleep(3000);
////            totalrow = arrEcoligo.getTotalRow();
////            String[][] arr_listpage = new String[totalrow][2];
////            for (int row = 0; row < arr_listpage.length; row++) {
////                arr_listpage[row][0] = arrEcoligo.getTextStatus(row + 1);
////                arr_listpage[row][1] = arrEcoligo.getTextProject(row + 1);
////            }
////            //Print the list
////            for (int row = 0; row < arr_listpage.length; row++) {
////                System.out.print("Page" + page + ": " + arr_listpage[row][0] + " | ");
////                System.out.print(arr_listpage[row][1] + " | ");
////                System.out.println();
////            }
////        }
//    }
//
//}
