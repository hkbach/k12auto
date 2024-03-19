//package stepDefinition;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebElement;
//import pageObjects.NCTlogin;
//import pageObjects.listCampaigns;
//import pageObjects.login;
//import utils.libs.TestBase;
//
//import java.util.List;
//
//public class NCTlogin_Steps extends TestBase {
//    NCTlogin ncTlogin = new NCTlogin(driver);
////    login lg = new login(driver);
////    String actual = "";
////    String expected = "";
////    String name = "";
////    //String checkbox="";
//
//    public NCTlogin_Steps() {
//    }
//
//    @Given("User goes to the NCT page")
//    public void UsergoestotheNCTpage() throws Throwable {
//        String url = "https://www.nhaccuatui.com/";
//        driver.get(url);
//    }
//
//    @When("^User click 'Loginform' button$")
//    public void userClickLoginButton() throws InterruptedException {
//        NCTlogin.btn_login1().click();
//
//    }
//
//    @And("^User input email as \"([^\"]*)\"$")
//    public void userInputEmail(String username) throws Throwable {
//        Thread.sleep(2000);
//        String usernamevalue = username;
//        NCTlogin.txt_username().sendKeys(usernamevalue);
//    }
//
//    @And("^User input password as \"([^\"]*)\"$")
//    public void userInputPassword(String password) throws Throwable {
//        Thread.sleep(2000);
//        String passwordvalue = password;
//        NCTlogin.txt_password().sendKeys(passwordvalue);
//    }
//
//    @Then("^User logged in successfully$")
//    public void userLoggedInSuccessfully() throws InterruptedException {
//        System.out.println("Successfully login NCT");
//    }
//
//
//    @Then("^the error message will be displayed and User login failed$")
//    public void theErrorMessageWillBeDisplayedAndUserLoginFailed() {
//        System.out.println("Unsucessfully login NCT");
//    }
//
//    @When("^User click 'Login' button$")
//    public void userClickLoginformButton() {
//        NCTlogin.btn_login2().click();
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
