package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebPage {
    @FindBy(xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement emailField;

    public WebElement getemailField(){
        return emailField;

    }

    @FindBy(xpath = "/html/body/section[2]/div/div/div/button")
    private WebElement submitButton;

    @FindBy(xpath = "/html/body/section[3]/div/div/div[1]/div/div/a")
    private WebElement virtualReadMoreButton;

    @FindBy(xpath = "/html/body/section[3]/div/div/div[2]/div/div/a")
    private WebElement hybridReadMoreButton;

    @FindBy(xpath = "/html/body/section[1]/div/div/div/a")
    private WebElement enrollmentButton;



    public WebPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

   public void clickOnSubmitButton(){
        this.submitButton.click();

    }
    public void writeEmailToEmailField(String email){

        this.emailField.sendKeys(email);
    }

    public void clickOnVirtualReadMoreButton(){

        this.virtualReadMoreButton.click();
    }
    public void clickOnHybridReadMoreButton(){

        this.hybridReadMoreButton.click();
    }

    public void clickStartTheEnrollmentButton() {
        this.enrollmentButton.click();
        }
    }