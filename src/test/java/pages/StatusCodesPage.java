package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;

public class StatusCodesPage extends PageBase {

    @FindBy(linkText = "Status Codes")
    private WebElement statusCodesElement;

    @FindBy(tagName = "p")
    public WebElement textElement;



    public void clickOnStatusCodesLink(){
        statusCodesElement.click();
    }



    @DataProvider(name = "testFrom-9-12")
    public static Object[][] createData() {
        return new Object[][]{
                {"200", "This page returned a 200 status code."},
                {"301", "This page returned a 301 status code."},
                {"404", "This page returned a 404 status code."},
                {"500", "This page returned a 500 status code."},
        };
    }
}
