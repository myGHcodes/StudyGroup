package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import utilities.BrowserUtilities;

import java.util.List;

public class RegistrationFormPage extends PageBase {

    BrowserUtilities browserUtilities = new BrowserUtilities();


    // elements
    @FindBy(linkText = "Registration Form")
    private WebElement registrationFormLink;

    @FindBy(xpath = "//input[@name='birthday']")
    private WebElement dobElement;

    @FindBy(xpath = "//small[@data-bv-result='INVALID']")
    private WebElement wrongMsgElement;

    @FindBy(xpath = "//*[@class='form-check-label']")
    private List<WebElement> listOfProgLangElements;

    @FindBy(xpath = "//input[@name='firstname']")
    private WebElement firstNameElement;

    @FindBy(xpath = "(//*[@data-bv-for='firstname'])[2]")
    private WebElement errorMsgElement;

    @FindBy(name = "department")
    private WebElement departmentElement;

    @FindBy(xpath = "//input[@name='lastname']")
    private WebElement lastnameElement;

    @FindBy(xpath = "//input[@name='username']")
    private WebElement usernameElement;

    @FindBy(xpath = "//input[@placeholder='email@email.com']")
    private WebElement emailElement;

    //      input[type='password'] ---> this is css element (no @ , no //) faster than xpath
    // -> //input[@type='password']  ---> this is xpath (it has //, it has @)
    //  5 avenue -->css
    // 5th avenue --> xpath

    @FindBy(css = "input[type='password']")
    private WebElement passwordElement;

    // //input[@placeholder='571-000-0000']
    @FindBy(xpath = "(//input[@class='form-control'])[6]")
    private WebElement phoneNumberElement;

    @FindBy(xpath = "//input[@value='female']")
    private WebElement genderFemaleElement;
    // to see diffrent locators press ctrl + space
    // className, xpath, linkText, css, id, class, partialLinkText, tagname
    // @FindBy()

    @FindBy(name = "job_title")
    private WebElement jobTitleElement;

    @FindBy(id = "inlineCheckbox2")
    private WebElement javaLanguageElement;

    @FindBy(id = "inlineCheckbox3")
    private WebElement javaScriptLanguageElement;

    @FindBy(id = "wooden_spoon")
    private WebElement signUpButtonElement;

    @FindBy(tagName = "p")  //div/p
    private WebElement successMessage;


    public void fullRegistration() {
        firstNameElement.sendKeys("Elizabeth");
        lastnameElement.sendKeys("Thomas");
        usernameElement.sendKeys("eThomas");
        emailElement.sendKeys("ethosmas@gmail.com");
        passwordElement.sendKeys("12345678e");
       phoneNumberElement.sendKeys("123-456-7896");
        genderFemaleElement.click();
        // dob -> date of birth
        dobElement.sendKeys("05/14/2020");
        // when you see select in element understand it as Dropdown
        Select anyName = new Select(departmentElement);
        anyName.selectByVisibleText("Department of Engineering");
        /*
        anyName.selectByIndex(1);
        anyName.getFirstSelectedOption();
        */
        Select select = new Select(jobTitleElement);
        select.selectByIndex(2); // manager
        javaLanguageElement.click();
        javaScriptLanguageElement.click();

        signUpButtonElement.click();

        // a href -- LinkText, PartialLinkText

        Assert.assertTrue(successMessage.isDisplayed());  // return true
        Assert.assertEquals(successMessage.getText(), "You've successfully completed registration!");
        // Assert.assertFalse(successMessage.isDisplayed()); // return false it means not displayed
    }

    public void selectTourismOfficeDepartment() {
        Select blala = new Select(departmentElement);
        blala.selectByVisibleText("Tourism Office");
    }


    // ---------------- methods ---------------


    public void typeOneLetterToFistNameAndCheckIsDisplayed() {
        firstNameElement.sendKeys("t");
        Assert.assertTrue(errorMsgElement.isDisplayed());
        Assert.assertEquals(errorMsgElement.getText(), "first name must be more than 2 and less than 64 characters long");
    }


    public void programmLanguagesIsDisplayed() {
        for (WebElement each : listOfProgLangElements) {
            Assert.assertTrue(each.isDisplayed());
        }
    }


    public boolean messageIsDisplayed() {
        return wrongMsgElement.isDisplayed();
    }


    public String message() {
        return wrongMsgElement.getText();
    }


    public void typeDOB() {
        dobElement.sendKeys("wrong_dob");

    }

    public void clickOnRegistrationFormLink() {
        registrationFormLink.click();
    }


}
