package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.bytebuddy.asm.Advice;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pageObjects.listCampaigns;
import pageObjects.login;
import utils.libs.TestBase;

import java.security.Key;
import java.security.KeyStore;
import java.util.List;

public class ListCampaigns_Steps extends TestBase {
    listCampaigns cp = new listCampaigns(driver);
    login lg = new login(driver);
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
        lg.txt_email().sendKeys("admin@ecoligo.com");
        lg.txt_password().sendKeys("EcoAdmin4564322020!!!");
        lg.btn_login().click();
        Thread.sleep(1000);

    }


    @When("^User goes to the Campaign List View$")
    public void userGoesToTheCampaignListView() {

    }

    @And("^Clicks on the dropdown filter button$")
    public void clicksOnTheDropdownFilterButton() throws Throwable {
        cp.btn_filter().click();
        Thread.sleep(1000);
    }


    @And("^At the filter, user selects \"([^\"]*)\"$")
    public void atTheFilterUserSelects(String checkbox) {
        // Write code here that turns the phrase above into concrete actions
        if (checkbox.equals("Ready to launch")) {
            cp.checkbox_ReadyToLaunch().click();
        } else if (checkbox.equals("Draft")) {
            cp.checkbox_Draft().click();
        } else if (checkbox.equals("Active")) {
            cp.checkbox_active().click();
        } else if (checkbox.equals("Closed")) {
            cp.checkbox_closed().click();
        } else if (checkbox.equals("Fully funded")) {
            cp.checkbox_fullyFunded().click();
        } else if (checkbox.equals("Part funded")) {
            cp.checkbox_partFunded().click();
        } else if (checkbox.equals("Not funded")) {
            cp.checkbox_notFunded().click();
        }

    }

    @And("^Clicks on the X button$")
    public void clicksOnTheXButtonAgain() {
        cp.btn_X().click();
    }

    @And("^At Finance, user enters number into the \"([^\"]*)\" field$")//to Finance
    public void atFinanceUserEntersNumberIntoTheField(int toF) {
        // Write code here that turns the phrase above into concrete actions

        cp.txt_toF().sendKeys(toF + "");
    }

    @And("^Enters number into the \"([^\"]*)\" field at Finance$")//from Finance
    public void entersNumberIntoTheFieldAtFinance(int fromF) {
        // Write code here that turns the phrase above into concrete actions
        cp.txt_fromF().sendKeys(fromF + "");
    }

    @And("^At Finance, user enters number is negative into the To field$")
    public void atFinanceUserEntersNumberIsNegativeIntoTheField() {
        // Write code here that turns the phrase above into concrete actions
        cp.txt_toF().clear();
        float to = -50.55f;
        cp.txt_toF().sendKeys(to + "");
    }

    @And("^Enters number is negative into the From field at Finance$")
    public void entersNumberIsNegativeIntoTheFieldAtFinance() {
        // Write code here that turns the phrase above into concrete actions
        cp.txt_fromF().clear();
        float from = -60.55f;
        cp.txt_fromF().sendKeys(from + "");

    }

    //Investment

    @And("^At the Investment filter, user enters number into the \"([^\"]*)\" field$") //to ivestment
    public void atTheInvestmentFilterUserEntersNumberIntoTheField(int toI) {
        cp.txt_toI().sendKeys(toI + "");
    }



    @And("^Enters number into the \"([^\"]*)\" field at investment$")
    public void entersNumberIntoTheFieldAtInvestment(int fromI) {

        cp.txt_fromI().sendKeys(fromI + "");
    }

    @And("^At the Investment filter, user enters negative number into the To field$")
    public void atTheInvestmentFilterUserEntersNegativeNumberIntoTheToField() {
        cp.txt_toI().clear();
        float to = -50.55f;
        cp.txt_toI().sendKeys(to + "");
    }

    @And("^Enters negative number into the from field at investment$")
    public void entersNegativeNumberIntoTheFromFieldAtInvestment() {
        cp.txt_fromI().clear();
        float from = -50.55f;
        cp.txt_fromI().sendKeys(from + "");
    }

    @And("^Clicks on 'Apply filter' button$")
    public void clicksOnApplyFilterButton() throws Throwable {
        cp.btn_applyFilters().click();
        Thread.sleep(1000);
        cp.btn_X().click();
        Thread.sleep(1000);
    }

    @And("^At the filter, user selects the filter options want to apply \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void atTheFilterUserSelectsTheFilterOptionsWantToApply(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5) {
        // Write code here that turns the phrase above into concrete actions
        if (arg1.equals("Ready to launch")) {
            cp.checkbox_ReadyToLaunch().click();
        } else if (arg1.equals("Draft")) {
            cp.checkbox_Draft().click();
        } else if (arg1.equals("Active")) {
            cp.checkbox_active().click();
        } else if (arg1.equals("Closed")) {
            cp.checkbox_closed().click();
        } else if (arg1.equals("Fully funded")) {
            cp.checkbox_fullyFunded().click();
        } else if (arg1.equals("Part funded")) {
            cp.checkbox_partFunded().click();
        } else if (arg1.equals("Not funded")) {
            cp.checkbox_notFunded().click();
        }

        if (arg0.equals("Chile")) {
            cp.checkbox_Chile().click();
        } else if (arg0.equals("Costa Rica")) {
            cp.checkbox_CostaRica().click();
        } else if (arg0.equals("Ghana")) {
            cp.checkbox_Ghana().click();
        } else if (arg0.equals("Ivory Coast")) {
            cp.checkbox_IvoryCoast().click();
        } else if (arg0.equals("Kenya")) {
            cp.checkbox_Kenya().click();
        } else if (arg0.equals("Nigeria")) {
            cp.checkbox_Nigeria().click();
        } else if (arg0.equals("Panama")) {
            cp.checkbox_Panama().click();
        } else if (arg0.equals("Philippines")) {
            cp.checkbox_Philippines().click();
        } else if (arg0.equals("Thailand")) {
            cp.checkbox_Thailand().click();
        } else if (arg0.equals("Uganda")) {
            cp.checkbox_Uganda().click();
        } else if (arg0.equals("Vietnam")) {
            cp.checkbox_Vietnam().click();
        }

        cp.txt_toI().sendKeys(arg2);
        cp.txt_fromI().sendKeys(arg3);
        cp.txt_fromF().sendKeys(arg4);
        cp.txt_toF().sendKeys(arg5);


    }


    @And("^Clicks on 'Reset all filter' button$")
    public void clicksOnResetAllFilterButton() throws Throwable {
        cp.btn_resetFilter().click();
        Thread.sleep(2000);
    }

    @Then("^The filter panel will be hidden and the \"([^\"]*)\" won't be cleared$")
    public void theFilterPanelWillBeHiddenAndTheWonTBeCleared(String checkbox) throws Throwable {

        // Check xem panel filter có hiển thị ko?
        boolean expected1 = false;
        boolean actual1 = cp.filter().isDisplayed();
        Assert.assertEquals(expected1, actual1);

        //check xem các check box có được select hay không?
        boolean expected2 = true;

        //cách này chỉ check từng checkbox 1, nếu chọn nhiêu check box 1 lúc thì k check dc

        if (checkbox.equals("Ready to launch")) {
            boolean actual2 = cp.checkbox_ReadyToLaunch().isSelected();
            Assert.assertEquals(expected2, actual2);
        } else if (checkbox.equals("Draft")) {
            boolean actual2 = cp.checkbox_Draft().isSelected();
            Assert.assertEquals(expected2, actual2);
        } else if (checkbox.equals("Active")) {
            boolean actual2 = cp.checkbox_active().isSelected();
            Assert.assertEquals(expected2, actual2);
        } else if (checkbox.equals("Closed")) {
            boolean actual2 = cp.checkbox_closed().isSelected();
            Assert.assertEquals(expected2, actual2);
        } else if (checkbox.equals("Fully funded")) {
            boolean actual2 = cp.checkbox_fullyFunded().isSelected();
            Assert.assertEquals(expected2, actual2);
        } else if (checkbox.equals("Part funded")) {
            boolean actual2 = cp.checkbox_partFunded().isSelected();
            Assert.assertEquals(expected2, actual2);
        } else if (checkbox.equals("Not funded")) {
            boolean actual2 = cp.checkbox_notFunded().isSelected();
            Assert.assertEquals(expected2, actual2);
        }

    }
    public void checkValueStatus(String checkbox) throws Throwable{
        System.out.println(cp.btn_lastPage().getText()); //check
        int totalPage = Integer.parseInt(cp.btn_lastPage().getText());        // xác định số trang, chuyểnn số trang sang chữ số

        List<WebElement> row_per_page = driver.findElements(By.xpath("//tr[@class='MuiTableRow-root css-1gqug66']"));
        //Tạo list chứa các đối tượng WebElement <tr>
        if (totalPage == 1) {

            for (int i = 1; i <= row_per_page.size(); i++) {
                WebElement statusCheck = driver.findElement(By.xpath("//tbody/tr[" + i + "]/th[1]")); //chạy từng dòng để check cột status
                actual = statusCheck.getText();
                expected = checkbox;
                Assert.assertEquals(expected, actual);
            }
        } else {

            // số trang trước trang cuối

            for (int j = 1; j < totalPage; j++) {
                for (int i = 1; i <= 30; i++) {
                    WebElement statusCheck = driver.findElement(By.xpath("//tbody/tr[" + i + "]/th[1]"));
                    actual = statusCheck.getText();
                    System.out.println(actual);
                    expected = checkbox;
                    Assert.assertEquals(expected, actual);
                }
                if(j==totalPage) return ; //khi return thif sẽ k chạy các dòng phía sau return nữa
                cp.btn_nextPage().click();
            }
        }
    }
    @Then("^The list of campaigns will be filtered and just displays the campaigns which on \"([^\"]*)\" status$")
    public void theListOfCampaignsWillBeFilteredAndJustDisplaysTheCampaignsWhichOnStatus(String checkbox) throws Throwable {
        checkValueStatus(checkbox);
    }
