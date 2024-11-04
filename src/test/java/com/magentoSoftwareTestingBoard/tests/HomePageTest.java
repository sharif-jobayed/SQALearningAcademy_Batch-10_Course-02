package com.magentoSoftwareTestingBoard.tests;

import com.magentoSoftwareTestingBoard.framework.BaseTest;
import com.magentoSoftwareTestingBoard.pages.HomePage;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
    @Test(priority = 1)
    protected void clickOnSignInLink() {
        HomePage homePage = this.page.getInstance(HomePage.class);
        homePage.clickSignInLink();
    }
}
