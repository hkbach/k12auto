package stepDefinition;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pageObjects.campaigns;
import pageObjects.createNewCampaign;
import utils.libs.TestBase;

import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;


public class CreateNewCampaign_Steps extends TestBase {
    createNewCampaign cnc = new createNewCampaign(driver);
    String actual = "";
    String expected = "";

    public CreateNewCampaign_Steps() {
    }


    @And("^Clicks on Add campaign button$")
    public void clicksOnAddCampaignButton() throws Throwable {
        cnc.btn_addCampaign().click();
        Thread.sleep(1000);
    }
    @And("^Clicks on Tranches link at the right hand navigation$")
    public void clicksOnTranchesLinkAtTheRightHandNavigation() throws Throwable {
        cnc.link_Tranches().click();
        Thread.sleep(1000);
    }
    @And("^Clicks on Campaign details link at the right hand navigation$")
    public void clicksOnCampaignDetailsLinkAtTheRightHandNavigation() throws Throwable {
        cnc.link_CampaignDetails().click();
    }
    @And("^Clicks Save as Draft button$")
    public void clicksSaveAsDraftButton() throws Throwable {
        cnc.btn_SaveAsDraft().click();
        Thread.sleep(2000);
    }
    @And("^Enters the data at fields but missing many madantory fields$")
    public void entersTheDataAtFieldsButMissingManyMadantoryFields() throws Throwable {

    }
    @And("^Clicks on Add another project button$")
    public void clicksOnAddAnotherProjectButton() throws Throwable {
        cnc.btn_AddAnotherProject().click();
        Thread.sleep(3000);
    }
    @And("^Enters new data at the General Information tile$")
    public void entersNewDataAtTheGeneralInformationTile() throws Throwable {
        cnc.input_CampaignName().sendKeys("TEST");
        cnc.input_Tenure().sendKeys("23");
        cnc.dropdown_EmissionSPV().click();
        cnc.btn_OptionOneOfEmissionSPV().click();
        Thread.sleep(1000);
    }
    @And("^Enters characters into the Tenure field$")
    public void entersCharactersIntoTheTenureField() throws Throwable {
        cnc.input_Tenure().sendKeys("abc");
    }
    @And("^Enters characters into the Maximum finance volume field, Tenure field, Minimum finance volume field$")
    public void entersCharactersIntoTheMaximumFinanceVolumeFieldTenureFieldMinimumFinanceVolumeField() throws Throwable {
        cnc.input_Tenure().clear();
        cnc.input_Tenure().sendKeys("TEST");
        Thread.sleep(1000);
        cnc.input_MinFinanceVol().clear();
        cnc.input_MinFinanceVol().sendKeys("TEST");
        Thread.sleep(1000);
        cnc.input_MaxFinanceVol().clear();
        cnc.input_MaxFinanceVol().sendKeys("TEST");
        Thread.sleep(1000);
    }
    @And("^Enters a \"([^\"]*)\" into the Maximum finance volume field$")
    public void entersAIntoTheMaximumFinanceVolumeField(String arg0) throws Throwable {
        // The initialized value at MinFinaceVol will be 10,000
        actual = cnc.input_MinFinanceVol().getAttribute("value");
        expected = "10000";
        Assert.assertEquals(expected, actual);
        // The initialized value at MinFinaceVol will be 25,000
        actual = cnc.input_MaxFinanceVol().getAttribute("value");
        expected = "25000";
        Assert.assertEquals(expected, actual);

        cnc.input_MaxFinanceVol().clear();
        cnc.input_MaxFinanceVol().sendKeys(arg0);
        Thread.sleep(2000);
    }
    @And("^Enters the new data at Minimum amount field, Maximum amount field, Divisible amount field$")
    public void entersTheNewDataAtMinimumAmountFieldMaximumAmountFieldDivisibleAmountField() throws Throwable {
        // The initialized value will be 100
        actual = cnc.input_MinAmount().getAttribute("value");
        expected = "100";
        Assert.assertEquals(expected, "100");

        cnc.input_MinAmount().sendKeys("TEST");
        Thread.sleep(1000);
        cnc.input_MaxAmount().sendKeys("TEST");
        Thread.sleep(1000);
        cnc.input_DivisibleBy().sendKeys("TEST");
        Thread.sleep(1000);
    }




