package tests;

import org.testng.annotations.Test;
import pages.RegistrationFormPage;

public class TestCases  extends TestBase{

    RegistrationFormPage registrationFormPage = new RegistrationFormPage();

    @Test(testName = "Test Case #1", priority = 0, description = "https://practice-cybertekschool.herokuapp.com/")
    public void wrongDOB() throws InterruptedException {
     registrationFormPage.clickOnRegistrationFormLink();

    }
}
