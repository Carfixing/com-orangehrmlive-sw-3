package testsuite;

import com.google.common.base.Verify;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utilities;
/*userSholdLoginSuccessfullyWithValidCredentials
 * Enter “Admin” username
 * Enter “admin123 password
 * Click on ‘LOGIN’ button
 * Verify the ‘Welcome’ text is display*/

public class LoginTest extends Utilities {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setup(){

        openBrowser(baseUrl);
    }
    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials(){
        //Enter “Admin” username
        sendTextToElement(By.id("txtUsername"),"Admin");
        //Enter “admin123 password
        sendTextToElement(By.id("txtPassword"),"admin123");
        //Click on ‘LOGIN’ button
        clickOnElement(By.name("Submit"));
        //Verify the ‘Welcome’ text is display
        String welcome = getTextFromElement(By.id("welcome"));
        //Verify the ‘Welcome’ text is display
        Assert.assertEquals("Incorrect Login Detail","Welcome Admin",welcome);
    }
    @After
    public void tearDown() {
        closeBrowser();
    }

}

