package utils;

import org.openqa.selenium.WebDriver;

public class WindowManager {

    private WebDriver driver;
    private WebDriver.Navigation navigate;

    public WindowManager(WebDriver driver){
        this.driver = driver;
        navigate = driver.navigate();
    }

    public void browserBack(){
        navigate.back();
    }

    public void browserForward(){
        navigate.forward();
    }

    public void browserRefresh(){
        navigate.refresh();
    }

    public void browserGoTo(String url) {
        navigate.to(url);
    }

    // getWindowHandles will return us handles to
    // all of the open windows or tabs.
    public void switchToTab(String tabTitle){
        var windows = driver.getWindowHandles();
        System.out.println("Number of tabs: " + windows.size());
        windows.forEach(System.out::println);

        for(String window : windows){
            System.out.println("Switching to window: " + window);
            driver.switchTo().window(window);
            System.out.println("Current window title: " + driver.getTitle());

            if(tabTitle.equals(driver.getTitle())){
                break;
            }
        }
    }

    public void switchToNew(){
        var windows = driver.getWindowHandles();
        windows.forEach(driver.switchTo()::window);
    }

}
