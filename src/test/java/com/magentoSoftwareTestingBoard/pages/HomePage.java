package com.magentoSoftwareTestingBoard.pages;

import com.magentoSoftwareTestingBoard.framework.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    private WebElement signInLink;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage clickSignInLink() {
        this.clickOn(By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]"));
        return this;
    }

    public WebElement getFeaturedImage() {
        return getElement(By.xpath("//img[@src='https://magento.softwaretestingboard.com/pub/media/wysiwyg/home/home-main.jpg']"));
    }
}
