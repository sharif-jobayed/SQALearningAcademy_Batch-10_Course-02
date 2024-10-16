package parabank.framework.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

import static parabank.framework.utils.DriverTools.getDriver;

public class ScreenshotTool {

    public void takeScreenshot() {
        try {
            File screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
            String currentDir = System.getProperty("user.dir") + "./build/screenshots/";
            FileUtils.copyFile(screenshot, new File(currentDir + System.currentTimeMillis() + ".png"));
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
