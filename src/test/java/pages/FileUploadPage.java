package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FileUploadPage extends PageBase {
     // when you make variable or elements anything private it means
    // ENCAPSULATION

    @FindBy(id = "file-upload")
    private WebElement chooseFileElement;

    public void clickOnChooseFileButtonAndUploadFile(){
        chooseFileElement.click();

        chooseFileElement.sendKeys("C:\\Users\\Ika\\Desktop\\WikipideaText.txt");

    }

}
