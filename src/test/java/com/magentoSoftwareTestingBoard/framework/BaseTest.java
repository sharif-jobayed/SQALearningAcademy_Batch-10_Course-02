package com.magentoSoftwareTestingBoard.framework;

import com.magentoSoftwareTestingBoard.utils.DataConverter;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Locale;

public class BaseTest {
    private DataConverter dataConverter;
    private WebDriver driver;

    protected BaseTest() {
        this.dataConverter = new DataConverter();
        this.driver = getDriver("firefox");
    }

    protected WebDriver getDriver(String driverTitle) {
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
    }

    @Test
    protected void test() {
    }

    @AfterClass
    protected void tearDown() {
        this.driver.quit();
    }
}
