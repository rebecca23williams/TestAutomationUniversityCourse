package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {

    private WebDriver driver;
    private String linkXpath_Format = ".//a[contains(text(), '%s')]";
    private By link_example1 = By.xpath(String.format(linkXpath_Format, "Example 1"));
    private By Link_example2 = By.xpath(String.format(linkXpath_Format, "Example 2"));

    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }

    public DynamicLoadingPageExample1 clickExample1(){
        driver.findElement(link_example1).click();
        return new DynamicLoadingPageExample1(driver);
    }

    public DynamicLoadingPageExample2 clickExample2(){
        driver.findElement(Link_example2).click();
        return new DynamicLoadingPageExample2(driver);
    }

    public DynamicLoadingPageExample2 rightClickOnExample2Link(){
        driver.findElement(Link_example2).sendKeys(Keys.CONTROL, Keys.RETURN);
        return new DynamicLoadingPageExample2(driver);
    }


}
