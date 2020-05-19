package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
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
        registrationFormPage.fullRegistration();
    }

    @Test(testName = "Test Case #6", priority = 6, description = "https://www.fakemail.net/")
    public void mailList() {
        FakeMailPage fakeMailPage = new FakeMailPage();
        String email = fakeMailPage.emailTextFromFakeMail();
        browserUtilities.goToURL("https://practice-cybertekschool.herokuapp.com/");

        SignUpForMailingListPage maillingListPage = new SignUpForMailingListPage();


        maillingListPage.clickOnSignUpMailingList();
        maillingListPage.emailInputElement.sendKeys(email);
        maillingListPage.clickOnSignUpButton();
        maillingListPage.checkTextAfterSignUp();

        browserUtilities.goToURL("https://www.fakemail.net/");

        maillingListPage.verifyEmailCameFrom();
        maillingListPage.clickOnEmailThatCameFromCybertek();

        maillingListPage.verifyEmailFromCybertekAfterClicking();
        maillingListPage.verifySubject();

        // 1 - I inspected element (I founded element) using xpath, css, id .....
        // 2 - I saved as @FindBy(using xpath, css, id) and I named as blablaElement in Pages Folder
        // 3 - I wrote the method (click, sendKeys, Verify, check, compare)
        // 4 - Now in Test folder I'm calling methods
    }




         // txt file means it is a text file on windows --> notepad
        //                                   on mac --> TextEdit

//================================== FORK =========================================
    // if you Fork it you will have it on your own Github
    // you will have it on IntellIJ -> this is the steps ->(file -> new -> project from version control)
    // it mean you have on Github and you don't need to type->> git init
    // because it is on Github located already --->  git pull --> means get new changes
    // if you changed something you just push
    // how to push changes  --->
    //    git add .
    //    git commit -m "first commit"
    //    git push

//============================ CLONE ========================================================
    // if you Clone it you will have it on IntellIJ -> this is the steps ->(file -> new -> project from version control)
    // BUT you can not push to Github because  Github doesn't know about this project
    // then you have to open new repository on Github
    //  name it the repository name --> public
   /*
    on IntellIj --> terminal --> type this steps
    git init
    git add .
    git commit -m "first commit"
    git remote add origin https://github.com/myGHcodes/rerertrttyy.git---> link is example
    git push -u origin master
    */




    @Test(testName = "upload file", description = "https://practice-cybertekschool.herokuapp.com/")
    public void task7(){


    }








}
