package com.example.pages;
import static com.example.constant.ConstantsProductPage.*;

import com.example.base.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class ProductPage extends BasePage {



    public ProductPage(WebDriver driver){
        super(driver);
    }

    ArrayList<String> tabs;

    public ProductPage selectLogitechBrand() {
        click(SELECT_LOGITECH_BRAND);
        logger.info("selectLogitechBrand Success");
        timeUnitSeconds(1);
        return this;
    }

    public ProductPage clickOnSuggestedRanking() {
        click(CLICK_ON_SUGGESTED_RANKING);
        logger.info("clickOnSuggestedRanking Success");
        timeUnitSeconds(1);
        return this;
    }

    public ProductPage selectPriceByAsc() {
        click(SELECT_PRICE_BY_ASC);
        logger.info("selectPriceByAsc Success");
        timeUnitSeconds(1);
        return this;
    }

    public ProductPage clickLowestPriceProductOfLogitech() {
        click(CLICK_LOWEST_PRICE_PRODUCT_OF_LOGITECH);
        logger.info("clickLowestPriceProduct Success");
        timeUnitSeconds(1);
        return this;
    }

    public ProductPage scrollDownToProductReview() {
        tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        WebElement divElement = driver.findElement(SCROLL_DOWN_TO_PRODUCT_REVIEWS);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true)", divElement);
        logger.info("scrollDownToProductReview Success");
        timeUnitSeconds(1);
        return this;
    }

    public ProductPage getNumberOfReviews() {
        String numberOfReviews = getText(NUMBER_OF_REVIEWS);
        logger.info("getNumberOfReviews Success");
        logger.info("Reviews Number: " + numberOfReviews);
        timeUnitSeconds(1);
        return this;
    }

    public ProductPage getNumberOfComments() {
        String numberOfComments = getText(NUMBER_OF_COMMENTS);
        logger.info("getNumberOfComments Success");
        logger.info("Comments Number: " + numberOfComments);
        timeUnitSeconds(1);
        return this;
    }

    public ProductPage closeSecondTab() {
        driver.close();
        logger.info("closeSecondTab Success");
        driver.switchTo().window(tabs.get(0));
        timeUnitSeconds(1);
        return this;
    }

    public ProductPage deSelectLogitechBrand() {
        click(SELECT_LOGITECH_BRAND);
        logger.info("deSelectLogitechBrand Success");
        timeUnitSeconds(1);
        return this;
    }

    public ProductPage selectA4TechBrand() {
        click(SELECT_A4TECH_BRAND);
        logger.info("selectA4TechBrand Success");
        timeUnitSeconds(1);
        return this;
    }

    public ProductPage clickLowestPriceProductOfA4Tech() {
        click(CLICK_LOWEST_PRICE_PRODUCT_OF_A4TECH);
        logger.info("clickLowestPriceProduct Success");
        timeUnitSeconds(1);
        return this;
    }

    public ProductPage scrollDownToProductComments() {
        tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        WebElement divElement = driver.findElement(SCROLL_DOWN_TO_PRODUCT_REVIEWS);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true)", divElement);
        logger.info("scrollDownToProductComments Success");
        timeUnitSeconds(1);
        return this;
    }

    public ProductPage getFirstCommentOfProduct() {
        String firstComment = getText(A4_TECH_FIRST_COMMENT);
        logger.info("getFirstCommentOfProduct Success");
        logger.info("A4Tech First Comment: " + firstComment);
        timeUnitSeconds(1);
        return this;
    }
}