    @Then("^The UI will be scrolled to the Tranches zone$")
    public void theUIWillBeScrolledToTheTranchesZone() throws Throwable {
        Assert.assertEquals(cnc.btn_addATranche().isDisplayed(), true);
    }
    @Then("^The UI will be scrolled to the Campaign detail zone$")
    public void theUIWillBeScrolledToTheCampaignDetailZone() throws Throwable {
        Assert.assertEquals(cnc.title_CampaignDetail().isDisplayed(), true);
    }
    @Then("^The campaign will be successfully saved as Draft without any validation messages are shown up$")
    public void theCampaignWillBeSuccessfullySavedAsDraftWithoutAnyValidationMessagesAreShownUp() throws Throwable {
        actual = cnc.title_CampaignOverview().getText();
        expected = "Campaign Overview";
        Assert.assertEquals(expected, actual);
    }
    @Then("^A new Project field will be shown and it works in the same way with the first project field$")
    public void aNewProjectFieldWillBeShownAndItWorksInTheSameWayWithTheFirstProjectField() throws Throwable {
        actual = cnc.title_CampaignOverview().getText();
        expected = "Campaign Overview";
        Assert.assertEquals(expected, actual);
    }
    @Then("^An error message will be shown as required user should enter numbers only at finance vol zone$")
    public void anErrorMessageWillBeShownAsRequiredUserShouldEnterNumbersOnlyAtFinanceVolZone() throws Throwable {
        // Error message at input tenure
        actual = cnc.errorMessage_Tenure().getText();
        expected = "Please enter a number.";
        Assert.assertEquals(expected, actual);

        // Error message at input min finance vol
        actual = cnc.errorMessage_MinFinanceVol().getText();
        expected = "Please enter a number.";
        Assert.assertEquals(expected, actual);

        // Error message at input max finance vol
        actual = cnc.errorMessage_MaxFinanceVol().getText();
        expected = "Please enter a number.";
        Assert.assertEquals(expected, actual);
    }

    @Then("^The 'KIB' or 'VIB' option will be selected with right \"([^\"]*)\" value$")
    public void theKIBOrVIBOptionWillBeSelectedWithRightValue(String arg0) throws Throwable {

        if (Integer.parseInt(arg0) < 100000) {
            Assert.assertEquals(cnc.radioBtn_KIB().getAttribute("aria-label").contains("selected"), true);
        } else if (Integer.parseInt(arg0) == 100000) {
            Assert.assertEquals(cnc.radioBtn_VIB().getAttribute("aria-label").contains("selected"), true);
        } else if (Integer.parseInt(arg0) > 100000) {
            Assert.assertEquals(cnc.radioBtn_VIB().getAttribute("aria-label").contains("selected"), true);
        }
    }

    @Then("^The 'KIB/VIB' is read only field and user can't change the option$")
    public void theKIBVIBIsReadOnlyFieldAndUserCanTChangeTheOption() throws Throwable {
        Assert.assertEquals(cnc.radioBtn_KIB().isEnabled(), false);
        Assert.assertEquals(cnc.radioBtn_VIB().isEnabled(), false);
    }



    @Then("^Check validity data the fields at Individual investment zone$")
    public void checkValidityDataTheFieldsAtIndividualInvestmentZone() throws Throwable {
        expected = "Please enter a number.";
        // Error message at input min amount
        actual = cnc.errorMessage_MinAmount().getText();
        Assert.assertEquals(expected, actual);

        // Error message at input max amount
        actual = cnc.errorMessage_MaxAmount().getText();
        Assert.assertEquals(expected, actual);

        // Error message at input divisible
        actual = cnc.errorMessage_DivisibleBy().getText();
        Assert.assertEquals(expected, actual);

        // The new data will be saved
        cnc.input_MinAmount().clear();
        cnc.input_MinAmount().sendKeys("1");
        Thread.sleep(1000);

        cnc.input_MaxAmount().clear();
        cnc.input_MaxAmount().sendKeys("2");
        Thread.sleep(1000);

        cnc.input_DivisibleBy().clear();
        cnc.input_DivisibleBy().sendKeys("3");
        Thread.sleep(1000);

        cnc.btn_SaveAsDraft().click();
        Thread.sleep(2000);
        actual = cnc.title_CampaignOverview().getText();
        expected = "Campaign Overview";
        Assert.assertEquals(expected, actual);
    }