//finance error

    @Then("^The error message will be displayed at Finance as user should enters number only$")
    public void theErrorMessageWillBeDisplayedAtFinanceAsUserShouldEntersNumberOnly() {
    }

    @Then("^The error message will be displayed at Finance as user can enter positive number only$")
    public void theErrorMessageWillBeDisplayedAtFinanceAsUserShouldEntersPositiveNumberOnly() {
        actual = cp.error_finance().getText().toString();
        expected = "chưa có message";
        Assert.assertEquals(expected, actual);
    }

    @Then("^The error message will be displayed as the value of 'To' can't be smaller than 'From' field$")
    public void theErrorMessageWillBeDisplayedAsTheValueOfToCanTBeSmallerThanFromField() {
        actual = cp.error_finance().getText().toString();
        expected = "chưa có message";
        Assert.assertEquals(expected, actual);
    }

    @Then("^The error message will be displayed as user can enter positive number only$")
    public void theErrorMessageWillBeDisplayedAsUserCanEnterPositiveNumberOnly() {
        actual = cp.error_finance().getText().toString();
        expected = "chưa có message";
        Assert.assertEquals(expected, actual);
    }


    public void checkValueFinance(int fromF, int toF) throws Throwable {
        int totalPage = Integer.parseInt(cp.btn_lastPage().getText());        // xác định số trang, chuyểnn số trang sang chữ số

        List<WebElement> row_per_page = driver.findElements(By.xpath("//tr[@class='MuiTableRow-root css-1gqug66']"));

        if (totalPage == 1) {
            //Tạo list chứa các đối tượng WebElement <tr>
            Thread.sleep(1000);

            for (int i = 1; i <= row_per_page.size(); i++) {
                WebElement financeCheck = driver.findElement(By.xpath("//tbody/tr[" + i + "]/th[4]"));
                boolean expected1 = true;
                boolean actual1;
                String finance1 = "";

                String[] listFinance = financeCheck.getText().split("€")[0].split(",");
                for (int j = 0; j < listFinance.length; j++) { //dùng vòng for cộng các phần tử lại đểdđược chuỗi finance
                    finance1 += listFinance[i];
                }
                System.out.println(finance1); //check
                int finance = Integer.parseInt(finance1); //đổi string sang int
                if (finance <= fromF && finance >= toF) { //check đk
                    actual1 = true;
                } else {
                    actual1 = false;
                }
                Assert.assertEquals(expected1, actual1);
            }
        } else {
            // số trang trước trang cuối
            for (int m = 1; m < totalPage; m++) {
                for (int i = 1; i <= row_per_page.size(); i++) {
                    WebElement financeCheck = driver.findElement(By.xpath("//tbody/tr[" + i + "]/th[4]"));
                    boolean expected1 = true;
                    boolean actual1;
                    String finance1 = "";
                    String[] listFinance = financeCheck.getText().split("€")[0].split(",");
                    for (int j = 0; j < listFinance.length; j++) {
                        finance1 += listFinance[i];
                    }
                    System.out.println(finance1); //check
                    int finance = Integer.parseInt(finance1);
                    if (finance <= fromF && finance >= toF) {
                        actual1 = true;
                    } else {
                        actual1 = false;
                    }
                    Assert.assertEquals(expected1, actual1);
                }
                if (m == totalPage) return; //khi return thif sẽ k chạy các dòng phía sau return nữa
                cp.btn_nextPage().click();
            }
            Thread.sleep(1000);
        }


    }

    @Then("^The list of campaigns will be filtered and just displays the campaigns which contain the finance volume in the range \"([^\"]*)\" to \"([^\"]*)\" of the filter$")
    public void theListOfCampaignsWillBeFilteredAndJustDisplaysTheCampaignsWhichContainTheFinanceVolumeInTheRangeToOfTheFilter(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        checkValueFinance(Integer.parseInt(arg0),Integer.parseInt(arg1));
    }


