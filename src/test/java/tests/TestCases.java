package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RegistrationFormPage;
import utilities.BrowserUtilities;

public class TestCases extends TestBase {

    RegistrationFormPage registrationFormPage = new RegistrationFormPage();
    BrowserUtilities browserUtilities = new BrowserUtilities();

    @Test(testName = "Test Case #1", priority = 0, description = "https://practice-cybertekschool.herokuapp.com/")
    public void wrongDOB() throws InterruptedException {
        registrationFormPage.clickOnRegistrationFormLink();
        registrationFormPage.typeDOB();
        browserUtilities.wait(3);
        //                    actual                                   expected
        Assert.assertEquals(registrationFormPage.message(), "The date of birth is not valid");
        Assert.assertTrue(registrationFormPage.messageIsDisplayed());
    }


}