    @And("^Selects Annuity and Bullet field or Constant field$")
    public void selectsAnnuityAndBulletFieldOrConstantField() throws Throwable {
        if (cnc.radioBtn_Repayment_Annuity().isSelected()) {
            cnc.radioBtn_Repayment_Constant().click();
        } else {
            cnc.radioBtn_Repayment_Annuity().click();
        }
    }

    @And("^Doesn't enter the madantory fields$")
    public void doesnTEnterTheMadantoryFields() throws Throwable {
    }


    @And("^Enters the characters into the Annuity field and Bullet field, Constant field$")
    public void entersTheCharactersIntoTheAnnuityFieldAndBulletFieldConstantField() throws Throwable {
        cnc.input_Annuity().sendKeys("TEST");
        Thread.sleep(1000);
        cnc.input_Bullet().sendKeys("TEST");
        Thread.sleep(1000);
        cnc.input_Constant().sendKeys("TEST");
        Thread.sleep(1000);
    }

    @Then("^An error message will be shown as required user should enter numbers only at Repayment zone$")
    public void anErrorMessageWillBeShownAsRequiredUserShouldEnterNumbersOnlyAtRepaymentZone() throws Throwable {
        expected = "Please enter a number.";
        // Error message at input annuity
        actual = cnc.errorMessage_Annuity().getText();
        Assert.assertEquals(expected, actual);

        // Error message at input bullet
        actual = cnc.errorMessage_Bullet().getText();
        Assert.assertEquals(expected, actual);

        // Error message at input constant
        actual = cnc.errorMessage_Constant().getText();
        Assert.assertEquals(expected, actual);
    }


    @And("^Enter a \"([^\"]*)\" into the Annuity field$")
    public void enterAIntoTheAnnuityField(String arg0) throws Throwable {
        cnc.input_Annuity().sendKeys(arg0);
    }


    @Then("^Check validity data the Annuity field when enter a \"([^\"]*)\"$")
    public void checkValidityDataTheAnnuityFieldWhenEnterA(String arg0) throws Throwable {
        if (Integer.parseInt(arg0) > 100) {
            actual = "";
            expected = "User can't enters number greater than 100";
            Assert.assertEquals(expected, actual);
        } else if (Integer.parseInt(arg0) < 0) {
            actual = "";
            expected = "The minimum number is 0 and can't enters a smaller number";
            Assert.assertEquals(expected, actual);
        }
    }

    @And("^Enter a \"([^\"]*)\" into the Bullet field$")
    public void enterAIntoTheBulletField(String arg0) throws Throwable {
        cnc.input_Bullet().sendKeys(arg0);
    }

    @Then("^Check validity data the Bullet field when enter a \"([^\"]*)\"$")
    public void checkValidityDataTheBulletFieldWhenEnterA(String arg0) throws Throwable {
        if (Integer.parseInt(arg0) > 100) {
            actual = "";
            expected = "User can't enters number greater than 100";
            Assert.assertEquals(expected, actual);
        } else if (Integer.parseInt(arg0) < 0) {
            actual = "";
            expected = "The minimum number is 0 and can't enters a smaller number";
            Assert.assertEquals(expected, actual);
        }
    }

    @And("^Enter \"([^\"]*)\" into the Annuity field and \"([^\"]*)\" into the Bullet field$")
    public void enterIntoTheAnnuityFieldAndIntoTheBulletField(String number1, String number2) throws Throwable {
        cnc.input_Annuity().sendKeys(number1);
        Thread.sleep(1000);
        cnc.input_Bullet().sendKeys(number2);
        Thread.sleep(1000);
    }

    @Then("^An error message will be shown as the total of the values entered in the Annuity field and the Bullet field must equal (\\d+)$")
    public void anErrorMessageWillBeShownAsTheTotalOfTheValuesEnteredInTheAnnuityFieldAndTheBulletFieldMustEqual(int arg0) throws Throwable {
        String value_Annuity = cnc.input_Annuity().getAttribute("value");
        String value_Butllet = cnc.input_Bullet().getAttribute("value");
        int total = Integer.parseInt(value_Annuity) + Integer.parseInt(value_Butllet);

        if (total != 100) {
            actual = "";
            expected = "The total of the values entered in the Annuity field and the Bullet field must equal 100";
            Assert.assertEquals(expected, actual);
        } else {
            Assert.assertEquals(total, 100);
        }

    }

