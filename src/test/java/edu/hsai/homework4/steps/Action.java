package edu.hsai.homework4.steps;

import edu.hsai.homework4.pages.homepage.HomePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class Action extends StepsSetup {
    public Action(WebDriver driver, Properties properties) {
        super(driver, properties);
    }

    @Step("Navigating to Home Page")
    public void navigateToHomePage() {
        homePage = new HomePage(driver, properties);
    }

    @Step("Logging in")
    public void performLogin() {
        homePage.performLogin();
    }

    @Step("Switching to the original window")
    public void switchToOriginalWindow() {
        homePage.switchToOriginalWindow();
    }
}
