package com.example.constant;

import org.openqa.selenium.By;

public class ConstantsProductPage {
    public static final By SELECT_LOGITECH_BRAND = By.xpath("//div[contains(@class, 'fltr-item-text') and text()='logitech']");
    public static final By SELECT_A4TECH_BRAND = By.xpath("//div[contains(@class, 'fltr-item-text') and text()='A4 Tech']");
    public static final By CLICK_ON_SUGGESTED_RANKING = By.className("sort-fltr-cntnr");
    public static final By SELECT_PRICE_BY_ASC = By.cssSelector(".sort-fltr-cntnr>select option[value='PRICE_BY_ASC']");
    public static final By CLICK_LOWEST_PRICE_PRODUCT_OF_LOGITECH = By.cssSelector(".prdct-cntnr-wrppr>div:nth-child(1)");
    public static final By CLICK_LOWEST_PRICE_PRODUCT_OF_A4TECH = By.cssSelector(".prdct-cntnr-wrppr>div:nth-child(1)");
    public static final By SCROLL_DOWN_TO_PRODUCT_REVIEWS = By.cssSelector(".pr-rnr-tl>div");
    public static final By NUMBER_OF_REVIEWS = By.xpath("//*[@class=\"pr-rnr-sm-p-s\"]//span[1]");
    public static final By NUMBER_OF_COMMENTS = By.xpath("//*[@class=\"pr-rnr-sm-p-s\"]//span[2]");
    public static final By A4_TECH_FIRST_COMMENT = By.cssSelector("div.rnr-com-w:nth-child(1)>div.rnr-com-cn>div");
}
