package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utilities.BrowserUtilities;

import java.util.List;

public class RegistrationFormPage extends PageBase {



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


     // ---------------- methods ---------------


    public void typeOneLetterToFistNameAndCheckIsDisplayed(){
        firstNameElement.sendKeys("t");
        Assert.assertTrue(errorMsgElement.isDisplayed());
        Assert.assertEquals(errorMsgElement.getText(), "first name must be more than 2 and less than 64 characters long");
    }


     public void programmLanguagesIsDisplayed(){
         for ( WebElement each : listOfProgLangElements) {
             Assert.assertTrue(each.isDisplayed());
         }
     }


    public boolean messageIsDisplayed(){
        return  wrongMsgElement.isDisplayed();
    }


    public String message(){
        return wrongMsgElement.getText();
    }


    public void typeDOB(){
        dobElement.sendKeys("wrong_dob");

    }

    public void clickOnRegistrationFormLink(){
        registrationFormLink.click();
    }



}
