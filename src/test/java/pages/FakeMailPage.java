package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FakeMailPage extends PageBase {

    @FindBy(xpath = "//span[@id='email']")
    private WebElement emailElement;

    public String emailTextFromFakeMail(){
       return emailElement.getText();
    }


    


}
