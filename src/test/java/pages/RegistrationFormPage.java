package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationFormPage extends PageBase {

    @FindBy(linkText = "Registration Form")
    private WebElement registrationFormLink;

    public void clickOnRegistrationFormLink(){
        registrationFormLink.click();
    }

}
