package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RegistrationFormPage;
import utilities.BrowserUtilities;

public class TestCases extends TestBase {

    RegistrationFormPage registrationFormPage = new RegistrationFormPage();
    BrowserUtilities browserUtilities = new BrowserUtilities();

    @Test(testName = "Test Case #1", priority = 1, description = "https://practice-cybertekschool.herokuapp.com/")
    public void wrongDOB()  {
        registrationFormPage.clickOnRegistrationFormLink();
        registrationFormPage.typeDOB();
        browserUtilities.wait(3);
        //                    actual                                   expected
        Assert.assertEquals(registrationFormPage.message(), "The date of birth is not valid");
        Assert.assertTrue(registrationFormPage.messageIsDisplayed());
    }

    @Test(testName = "Test Case #2", priority = 2, description = "https://practice-cybertekschool.herokuapp.com/")
    public void languagesAreDisplayed() {
        registrationFormPage.clickOnRegistrationFormLink();
        registrationFormPage.programmLanguagesIsDisplayed();
    }

    @Test(testName = "Test Case #3", priority = 3, description = "https://practice-cybertekschool.herokuapp.com/")
    public void onlyOneLetterErrorIsDisplayed() {
        registrationFormPage.clickOnRegistrationFormLink();
        registrationFormPage.typeOneLetterToFistNameAndCheckIsDisplayed();
    }

    @Test(testName = "Test Case #4", priority = 4, description = "https://practice-cybertekschool.herokuapp.com/")
    public void nndnkjdkd() {
    }


    @Test(testName = "Test Case #5", priority = 5, description = "https://practice-cybertekschool.herokuapp.com/")
    public void fullRegistration() throws InterruptedException {
        registrationFormPage.clickOnRegistrationFormLink();
        registrationFormPage.selectTourismOfficeDepartment();



    }





}
