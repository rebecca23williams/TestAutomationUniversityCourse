package navigation;

import base.BaseTests;
import org.testng.annotations.Test;

public class NavigationTests extends BaseTests {

    @Test
    public void testNavigator(){
        homepage.clickDynamicLoading().clickExample1();
        getWindowManager().browserBack();
        getWindowManager().browserRefresh();
        getWindowManager().browserForward();
        getWindowManager().browserGoTo("https://google.com");
    }

    @Test
    public void testSwitchTab(){
        homepage.clickMultipleWindows().clickHere();
        getWindowManager().switchToTab("New Window");
    }
}
