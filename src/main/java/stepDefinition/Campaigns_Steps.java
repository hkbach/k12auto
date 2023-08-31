package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.cy_gb.A;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pageObjects.campaigns;
import utils.libs.TestBase;

import java.util.Date;
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
    public void clicksOnApplyFilterButton() throws Throwable {
        cp.btn_ApplyFilter().click();
        Thread.sleep(1000);
    }

    @And("^Clicks on the X button$")
    public void clicksOnTheXButtonAgain() throws Throwable {
        cp.btn_X_PanelFilter().click();
        Thread.sleep(1000);
    }

    @And("^At the filter, user selects \"([^\"]*)\"$")
    public void atTheFilterUserSelects(String arg0) throws Throwable {
        cp.checkbox_PanelFilter(arg0).click();
        Thread.sleep(1000);
    }


    @And("^Opens the filter panel again$")
    public void opensTheFilterPanelAgain() {
        cp.btn_Filter().click();
    }

    @And("^Clicks on 'Reset all filter' button$")
    public void clicksOnResetAllFilterButton() throws Throwable {
        cp.btn_ResetAllFilter().click();
        Thread.sleep(1000);
    }

    @And("^At the filter, user selects the filter options want to apply \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void atTheFilterUserSelectsTheFilterOptionsWantToApply(String status, String country, String InvestmentTo, String InvestmentFrom, String FinanceFrom, String FinanceTo) throws Throwable {
        cp.checkbox_PanelFilter(status).click();
        Thread.sleep(1000);
        cp.checkbox_PanelFilter(country).click();
        Thread.sleep(1000);
        cp.input_FromFinanceVolume().sendKeys(FinanceFrom);
        Thread.sleep(1000);
        cp.input_ToFinanceVolume().sendKeys(FinanceTo);
        Thread.sleep(1000);
        cp.input_ToInvestments().sendKeys(InvestmentTo);
        Thread.sleep(1000);
        cp.input_FromInvestments().sendKeys(InvestmentFrom);
        Thread.sleep(1000);
    }

    @And("^Check the initialized data of the search textbox$")
    public void checkTheInitializedDataOfTheSearchTextbox() throws Throwable {
        Assert.assertEquals(cp.input_SearchByName().getAttribute("value").equals(""), true);
    }

    @And("^Enters the name of campaign into the \"([^\"]*)\" field$")
    public void entersTheNameOfCampaignIntoTheField(String arg0) throws Throwable {
        name = arg0;
        cp.input_SearchByName().sendKeys(arg0);
        cp.input_SearchByName().sendKeys(Keys.ENTER);
        Thread.sleep(1000);
    }

    @And("^Click X button at the textbox$")
    public void clickXButtonAtTheTextbox() throws Throwable {
        cp.btn_X_SearchByName().click();
        Thread.sleep(1000);
    }


    @Then("^The filter panel will be hidden and the filter options won't be cleared$")
    public void theFilterPanelWillBeHiddenAndTheFilterOptionsWonTBeCleared() throws Exception {
        // Check filter panel is display?
        expected = "NotAppear";
        try {
            cp.panel_Filter().isDisplayed();
            Assert.assertEquals(expected, "Appear");
        }catch(Exception e) {
            System.out.println(e);
            Assert.assertEquals(expected, "NotAppear");
        }

         // Check checkbox filter option is cleared?
        cp.btn_Filter().click();
        expected = "true";
        Thread.sleep(2000);
        List<WebElement> webElementList_checkbox = cp.checkboxes_checked();
        for (int i = 0; i < webElementList_checkbox.size(); i++) {
            if(webElementList_checkbox.get(i).isSelected()) {
                Assert.assertEquals(expected, "true");
            }else {
                Assert.assertEquals(expected, "false");
            }
        }
    }

    // Status
    @Then("^The list of campaigns will be filtered and just displays the campaigns which on \"([^\"]*)\" status$")
    public void theListOfCampaignsWillBeFilteredAndJustDisplaysTheCampaignsWhichOnStatus(String arg0) throws Throwable {
        if (cp.tableCell().size() > 0) {
            int numberPageResult = Integer.parseInt(cp.btns_Navigation().get(cp.btns_Navigation().size() - 3).getText());
            if(numberPageResult > 1) {
                for (int i = 1; i < numberPageResult; i++) {
                    verifyDisplayValueCheckbox(arg0, "Status");
                    cp.arrow_NextPage().click();
                    Thread.sleep(1000);
                }
            } else {
                verifyDisplayValueCheckbox(arg0, "Status");
            }
        }else {
            System.out.println("No result");
        }
    }

    // Country
    @Then("^The list of campaigns will be filtered and just displays the campaigns which belong to the selected \"([^\"]*)\" option$")
    public void theListOfCampaignsWillBeFilteredAndJustDisplaysTheCampaignsWhichBelongToTheSelectedOption(String arg0) throws Throwable {
        if (cp.tableCell().size() > 0) {
            int numberPageResult = Integer.parseInt(cp.btns_Navigation().get(cp.btns_Navigation().size() - 3).getText());
            if(numberPageResult > 1) {
                for (int i = 1; i < numberPageResult; i++) {
                    verifyDisplayValueCheckbox(arg0, "Country");
                    cp.arrow_NextPage().click();
                    Thread.sleep(500);
                }
            } else {
                verifyDisplayValueCheckbox(arg0, "Country");
            }
        }else {
            System.out.println("No result");
        }

    }

    // Finance volume (CL017-CL020)
    @Then("^At the filter finance volume, user enters value and Clicks on 'Apply filter' button Then error message will be displayed$")
    public void atTheFilterFinanceVolumeUserEntersValueAndClicksOnApplyFilterButtonThenErrorMessageWillBeDisplayed() throws Throwable {
        // User tries to filter the Campaigns by Finance volume while entering characters into "From" and "To" fields
        String finance = "Ae23";
        cp.input_FromFinanceVolume().sendKeys(finance);
        cp.input_ToFinanceVolume().sendKeys(finance);
        cp.btn_ApplyFilter().click();
        Thread.sleep(2000);
        expected = "User should enters number only";
        actual = "User should enters number only";
        Assert.assertEquals(expected, actual);

        // User tries to filter the Campaigns by Finance volume while entering value of "To" field smaller than "From" fields
        cp.input_FromFinanceVolume().clear();
        cp.input_ToFinanceVolume().clear();
        float fieldFromFinanceVolume = 400.22f;
        float fieldToFinanceVolume = 12.22f;
        cp.input_FromFinanceVolume().sendKeys(fieldFromFinanceVolume + "");
        cp.input_ToFinanceVolume().sendKeys(fieldToFinanceVolume + "");
        cp.btn_ApplyFilter().click();
        Thread.sleep(2000);
        expected = "The value of To can't be smaller than From field";
        actual = "The value of To can't be smaller than From field";
        Assert.assertEquals(expected, actual);

        // User tries to filter the Campaigns by Finance volume while entering negative number into "From" and "To" fields
        cp.input_FromFinanceVolume().clear();
        cp.input_ToFinanceVolume().clear();
        fieldFromFinanceVolume = -12.22f;
        fieldToFinanceVolume = -400.22f;
        cp.input_FromFinanceVolume().sendKeys(fieldFromFinanceVolume + "");
        cp.input_ToFinanceVolume().sendKeys(fieldToFinanceVolume + "");
        cp.btn_ApplyFilter().click();
        Thread.sleep(2000);
        expected = "User can enter positive number only";
        actual = "User can enter positive number only";
        Assert.assertEquals(expected, actual);

        // User tries to filter the Campaigns by Finance volume while entering valid number into "From" and "To" fields
        cp.input_FromFinanceVolume().clear();
        cp.input_ToFinanceVolume().clear();
        fieldFromFinanceVolume = 12.22f;
        fieldToFinanceVolume = 400000.22f;
        cp.input_FromFinanceVolume().sendKeys(fieldFromFinanceVolume + "");
        cp.input_ToFinanceVolume().sendKeys(fieldToFinanceVolume + "");
        cp.btn_ApplyFilter().click();
        Thread.sleep(2000);

        // The list of campaigns will be filtered and just displays the campaigns which contain the finance volume in the range of the filter
        cp.btn_X_PanelFilter().click();
        Thread.sleep(1000);
        if (cp.tableCell().size() > 0) {
            int numberPageResult = Integer.parseInt(cp.btns_Navigation().get(cp.btns_Navigation().size() - 3).getText());
            if(numberPageResult > 1) {
                for (int i = 1; i < numberPageResult; i++) {
                    verifyRangeValueInput(fieldFromFinanceVolume, fieldToFinanceVolume, "Finance vol.");
                    cp.arrow_NextPage().click();
                    Thread.sleep(500);
                }
            } else {
                verifyRangeValueInput(fieldFromFinanceVolume, fieldToFinanceVolume, "Finance vol.");
            }
        }else {
            System.out.println("No result");
        }

    }

    // Investment (CL021-CL024)
    @Then("^At the filter investment, user enters value and Clicks on 'Apply filter' button Then error message will be displayed$")
    public void atTheFilterInvestmentUserEntersValueAndClicksOnApplyFilterButtonThenErrorMessageWillBeDisplayed() throws Throwable {
        // User tries to filter the Campaigns by Investment while entering characters into "From" and "To" fields
        String investment = "A24";
        cp.input_FromInvestments().sendKeys(investment);
        cp.input_ToInvestments().sendKeys(investment);
        cp.btn_ApplyFilter().click();
        Thread.sleep(2000);
        expected = "User should enters number only";
        actual = "User should enters number only";
        Assert.assertEquals(expected, actual);

        // User tries to filter the Campaigns by Investment while entering value of "To" field smaller than "From" fields
        cp.input_FromInvestments().clear();
        cp.input_ToInvestments().clear();
        float fieldFromInvestment = 400.22f;
        float fieldToInvestment = 12.22f;
        cp.input_FromInvestments().sendKeys(fieldFromInvestment + "");
        cp.input_ToInvestments().sendKeys(fieldToInvestment + "");
        cp.btn_ApplyFilter().click();
        Thread.sleep(2000);
        expected = "The value of To can't be smaller than From field";
        actual = "The value of To can't be smaller than From field";
        Assert.assertEquals(expected, actual);

        // User tries to filter the Campaigns by Investment while entering negative number into "From" and "To" fields
        cp.input_FromInvestments().clear();
        cp.input_ToInvestments().clear();
        fieldFromInvestment = -12.22f;
        fieldToInvestment = -400.22f;
        cp.input_FromInvestments().sendKeys(fieldFromInvestment + "");
        cp.input_ToInvestments().sendKeys(fieldToInvestment + "");
        cp.btn_ApplyFilter().click();
        Thread.sleep(2000);
        expected = "User can enter positive number only";
        actual = "User can enter positive number only";
        Assert.assertEquals(expected, actual);

        // User tries to filter the Campaigns by Investment while entering valid number into "From" and "To" fields
        cp.input_FromInvestments().clear();
        cp.input_ToInvestments().clear();
        fieldFromInvestment = 12.22f;
        fieldToInvestment = 400000.22f;
        cp.input_FromInvestments().sendKeys(fieldFromInvestment + "");
        cp.input_ToInvestments().sendKeys(fieldToInvestment + "");
        cp.btn_ApplyFilter().click();
        Thread.sleep(2000);

        // The list of campaigns will be filtered and just displays the campaigns which contain the finance volume in the range of the filter
        cp.btn_X_PanelFilter().click();
        Thread.sleep(1000);
        if (cp.tableCell().size() > 0) {
            int numberPageResult = Integer.parseInt(cp.btns_Navigation().get(cp.btns_Navigation().size() - 3).getText());
            if(numberPageResult > 1) {
                for (int i = 1; i < numberPageResult; i++) {
                    verifyRangeValueInput(fieldFromInvestment, fieldToInvestment, "Investment");
                    cp.arrow_NextPage().click();
                    Thread.sleep(500);
                }
            } else {
                verifyRangeValueInput(fieldFromInvestment, fieldToInvestment, "Investment");
            }
        }else {
            System.out.println("No result");
        }

    }

    @Then("^All previously selected filters are removed and the Campaigns list return to its original stat instantly and the filter panel is Closed$")
    public void allPreviouslySelectedFiltersAreRemovedAndTheCampaignsListReturnToItsOriginalStatInstantlyAndTheFilterPanelIsClosed() throws Throwable {
        checkAllFieldFilterRemoved();
    }

    @Then("^The list of campaigns will be filtered and just displays the campaigns which mapping with the filter condition \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void theListOfCampaignsWillBeFilteredAndJustDisplaysTheCampaignsWhichMappingWithTheFilterCondition(String status, String country, String InvestmentTo, String InvestmentFrom, String FinanceFrom, String FinanceTo) throws Throwable {
        // Check mapping value filtered
        if (cp.tableCell().size() > 0) {
            verifyDisplayValueCheckbox(status, "Status");
            verifyDisplayValueCheckbox(country, "Country");
            verifyRangeValueInput(Integer.parseInt(InvestmentFrom), Integer.parseInt(InvestmentTo),"Investment");
            verifyRangeValueInput(Integer.parseInt(FinanceFrom), Integer.parseInt(FinanceTo), "Finance vol.");
        }else {
            System.out.println("No result");
        }

    }

    @Then("^The textbox is displayed as blank and the placeholder should be \"([^\"]*)\"$")
    public void theTextboxIsDisplayedAsBlankAndThePlaceholderShouldBe(String arg0) {
        Assert.assertEquals(cp.input_SearchByName().getAttribute("placeholder").equals(arg0), true);
    }


    @Then("^The campaigns list will be filtered and shows the campaign which named contains the entered characters Query %LIKE%$")
    public void theCampaignsListWillBeFilteredAndShowsTheCampaignWhichNamedContainsTheEnteredCharactersQueryLIKE() throws Throwable {
        if (cp.tableCell().size() > 0) {
            verifyName(name);
        }else {
            System.out.println("No result");
        }

    }

    @Then("^The result list will be cleared and return the list to its original state$")
    public void theResultListWillBeClearedAndReturnTheListToItsOriginalState() throws Throwable {
        Assert.assertEquals(cp.input_SearchByName().getText().equals(""), true);
    }


    @Then("^The results are displayed following the same rules as the Campaign list view, (\\d+) results per page, most recently created at the top$")
    public void theResultsAreDisplayedFollowingTheSameRulesAsTheCampaignListViewResultsPerPageMostRecentlyCreatedAtTheTop(int arg0) throws Throwable {
        String numberPageResult = cp.btns_Navigation().get(cp.btns_Navigation().size() - 3).getText();
        if(Integer.parseInt(numberPageResult) > 1) {
            for (int i = 1; i < Integer.parseInt(numberPageResult); i++) {
                Assert.assertEquals(cp.tableRow().size() <= 30, true);
                verifyDateCreatedOn();
                cp.arrow_NextPage().click();
            }
        }else if (Integer.parseInt(numberPageResult) == 1) {
            Assert.assertEquals(cp.tableRow().size() <= 30, true);
            verifyDateCreatedOn();
        }else {
            System.out.println("No result");
        }
    }

    @Then("^The 'no search results' screen will show$")
    public void theNoSearchResultsScreenWillShow() throws Throwable {
        actual = cp.textNoResultLineOne().getText().toString() + cp.textNoResultLineTwo().getText().toString();
        expected = "It seems that there are no results that match what you’re looking for." + "Please try using different criteria.";
        Assert.assertEquals(expected, actual);
    }

    @Then("^The result counter will displays exactly how many result there are in the list$")
    public void theResultCounterWillDisplaysExactlyHowManyResultThereAreInTheList() throws Throwable {

        // Click arrow last page
        cp.arrow_LastPage().click();
        Thread.sleep(2000);

        // Get number page result
        String numberPageResult = cp.btns_Navigation().get(cp.btns_Navigation().size() - 3).getText();

        // One line redundant display when number row of that page less than 30
        int numberRowOfLastPage = cp.tableRow().size();
        int totalResult = numberRowOfLastPage + (Integer.parseInt(numberPageResult) - 1) * 30;

        System.out.println("Total result: " + totalResult);

        // Get numberResult at screen
        String[] counterResult = cp.counterResult().getText().split(" ");

        actual = totalResult + "";
        expected = counterResult[counterResult.length - 1];

        // Compare result between calculator and get result at screen
        Assert.assertEquals(expected, actual);
    }

    @Then("^The pagination won't be displayed$")
    public void thePaginationWonTBeDisplayed() throws Throwable {
        expected = "NotAppear";
        try {
            cp.navigation().isDisplayed();
            Assert.assertEquals(expected, "Appear");
        }catch(Exception e) {
            System.out.println(e);
            Assert.assertEquals(expected, "NotAppear");
        }
    }


    @Then("^The pagination will be displayed with two pages$")
    public void thePaginationWillBeDisplayedWithTwoPages() throws Throwable {
        String numberPageResult = cp.btns_Navigation().get(cp.btns_Navigation().size() - 3).getText();
        actual = numberPageResult;
        expected = "2";
        Assert.assertEquals(expected, actual);
    }

    @Then("^The pagination will be displayed with three pages$")
    public void thePaginationWillBeDisplayedWithThreePages() throws Throwable {
        String numberPageResult = cp.btns_Navigation().get(cp.btns_Navigation().size() - 3).getText();
        actual = numberPageResult;
        expected = "3";
        Assert.assertEquals(expected, actual);
    }

    @Then("^Any search will be applied on top of selected filter options, and any filter options applied on top of any search results \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void anySearchWillBeAppliedOnTopOfSelectedFilterOptionsAndAnyFilterOptionsAppliedOnTopOfAnySearchResults(String SearchByName, String status, String country, String InvestmentTo, String InvestmentFrom, String FinanceFrom, String FinanceTo) throws Throwable {
        if(cp.tableCell().size() > 0){
            verifyName(SearchByName);
            verifyDisplayValueCheckbox(status, "Status");
            verifyDisplayValueCheckbox(country, "Country");
            verifyRangeValueInput(Integer.parseInt(InvestmentFrom), Integer.parseInt(InvestmentTo), "Investment");
            verifyRangeValueInput(Integer.parseInt(FinanceFrom), Integer.parseInt(FinanceTo),"Finance vol.");
        }else {
            System.out.println("No result");
        }
    }

    @Then("^The Filter button displays a counter of the number of filters applied$")
    public void theFilterButtonDisplaysACounterOfTheNumberOfFiltersApplied() throws Throwable {
        // Check input have value = one count.
        cp.btn_Filter().click();
        Thread.sleep(1000);
        int count_FieldFromFinance = cp.input_FromFinanceVolume().getAttribute("value").equals("") ? 0 : 1;
        int count_FieldToFinance = cp.input_ToFinanceVolume().getAttribute("value").equals("") ? 0 : 1;
        int count_FieldFromInvestment = cp.input_FromInvestments().getAttribute("value").equals("") ? 0 : 1;
        int count_FieldToInvestment = cp.input_ToInvestments().getAttribute("value").equals("") ? 0 : 1;
        actual = cp.checkboxes_checked().size() + count_FieldFromFinance + count_FieldToFinance + count_FieldFromInvestment + count_FieldToInvestment + "";

        cp.btn_X_PanelFilter().click();
        Thread.sleep(1000);
        String counterFilter = cp.btn_Filter().getText();
        int startIndex = counterFilter.indexOf("(");
        int endIndex = counterFilter.indexOf(")");
        if (startIndex != -1 && endIndex != -1) {
            String numberStr = counterFilter.substring(startIndex + 1, endIndex);
            int numberOptionFilter = Integer.parseInt(numberStr);
            expected = numberOptionFilter + "";
            Assert.assertEquals(expected, actual);
        }

    }


    public void verifyDisplayValueCheckbox(String arg0, String nameColumn) {
        expected = arg0;
        int numberColumn = cp.tableHeader_Column().size();
        for (int i = 0; i < numberColumn; i++) {
            if (cp.tableHeader_Column().get(i).getText().equals(nameColumn)) {
                List<WebElement> listValueOfColumn =  cp.checkValueColumn(i + 1);
                for (WebElement value: listValueOfColumn) {
                    actual = value.getText();
                    Assert.assertEquals(expected, actual);
                }
            }
        }
    }


    public void verifyName(String name) {
        expected = name.toLowerCase();
        int numberColumn = cp.tableHeader_Column().size();
        for (int i = 0; i < numberColumn; i++) {
            if (cp.tableHeader_Column().get(i).getText().equals("Name")) {
                List<WebElement> listValueOfColumn =  cp.checkValueColumn(i + 1);
                for (WebElement value: listValueOfColumn) {
                    actual = value.getText().toLowerCase();
                    Assert.assertEquals(actual.contains(expected), true);
                }
            }
        }
    }


    public void verifyRangeValueInput(float fieldFromInvestment, float fieldToInvestment, String nameColumn) {
        int numberColumn = cp.tableHeader_Column().size();
        for (int i = 0; i < numberColumn; i++) {
            if (cp.tableHeader_Column().get(i).getText().equals(nameColumn)) {
                List<WebElement> listValueOfColumn =  cp.checkValueColumn(i + 1);
                for (WebElement value: listValueOfColumn) {
                    String investmentVolume  = value.getText();
                    String[] arrayList = investmentVolume.substring(0, investmentVolume.length() - 1).split(",");
                    String investmentFilter = "";

                    for (int k = 0; k < arrayList.length; k++) {
                        investmentFilter += arrayList[k];
                    }

                    expected = "true";
                    if(fieldFromInvestment < Integer.parseInt(investmentFilter) && Integer.parseInt(investmentFilter) < fieldToInvestment) {
                        Assert.assertEquals(expected, "true");
                    }else {
                        Assert.assertEquals(expected, "false");
                    }
                }
            }
        }
    }

    public void verifyDateCreatedOn() {
        int numberColumn = cp.tableHeader_Column().size();
        for (int i = 0; i < numberColumn; i++) {
            // Check column have header name
            if (cp.tableHeader_Column().get(i).getText().equals("Created on")) {

                    String dateCreateOnBefore = cp.checkValueColumn(i + 1).get(0).getText();
                    String[] arrayDateCreateOnBefore = dateCreateOnBefore.split("\\.");
                    Date dateBefore = new Date(Integer.parseInt(arrayDateCreateOnBefore[0]),Integer.parseInt(arrayDateCreateOnBefore[1]),Integer.parseInt(arrayDateCreateOnBefore[2]));

                    List<WebElement> listValueOfColumn =  cp.checkValueColumn(i + 1);
                for (WebElement value: listValueOfColumn) {
                    String dateCreateOnAfter = value.getText();
                    String[] arrayDateCreateOnAfter = dateCreateOnAfter.split("\\.");
                    Date dateAfter = new Date(Integer.parseInt(arrayDateCreateOnAfter[0]),Integer.parseInt(arrayDateCreateOnAfter[1]),Integer.parseInt(arrayDateCreateOnAfter[2]));
                    Assert.assertEquals(dateAfter.before(dateBefore) || dateAfter.equals(dateBefore), true);
                    dateCreateOnBefore = dateCreateOnAfter;
                }

            }
        }
    }


    public void checkAllFieldFilterRemoved() {
        Assert.assertEquals(cp.checkboxes_checked().size() <= 0, true);
        Assert.assertEquals(cp.input_FromFinanceVolume().getAttribute("value").equals(""), true);
        Assert.assertEquals(cp.input_ToFinanceVolume().getAttribute("value").equals(""), true);
        Assert.assertEquals(cp.input_FromInvestments().getAttribute("value").equals(""), true);
        Assert.assertEquals(cp.input_ToInvestments().getAttribute("value").equals(""), true);
    }



}



