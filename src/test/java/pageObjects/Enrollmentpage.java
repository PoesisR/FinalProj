package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Enrollmentpage {
    @FindBy(xpath = "//*[@id=\"firstName\"]")
     private WebElement firstNameField;

    public void writeToFirstNameField(String string) {
        this.firstNameField.sendKeys(string);
    }

    @FindBy(xpath = "//*[@id=\"lastName\"]")
    private WebElement lastNameField;

    public void writeToLastNameField(String string){
        this.lastNameField.sendKeys(string);
    }
    @FindBy(xpath = "//*[@id=\"username\"]")
    private WebElement usernameField;

    public void writeToUsernameField(String string){
        this.usernameField.sendKeys(string);
    }
    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement passwordField;

    public void writeToPasswordField(String string){
        this.passwordField.sendKeys(string);
    }
    @FindBy(xpath = "//*[@id=\"cpassword\"]")
    private WebElement cpasswordField;

    public WebElement getCpasswordField(String string){
        this.cpasswordField.sendKeys();

    }

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/button")
    private WebElement nextButton;




    public Enrollmentpage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void writeFirstNameToFirstNameField(String firstName){
        this.firstNameField.sendKeys(firstName);

    }
    public void writeLastNameToLastNameField(String lastName){
        this.lastNameField.sendKeys(lastName);
    }
    public void writeUsernameToUsernameField(String username){
        this.usernameField.sendKeys(username);
    }
    public void writePasswordToPasswordField(String password){
        this.passwordField.sendKeys(password);
    }
    public void writeCpasswordToCpasswordField(String cpassword){
        this.cpasswordField.sendKeys(cpassword);
    }
    public void clickOnNextButton(){
        this.nextButton.click();

    }


}
