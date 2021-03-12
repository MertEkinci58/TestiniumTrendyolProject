package com.example.constant;
import static com.example.constant.ConstantsChartPage.*;

import org.openqa.selenium.By;

public class ConstantsChartPage {
    public static final By ADD_TO_CHART = By.cssSelector(".pr-in-btn>.add-to-bs-tx");
    public static final By HOVER_TO_MY_CHART = By.cssSelector(".account-navigation-wrapper>.account-nav-item:nth-child(3)");
    public static final By GO_TO_CHART = By.cssSelector(".productPriceBox>.goBasket");
    public static final By INC_CHART_PRODUCT_COUNT_BY_ONE = By.cssSelector(".ty-display-flex>.ty-numeric-counter-button:nth-child(3)");
    public static final By DELETE_PRODUCT_FROM_CHART = By.cssSelector("button>.i-trash");
    public static final By CONFIRM_DELETE_PRODUCT_FROM_CHART = By.cssSelector(".btnBox>button:nth-child(2)");


}
