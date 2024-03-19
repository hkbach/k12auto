//package stepDefinition;//package stepDefinition;
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
//import pageObjects.TTlogin;
//import pageObjects.listCampaigns;
//import pageObjects.login;
//import utils.libs.TestBase;
//
//import java.util.List;
//
//public class TTlogin_Steps extends TestBase {
//    TTlogin ttLogin = new TTlogin(driver);
////    login lg = new login(driver);
////    String actual = "";
////    String expected = "";
////    String name = "";
////    //String checkbox="";
//
//    public TTlogin_Steps() {
//    }
//
//    @Given("User goes to the TT Loginpage")
//    public void UsergoestotheTTpage() throws Throwable {
//        String url = "https://tinhte.vn/login/";
//        driver.get(url);
//    }
//
//    @When("^User input email as \"([^\"]*)\"$")
//    public void userInputEmailAs(String email) throws Throwable {
//        String emailvalue = email;
//        enterText(ttLogin.txt_email, emailvalue);
//    }
//
//    @And("^User input password as \"([^\"]*)\"$")
//    public void userInputPasswordAs(String password) throws Throwable {
//        String passwordvalue = password;
//        enterText(ttLogin.txt_password, passwordvalue);
//    }
//
//    @And("^User click 'Login' button$")
//    public void userClickLoginButton() {
//        clickButton (ttLogin.btn_login);
//    }
//
//    @Then("^User logged in successfully$")
//    public void userLoggedInSuccessfully() {
//    }
//
//    @Then("^the error message will be displayed and User login failed$")
//    public void theErrorMessageWillBeDisplayedAndUserLoginFailed() {
//    }
//}