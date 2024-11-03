package com.magentoSoftwareTestingBoard.utils;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Locale;

public class DriverTools {
    private WebDriver driver;

    public DriverTools(String driverTitle) {
        this.setDriver(driverTitle);
    }

    private void setDriver(String driverTitle) {
        String drvr = driverTitle.toLowerCase(Locale.ROOT);

        switch (drvr) {
            case "chrome":
                this.driver = new ChromeDriver();
            case "firefox":
                this.driver = new FirefoxDriver();
            case "edge":
                this.driver = new EdgeDriver();
            case "chrome_hl": {
                this.driver = new ChromeDriver(new ChromeOptions().addArguments("--headless"));
            }
            case "firefox_hl": {
                this.driver = new FirefoxDriver(new FirefoxOptions().addArguments("--headless"));
            }
            case "edge_hl": {
                this.driver = new EdgeDriver(new EdgeOptions().addArguments("--headless"));
            }
            default:
                throw new InvalidArgumentException("Invalid driver request");
        }
    }

    public WebDriver getDriver() {
        return this.driver;
    }

    public WebDriverWait getXWait(Integer timeout) {
        return new WebDriverWait(this.getDriver(), Duration.ofMillis(timeout));
    }

    public Actions getActions() {
        return new Actions(getDriver());
    }

    public JavascriptExecutor getJS() {
        return (JavascriptExecutor) getDriver();
    }
}
