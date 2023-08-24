package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObjects.campaigns;
import utils.libs.TestBase;

import java.util.List;

public class Campaigns_Steps extends TestBase {
    campaigns cp = new campaigns(driver);

    String actual = "";
    String expected = "";
    String name = "";

    public Campaigns_Steps() {
    }


    @Given("^User Logged in as Admin$")
    public void userLoggedInAsAdmin() throws InterruptedException {
        String url = "https://v2.dev.pulse.ecoligo.com/campaigns";
        driver.get(url);
        Thread.sleep(3000);
    }

    @When("^User goes to the Campaign List View$")
    public void userGoesToTheCampaignListView() {
        actual = "Campaigns";
        expected = cp.title().getText();
        Assert.assertEquals(expected, actual);
    }


    @And("^Clicks on the dropdown filter button$")
    public void clicksOnTheDropdownFilterButton() {
        cp.btn_Filter().click();
    }


    @And("^Clicks on 'Apply filter' button$")
    public void clicksOnApplyFilterButton() {
        cp.btn_ApplyFilter().click();
    }

    @And("^Clicks on the X button again$")
    public void clicksOnTheXButtonAgain() throws Throwable {
        cp.btn_X_PanelFilter().click();
    }

    @And("^At the filter, user selects \"([^\"]*)\"$")
    public void atTheFilterUserSelects(String arg0) throws Throwable {
        cp.checkboxes_PanelFilter(arg0).click();
    }


    @And("^Opens the filter panel again$")
    public void opensTheFilterPanelAgain() throws Throwable {
        cp.btn_Filter().click();
    }

    @And("^Clicks on 'Reset all filter' button$")
    public void clicksOnResetAllFilterButton() throws Throwable {
        cp.btn_ResetAllFilter().click();
    }

    @And("^At the filter, user selects the filter options want to apply \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void atTheFilterUserSelectsTheFilterOptionsWantToApply(String country, String status, String InvestmentTo, String InvestmentFrom, String FinanceFrom, String FinanceTo) throws Throwable {
        cp.checkboxes_PanelFilter(country);
        cp.checkboxes_PanelFilter(status);
        cp.input_FromFinanceVolume().sendKeys(FinanceFrom);
        cp.input_ToFinanceVolume().sendKeys(FinanceTo);
        cp.input_ToInvestments().sendKeys(InvestmentTo);
        cp.input_FromInvestments().sendKeys(InvestmentFrom);
    }

    @And("^Check the initialized data of the search textbox$")
    public void checkTheInitializedDataOfTheSearchTextbox() throws Throwable {
        System.out.println(cp.input_SearchByName().getText().equals("null"));
        ;
    }

    @And("^Enters the name of campaign into the \"Search by name\" field$")
    public void entersTheNameOfCampaignIntoTheField(String arg0) throws Throwable {
        name = "Test";
        cp.input_SearchByName().sendKeys(name);
    }

    @And("^Click X button at the textbox$")
    public void clickXButtonAtTheTextbox() throws Throwable {
        cp.btn_X_SearchByName().click();
    }


    @Then("^The filter panel will be hidden and the filter options won't be cleared$")
    public void theFilterPanelWillBeHiddenAndTheFilterOptionsWonTBeCleared() {
        if (!cp.panel_Filter().isDisplayed()) {
            System.out.println("The filter panel be hidden");
            cp.btn_Filter().click();
            List<WebElement> webElementList_status = driver.findElements(By.xpath("//div[@class=MuiAccordionDetails-root]"));
            for (int i = 0; i < webElementList_status.size(); i++) {
                System.out.println(webElementList_status.get(i).getText());
            }
        } else {
            System.out.println("The filter panel not hidden");
        }

    }

    // Status
    @Then("^The list of campaigns will be filtered and just displays the campaigns which on \"([^\"]*)\" status$")
    public void theListOfCampaignsWillBeFilteredAndJustDisplaysTheCampaignsWhichOnStatus(String arg0) throws Throwable {
        cp.checkJustDisplayStatus(arg0);
    }

    // Country
    @Then("^The list of campaigns will be filtered and just displays the campaigns which belong to the selected \"([^\"]*)\" option$")
    public void theListOfCampaignsWillBeFilteredAndJustDisplaysTheCampaignsWhichBelongToTheSelectedOption(String arg0) throws Throwable {
        cp.checkJustDisplayCountry(arg0);
    }