//investment error

    @Then("^At Investment field the error message will be displayed as user should enters number only$")
    public void atInvestmentFieldTheErrorMessageWillBeDisplayedAsUserShouldEntersNumberOnly() {
        actual = cp.error_investment().getText().toString();
        expected = "";
        Assert.assertEquals(expected, actual);
    }

    @Then("^The error message will be displayed at Investment as the value of 'To' can't be smaller than 'From' field$")
    public void theErrorMessageWillBeDisplayedAtInvestmentAsTheValueOfToCanTBeSmallerThanFromField() {
        actual = cp.error_investment().getText().toString();
        expected = "";
        Assert.assertEquals(expected, actual);
    }

    @Then("^The error message will be displayed at Investment as user can enter positive number only$")
    public void theErrorMessageWillBeDisplayedAtInvestmentAsUserCanEnterPositiveNumberOnly() {
        actual = cp.error_investment().getText().toString();
        expected = "";
        Assert.assertEquals(expected, actual);
    }


    @Then("^All previously selected filters \"([^\"]*)\" are removed and the Campaigns list return to its original stat instantly and the filter panel is Closed$")
    public void allPreviouslySelectedFiltersAreRemovedAndTheCampaignsListReturnToItsOriginalStatInstantlyAndTheFilterPanelIsClosed(String checkbox) {
        //check filter bị clear
        for (int j = 1; j <= 18; j++) {    //18 vì co 18 checkbox cần check =)))
            WebElement lbl_check = driver.findElement(By.xpath("//*[@id=\"Status\"]/div/div[" + j + "]/div[1]/p")); //tại list các label
            if (checkbox.equals(lbl_check)) { //check cac label nếu đúng với giá trị mình truyền vào thì check xem check box đó có selected k
                for (int i = 1; i <= 18; i++) {
                    WebElement checkboxCheck = driver.findElement(By.xpath("//*[@id=\"Status\"]/div/div[" + i + "]/div[2]/div/span/input")); //tạo list các checkbox
                    boolean actual = checkboxCheck.isSelected(); //ktra xem các checkbox đó cos selected k
                    boolean expected = false;
                    Assert.assertEquals(expected, actual);
                }

            } else break;
        }

        //check Campaigns list return to its original stat instantly
        //k biết làm

        // Check the filter panel is Closed
        boolean actual = cp.filter().isDisplayed();
        boolean expected = false;
        Assert.assertEquals(expected, actual);

    }


    @Then("^The Filter button displays a counter of the number of filters applied$")
    public void theFilterButtonDisplaysACounterOfTheNumberOfFiltersApplied() throws Throwable {
        String a = cp.btn_filter().getText().toString(); //Filter (4)

        //check xem các textbox có được truyền value gì k? nếu value null thì o, có thì 1
        int count_FromFinance = cp.txt_fromF().getAttribute("value").equals("") ? 0 : 1;
        int count_ToFinance = cp.txt_toF().getAttribute("value").equals("") ? 0 : 1;
        int count_FromInvestment = cp.txt_fromI().getAttribute("value").equals("") ? 0 : 1;
        int count_ToInvestment = cp.txt_toI().getAttribute("value").equals("") ? 0 : 1;
        actual = cp.checkBox_checked().size() + count_FromFinance + count_ToFinance + count_FromInvestment + count_ToInvestment + ""; //cộng các biến lại

        cp.btn_X().click();
        Thread.sleep(2000);
        String counter = cp.btn_filter().getText().toString(); //Filter (4)

        int startIndex = counter.indexOf("(");
        int endIndex = counter.indexOf(")");
        if (startIndex != -1 && endIndex != -1) {
            String numberStr = counter.substring(startIndex + 1, endIndex);
            int numberOfFilterApplied = Integer.parseInt(numberStr);
            expected = numberOfFilterApplied + "";
            Assert.assertEquals(expected, actual);


        }
    }

    public void checkValueInvestment(int fromI, int toI) throws Throwable {
        int totalPage = Integer.parseInt(cp.btn_lastPage().getText());        // xác định số trang, chuyểnn số trang sang chữ số

        List<WebElement> row_per_page = driver.findElements(By.xpath("//tr[@class='MuiTableRow-root css-1gqug66']"));
        if (totalPage == 1) {
            //Tạo list chứa các đối tượng WebElement <tr>
            Thread.sleep(1000);

            for (int i = 1; i <= row_per_page.size(); i++) {
                WebElement investmentCheck = driver.findElement(By.xpath("//tbody/tr[" + i + "]/th[3]"));
                boolean expected1 = true;
                boolean actual1;
                String investment1 = "";

                String[] listValueInvestment = investmentCheck.getText().split("€")[0].split(",");
                for (int j = 0; j < listValueInvestment.length; j++) { //dùng vòng for cộng các phần tử lại đểdđược chuỗi finance
                    investment1 += listValueInvestment[i];
                }
                System.out.println(investment1); //check
                int investment = Integer.parseInt(investment1); //đổi string sang int
                if (investment <= fromI && investment >= toI) { //check đk
                    actual1 = true;
                } else {
                    actual1 = false;
                }
                Assert.assertEquals(expected1, actual1);
            }
        } else {
            // số trang trước trang cuối
            for (int m = 1; m < totalPage; m++) {
                for (int i = 1; i <= row_per_page.size(); i++) {
                    WebElement investmentCheck = driver.findElement(By.xpath("//tbody/tr[" + i + "]/th[3]"));
                    boolean expected1 = true;
                    boolean actual1;
                    String investment1 = "";
                    String[] listFinance = investmentCheck.getText().split("€")[0].split(",");
                    for (int j = 0; j < listFinance.length; j++) {
                        investment1 += listFinance[i];
                    }
                    System.out.println(investment1); //check
                    int finance = Integer.parseInt(investment1);
                    if (finance <= fromI && finance >= toI) {
                        actual1 = true;
                    } else {
                        actual1 = false;
                    }
                    Assert.assertEquals(expected1, actual1);
                }
                if (m == totalPage) return; //khi return thif sẽ k chạy các dòng phía sau return nữa
                cp.btn_nextPage().click();
            }
            Thread.sleep(1000);
        }
    }




    @Then("^The list of campaigns will be filtered and just displays the campaigns which mapping with the filter condition \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void theListOfCampaignsWillBeFilteredAndJustDisplaysTheCampaignsWhichMappingWithTheFilterCondition(String country, String Status, String InvestmentTo, String InvestmentFrom, String FinanceFrom, String FinanceTo) throws Throwable {
        //Country: Không biết verify country, vì hiển thị kết quả là icon lá cờ
        checkValueInvestment(Integer.parseInt(InvestmentTo),Integer.parseInt(InvestmentFrom));
        checkValueFinance(Integer.parseInt(FinanceFrom),Integer.parseInt(FinanceTo));
        checkValueStatus(Status);
    }


    @Then("^The list of campaigns will be filtered and just displays the campaigns which contain the Investment in the range \"([^\"]*)\" to \"([^\"]*)\"  of the filter$")
    public void theListOfCampaignsWillBeFilteredAndJustDisplaysTheCampaignsWhichContainTheInvestmentInTheRangeToOfTheFilter(String arg0, String arg1) throws Throwable {
        checkValueInvestment(Integer.parseInt(arg0),Integer.parseInt(arg1));
        throw new PendingException();
    }
