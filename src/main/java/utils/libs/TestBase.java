package utils.libs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import stepDefinition.Hooks;

public class TestBase {
    public static WebDriver driver;
    public TestBase() {
        this.driver = Hooks.getDriver();
    }
    private static WebElement element;

    public void enterText(String xpath, String value) {
        String elementXpath = xpath;
        element = driver.findElement(By.xpath(elementXpath));
        if (element.isDisplayed()) {
            element.clear();
            element.sendKeys(value);
        }
    }
    public void clickButton(String xpath) {
        String elementXpath = xpath;
        element = driver.findElement(By.xpath(elementXpath));
        if (element.isDisplayed()) {
            element.isEnabled();
            element.click();
        }
    }
}