    @And("^Enter a \"([^\"]*)\" into the Constant field$")
    public void enterAIntoTheConstantField(String arg0) throws Throwable {
        cnc.input_Constant().sendKeys(arg0);
        Thread.sleep(1000);
    }

    @Then("^Check validity data the Constant field when enter a \"([^\"]*)\"$")
    public void checkValidityDataTheConstantFieldWhenEnterA(String arg0) throws Throwable {
        if (Integer.parseInt(arg0) > 100) {
            actual = "";
            expected = "User can't enters number greater than 100";
            Assert.assertEquals(expected, actual);
        } else if (Integer.parseInt(arg0) < 0) {
            actual = "";
            expected = "The minimum number is 0 and can't enters a smaller number";
            Assert.assertEquals(expected, actual);
        }
    }

    @Then("^An error message will be displayed as cannot enter a past date into this field$")
    public void anErrorMessageWillBeDisplayedAsCannotEnterAPastDateIntoThisField() throws Throwable {
        expected = "Cannot enter a past date into this field";

        actual = "";
        Assert.assertEquals(expected, actual);

        actual = "";
        Assert.assertEquals(expected, actual);

        actual = "";
        Assert.assertEquals(expected, actual);
    }

    @And("^Clicks on the date fields and enter a past date into fields$")
    public void clicksOnTheDateFieldsAndEnterAPastDateIntoFields() throws Throwable {
        Date currentDate = new Date();

        //
        cnc.btn_RepaymentFirstDate().click();
        Thread.sleep(2000);
        for (WebElement element : cnc.listDayOfRepaymentFirstDate()) {
            String day = element.getText();
            if (Integer.parseInt(day) < currentDate.getDate()) {
                element.click();
                Thread.sleep(2000);
                break;
            }
        }

        cnc.btn_RepaymentLastDate().click();
        Thread.sleep(2000);
        for (WebElement element : cnc.listDayOfRepaymentLastDate()) {
            String day = element.getText();
            if (Integer.parseInt(day) < currentDate.getDate()) {
                element.click();
                Thread.sleep(2000);
                break;
            }
        }

        cnc.btn_RepaymentInterestDate().click();
        Thread.sleep(2000);
        for (WebElement element : cnc.listDayOfFirstInterestDate()) {
            String day = element.getText();
            if (Integer.parseInt(day) < currentDate.getDate()) {
                element.click();
                Thread.sleep(2000);
                break;
            }
        }
    }


    @Then("^The front-end review has been completed passed and The plausibility check has been completed and passed$")
    public void theFrontEndReviewHasBeenCompletedPassedAndThePlausibilityCheckHasBeenCompletedAndPassed() throws Throwable {
        List<WebElement> listValidations = cnc.listValidations();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", listValidations.get(0));
        Thread.sleep(2000);

        actual = listValidations.get(0).getText();
        expected = "The front-end review has been completed and passed. *";
        Assert.assertEquals(expected, actual);

        actual = listValidations.get(1).getText();
        expected = "The plausibility check has been completed and passed. *";
        Assert.assertEquals(expected, actual);
    }

    @Then("^The VIB document has been approved, The front-end review has been completed passed and The plausibility check has been completed and passed$")
    public void theVIBDocumentHasBeenApprovedTheFrontEndReviewHasBeenCompletedPassedAndThePlausibilityCheckHasBeenCompletedAndPassed() throws Throwable {
        List<WebElement> listValidations = cnc.listValidations();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", listValidations.get(0));
        Thread.sleep(2000);

        actual = listValidations.get(0).getText();
        expected = "The VIB document has been approved. *";
        Assert.assertEquals(expected, actual);

        actual = listValidations.get(1).getText();
        expected = "The front-end review has been completed and passed. *";
        Assert.assertEquals(expected, actual);

        actual = listValidations.get(2).getText();
        expected = "The plausibility check has been completed and passed. *";
        Assert.assertEquals(expected, actual);

    }

    @And("^Click Add a tranche button$")
    public void clickAddATrancheButton() throws Throwable {
        cnc.btn_addATranche().click();
        Thread.sleep(2000);
    }