//search
    @And("^Check the initialized data of the search textbox$")
    public void checkTheInitializedDataOfTheSearchTextbox() {
        actual= cp.txt_search().getAttribute("value");
        expected="";
        Assert.assertEquals(expected,actual);
    }

    @Then("^The text box is displayed as blank and the placeholder should be \"([^\"]*)\"$")
    public void theTextBoxIsDisplayedAsBlankAndThePlaceholderShouldBe(String arg0)   {
         actual= cp.txt_search().getAttribute("placeholder");
         expected="Search by name";
         Assert.assertEquals(expected,actual);
    }

    @And("^Enters the \"([^\"]*)\" of campaign into the 'Search by name' field$")
    public void entersTheOfCampaignIntoTheSearchByNameField(String arg0) throws Throwable {
        cp.txt_search().sendKeys(arg0);
        cp.txt_search().sendKeys(Keys.ENTER);
        Thread.sleep(1000);
    }
    public void checkValueName(String name) throws Throwable {
        int totalPage = Integer.parseInt(cp.btn_lastPage().getText());        // xác định số trang, chuyểnn số trang sang chữ số

        List<WebElement> row_per_page = driver.findElements(By.xpath("//tr[@class='MuiTableRow-root css-1gqug66']"));
        if (totalPage == 1) {
            //Tạo list chứa các đối tượng WebElement <tr>
            Thread.sleep(1000);

            for (int row = 1; row <= row_per_page.size(); row++) {
                WebElement nameCheck = driver.findElement(By.xpath("//tbody/tr["+row+"]/th[2]/a[1]"));
                boolean actual=nameCheck.getText().contains(name);
                boolean expected = true;
                Assert.assertEquals(expected, actual);
            }
        } else {

            for (int m = 1; m < totalPage; m++) {
                for (int row = 1; row <= row_per_page.size(); row++) {
                    WebElement nameCheck = driver.findElement(By.xpath("//tbody/tr["+row+"]/th[2]/a[1]"));
                    boolean actual=nameCheck.getText().contains(name);
                    boolean expected = true;
                    Assert.assertEquals(expected, actual);
                    }

                if (m == totalPage) return;
                cp.btn_nextPage().click();
            }
            Thread.sleep(1000);
        }
    }
    @Then("^The campaigns list will be filtered and shows the campaign which named contains the \"([^\"]*)\" characters Query %LIKE%$")
    public void theCampaignsListWillBeFilteredAndShowsTheCampaignWhichNamedContainsTheCharactersQueryLIKE(String name) throws Throwable {
        checkValueName(name);
        Thread.sleep(1000);
    }

    @And("^Click X button at the text box$")
    public void clickXButtonAtTheTextbox() throws Throwable {
        cp.btn_X_atSearchTextbox().click();
        Thread.sleep(1000);
    }
}











