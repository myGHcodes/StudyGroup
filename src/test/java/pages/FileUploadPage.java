package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FileUploadPage extends PageBase {
     // when you make variable or elements anything private it means
    // ENCAPSULATION

    @FindBy(linkText ="File Upload")
    private WebElement fileUploadLinkElement;

    @FindBy(id ="file-upload")
    private WebElement chooseFileElement;
   /*
   // (id="")
    //input[@id="file-submit"] --> xpath
      input[id="file-submit"] -->  css --> faster
      linkText -- a href
      h3 --> means header the size 3     = tagName
      h2 --> size 2                      = tagName
      h1 -->                             = tagName
      //h3   -->xpath
      //div[@class='example']//h3
    */
    @FindBy(id="file-submit")
    private WebElement uploadButtonElement;

    @FindBy(tagName = "h3")
    private WebElement fileUploadedTextElement;

    @FindBy(id="uploaded-files")
    private WebElement uploadedFileNameElement;


    public void clickUploadFileButtonAndVerifyTextAndNameFileTextIsDisplayed(){
        uploadButtonElement.click();
       Assert.assertEquals(fileUploadedTextElement.getText(), "File Uploaded!");
       // when on the requirement it is asking is displayed we use AssertTrue or AssertFalse
       Assert.assertTrue(uploadedFileNameElement.isDisplayed());


        /*// this one is one way of verifying text
        if (fileUploadedTextElement.getText().equals("File Uploaded!")){
            System.out.println("File Uploaded! is displayed");
        } else {
            System.out.println("File Uploaded! NOT displayed");
        }
        // output/result if it is displayed it is gonna show this text "File Uploaded! is displayed"*/

    }

    public void UploadFile() throws InterruptedException {
        // I commented out this one because no need to click then send keys
       // chooseFileElement.click();
        Thread.sleep(3000);
        chooseFileElement.sendKeys("C:\\Users\\Ika\\Desktop\\WikipideaText.txt");

    }


    public void clickOnFileUploadLink(){
        fileUploadLinkElement.click();
    }

}
