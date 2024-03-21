//package stepDefinition;//package stepDefinition;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import org.junit.Assert;
//import pageObjects.EcoligoLogin;
//import utils.libs.TestBase;
//
//import static java.lang.Integer.parseInt;
//
//public class EcoligoLogin_Steps extends TestBase {
//    EcoligoLogin ecoligoLogin = new EcoligoLogin(driver);
////    login lg = new login(driver);
////    String actual = "";
////    String expected = "";
////    String name = "";
////    //String checkbox="";
//
//    public EcoligoLogin_Steps() {
//    }
//
//    @Given("User goes to the Ecoligo Loginpage")
//    public void UsergoestotheEcoligoLoginpage() throws Throwable {
//        String url = "https://dev-iip.ecoligo.com/login";
//        driver.get(url);
//    }
//
//
//    @And("^User input email as \"([^\"]*)\"$")
//    public void userInputEmailAs(String email) throws Throwable {
//        String emailvalue = email;
//        enterText(ecoligoLogin.txt_email, emailvalue);
//    }
//
//    @And("^User input password as \"([^\"]*)\"$")
//    public void userInputPasswordAs(String password) throws Throwable {
//        String passwordvalue = password;
//        enterText(ecoligoLogin.txt_password, password);
//    }
//
//    @And("^User click 'Login' button$")
//    public void userClickLoginButton() {
//        clickButton(ecoligoLogin.btn_login);
//    }
//
////    @Then("^Go to the Investments page$")
////    public void GototheInvestmentspage() throws InterruptedException{
////        Thread.sleep(6000);
////        driver.get("https://dev-iip.ecoligo.com/investments");
//////        String expected = "Investments";
//////        String actual = "";
//////        actual = ecoligoLogin.btn_investments().getText();
//////        System.out.println(actual);
//////        Assert.assertEquals(actual, expected);
////    }
////
////
//    @Then("^Check Total page and record$")
//    public void CheckTotalpageandrecord() throws InterruptedException {
//
//        // tính tổng trang
//        clickButton(ecoligoLogin.btn_lastpage);
//        String lastpageno = "";
//        lastpageno = ecoligoLogin.gettext_btn_lastpage();
//        System.out.println("Total page: " + lastpageno);
//
//        // tính tổng record page
//        int totalpage = 0;
//        int rowperpage = 0;
//        totalpage = Integer.parseInt(lastpageno);
//        for (int page = 1; page <= totalpage; page ++){
//            String url = "https://dev-iip.ecoligo.com/investments?limit=30&page=";
//            driver.get(url+page);
//            Thread.sleep(3000);
//            rowperpage = ecoligoLogin.getTotalRow();
//            System.out.println("At page " + page +", have " + rowperpage + " rows");
//        }
//
//    }
//    @Then("^Print record page (\\d+)$")
//    public void printRecordPage(int arg0) throws InterruptedException{
//            Thread.sleep(6000);
//        driver.get("https://dev-iip.ecoligo.com/investments");
//        int totalRow = 0;
//        String status="";
//        String projectName="";
//        String investedOn="";
//        String Investmentamount = "";
//        String Repayments = "";
//        String Capitaloutstanding = "";
//        String country = "";
//
//        totalRow = ecoligoLogin.getTotalRow();
//        System.out.println(totalRow);
//        for(int row=1; row<=totalRow; row++){
//            status = ecoligoLogin.getTextStatus(row);
//            System.out.println("Status = "+status);
//
//            projectName = ecoligoLogin.getTextProject(row);
//            System.out.println("Project Name = "+projectName);
//
//            investedOn = ecoligoLogin.getTextInvestedOn(row);
//            System.out.println("Invested On = "+investedOn);
//
//            Investmentamount = ecoligoLogin.getTextInvestmentamount(row);
//            System.out.println("Investmentamount = "+Investmentamount);
//
//            Repayments = ecoligoLogin.getTextRepayments(row);
//            System.out.println("Repayments = "+Repayments);
//
//            Capitaloutstanding = ecoligoLogin.getTextCapitaloutstanding(row);
//            System.out.println("Capitaloutstanding = "+Capitaloutstanding);
//
//            country = ecoligoLogin.country(row);
//            System.out.println("country = "+country);
//
//        }
//
//    }
//
//}
