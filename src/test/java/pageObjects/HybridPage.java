package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HybridPage {
    @FindBy(xpath = "/html/body/a")
    private WebElement hybridReturnButton;

    public void clickOnHybridReturnButton(){
        this.hybridReturnButton.click();
    }
    public HybridPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

}
