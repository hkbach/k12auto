package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pageObjects.listCampaigns;
import utils.libs.TestBase;

public class ListCampaigns_Steps extends TestBase {
    listCampaigns cp = new listCampaigns(driver);

    String actual = "";
    String expected = "";
    String name = "";

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
    public void atTheFilterUserSelects(String arg0)  {
        // Write code here that turns the phrase above into concrete actions
        if (arg0.equals("Ready to launch") ){
            cp.checkbox_ReadyToLaunch().click();
        } else if (arg0.equals("Draft")) {
            cp.checkbox_Draft().click() ;
        } else if (arg0.equals("Active")) {
            cp.checkbox_active().click();
        } else if (arg0 .equals("Closed") ) {
            cp.checkbox_closed().click();
        } else if (arg0.equals("Fully funded") ) {
            cp.checkbox_fullyFunded().click();
        } else if (arg0.equals("Part funded") ) {
            cp.checkbox_partFunded().click();
        } else if (arg0.equals("Not funded") ) {
            cp.checkbox_notFunded().click() ;
        }

    }

    @And("^Clicks on the X button$")
    public void clicksOnTheXButtonAgain() {
        cp.btn_X().click() ;
    }

    @Then("^The filter panel will be hidden and the filter options won't be cleared$")
    public void theFilterPanelWillBeHiddenAndTheFilterOptionsWonTBeCleared() {
         Boolean actual1,actual2,expected1,expected2;

         actual1 = cp.checkbox_ReadyToLaunch().isSelected() ; // true
         actual2 = cp.title().isDisplayed();

         expected1 = true ;
         expected2 = true;
         Assert.assertEquals(expected1,actual1);
         Assert.assertEquals(expected2,actual2);

         //k biết làm
    }

    @And("^Clicks on 'Apply filter' button$")
    public void clicksOnApplyFilterButton() throws Throwable {
        cp.btn_applyFilters().click() ;
        Thread.sleep(1000);

    }

    @Then("^The list of campaigns will be filtered and just displays the campaigns which on \"([^\"]*)\" status$")
    public void theListOfCampaignsWillBeFilteredAndJustDisplaysTheCampaignsWhichOnStatus(String arg0)  {
        //k biết làm
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
}








