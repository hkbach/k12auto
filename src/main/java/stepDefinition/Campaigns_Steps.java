//package stepDefinition;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import org.junit.Assert;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebElement;
//import pageObjects.campaigns;
//import utils.libs.TestBase;
//
//import java.util.List;
//
//public class Campaigns_Steps extends TestBase {
//    campaigns cp = new campaigns(driver);
//
//    String actual = "";
//    String expected = "";
//    String name = "";
//
//    public Campaigns_Steps() {
//    }
//
//
//    @Given("^User Logged in as Admin$")
//    public void userLoggedInAsAdmin() throws InterruptedException {
//        String url = "https://v2.dev.pulse.ecoligo.com/campaigns";
//        driver.get(url);
//        Thread.sleep(3000);
//    }
//
//    @When("^User goes to the Campaign List View$")
//    public void userGoesToTheCampaignListView() {
//        actual = "Campaigns";
//        expected = cp.title().getText();
//        Assert.assertEquals(expected, actual);
//    }
//
//
//    @And("^Clicks on the dropdown filter button$")
//    public void clicksOnTheDropdownFilterButton() {
//        cp.btn_Filter().click();
//    }
//
//
//    @And("^Clicks on 'Apply filter' button$")
//    public void clicksOnApplyFilterButton() throws Throwable {
//        cp.btn_ApplyFilter().click();
//        Thread.sleep(1000);
//    }
//
//    @And("^Clicks on the X button again$")
//    public void clicksOnTheXButtonAgain() throws Throwable {
//        cp.btn_X_PanelFilter().click();
//        Thread.sleep(1000);
//    }
//
//    @And("^At the filter, user selects \"([^\"]*)\"$")
//    public void atTheFilterUserSelects(String arg0) throws Throwable {
//        cp.checkbox_PanelFilter(arg0).click();
//        cp.checkbox_PanelFilter("Active").click();
//        Thread.sleep(1000);
//    }
//
//
//    @And("^Opens the filter panel again$")
//    public void opensTheFilterPanelAgain() {
//        cp.btn_Filter().click();
//    }
//
//    @And("^Clicks on 'Reset all filter' button$")
//    public void clicksOnResetAllFilterButton() throws Throwable {
//        cp.btn_ResetAllFilter().click();
//        Thread.sleep(1000);
//    }
//
//    @And("^At the filter, user selects the filter options want to apply \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
//    public void atTheFilterUserSelectsTheFilterOptionsWantToApply(String status, String country, String InvestmentTo, String InvestmentFrom, String FinanceFrom, String FinanceTo) throws Throwable {
//        cp.checkbox_PanelFilter(status).click();
//        Thread.sleep(1000);
//        cp.checkbox_PanelFilter(country).click();
//        Thread.sleep(1000);
//        cp.input_FromFinanceVolume().sendKeys(FinanceFrom);
//        Thread.sleep(1000);
//        cp.input_ToFinanceVolume().sendKeys(FinanceTo);
//        Thread.sleep(1000);
//        cp.input_ToInvestments().sendKeys(InvestmentTo);
//        Thread.sleep(1000);
//        cp.input_FromInvestments().sendKeys(InvestmentFrom);
//        Thread.sleep(1000);
//    }
//
//    @And("^Check the initialized data of the search textbox$")
//    public void checkTheInitializedDataOfTheSearchTextbox() throws Throwable {
//        System.out.println(cp.input_SearchByName().getAttribute("value").equals("") ? "SearchTextbox is null" : "Error");
//    }
//
//    @And("^Enters the name of campaign into the \"([^\"]*)\" field$")
//    public void entersTheNameOfCampaignIntoTheField(String arg0) throws Throwable {
//        cp.input_SearchByName().sendKeys(arg0);
//        cp.input_SearchByName().sendKeys(Keys.ENTER);
//        Thread.sleep(1000);
//    }
//
//    @And("^Click X button at the textbox$")
//    public void clickXButtonAtTheTextbox() throws Throwable {
//        cp.btn_X_SearchByName().click();
//        Thread.sleep(1000);
//    }
//
//
//    @Then("^The filter panel will be hidden and the filter options won't be cleared$")
//    public void theFilterPanelWillBeHiddenAndTheFilterOptionsWonTBeCleared() {
//        cp.btn_Filter().click();
//        System.out.println(cp.panel_Filter().isDisplayed() ? "Passed: Panel filter is displayed after click btn_filter " : "Panel filter be hidden");
//        List<WebElement> webElementList_status = cp.checkboxes_checked();
//        System.out.println(webElementList_status.size() > 0 ? "Passed :The filter options not be cleared" : "Failed: The filter options be cleared");
//    }
//
//    // Status
//    @Then("^The list of campaigns will be filtered and just displays the campaigns which on \"([^\"]*)\" status$")
//    public void theListOfCampaignsWillBeFilteredAndJustDisplaysTheCampaignsWhichOnStatus(String arg0) throws Throwable {
//        cp.checkJustDisplayStatus(arg0);
//        Thread.sleep(1000);
//    }
//
//    // Country
//    @Then("^The list of campaigns will be filtered and just displays the campaigns which belong to the selected \"([^\"]*)\" option$")
//    public void theListOfCampaignsWillBeFilteredAndJustDisplaysTheCampaignsWhichBelongToTheSelectedOption(String arg0) throws Throwable {
//        cp.checkJustDisplayCountry(arg0);
//        Thread.sleep(1000);
//    }
//
//    // Finance volume (CL017-CL020)
//    @Then("^At the filter finance volume, user enters value and Clicks on 'Apply filter' button Then error message will be displayed$")
//    public void atTheFilterFinanceVolumeUserEntersValueAndClicksOnApplyFilterButtonThenErrorMessageWillBeDisplayed() throws Throwable {
//        // User tries to filter the Campaigns by Finance volume while entering characters into "From" and "To" fields
//        String finance = "Ae23";
//        cp.input_FromFinanceVolume().sendKeys(finance);
//        cp.input_ToFinanceVolume().sendKeys(finance);
//        cp.btn_ApplyFilter().click();
//        Thread.sleep(2000);
//        expected = "User should enters number only";
//        actual = "";
//        System.out.println(expected.equals(actual) ? "Passed" : "Failed");
//
//        // User tries to filter the Campaigns by Finance volume while entering value of "To" field smaller than "From" fields
//        cp.input_FromFinanceVolume().clear();
//        cp.input_ToFinanceVolume().clear();
//        float fieldFromFinanceVolume = 400.22f;
//        float fieldToFinanceVolume = 12.22f;
//        cp.input_FromFinanceVolume().sendKeys(fieldFromFinanceVolume + "");
//        cp.input_ToFinanceVolume().sendKeys(fieldToFinanceVolume + "");
//        cp.btn_ApplyFilter().click();
//        Thread.sleep(2000);
//        expected = "The value of To can't be smaller than From field";
//        actual = "";
//        System.out.println(expected.equals(actual) ? "Passed" : "Failed");
//
//        // User tries to filter the Campaigns by Finance volume while entering negative number into "From" and "To" fields
//        cp.input_FromFinanceVolume().clear();
//        cp.input_ToFinanceVolume().clear();
//        fieldFromFinanceVolume = -12.22f;
//        fieldToFinanceVolume = -400.22f;
//        cp.input_FromFinanceVolume().sendKeys(fieldFromFinanceVolume + "");
//        cp.input_ToFinanceVolume().sendKeys(fieldToFinanceVolume + "");
//        cp.btn_ApplyFilter().click();
//        Thread.sleep(2000);
//        expected = "user can enter positive number only";
//        actual = "";
//        System.out.println(expected.equals(actual) ? "Passed" : "Failed");
//
//        // User tries to filter the Campaigns by Finance volume while entering valid number into "From" and "To" fields
//        cp.input_FromFinanceVolume().clear();
//        cp.input_ToFinanceVolume().clear();
//        fieldFromFinanceVolume = 12.22f;
//        fieldToFinanceVolume = 400000.22f;
//        cp.input_FromFinanceVolume().sendKeys(fieldFromFinanceVolume + "");
//        cp.input_ToFinanceVolume().sendKeys(fieldToFinanceVolume + "");
//        cp.btn_ApplyFilter().click();
//        Thread.sleep(2000);
//
//        // The list of campaigns will be filtered and just displays the campaigns which contain the finance volume in the range of the filter
//        cp.checkRangeFinanceVolume(fieldFromFinanceVolume, fieldToFinanceVolume);
//    }
//
//    // Investment (CL021-CL024)
//    @Then("^At the filter investment, user enters value and Clicks on 'Apply filter' button Then error message will be displayed$")
//    public void atTheFilterInvestmentUserEntersValueAndClicksOnApplyFilterButtonThenErrorMessageWillBeDisplayed() throws Throwable {
//        // User tries to filter the Campaigns by Investment while entering characters into "From" and "To" fields
//        String investment = "A24";
//        cp.input_FromInvestments().sendKeys(investment);
//        cp.input_ToInvestments().sendKeys(investment);
//        cp.btn_ApplyFilter().click();
//        Thread.sleep(2000);
//        expected = "User should enters number only";
//        actual = "";
//        System.out.println(expected.equals(actual) ? "Passed" : "Failed");
//
//        // User tries to filter the Campaigns by Investment while entering value of "To" field smaller than "From" fields
//        cp.input_FromInvestments().clear();
//        cp.input_ToInvestments().clear();
//        float fieldFromInvestment = 400.22f;
//        float fieldToInvestment = 12.22f;
//        cp.input_FromInvestments().sendKeys(fieldFromInvestment + "");
//        cp.input_ToInvestments().sendKeys(fieldToInvestment + "");
//        cp.btn_ApplyFilter().click();
//        Thread.sleep(2000);
//        expected = "The value of To can't be smaller than From field";
//        actual = "";
//        System.out.println(expected.equals(actual) ? "Passed" : "Failed");
//
//        // User tries to filter the Campaigns by Investment while entering negative number into "From" and "To" fields
//        cp.input_FromInvestments().clear();
//        cp.input_ToInvestments().clear();
//        fieldFromInvestment = -12.22f;
//        fieldToInvestment = -400.22f;
//        cp.input_FromInvestments().sendKeys(fieldFromInvestment + "");
//        cp.input_ToInvestments().sendKeys(fieldToInvestment + "");
//        cp.btn_ApplyFilter().click();
//        Thread.sleep(2000);
//        expected = "User can enter positive number only";
//        actual = "";
//        System.out.println(expected.equals(actual) ? "Passed" : "Failed");
//
//        // User tries to filter the Campaigns by Investment while entering valid number into "From" and "To" fields
//        cp.input_FromInvestments().clear();
//        cp.input_ToInvestments().clear();
//        fieldFromInvestment = 12.22f;
//        fieldToInvestment = 400000.22f;
//        cp.input_FromInvestments().sendKeys(fieldFromInvestment + "");
//        cp.input_ToInvestments().sendKeys(fieldToInvestment + "");
//        cp.btn_ApplyFilter().click();
//        Thread.sleep(2000);
//
//        // The list of campaigns will be filtered and just displays the campaigns which contain the finance volume in the range of the filter
//        cp.checkRangeInvestment(fieldFromInvestment, fieldToInvestment);
//    }
//
//    @Then("^All previously selected filters are removed and the Campaigns list return to its original stat instantly and the filter panel is Closed$")
//    public void allPreviouslySelectedFiltersAreRemovedAndTheCampaignsListReturnToItsOriginalStatInstantlyAndTheFilterPanelIsClosed() throws Throwable {
//        System.out.println(cp.checkboxes_checked().size() <= 0 ? "Passed: Are removed" : "Failed: Not yet removed");
//        System.out.println( cp.input_FromFinanceVolume().getAttribute("value").equals("") ? "Passed: Are removed" : "Failed: Not yet removed");
//        System.out.println( cp.input_ToFinanceVolume().getAttribute("value").equals("") ? "Passed: Are removed" : "Failed: Not yet removed");
//        System.out.println( cp.input_FromInvestments().getAttribute("value").equals("") ? "Passed: Are removed" : "Failed: Not yet removed");
//        System.out.println( cp.input_ToInvestments().getAttribute("value").equals("") ? "Passed: Are removed" : "Failed: Not yet removed");
//    }
//
//    @Then("^The list of campaigns will be filtered and just displays the campaigns which mapping with the filter condition \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
//    public void theListOfCampaignsWillBeFilteredAndJustDisplaysTheCampaignsWhichMappingWithTheFilterCondition(String status, String country, String InvestmentTo, String InvestmentFrom, String FinanceFrom, String FinanceTo) throws Throwable {
//        // Check removed after click btn reset all filter
//        System.out.println(cp.checkboxes_checked().size() <= 0 ? "Passed: Are removed" : "Failed: Not yet removed");
//        System.out.println( cp.input_FromFinanceVolume().getAttribute("value").equals("") ? "Passed: Are removed" : "Failed: Not yet removed");
//        System.out.println( cp.input_ToFinanceVolume().getAttribute("value").equals("") ?  "Passed: Are removed" : "Failed: Not yet removed");
//        System.out.println( cp.input_FromInvestments().getAttribute("value").equals("") ?  "Passed: Are removed" : "Failed: Not yet removed");
//        System.out.println( cp.input_ToInvestments().getAttribute("value").equals("") ?  "Passed: Are removed" : "Failed: Not yet removed");
//        // Check mapping value filtered
//        cp.checkJustDisplayStatus(status);
//        cp.checkJustDisplayCountry(country);
//        cp.checkRangeInvestment(Integer.parseInt(InvestmentFrom), Integer.parseInt(InvestmentTo));
//        cp.checkRangeFinanceVolume(Integer.parseInt(FinanceFrom), Integer.parseInt(FinanceTo));
//    }
//
//    @Then("^The textbox is displayed as blank and the placeholder should be 'Search by name'$")
//    public void theTextboxIsDisplayedAsBlankAndThePlaceholderShouldBeSearchByName() throws Throwable {
//        System.out.println(cp.input_SearchByName().getAttribute("placeholder").contains("Search by name") ? "Passed" : "Failed");
//    }
//
//
//    @Then("^The campaigns list will be filtered and shows the campaign which named contains the entered characters Query %LIKE%$")
//    public void theCampaignsListWillBeFilteredAndShowsTheCampaignWhichNamedContainsTheEnteredCharactersQueryLIKE() throws Throwable {
//        cp.checkName(name);
//        Thread.sleep(2000);
//    }
//
//    @Then("^The result list will be cleared and return the list to its original state$")
//    public void theResultListWillBeClearedAndReturnTheListToItsOriginalState() throws Throwable {
//        System.out.println(cp.input_SearchByName().getText().equals("") ? "The result be cleared and the list to its original state" : "Failed");
//        // Return the list to its original state
//    }
//
//
//    @Then("^The results are displayed following the same rules as the Campaign list view, (\\d+) results per page, most recently created at the top$")
//    public void theResultsAreDisplayedFollowingTheSameRulesAsTheCampaignListViewResultsPerPageMostRecentlyCreatedAtTheTop(int arg0) throws Throwable {
//        System.out.println(cp.tableRow().size()>30 ? "Failed: > 30 results per page" : "Passed: Just display 30 results per page");;
//        cp.checkDateCreatedOn();
//    }
//
//    @Then("^The 'no search results' screen will show$")
//    public void theNoSearchResultsScreenWillShow() throws Throwable {
//        System.out.println(cp.tableCell().size() > 0 ? "": "The 'no search results' screen showed");
//        actual = cp.textNoResultLineOne().getText().toString() + cp.textNoResultLineTwo().getText().toString();
//        expected = "It seems that there are no results that match what you’re looking for." + "Please try using different criteria.";
//        Assert.assertEquals(expected, actual);
//        Thread.sleep(1000);
//    }
//
//    @Then("^The result counter will displays exactly how many result there are in the list$")
//    public void theResultCounterWillDisplaysExactlyHowManyResultThereAreInTheList() throws Throwable {
//
//        // Click arrow last page
//        cp.arrow_LastPage().click();
//        Thread.sleep(2000);
//
//        // Get number page result
//        String numberPageResult = cp.buttons_Navigation().get(cp.buttons_Navigation().size() - 3).getText();
//
//        // One line redundant display when number row of that page less than 30
//        int numberRowLastPage = cp.tableRow().size() >= 30 ? cp.tableRow().size() : (cp.tableRow().size() - 1);
//        int totalResult = numberRowLastPage + (Integer.parseInt(numberPageResult) - 1) * 30;
//
//        System.out.println("Total result: " + totalResult);
//
//        // Get numberResult at screen
//        String[] counterResult = cp.counterResult().getText().split(" ");
//
//        actual = totalResult + "";
//        expected = counterResult[counterResult.length - 1];
//
//        // Compare result between calculator and get result at screen
//        Assert.assertEquals(expected, actual);
//    }
//
//    @Then("^The pagination won't be displayed$")
//    public void thePaginationWonTBeDisplayed() throws Throwable {
//        System.out.println(cp.navigation().isDisplayed() ? "Failed" : "Passed");;
//    }
//
//
//    @Then("^The pagination will be displayed with two pages$")
//    public void thePaginationWillBeDisplayedWithTwoPages() throws Throwable {
//        String numberPageResult = cp.buttons_Navigation().get(cp.buttons_Navigation().size() - 3).getText();
//        actual = numberPageResult;
//        System.out.println(numberPageResult);
//        expected = "2";
//        Assert.assertEquals(expected, actual);
//    }
//
//    @Then("^The pagination will be displayed with three pages$")
//    public void thePaginationWillBeDisplayedWithThreePages() throws Throwable {
//        String numberPageResult = cp.buttons_Navigation().get(cp.buttons_Navigation().size() - 3).getText();
//        actual = numberPageResult;
//        System.out.println(numberPageResult);
//        expected = "3";
//        Assert.assertEquals(expected, actual);
//    }
//
//    @Then("^Any search will be applied on top of selected filter options, and any filter options applied on top of any search results \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
//    public void anySearchWillBeAppliedOnTopOfSelectedFilterOptionsAndAnyFilterOptionsAppliedOnTopOfAnySearchResults(String SearchByName, String status, String country, String InvestmentTo, String InvestmentFrom, String FinanceFrom, String FinanceTo) throws Throwable {
//        cp.checkName(SearchByName);
//        cp.checkJustDisplayStatus(status);
//        cp.checkJustDisplayCountry(country);
//        cp.checkRangeInvestment(Integer.parseInt(InvestmentFrom), Integer.parseInt(InvestmentTo));
//        cp.checkRangeFinanceVolume(Integer.parseInt(FinanceFrom), Integer.parseInt(FinanceTo));
//    }
//
//    @Then("^The Filter button displays a counter of the number of filters applied$")
//    public void theFilterButtonDisplaysACounterOfTheNumberOfFiltersApplied() throws Throwable {
//        String counterFilter = cp.btn_Filter().getText();
//        int startIndex = counterFilter.indexOf("(");
//        int endIndex = counterFilter.indexOf(")");
//
//        if (startIndex != -1 && endIndex != -1) {
//            String numberStr = counterFilter.substring(startIndex + 1, endIndex);
//            int number = Integer.parseInt(numberStr);
//            System.out.println(number);
//        }
//
//    }
//
//
//
//}
//
//
//
