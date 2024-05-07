package alerts;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload()
    {
        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("/Users/Justin/IdeaProjects/webdriver_java/resources/chromedriver");
        Assert.assertEquals(uploadPage.getUploadedFiles(), "chromedriver", "incorrect upload files");
    }
}
