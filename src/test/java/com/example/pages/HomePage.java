package com.example.pages;
import static com.example.constant.ConstantsHomePage.*;

import com.example.base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.*;


public class HomePage extends BasePage {


    public HomePage(WebDriver driver) {
        super(driver);
    }



    public HomePage openHomePage() {
        navigateUrl(TRENDYOL_URL);
        logger.info("openHomePage Success");
        timeUnitSeconds(1);
        ;
        return this;
    }

    public HomePage hoverManPicture() {
        hoverElement(MAN_PICTURE);
        logger.info("hoverManPicture Success");
        timeUnitSeconds(1);
        ;
        return this;
    }

    public HomePage clickManPicture() {
        click(MAN_PICTURE);
        logger.info("clickManPicture Success");
        timeUnitSeconds(1);
        ;
        return this;
    }

    public HomePage manPictrueSelectionControl() {
        try {
            Assert.assertEquals("https://www.trendyol.com/butik/liste/erkek", getCurrentPageUrl());
            logger.info("manPictrueSelectionControl Success");
        } catch (Error error) {
            logger.error("Error on manPictrueSelectionControl : " + error);
        }
        return this;
    }

    public HomePage writeTheProductToSearch() {
        sendKeys(SEARCH_BOX, "webcam");
        logger.info("writeTheProductToSearch Success");
        timeUnitSeconds(1);
        ;
        return this;
    }

    public HomePage clickSearchButton() {
        timeUnitSeconds(1);
        click(SEARCH_BUTTON);
        logger.info("clickSearchButton Success");
        return this;
    }







}