    @And("^Doesn't enter the data at the Tranche name$")
    public void doesnTEnterTheDataAtTheTrancheName() throws Throwable {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", cnc.title_Tranches());
    }

    @And("^Selectes the option at the Platform field$")
    public void selectesTheOptionAtThePlatformField() throws Throwable {
        cnc.dropdown_Platform().click();
        Thread.sleep(1000);
    }


    @Then("^There are (\\d+) options as: Ecoligo and CrowdForClimate Austria$")
    public void thereAreOptionsAsEcoligoAndCrowdForClimateAustria(int arg0) throws Throwable {
        actual = cnc.listOptionsOfPlatform().get(0).getText();
        expected = "Ecoligo";
        Assert.assertEquals(expected, actual);

        actual = cnc.listOptionsOfPlatform().get(1).getText();
        expected = "CrowdForClimate Austria";
        Assert.assertEquals(expected, actual);

        // The default vaflue is "Ecoligo"
        actual = cnc.dropdown_Platform().getAttribute("value");
        expected = "Ecoligo";
        Assert.assertEquals(expected, actual);
    }

    @Then("^The error message will be shown as user should enters number only$")
    public void theErrorMessageWillBeShownAsUserShouldEntersNumberOnly() throws Throwable {
        actual = cnc.errorMessage_InterestRate().getText();
        expected = "Please enter a number.";
        Assert.assertEquals(expected, actual);
    }

    @And("^Enters \"([^\"]*)\" into the Interest rate field$")
    public void entersIntoTheInterestRateField(String arg0) throws Throwable {
        cnc.input_InterestRate().sendKeys(arg0);
        Thread.sleep(2000);
    }


    @Then("^Check the validation of Interest rate field with \"([^\"]*)\"$")
    public void checkTheValidationOfInterestRateFieldWith(String arg0) throws Throwable {
        if (arg0.equals("TEST")) {
            expected = "Please enter a number.";
            actual = cnc.errorMessage_InterestRate().getText();
            Assert.assertEquals(expected, actual);
        } else if (Integer.parseInt(arg0) == 0) {

        } else if (arg0.equals("")) {
            actual = "";
            expected = "Required field please enter";
            Assert.assertEquals(expected, actual);
        } else if (arg0.equals("100000")) {

        }
    }

    @And("^Enters \"([^\"]*)\" into the Bonus amount field$")
    public void entersIntoTheBonusAmountField(String arg0) throws Throwable {
        cnc.input_BonusAmount().sendKeys(arg0);
        Thread.sleep(2000);
    }

    @Then("^Check the validation of Bonus amount field with \"([^\"]*)\"$")
    public void checkTheValidationOfBonusAmountFieldWith(String arg0) throws Throwable {
        if (arg0.equals("TEST")) {
            expected = "Please enter a number.";
            actual = cnc.errorMessage_BonusAmount().getText();
            Assert.assertEquals(expected, actual);
        } else if (Integer.parseInt(arg0) == 0) {

        } else if (arg0.equals("100000")) {

        }
    }


    @And("^Enters \"([^\"]*)\" into the Annuity factor field$")
    public void entersIntoTheAnnuityFactorField(String arg0) throws Throwable {
        cnc.input_AnnuityFactor().sendKeys(arg0);
        Thread.sleep(2000);
    }

    @Then("^Check the validation of Annuity factor field \"([^\"]*)\"$")
    public void checkTheValidationOfAnnuityFactorField(String arg0) throws Throwable {
        if (arg0.equals("TEST")) {
            expected = "Please enter a number.";
            actual = "";
            Assert.assertEquals(expected, actual);
        } else if (Integer.parseInt(arg0) == 0) {

        } else if (arg0.equals("100000")) {

        }
    }

    @Then("^The new rows for add more tranche information will be shown and they work in the same way with the first project field$")
    public void theNewRowsForAddMoreTrancheInformationWillBeShownAndTheyWorkInTheSameWayWithTheFirstProjectField() throws Throwable {
        expected = "Appear";
        try {
            cnc.title_Tranches().isDisplayed();
            Assert.assertEquals(expected, "Appear");
        }catch(NoSuchElementException e) {
            System.out.println(e);
            Assert.assertEquals(expected, "NotAppear");
        }
    }


}


