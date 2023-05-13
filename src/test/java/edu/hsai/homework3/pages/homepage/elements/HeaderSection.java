package edu.hsai.homework3.pages.homepage.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HeaderSection {
    @FindBy(css = "body > header > div > nav > ul.uui-navigation.nav.navbar-nav.m-l8 > li")
    private List<WebElement> items;

    public HeaderSection(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public List<WebElement> getItems() {
        return items;
    }

    public int getItemsSize() {
        return items.size();
    }

    public List<String> getItemsNames() {
        return items.stream().map(WebElement::getText).toList();
    }
}
