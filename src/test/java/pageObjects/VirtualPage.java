package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverInfo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VirtualPage {
    @FindBy(xpath = "/html/body/a")
    private WebElement virtualReturnButton;

    public void clickOnVirtualReturnButton() {
        this.virtualReturnButton.click();
    }
    public VirtualPage(WebDriver driver){
        PageFactory.initElements(driver,this);

    }
}