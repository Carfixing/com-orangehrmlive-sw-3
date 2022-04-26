package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utilities;

public class ForgotPasswordTest extends Utilities {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setup() {
        openBrowser(baseUrl);

    }
    @Test
    // userShouldNavigateToForgotPasswordPageSuccessfully
    public void  userShouldNavigateToForgotPasswordPageSuccessfully(){
        // Verify the text ‘Forgot Your Password?’
        String expectedMessage = "Forgot your password?";
        String actualMessage = getTextFromElement(By.xpath("//a[@href = '/index.php/auth/requestPasswordResetCode']"));
        Assert.assertEquals("Can not verify Forgot Your Pasword Message : ", expectedMessage, actualMessage);
//        verifyText("Forgot your password?","Forgot your password?","Can not verify Forgot Your Pasword Message : ");
//        getTextFromElement(By.xpath("//a[@href = '/index.php/auth/requestPasswordResetCode']"));
        //  Click on ‘Forgot your password’ link
        clickOnElement(By.xpath("//a[text() = 'Forgot your password?']"));
    }

}
