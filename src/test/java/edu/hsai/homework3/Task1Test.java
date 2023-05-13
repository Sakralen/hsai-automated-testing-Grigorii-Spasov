package edu.hsai.homework3;

import edu.hsai.homework3.expecteddata.ExpectedData;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Task1Test extends DriverSetup {
    @Test
    public void testTask1() {
        SoftAssert softAssert = new SoftAssert();

        // 2. Assert browser title
        softAssert.assertEquals(homePage.getTitle(), ExpectedData.SITE_NAME);

        // 4. Assert Username is loggined
        softAssert.assertEquals(homePage.getLoggedName(), ExpectedData.LOGGED_USER_NAME);

        // 5. Assert that there are 4 items on the header section are displayed, and they have proper texts
        softAssert.assertEquals(homePage.getHeaderSection().getItemsSize(), ExpectedData.HEADER_SECTION_ITEMS_SIZE);
        softAssert.assertEquals(homePage.getHeaderSection().getItemsNames(), ExpectedData.HEADER_SECTION_ITEMS_NAMES);

        homePage.getHeaderSection().getItems().forEach(item -> {
            softAssert.assertTrue(item.isDisplayed());
        });

        // 6. Assert that there are 4 images on the Index Page, and they are displayed
        softAssert.assertEquals(homePage.getBenefitIconsSize(), ExpectedData.BENEFIT_ICONS_SIZE);

        homePage.getBenefitIcons().forEach(icon -> {
            softAssert.assertTrue(icon.isDisplayed());
        });

        // 7. Assert that there are 4 texts on the Index Page under icons, and they have proper text
        softAssert.assertEquals(homePage.getBenefitIconsTextsSize(), ExpectedData.BENEFIT_ICONS_TEXTS_SIZE);
        softAssert.assertEquals(homePage.getBenefitIconsTextsStrings(), ExpectedData.BENEFIT_ICONS_TEXTS_STRINGS);

        softAssert.assertAll();
    }
}
