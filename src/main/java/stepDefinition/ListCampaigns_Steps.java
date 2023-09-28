package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.http.impl.io.SessionOutputBufferImpl;
import org.apache.http.impl.io.SocketOutputBuffer;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.w3c.dom.Text;
import pageObjects.listCampaigns;
import utils.libs.TestBase;

import java.util.List;

public class ListCampaigns_Steps extends TestBase {
    listCampaigns cp = new listCampaigns(driver);

    String actual = "";
    String expected = "";
    String name = "";
    //String checkbox="";

    public ListCampaigns_Steps() {
    }

    @Given("User Logged in as Admin")
    public void userLoggedInAsAdmin() throws Throwable {
        String url = "https://v2.dev.pulse.ecoligo.com/campaigns";
        driver.get(url);
        Thread.sleep(3000);
    }


    @When("^User goes to the Campaign List View$")
    public void userGoesToTheCampaignListView() {

    }

    @And("^Clicks on the dropdown filter button$")
    public void clicksOnTheDropdownFilterButton() throws Throwable  {
        cp.btn_filter().click() ;
        Thread.sleep(1000);
    }


    @And("^At the filter, user selects \"([^\"]*)\"$")
    public void atTheFilterUserSelects(String checkbox)  {
        // Write code here that turns the phrase above into concrete actions
        if (checkbox.equals("Ready to launch") ){
            cp.checkbox_ReadyToLaunch().click();
        } else if (checkbox.equals("Draft")) {
            cp.checkbox_Draft().click() ;
        } else if (checkbox.equals("Active")) {
            cp.checkbox_active().click();
        } else if (checkbox .equals("Closed") ) {
            cp.checkbox_closed().click();
        } else if (checkbox.equals("Fully funded") ) {
            cp.checkbox_fullyFunded().click();
        } else if (checkbox.equals("Part funded") ) {
            cp.checkbox_partFunded().click();
        } else if (checkbox.equals("Not funded") ) {
            cp.checkbox_notFunded().click() ;
        }

    }

    @And("^Clicks on the X button$")
    public void clicksOnTheXButtonAgain() {cp.btn_X().click() ;}
    @Then("^The filter panel will be hidden and the \"([^\"]*)\" won't be cleared$")
    public void theFilterPanelWillBeHiddenAndTheWonTBeCleared(String checkbox ) throws Throwable {

        // Check xem panel filter có hiển thị ko?
        boolean expected1 = false;
        boolean actual1 = cp.filter().isDisplayed();
        Assert.assertEquals(expected1, actual1);

        //check xem các check box có được select hay không?
        boolean expected2 = true;

        if (checkbox.equals("Ready to launch") ){
            boolean actual2 = cp.checkbox_ReadyToLaunch().isSelected() ;
            Assert.assertEquals(expected2, actual2);
        } else if (checkbox.equals("Draft")) {
            boolean actual2 = cp.checkbox_Draft().isSelected();
            Assert.assertEquals(expected2, actual2);
        } else if (checkbox.equals("Active")) {
            boolean actual2 =cp.checkbox_active().isSelected();
            Assert.assertEquals(expected2, actual2);
        } else if (checkbox .equals("Closed") ) {
            boolean actual2 = cp.checkbox_closed().isSelected();
            Assert.assertEquals(expected2, actual2);
        } else if (checkbox.equals("Fully funded") ) {
            boolean actual2 = cp.checkbox_fullyFunded().isSelected();
            Assert.assertEquals(expected2, actual2);
        } else if (checkbox.equals("Part funded") ) {
            boolean actual2 = cp.checkbox_partFunded().isSelected();
            Assert.assertEquals(expected2, actual2);
        } else if (checkbox.equals("Not funded") ) {
            boolean actual2 = cp.checkbox_notFunded().isSelected() ;
            Assert.assertEquals(expected2, actual2);
        }

//        cp.btn_filter().click();
//        Thread.sleep(1000);
//        //tạo 1 list chứa tất cả các checkbox
//        List<WebElement> webElementList_checkbox = cp.checkBox_checked();
//            //chạy vòng lặp để check các checkbox
//            for (int i = 0; i < webElementList_checkbox.size(); i++) {
//                //check xem các check box nào cần text
//                // get text ra tìm xem cái nào là checkbox cần ktra, tạidđó check xem checkbox nào đc selected
//                webElementList_checkbox.get(i).isSelected();
//            boolean expected = true;
//            Assert.assertEquals(expected, actual);
//        }
    }

    @And("^Clicks on 'Apply filter' button$")
    public void clicksOnApplyFilterButton() throws Throwable {
        cp.btn_applyFilters().click() ;
        Thread.sleep(1000);
        cp.btn_X().click();
        Thread.sleep(1000);
    }

