package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class createNewCampaign {
    public static WebDriver driver;
    private static WebElement element;

    private static List<WebElement> elementList;
    public createNewCampaign (WebDriver driver) {this.driver = driver;}



    // Buttons
    public static WebElement btn_addCampaign() {
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/main/div/div[1]/div[2]/button[3]"));
        return element;
    }

    public static WebElement btn_addATranche() {
        element = driver.findElement(By.xpath("//*[@id=\"Tranches\"]/div/div/button"));
        return element;
    }

    public static WebElement btn_SaveAsDraft() {
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/main/form/div/div[1]/div/div[2]/button[2]"));
        return element;
    }

    public static WebElement btn_AddAnotherProject() {
        element = driver.findElement(By.xpath("//*[@id=\"Campaigndetails\"]/div/div[3]/div/div[2]/button"));
        return element;
    }

    public static WebElement btn_closeCampaignDetails() {
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/main/form/div/div[1]/div/div[2]/button[1]"));
        return element;
    }



    // Link at right hand navigation
    public static WebElement link_Tranches() {
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/main/form/div/div[2]/div/div[2]/ul/div[2]/li/div/div/span"));
        return element;
    }

    public static WebElement link_CampaignDetails() {
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/main/form/div/div[2]/div/div[2]/ul/div[1]/li/div/div/span"));
        return element;
    }

    // Title page
    public static WebElement title_Campaigns() {
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/main/div/div[1]/div[1]/span"));
        return element;
    }
    public static WebElement title_CampaignDetail() {
        element = driver.findElement(By.xpath("//*[@id=\"Campaigndetails\"]/div/h6"));
        return element;
    }
    public static WebElement title_CampaignOverview() {
        element = driver.findElement(By.xpath("//*[@id=\"Campaignoverview\"]/h6"));
        return element;
    }

    public static WebElement title_Tranches() {
        element = driver.findElement(By.xpath("//*[@id=\"Tranches\"]/div/p"));
        return element;
    }

    // Inputs
    public static WebElement input_CampaignName() {
        element = driver.findElement(By.xpath("//*[@id=\"Campaigndetails\"]/div/div[2]/div/div[1]/div[1]/fieldset/input"));
        return element;
    }

    public static WebElement input_Tenure() {
        element = driver.findElement(By.xpath("//*[@id=\"Campaigndetails\"]/div/div[2]/div/div[2]/div[1]/fieldset/input"));
        return element;
    }

    public static WebElement input_MinFinanceVol() {
        element = driver.findElement(By.xpath("//*[@id=\"Campaigndetails\"]/div/div[4]/div/div[1]/div[1]/fieldset/input"));
        return element;
    }

    public static WebElement input_MaxFinanceVol() {
        element = driver.findElement(By.xpath("//*[@id=\"Campaigndetails\"]/div/div[4]/div/div[1]/div[2]/fieldset/input"));
        return element;
    }

    public static WebElement input_MinAmount() {
        element = driver.findElement(By.xpath("//*[@id=\"Campaigndetails\"]/div/div[5]/div/div[1]/fieldset/input"));
        return element;
    }

    public static WebElement input_MaxAmount() {
        element = driver.findElement(By.xpath("//*[@id=\"Campaigndetails\"]/div/div[5]/div/div[2]/fieldset/input"));
        return element;
    }
    public static WebElement input_DivisibleBy() {
        element = driver.findElement(By.xpath("//*[@id=\"Campaigndetails\"]/div/div[5]/div/div[3]/fieldset/input"));
        return element;
    }

    public static WebElement input_Annuity() {
        element = driver.findElement(By.xpath("//*[@id=\"Campaigndetails\"]/div/div[6]/div/div[1]/div[2]/fieldset/input"));
        return element;
    }

    public static WebElement input_Bullet() {
        element = driver.findElement(By.xpath("//*[@id=\"Campaigndetails\"]/div/div[6]/div/div[1]/div[3]/fieldset/input"));
        return element;
    }

    public static WebElement input_Constant() {
        element = driver.findElement(By.xpath("//*[@id=\"Campaigndetails\"]/div/div[6]/div/div[2]/div[2]/fieldset/input"));
        return element;
    }

    public static WebElement input_InterestRate() {
        element = driver.findElement(By.xpath("//*[@id=\"panel1a-header\"]/div/div/div[2]/div/div[1]/fieldset/input"));
        return element;
    }

    public static WebElement input_BonusAmount() {
        element = driver.findElement(By.xpath("//*[@id=\"panel1a-header\"]/div/div/div[2]/div/div[2]/fieldset/input"));
        return element;
    }

    public static WebElement input_AnnuityFactor() {
        element = driver.findElement(By.xpath("//*[@id=\"panel1a-header\"]/div/div/div[2]/div/div[3]/fieldset/input"));
        return element;
    }

    // Dropdown Emission
    public static WebElement dropdown_EmissionSPV() {
        element = driver.findElement(By.xpath("//*[@id=\"Campaigndetails\"]/div/div[2]/div/div[2]/div[2]/div/div/input"));
        return element;
    }
    public static WebElement btn_OptionOneOfEmissionSPV() {
        element = driver.findElement(By.xpath("//*[@id=\"autocomplete-option-0\"]/button"));
        return element;
    }

    public static WebElement btn_OptionTwoOfEmissionSPV() {
        element = driver.findElement(By.xpath("//*[@id=\"autocomplete-option-1\"]/button"));
        return element;
    }

    // Dropdown Platform
    public static WebElement dropdown_Platform() {
        element = driver.findElement(By.xpath("//*[@id=\"panel1a-header\"]/div/div/div[1]/div/div[4]/div/div/input"));
        return element;
    }
    public static List<WebElement> listOptionsOfPlatform() {
        elementList = driver.findElements(By.xpath("//*[@id=\"autocomplete-listbox\"]/li/button"));
        return elementList;
    }


    // Error messages
    public static WebElement errorMessage_Tenure() {
        element = driver.findElement(By.xpath("//*[@id=\"Campaigndetails\"]/div/div[2]/div/div[2]/div[1]/span"));
        return element;
    }

    public static WebElement errorMessage_MinFinanceVol() {
        element = driver.findElement(By.xpath("//*[@id=\"Campaigndetails\"]/div/div[4]/div/div[1]/div[1]/span"));
        return element;
    }

    public static WebElement errorMessage_MaxFinanceVol() {
        element = driver.findElement(By.xpath("//*[@id=\"Campaigndetails\"]/div/div[4]/div/div[1]/div[2]/span"));
        return element;
    }

    public static WebElement errorMessage_MinAmount() {
        element = driver.findElement(By.xpath("//*[@id=\"Campaigndetails\"]/div/div[5]/div/div[1]/span"));
        return element;
    }

    public static WebElement errorMessage_MaxAmount() {
        element = driver.findElement(By.xpath("//*[@id=\"Campaigndetails\"]/div/div[5]/div/div[2]/span"));
        return element;
    }

    public static WebElement errorMessage_DivisibleBy() {
        element = driver.findElement(By.xpath("//*[@id=\"Campaigndetails\"]/div/div[5]/div/div[3]/span"));
        return element;
    }
    public static WebElement errorMessage_Annuity() {
        element = driver.findElement(By.xpath("//*[@id=\"Campaigndetails\"]/div/div[6]/div/div[1]/div[2]/span"));
        return element;
    }

    public static WebElement errorMessage_Bullet() {
        element = driver.findElement(By.xpath("//*[@id=\"Campaigndetails\"]/div/div[6]/div/div[1]/div[3]/span"));
        return element;
    }

    public static WebElement errorMessage_Constant() {
        element = driver.findElement(By.xpath("//*[@id=\"Campaigndetails\"]/div/div[6]/div/div[2]/div[2]/span"));
        return element;
    }

    public static WebElement errorMessage_InterestRate() {
        element = driver.findElement(By.xpath("//*[@id=\"panel1a-header\"]/div/div/div[2]/div/div[1]/span"));
        return element;
    }

    public static WebElement errorMessage_BonusAmount() {
        element = driver.findElement(By.xpath("//*[@id=\"panel1a-header\"]/div/div/div[2]/div/div[2]/span"));
        return element;
    }




    // Radio button
    public static WebElement radioBtn_KIB() {
        element = driver.findElement(By.xpath("//*[@id=\"Campaigndetails\"]/div/div[4]/div/div[2]/div[1]/button"));
        return element;
    }

    public static WebElement radioBtn_VIB() {
        element = driver.findElement(By.xpath("//*[@id=\"Campaigndetails\"]/div/div[4]/div/div[2]/div[2]/button"));
        return element;
    }

    public static WebElement radioBtn_Repayment_Annuity() {
        element = driver.findElement(By.xpath("//*[@id=\"Campaigndetails\"]/div/div[6]/div/div[1]/div[1]/button"));
        return element;
    }

    public static WebElement radioBtn_Repayment_Constant() {
        element = driver.findElement(By.xpath("//*[@id=\"Campaigndetails\"]/div/div[6]/div/div[2]/div[1]/button"));
        return element;
    }

    public static WebElement btn_RepaymentFirstDate() {
        element = driver.findElement(By.xpath("//*[@id=\"Campaigndetails\"]/div/div[7]/div/div[1]/div/div/fieldset/div[2]/button"));
        return element;
    }

    public static WebElement btn_RepaymentLastDate() {
        element = driver.findElement(By.xpath("//*[@id=\"Campaigndetails\"]/div/div[7]/div/div[2]/div/div/fieldset/div[2]/button"));
        return element;
    }

    public static WebElement btn_RepaymentInterestDate() {
        element = driver.findElement(By.xpath("//*[@id=\"Campaigndetails\"]/div/div[7]/div/div[3]/div/div/fieldset/div[2]/button"));
        return element;
    }


    // List day
    public static List<WebElement> listDayOfRepaymentFirstDate() {
        elementList = driver.findElements(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div[2]/div[1]/div/button"));
        return elementList;
    }

    public static List<WebElement> listDayOfRepaymentLastDate() {
        elementList = driver.findElements(By.xpath("//*[@id=\"root\"]/div[4]/div[2]/div[2]/div[1]/div/button"));
        return elementList;
    }

    public static List<WebElement> listDayOfFirstInterestDate() {
        elementList = driver.findElements(By.xpath("//*[@id=\"root\"]/div[5]/div[2]/div[2]/div[1]/div/button"));
        return elementList;
    }

    // Checkbox validations
    public static List<WebElement> listValidations() {
        elementList = driver.findElements(By.xpath("//*[@id=\"Campaigndetails\"]/div/div[9]/div/div/div/p"));
        return elementList;
    }




}
