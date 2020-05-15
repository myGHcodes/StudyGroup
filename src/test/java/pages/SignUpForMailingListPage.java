package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SignUpForMailingListPage extends PageBase {

    @FindBy(linkText = "Sign Up For Mailing List")
    private WebElement signUpForMailingListElement;

    @FindBy(name = "full_name")
    private WebElement fullNameElement;

    @FindBy(xpath = "//input[@type ='email']")
    public WebElement emailInputElement;

    @FindBy(name = "wooden_spoon")
    private WebElement signUpButtonElement;

    @FindBy(name = "signup_message")
    private WebElement successMessageElement;

    @FindBy(xpath = "//tbody[@id='schranka']//tr//td[1][contains(text(), 'do-not-reply@practice.cybertekschool.com')]")
    private WebElement emailFromCybertekElement;

    @FindBy(id = "odesilatel")
    private WebElement replyMessageElement;

    @FindBy(id="predmet")
    private WebElement subjectElement;

    public void verifySubject(){
        Assert.assertEquals(subjectElement.getText(), "Thanks for subscribing to practice.cybertekschool.com!");
    }

    public void verifyEmailFromCybertekAfterClicking(){
        Assert.assertEquals(replyMessageElement.getText(), "do-not-reply@practice.cybertekschool.com");
    }


    public void verifyEmailCameFrom(){
        Assert.assertEquals(emailFromCybertekElement.getText(), " do-not-reply@practice.cybertekschool.com");
    }

    public void clickOnEmailThatCameFromCybertek(){
        emailFromCybertekElement.click();
    }




    public void checkTextAfterSignUp(){
        // optional
        Assert.assertEquals(successMessageElement.getText(), "Thank you for signing up. Click the button below to return to the home page.");

        // if the text is displayed (successMessageElement.isDisplayed()) it will return true -->true means YES it is displayed
        // successMessageElement.isDisplayed() -->return false--> it means NO it is not displayed
        Assert.assertTrue(successMessageElement.isDisplayed());

    }


    public void clickOnSignUpButton(){
        signUpButtonElement.click();
    }




    public void typeFullName(){
        fullNameElement.sendKeys("Mary");
    }

    public void clickOnSignUpMailingList(){
        signUpForMailingListElement.click();
    }
}
