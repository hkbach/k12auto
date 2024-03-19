//package stepDefinition;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import org.junit.Assert;
//import pageObjects.INSlogin;
//import utils.libs.TestBase;
//
//public class INSlogin_Steps extends TestBase {
//    INSlogin INSlogin = new INSlogin(driver);
////    login lg = new login(driver);
////    String actual = "";
////    String expected = "";
////    String name = "";
////    //String checkbox="";
//
//    public INSlogin_Steps() {
//    }
//
//    @Given("User goes to the INS page")
//    public void UsergoestotheINSpage() throws Throwable {
//        String url = "https://www.instagram.com/";
//        driver.get(url);
//    }
//
//    @When("^User input email as \"([^\"]*)\"$")
//    public void userInputEmailAs(String username) throws Throwable {
//        String usernamevalue = username;
//        INSlogin.txt_username().sendKeys(usernamevalue);
//    }
//
//    @And("^User input password as \"([^\"]*)\"$")
//    public void userInputPasswordAs(String password) throws Throwable {
//        String passwordvalue = password;
//        INSlogin.txt_password().sendKeys(passwordvalue);
//    }
//
//    @And("^User click 'Login' button$")
//    public void userClickLoginButton() {
//        INSlogin.btn_login().click();
//    }
//
//    @Then("^User logged in successfully$")
//    public void userLoggedInSuccessfully() {
//    }
//
//    @Then("^the error message will be displayed and User login failed$")
//    public void theErrorMessageWillBeDisplayedAndUserLoginFailed() {
//        String expected = "Sorry, your password was incorrect. Please double-check your password.";
//        String actual = "";
//        actual = INSlogin.lbl_error().getText();
//        if (actual.length()>0){
//            actual = actual.trim();
//        }
//        Assert.assertEquals(expected, actual);
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
//
//
//
