package com.magentoSoftwareTestingBoard.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public abstract class Page {
    protected WebDriver driver;
    protected WebDriverWait xWait;
    protected Actions actions;
    protected JavascriptExecutor js;

    public Page(WebDriver driver) {
        this.driver = driver;
        this.xWait = new WebDriverWait(this.driver, Duration.ofMillis(30));
        this.actions = new Actions(driver);
        this.js = (JavascriptExecutor) driver;
    }

    public abstract WebElement getElement(By locator);

    public abstract List<WebElement> getElements(By locator);

    public abstract void waitTillVisible(By locator);

    public abstract void doClick(By locator);

    public abstract String getItsText(By locator);

    public abstract void clearAndType(By locator, String text);

    public abstract <T extends BasePage> T getInstance(Class<T> tClass);
}