    // Finance volume (CL017-CL020)
    @Then("^At the filter finance volume, user enters value and Clicks on 'Apply filter' button Then error message will be displayed$")
    public void atTheFilterFinanceVolumeUserEntersValueAndClicksOnApplyFilterButtonThenErrorMessageWillBeDisplayed() throws Throwable {
        // User tries to filter the Campaigns by Finance volume while entering characters into "From" and "To" fields
        String finance = "Ae23";
        cp.input_FromFinanceVolume().sendKeys(finance);
        cp.input_ToFinanceVolume().sendKeys(finance);
        expected = "User should enters number only";
        actual = "";
        Assert.assertEquals(expected, actual);

        // User tries to filter the Campaigns by Finance volume while entering value of "To" field smaller than "From" fields
        float fieldFromFinanceVolume = 400.22f;
        float fieldToFinanceVolume = 12.22f;
        cp.input_FromFinanceVolume().sendKeys(fieldFromFinanceVolume + "");
        cp.input_ToFinanceVolume().sendKeys(fieldToFinanceVolume + "");
        expected = "The value of To can't be smaller than From field";
        actual = "";
        Assert.assertEquals(expected, actual);

        // User tries to filter the Campaigns by Finance volume while entering negative number into "From" and "To" fields
        fieldFromFinanceVolume = -12.22f;
        fieldToFinanceVolume = -400.22f;
        cp.input_FromFinanceVolume().sendKeys(fieldFromFinanceVolume + "");
        cp.input_ToFinanceVolume().sendKeys(fieldToFinanceVolume + "");
        expected = "user can enter positive number only";
        actual = "";
        Assert.assertEquals(expected, actual);

        // User tries to filter the Campaigns by Finance volume while entering valid number into "From" and "To" fields
        fieldFromFinanceVolume = 12.22f;
        fieldToFinanceVolume = 400.22f;
        cp.input_FromFinanceVolume().sendKeys(fieldFromFinanceVolume + "");
        cp.input_ToFinanceVolume().sendKeys(fieldToFinanceVolume + "");

        // The list of campaigns will be filtered and just displays the campaigns which contain the finance volume in the range of the filter
        cp.checkRangeFinanceVolume(actual, fieldFromFinanceVolume, fieldToFinanceVolume);
    }

    // Investment (CL021-CL024)
    @Then("^At the filter investment, user enters value and Clicks on 'Apply filter' button Then error message will be displayed$")
    public void atTheFilterInvestmentUserEntersValueAndClicksOnApplyFilterButtonThenErrorMessageWillBeDisplayed() throws Throwable {
        // User tries to filter the Campaigns by Investment while entering characters into "From" and "To" fields
        String investment = "A24";
        cp.input_FromInvestments().sendKeys(investment);
        cp.input_ToInvestments().sendKeys(investment);
        expected = "User should enters number only";
        actual = "";
        Assert.assertEquals(expected, actual);

        // User tries to filter the Campaigns by Investment while entering value of "To" field smaller than "From" fields
        float fieldFromInvestment = 400.22f;
        float fieldToInvestment = 12.22f;
        cp.input_FromFinanceVolume().sendKeys(fieldFromInvestment + "");
        cp.input_ToFinanceVolume().sendKeys(fieldToInvestment + "");
        expected = "The value of To can't be smaller than From field";
        actual = "";
        Assert.assertEquals(expected, actual);

        // User tries to filter the Campaigns by Investment while entering negative number into "From" and "To" fields
        fieldFromInvestment = -12.22f;
        fieldToInvestment = -400.22f;
        cp.input_FromFinanceVolume().sendKeys(fieldFromInvestment + "");
        cp.input_ToFinanceVolume().sendKeys(fieldToInvestment + "");
        expected = "User can enter positive number only";
        actual = "";
        Assert.assertEquals(expected, actual);

        // User tries to filter the Campaigns by Investment while entering valid number into "From" and "To" fields
        fieldFromInvestment = 12.22f;
        fieldToInvestment = 400.22f;
        cp.input_FromFinanceVolume().sendKeys(fieldFromInvestment + "");
        cp.input_ToFinanceVolume().sendKeys(fieldToInvestment + "");

        // The list of campaigns will be filtered and just displays the campaigns which contain the finance volume in the range of the filter
        cp.checkRangeInvestment(actual, fieldFromInvestment, fieldToInvestment);
    }


    @Then("^All previously selected filters \"([^\"]*)\" are removed and the Campaigns list return to its original stat instantly and the filter panel is Closed$")
    public void allPreviouslySelectedFiltersAreRemovedAndTheCampaignsListReturnToItsOriginalStatInstantlyAndTheFilterPanelIsClosed(String arg0) throws Throwable {
        System.out.println(cp.checkboxes_PanelFilter(arg0).getAttribute("data-testid").contains("CheckBoxIcon") ? "Are removed" : "Not yet removed");
        System.out.println(cp.panel_Filter().isDisplayed() ? "Filter panel is Closed" : "Filter panel not closed");
    }


    @Then("^The list of campaigns will be filtered and just displays the campaigns which mapping with the filter condition \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void theListOfCampaignsWillBeFilteredAndJustDisplaysTheCampaignsWhichMappingWithTheFilterCondition(String country, String status, String InvestmentTo, String InvestmentFrom, String FinanceFrom, String FinanceTo) throws Throwable {
        cp.checkJustDisplayStatus(status);
        cp.checkJustDisplayCountry(country);
        cp.checkRangeInvestment(actual, Integer.parseInt(InvestmentFrom), Integer.parseInt(InvestmentTo));
        cp.checkRangeFinanceVolume(actual, Integer.parseInt(FinanceFrom), Integer.parseInt(FinanceTo));
    }


    @Then("^The textbox is displayed as blank and the placeholder should be 'Search by name'$")
    public void theTextboxIsDisplayedAsBlankAndThePlaceholderShouldBeSearchByName() throws Throwable {
        System.out.println(cp.input_SearchByName().getAttribute("placeholder").contains("Search by name"));
    }


    @Then("^The campaigns list will be filtered and shows the campaign which named contains the entered characters Query %LIKE%$")
    public void theCampaignsListWillBeFilteredAndShowsTheCampaignWhichNamedContainsTheEnteredCharactersQueryLIKE() throws Throwable {
        cp.checkName(name);
    }

    @Then("^The result list will be cleared and return the list to its original state$")
    public void theResultListWillBeClearedAndReturnTheListToItsOriginalState() throws Throwable {
        System.out.println(cp.input_SearchByName().getText().equals("null"));
        // Return the list to its original state


    }
}



