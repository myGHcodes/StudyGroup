package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AutocompletePage extends PageBase {

    @FindBy(linkText = "Autocomplete")
    private WebElement autocompleteLinkElement;

    @FindBy(xpath = "//input[@id='myCountry']")
    private WebElement inputBoxElement;

    @FindBy(xpath = "//input[@class='btn btn-primary']")
    private WebElement submitButtonElement;

    @FindBy(xpath = "//p[@id='result']") // -->> hashcode ->1245s4rfd7d8f
    private WebElement textElement;


    public void autocompleteActions() {
        autocompleteLinkElement.click();
        inputBoxElement.sendKeys("United States of America");
        submitButtonElement.click();
        Assert.assertEquals(textElement.getText(), "You selected: United States of America");
        Assert.assertTrue(textElement.isDisplayed()); // --> true --> not displayed = false
    }

}