    @Then("^The list of campaigns will be filtered and just displays the campaigns which on \"([^\"]*)\" status$")
    public void theListOfCampaignsWillBeFilteredAndJustDisplaysTheCampaignsWhichOnStatus(String checkbox)  throws Throwable {
        System.out.println(cp.btn_lastPage().getText());



        int totalPage = Integer.parseInt(cp.btn_lastPage().getText());        // xác định số trang, chuyểnn số trang sang chữ số

        if (totalPage==1) {
            List<WebElement> row_per_page = driver.findElements(By.xpath("//tr[@class='MuiTableRow-root css-1gqug66']"));
            //Tạo list chứa các đối tượng WebElement <tr>
            Thread.sleep(1000);

            for (int i=1;i <= row_per_page.size();i++ ){
                WebElement statusCheck = driver.findElement(By.xpath("//tbody/tr["+i+"]/th[1]"));
                actual = statusCheck.getText();
                expected = checkbox ;
                Assert.assertEquals(expected,actual);
            }
        }else {
            int page_temp = totalPage - 1;
            // số trang trước trang cuối

            for (int j=1; j<page_temp;j++) {     //mình có n page mình click n-1 lần
                for (int i = 1; i <= 30; i++) {
                    WebElement statusCheck = driver.findElement(By.xpath("//tbody/tr["+i+"]/th[1]"));
                    actual = statusCheck.getText();
                    System.out.println(actual) ;
                    expected = checkbox;
                    Assert.assertEquals(expected, actual);

                }
               // if(j==page_temp) return ; //khi return thif sẽ k chy các dòng phía sau return nữa
                cp.btn_nextPage().click();
            }

            //check tại trang cuối
            List<WebElement> row_per_page = driver.findElements(By.xpath("//tr[@class='MuiTableRow-root css-1gqug66']"));
            //Tạo list chứa các đối tượng WebElement <tr>
            Thread.sleep(1000);

            for (int i=1;i <= row_per_page.size();i++ ){
                WebElement statusCheck = driver.findElement(By.xpath("//tbody/tr["+i+"]/th[1]"));
                actual = statusCheck.getText();
                expected = checkbox ;
                Assert.assertEquals(expected,actual);
            }
        }
        }

















    @Then("^The list of campaigns will be filtered and just displays the campaigns which belong to the selected \"([^\"]*)\" option$")
    public void theListOfCampaignsWillBeFilteredAndJustDisplaysTheCampaignsWhichBelongToTheSelectedOption(String arg0) {
        //k biết làm
    }

    @And("^At the filter, user enters characters into the Finance volume fields From and To \"([^\"]*)\" and \"([^\"]*)\"$")
    public void atTheFilterUserEntersCharactersIntoTheFinanceVolumeFieldsFromAndToAnd(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        cp.txt_from().sendKeys(arg0 );
        cp.txt_to().sendKeys(arg1) ;
        Thread.sleep(1000);
    }

    @Then("^The error message will be displayed as user should enters number only$")
    public void theErrorMessageWillBeDisplayedAsUserShouldEntersNumberOnly() {
        actual = cp.error_numberOnly().getText().toString();
        expected ="chưa có message";
        Assert.assertEquals(expected,actual);

    }

    @And("^At the filter, user enters number into the \"([^\"]*)\" field$")
    public void atTheFilterUserEntersNumberIntoTheField(String arg0) {
        cp.txt_to().sendKeys(arg0) ;
    }

    @And("^Enters number into the \"([^\"]*)\" field$")
    public void entersNumberIntoTheField(String arg0)  {
        cp.txt_from().sendKeys(arg0 ) ;
    }


    @Then("^The error message will be displayed as the value of 'To' can't be smaller than 'From' field$")
    public void theErrorMessageWillBeDisplayedAsTheValueOfToCanTBeSmallerThanFromField() {
        actual = cp.error_numberOnly().getText().toString();
        expected ="chưa có message";
        Assert.assertEquals(expected,actual);

    }

    @Then("^The error message will be displayed as user can enter positive number only$")
    public void theErrorMessageWillBeDisplayedAsUserCanEnterPositiveNumberOnly() {

    }

    @Then("^The list of campaigns will be filtered and just displays the campaigns which contain the finance volume in the range of the filter$")
    public void theListOfCampaignsWillBeFilteredAndJustDisplaysTheCampaignsWhichContainTheFinanceVolumeInTheRangeOfTheFilter() {
    }


    @And("^At the Investment filter, user enters characters into the Investment fields \"([^\"]*)\" and \"([^\"]*)\"$")
    public void atTheFilterUserEntersCharactersIntoTheInvestmentFieldsAnd(String arg0, String arg1)  {
        // Write code here that turns the phrase above into concrete actions
        cp.txt_fromI().sendKeys(arg0);
        cp.txt_toI().sendKeys(arg1) ;
    }
    @Then("^At Investment field the error message will be displayed as user should enters number only$")
    public void atInvestmentFieldTheErrorMessageWillBeDisplayedAsUserShouldEntersNumberOnly() {
    }


    @And("^At the Investment filter, user enters number into the \"([^\"]*)\" field$")
    public void atTheInvestmentFilterUserEntersNumberIntoTheField(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^Enters number into the \"([^\"]*)\" field at investment$")
    public void entersNumberIntoTheFieldAtInvestment(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^The error message will be displayed as the value of \"([^\"]*)\" can't be smaller than \"([^\"]*)\" field$")
    public void theErrorMessageWillBeDisplayedAsTheValueOfCanTBeSmallerThanField(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^The list of campaigns will be filtered and just displays the campaigns which contain the Investment in the range of the filter$")
    public void theListOfCampaignsWillBeFilteredAndJustDisplaysTheCampaignsWhichContainTheInvestmentInTheRangeOfTheFilter() {

    }
}








