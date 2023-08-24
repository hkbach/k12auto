package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class campaigns {
    public static WebDriver driver;

    private static WebElement element;

    private static List<WebElement> webElementList;

    public campaigns (WebDriver driver) {
        this.driver = driver;
    }


    public static WebElement title() {
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/main/div/div[1]/div[1]/span"));
        return element;
    }

    // Filter
    public static WebElement btn_Filter() {
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/main/div/div[1]/div[2]/button[2]"));
        return element;
    }

    public static WebElement btn_ResetAllFilter() {
        element = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button[1]"));
        return element;
    }


    public static WebElement input_SearchByName() {
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/main/div/div[1]/div[2]/div/div/fieldset/form/input"));
        return element;
    }

    public static WebElement btn_X_SearchByName() {
        element = driver.findElement((By.xpath("//*[@id=\"root\"]/div[1]/main/div/div[1]/div[2]/div/div/fieldset/button")));
        return element;
    }

    public static WebElement btn_ApplyFilter() {
        element = driver.findElement(By.xpath("//button[contains(text(),'Apply filters']"));
        return element;
    }

    public static WebElement btn_X_PanelFilter() {
        element = driver.findElement(By.xpath("//button[@aria-label='close']"));
        return element;
    }

    public static WebElement panel_Filter() {
        element = driver.findElement(By.xpath("/html/body/div[3]/div[3]"));
        return element;
    }



    // Countries and Status
    public static WebElement checkboxes_PanelFilter(String arg0) {
        element = driver.findElement(By.xpath("input[@value="+arg0+"]//svg[@aria-hidden='true']"));
        return element;
    }


    // Table_Filter
    public static WebElement table_Filter() {
        element = driver.findElement(By.xpath("//table[@class='MuiTable-root']"));
        return element;
    }

    public static List<WebElement> tableHeader_Column() {
        webElementList = driver.findElements(By.xpath("//thead[@class='MuiTableHead-root']//th[@class='MuiTableCell-root']"));
        return webElementList;
    }

    public static List<WebElement> tableCell() {
        webElementList = driver.findElements(By.xpath("//th[@class='MuiTableCell-root']"));
        return webElementList;
    }

    // Finance Volume
    public static WebElement input_FromFinanceVolume() {
        element = driver.findElement(By.xpath("//div[@id='Finance volume']//input[@aria-label='From']"));
        return element;
    }

    public static WebElement input_ToFinanceVolume() {
        element = driver.findElement(By.xpath("//div[@id='Finance volume']//input[@aria-label='To']"));
        return element;
    }

    // Investments
    public static WebElement input_FromInvestments() {
        element = driver.findElement(By.xpath("//div[@id='Investments']//input[@aria-label='From']"));
        return element;
    }

    public static WebElement input_ToInvestments() {
        element = driver.findElement(By.xpath("//div[@id='Investments']//input[@aria-label='To']"));
        return element;
    }

    // Navigation
    public static WebElement arrow_LastPage() {
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/main/div/div[2]/div[2]/div/nav/ul/li[5]/button"));
        return element;
    }


    public static void checkJustDisplayStatus(String arg0) {
        if (table_Filter().isDisplayed()) {
            int numberColumn = tableHeader_Column().size();
            for (int i = 0; i < numberColumn; i++) {
                if (tableHeader_Column().get(i).getText().equals("Status")) {
                    int numberCell = tableCell().size();
                    for (int j = i; j < numberCell; j += numberCell) {
                        System.out.println(tableCell().get(j).getText().equals(arg0) ? "Just display the campaigns which on" + arg0 + "status" : "Error");
                    }
                }
            }
        } else {
            System.out.println("No result");
        }
    }

    public static void checkJustDisplayCountry(String arg0) {
        if (table_Filter().isDisplayed()) {
            int numberColumn = tableHeader_Column().size();
            for (int i = 0; i < numberColumn; i++) {
                if (tableHeader_Column().get(i).getText().equals("Country")) {
                    int numberCell = tableCell().size();
                    for (int j = i; j < numberCell; j += numberCell) {
                        System.out.println(tableCell().get(j).getText().equals(arg0) ? "Just display the campaigns which belong to the selected" + arg0 + "option" : "Error");
                    }
                }
            }
        } else {
            System.out.println("No result");
        }
    }

    public static void checkRangeFinanceVolume(String actual, float fieldFromFinanceVolume,float fieldToFinanceVolume) {
        if (table_Filter().isDisplayed()) {
            int numberColumn = tableHeader_Column().size();
            for (int i = 0; i < numberColumn; i++) {
                if (tableHeader_Column().get(i).getText().equals("Finance vol.")) {
                    int numberCell = tableCell().size();
                    for (int j = i; j < numberCell; j += numberCell) {
                        String FinanceVolume = tableCell().get(j).getText();
                        String[] arrayList = FinanceVolume.substring(0, FinanceVolume.length() - 1).split(",");
                        actual = "";
                        for (int k = 0; k < arrayList.length; k++) {
                            actual += arrayList[i];
                        }
                        if (fieldFromFinanceVolume < Integer.parseInt(actual) && Integer.parseInt(actual) < fieldToFinanceVolume) {
                            System.out.println("Success");
                        } else {
                            System.out.println("Bug");
                        }
                    }
                }
            }
        } else {
            System.out.println("No result");
        }
    }

    public static void checkRangeInvestment(String actual, float fieldFromInvestment, float fieldToInvestment) {
        if (table_Filter().isDisplayed()) {
            int numberColumn = tableHeader_Column().size();
            for (int i = 0; i < numberColumn; i++) {
                if (tableHeader_Column().get(i).getText().equals("Investment")) {
                    int numberCell = tableCell().size();
                    for (int j = i; j < numberCell; j += numberCell) {
                        String Investment = tableCell().get(j).getText();
                        String[] arrayList = Investment.substring(0, Investment.length() - 1).split(",");
                        actual = "";
                        for (int k = 0; k < arrayList.length; k++) {
                            actual += arrayList[i];
                        }
                        if (fieldFromInvestment < Integer.parseInt(actual) && Integer.parseInt(actual) < fieldToInvestment) {
                            System.out.println("Success");
                        } else {
                            System.out.println("Bug");
                        }
                    }
                }
            }
        } else {
            System.out.println("No result");
        }
    }

    public static void checkName(String name) {
        if (table_Filter().isDisplayed()) {
            int numberColumn = tableHeader_Column().size();
            for (int i = 0; i < numberColumn; i++) {
                if (tableHeader_Column().get(i).getText().equals("Name")) {
                    int numberCell = tableCell().size();
                    for (int j = i; j < numberCell; j += numberCell) {
                        String Investment = tableCell().get(j).getText().toLowerCase();
                        if(Investment.contains(name.toLowerCase())) {
                            System.out.println("Table just display name follow input search name");
                        }else {
                            System.out.println("Error display not right");
                        }

                    }
                }
            }
        } else {
            System.out.println("No result");
        }
    }





}
