package parabank.framework.utils;

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
    private DataConverter dataConverter;
    private static WebDriver driver;

    public DriverTools() {
        this.dataConverter = new DataConverter();
        this.setDriver();
    }

    // Assign WebDriver
    private void setDriver() {
        String browserTitle = this.dataConverter.getAppData().getBrowser().toLowerCase(Locale.ROOT);

        switch (browserTitle) {
            case "firefox" -> driver = new FirefoxDriver();
            case "chrome" -> driver = new ChromeDriver();
            case "edge" -> driver = new EdgeDriver();

            case "firefoxhl" -> {
                FirefoxOptions options = new FirefoxOptions();
                options.addArguments("--headless");
                driver = new FirefoxDriver(options);
            }
            case "chromehl" -> {
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--headless");
                driver = new ChromeDriver(options);
            }
            case "edgehl" -> {
                EdgeOptions options = new EdgeOptions();
                options.addArguments("--headless");
                driver = new EdgeDriver(options);
            }
            default -> throw new InvalidArgumentException("Invalid WebDriver request");
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static WebDriverWait getXWait(Integer milliSeconds) {
        return new WebDriverWait(getDriver(), Duration.ofMillis(milliSeconds));
    }

    public static Actions getActions() {
        return new Actions(getDriver());
    }

    public static JavascriptExecutor getJS() {
        return (JavascriptExecutor) getDriver();
    }
}
