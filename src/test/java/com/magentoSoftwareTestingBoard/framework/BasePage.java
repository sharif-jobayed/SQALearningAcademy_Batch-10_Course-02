package com.magentoSoftwareTestingBoard.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class BasePage extends Page {
    public BasePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public WebElement getElement(By locator) {
        try {
            return this.driver.findElement(locator);
        } catch (Exception e) {
            try {
                throw new Exception(e.getMessage());
            } catch (Exception ex) {
                throw new RuntimeException(ex.getMessage());
            }
        }
    }

    @Override
    public List<WebElement> getElements(By locator) {
        try {
            return this.driver.findElements(locator);
        } catch (Exception e) {
            try {
                throw new Exception(e.getMessage());
            } catch (Exception ex) {
                throw new RuntimeException(ex.getMessage());
            }
        }
    }

    @Override
    public void waitTillVisible(By locator) {
        try {
            this.xWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch (Exception e) {
            try {
                throw new Exception(e.getMessage());
            } catch (Exception ex) {
                throw new RuntimeException(ex.getMessage());
            }
        }
    }

    @Override
    public void doClick(By locator) {
        try {
            getElement(locator).click();
        } catch (Exception e) {
            try {
                throw new Exception(e.getMessage());
            } catch (Exception ex) {
                throw new RuntimeException(ex.getMessage());
            }
        }
    }

    @Override
    public String getItsText(By locator) {
        try {
            return this.getElement(locator).getText();
        } catch (Exception e) {
            try {
                throw new Exception(e.getMessage());
            } catch (Exception ex) {
                throw new RuntimeException(ex.getMessage());
            }
        }
    }

    @Override
    public void clearAndType(By locator, String text) {
        try {
            this.getElement(locator).clear();
            this.getElement(locator).sendKeys(text);
        } catch (Exception e) {
            try {
                throw new Exception(e.getMessage());
            } catch (Exception ex) {
                throw new RuntimeException(ex.getMessage());
            }
        }
    }

    @Override
    public <T extends BasePage> T getInstance(Class<T> tClass) {
        try {
            return tClass.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);
        } catch (InvocationTargetException | InstantiationException | IllegalAccessException |
                 NoSuchMethodException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
