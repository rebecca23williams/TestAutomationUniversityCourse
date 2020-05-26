package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload(){
        var fileUploadPage = homepage.clickFileUpload();
        fileUploadPage.uploadFile("C:\\Users\\R2Williams\\IdeaProjects\\selenium_java\\resources\\chromedriver.exe");
        assertEquals(fileUploadPage.getUploadedFiles(), "chromedriver.exe", "Uploaded files incorrect");
    }
}
