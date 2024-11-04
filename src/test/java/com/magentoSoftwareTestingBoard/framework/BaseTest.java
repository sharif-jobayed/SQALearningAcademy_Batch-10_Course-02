package com.magentoSoftwareTestingBoard.framework;

import com.magentoSoftwareTestingBoard.pages.HomePage;
import com.magentoSoftwareTestingBoard.utils.DataConverter;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Locale;

public class BaseTest {
    private DataConverter dataConverter;
    private WebDriver driver;
    protected Page page;

    protected BaseTest() {
        this.dataConverter = new DataConverter();
        this.driver = getDriver(this.dataConverter.getAppData().getBrowser());
        this.page = new BasePage(this.driver);
    }

    private WebDriver getDriver(String driverTitle) {
        String drvr = driverTitle.toLowerCase(Locale.ROOT);
        return switch (drvr) {
            case "chrome" -> new ChromeDriver();
            case "firefox" -> new FirefoxDriver();
            case "edge" -> new EdgeDriver();
            case "chrome_hl" -> new ChromeDriver(new ChromeOptions().addArguments("--headless"));
            case "firefox_hl" -> new FirefoxDriver(new FirefoxOptions().addArguments("--headless"));
            case "edge_hl" -> new EdgeDriver(new EdgeOptions().addArguments("--headless"));
            default -> throw new InvalidArgumentException("Invalid driver request");
        };
    }

    @BeforeClass
    protected void setUp() {
        this.driver.manage().window().setSize(new Dimension(1440, 900));
        this.driver.get(this.dataConverter.getAppData().getBaseURL());
        HomePage homePage = page.getInstance(HomePage.class);
        Assert.assertTrue(homePage.getFeaturedImage().isDisplayed(), "Not on the Homepage.");
    }

    @AfterClass
    protected void tearDown() {
        this.driver.quit();
    }
}
