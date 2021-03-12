package com.example.pages;
import static com.example.constant.ConstantsChartPage.*;

import com.example.base.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChartPage extends BasePage {


    public ChartPage(WebDriver driver){
        super(driver);
    }

    public ChartPage scrollUpToAddToChart() {
        WebElement divElement = driver.findElement(ADD_TO_CHART);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true)", divElement);
        logger.info("scrollUpToAddToChart Success");
        timeUnitSeconds(3);
        return this;
    }

    public ChartPage clickAddToChart() {
        click(ADD_TO_CHART);
        logger.info("clickAddToChart Success");
        timeUnitSeconds(1);
        return this;
    }

    public ChartPage hoverToMyChart() {
        hoverElement(HOVER_TO_MY_CHART);
        logger.info("hoverToMyChart Success");
        timeUnitSeconds(1);
        return this;
    }

    public ChartPage goToChart() {
        click(GO_TO_CHART);
        logger.info("goToChart Success");
        timeUnitSeconds(1);
        return this;
    }

    public ChartPage incChartProductCountByOne() {
        click(INC_CHART_PRODUCT_COUNT_BY_ONE);
        logger.info("incChartProductCountByOne Success");
        timeUnitSeconds(2);
        return this;
    }

    public ChartPage deleteProductFromChart() {
        click(DELETE_PRODUCT_FROM_CHART);
        logger.info("deleteProductFromChart Success");
        timeUnitSeconds(2);
        return this;
    }

    public ChartPage confirmDeleteProductFromChart() {
        click(CONFIRM_DELETE_PRODUCT_FROM_CHART);
        logger.info("confirmDeleteProductFromChart Success");
        timeUnitSeconds(5);
        return this;
    }

}
