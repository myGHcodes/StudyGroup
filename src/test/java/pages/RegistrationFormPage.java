package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.BrowserUtilities;

public class RegistrationFormPage extends PageBase {



    // elements
    @FindBy(linkText = "Registration Form")
    private WebElement registrationFormLink;

    @FindBy(xpath = "//input[@name='birthday']")
    private WebElement dobElement;

    @FindBy(xpath = "//small[@data-bv-result='INVALID']")
    private WebElement wrongMsgElement;

     // methods

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
