package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Date;
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


    // Input search by name
    public static WebElement input_SearchByName() {
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/main/div/div[1]/div[2]/div/div/fieldset/form/input"));
        return element;
    }

    public static WebElement btn_X_SearchByName() {
        element = driver.findElement((By.xpath("//*[@id=\"root\"]/div[1]/main/div/div[1]/div[2]/div/div/fieldset/button")));
        return element;
    }

    // Panel filter
    public static WebElement panel_Filter() {
        element = driver.findElement(By.xpath("/html/body/div[2]/div[3]"));
        return element;
    }
    public static WebElement btn_Filter() {
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/main/div/div[1]/div[2]/button[2]"));
        return element;
    }

    public static WebElement btn_ResetAllFilter() {
        element = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button[1]"));
        return element;
    }
    public static WebElement btn_ApplyFilter() {
        element = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button[2]"));
        return element;
    }

    public static WebElement btn_X_PanelFilter() {
        element = driver.findElement(By.xpath("//button[@aria-label='close']"));
        return element;
    }





    // Countries and Status
    public static WebElement checkbox_PanelFilter(String arg0) {
        element = driver.findElement(By.xpath("//input[@value='"+arg0+"']"));
        return element;
    }

    public static List<WebElement> checkboxes_checked() {
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox'][@checked]"));
        return checkboxes;
    }


    // Table_Filter
    public static List<WebElement> tableHeader_Column() {
        webElementList = driver.findElements(By.xpath("//table/thead/tr/th/p"));
        return webElementList;
    }

    public static List<WebElement> tableRow() {
        webElementList = driver.findElements(By.xpath("//table/tbody/tr"));
        return webElementList;
    }
    public static List<WebElement> tableCell() {
        webElementList = driver.findElements(By.xpath("//table/tbody/tr/th"));
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
        element = driver.findElement(By.xpath("//button[@aria-label='Go to last page']"));
        return element;
    }

    // No result
    public static WebElement textNoResultLineOne() {
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/main/div/div[2]/div[1]/table/tbody/tr/td/div/div/p[1]"));
        return element;
    }

    public static WebElement textNoResultLineTwo() {
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/main/div/div[2]/div[1]/table/tbody/tr/td/div/div/p[2]"));
        return element;
    }

    // Counter result
    public static List<WebElement> buttons_Navigation() {
        webElementList = driver.findElements(By.xpath("//*[@id=\"root\"]/div[1]/main/div/div[2]/div[2]/div/nav/ul/li/button"));
        return webElementList;
    }

    public static WebElement navigation() {
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/main/div/div[2]/div[2]/div/nav"));
        return element;
    }

    public static WebElement counterResult() {
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/main/div/div[2]/div[2]/div/span"));
        return element;
    }

    public static void checkJustDisplayStatus(String arg0) {
        if (tableCell().size() > 0) {
            int numberColumn = tableHeader_Column().size();
            for (int i = 0; i < numberColumn; i++) {
                if (tableHeader_Column().get(i).getText().equals("Status")) {
                    int numberCell = tableCell().size();
                    for (int j = i; j < numberCell; j += numberColumn) {
                        System.out.println(tableCell().get(j).getText().equals(arg0) ? "Passed" : "Failed");
                    }
                }
            }
        } else {
            System.out.println("No result");
        }
    }

    public static void checkJustDisplayCountry(String arg0) {
        if (tableCell().size() > 0) {
            int numberColumn = tableHeader_Column().size();
            for (int i = 0; i < numberColumn; i++) {
                if (tableHeader_Column().get(i).getText().equals("Country")) {
                    int numberCell = tableCell().size();
                    for (int j = i; j < numberCell; j += numberColumn) {
                        System.out.println(tableCell().get(j).getText().equals(arg0) ? "Passed" : "Failed");
                    }
                }
            }
        } else {
            System.out.println("No result");
        }
    }

    public static void checkRangeFinanceVolume(float fieldFromFinanceVolume,float fieldToFinanceVolume) {
        if (tableCell().size() > 0) {
            int numberColumn = tableHeader_Column().size();
            for (int i = 0; i < numberColumn; i++) {
                if (tableHeader_Column().get(i).getText().equals("Finance vol.")) {
                    int numberCell = tableCell().size();
                    for (int j = i; j < numberCell; j += numberColumn) {
                        String FinanceVolume = tableCell().get(j).getText();
                        String[] arrayList = FinanceVolume.substring(0, FinanceVolume.length() - 1).split(",");
                        String financeVolumeFilter = "";
                        for (int k = 0; k < arrayList.length; k++) {
                            financeVolumeFilter += arrayList[k];
                        }
                        System.out.println(fieldFromFinanceVolume < Integer.parseInt(financeVolumeFilter) && Integer.parseInt(financeVolumeFilter) < fieldToFinanceVolume ? "Passed" : "Failed");
                    }
                }
            }
        } else {
            System.out.println("No result");
        }
    }

    public static void checkRangeInvestment(float fieldFromInvestment, float fieldToInvestment) {
        if (tableCell().size() > 0) {
            int numberColumn = tableHeader_Column().size();
            for (int i = 0; i < numberColumn; i++) {
                if (tableHeader_Column().get(i).getText().equals("Investment")) {
                    int numberCell = tableCell().size();
                    for (int j = i; j < numberCell; j += numberColumn) {
                        String Investment = tableCell().get(j).getText();
                        String[] arrayList = Investment.substring(0, Investment.length() - 1).split(",");
                        String investmentFilter = "";
                        for (int k = 0; k < arrayList.length; k++) {
                            investmentFilter += arrayList[k];
                        }
                        System.out.println(fieldFromInvestment < Integer.parseInt(investmentFilter) && Integer.parseInt(investmentFilter) < fieldToInvestment ? "Passed" : "Failed");
                    }
                }
            }
        } else {
            System.out.println("No result");
        }
    }

    public static void checkName(String name) {
        if (tableCell().size() > 0) {
            int numberColumn = tableHeader_Column().size();
            for (int i = 0; i < numberColumn; i++) {
                if (tableHeader_Column().get(i).getText().equals("Name")) {
                    int numberCell = tableCell().size();
                    for (int j = i; j < numberCell; j += numberColumn) {
                        String nameFilter = tableCell().get(j).getText().toLowerCase();
                        System.out.println(nameFilter.contains(name.toLowerCase()) ? "Passed" : "CheckSearchByName: Failed");;
                    }
                }
            }
        } else {
            System.out.println("No result");
        }
    }

    public static void checkDateCreatedOn() {

        // Check table have result
        if (tableCell().size() > 0) {
            int numberColumn = tableHeader_Column().size();
            for (int i = 0; i < numberColumn; i++) {

                // Check column have header name
                if (tableHeader_Column().get(i).getText().equals("Created on")) {
                    int numberCell = tableCell().size();
                    for (int j = i; j < numberCell; j += numberColumn) {
                        String dateCreateOn = tableCell().get(j).getText();

                        // Need write code than cleaner
                        String dateCreateOn1 = tableCell().get((j+numberColumn) >= numberColumn ? (numberCell- (numberColumn - i)) : (j+numberColumn)).getText();

                        // Check sort dateCreateOn decrease
                        String[] array = dateCreateOn.split("\\.");
                        String[] array1 = dateCreateOn1.split("\\.");
                        Date dateBefore = new Date(Integer.parseInt(array[0]),Integer.parseInt(array[1]),Integer.parseInt(array[2]));
                        Date dateAfter = new Date(Integer.parseInt(array1[0]),Integer.parseInt(array1[1]),Integer.parseInt(array1[2]));
                        System.out.println(dateAfter.before(dateBefore) || dateAfter.equals(dateBefore) ? "Passed" : "Failed");
                    }
                }
            }
        } else {
            System.out.println("No result");
        }
    }





}
