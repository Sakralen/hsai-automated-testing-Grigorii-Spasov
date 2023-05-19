package edu.hsai.homework4.steps;

import edu.hsai.homework4.pages.homepage.HomePage;
import edu.hsai.homework4.pages.differnetelementspage.DifferentElementsPage;

import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class StepsSetup {
    protected static WebDriver driver;
    protected static Properties properties;

    protected static HomePage homePage;
    protected static DifferentElementsPage differentElements;

    public StepsSetup(WebDriver driver, Properties properties) {
        StepsSetup.driver = driver;
        StepsSetup.properties = properties;
    }
}
