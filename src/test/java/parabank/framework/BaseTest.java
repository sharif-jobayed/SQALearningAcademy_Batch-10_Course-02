package parabank.framework;

import org.openqa.selenium.Dimension;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import parabank.framework.utils.DataConverter;
import parabank.framework.utils.DriverTools;
import parabank.framework.utils.ScreenshotTool;

import static parabank.framework.utils.DriverTools.getDriver;

public class BaseTest {
    private DataConverter dataConverter = new DataConverter();
    private ScreenshotTool screenshotTool = new ScreenshotTool();

    @BeforeClass
    protected void setUp() {
        new DriverTools();
        getDriver().manage().window().setSize(new Dimension(1440, 900));
        getDriver().get(this.dataConverter.getAppData().getBaseURL());
    }

//    @Test
//    void test() {}

    @AfterClass
    protected void tearDown() {
//        screenshotTool.takeScreenshot();
        getDriver().close();
    }
}
