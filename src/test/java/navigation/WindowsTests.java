package navigation;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class WindowsTests extends BaseTests {

    @Test
    public void testWindowTabs(){
        var buttonPage = homepage.clickDynamicLoading().rightClickOnExample2Link();
        getWindowManager().switchToNew();
        assertTrue(buttonPage.isStartButtonDisplayed(), "Start button is not displayed");
    }
}
