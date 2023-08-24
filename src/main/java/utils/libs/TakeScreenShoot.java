package utils.libs;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import static utils.libs.TestBase.driver;

public class TakeScreenShoot {

    private static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM_HH:mm");
    public static void screenshot(String screenName) throws IOException {
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
        String filename = "";
        // Create screenshot param
        TakesScreenshot ts = (TakesScreenshot) driver;
        // Call capture screenshot - getScreenshotAs
        File source = ts.getScreenshotAs(OutputType.FILE);
        //Check available folder
        File theDir = new File("test_result/Screenshot/");
        if (!theDir.exists()) {
            theDir.mkdirs();
        }
        // result.getName() get name of scenario then set into name of screenshot file
        filename = "test_result/Screenshot/" + screenName + "_" + timeStamp + ".png";
        FileHandler.copy(source, new File(filename));
    }

}
