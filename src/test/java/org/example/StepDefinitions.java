package org.example;

import io.cucumber.core.gherkin.Step;
import io.cucumber.java.After;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.*;

import org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.Enrollmentpage;
import pageObjects.HybridPage;
import pageObjects.VirtualPage;
import pageObjects.WebPage;


public class StepDefinitions {

    private final WebDriver driver = new ChromeDriver();
    private  WebPage webPage;

    private VirtualPage virtualPage;

    private HybridPage hybridPage;

    private Enrollmentpage enrollmentpage;

    public StepDefinitions() {
        driver.manage().window().maximize();
        webPage = new WebPage(driver);
        virtualPage = new VirtualPage(driver);
        hybridPage = new HybridPage(driver);
        enrollmentpage = new Enrollmentpage(driver);


    }

    @Given("I am on the Web page")
    public void i_am_on_the_web_page(){
        driver.get("file:///C:/Users/poesi/OneDrive/Desktop/git%20clone/Testing-Env/index.html");
    }
    @When("I click on the read more button in virtual")
    public void I_click_on_the_read_more_button_in_virtual(){
        webPage.clickOnHybridReadMoreButton();
    }
    @Then("a virtual header appears")
    public void a_virtual_header_appears(){
        driver.switchTo().alert().accept();
    }
    @When("I write the email address of {string}")
    public void i_write_the_email_adress_of(String string) {
        webPage.writeEmailToEmailField(string);
    }
    @When("I click the submit button")
    public void i_click_the_submit_button(){
        webPage.clickOnSubmitButton();
    }
    @Then("the confirmation button appears")
    public void the_confirmation_button_appears(){
        driver.switchTo().alert().accept();
    }
    @Then("the confirmation pop-up appears")
    public void the_confirmation_pop_up_appears(){
        driver.switchTo().alert().accept();
    }
    @When("I click virtual read more button ")
    public void I_click_read_more_button(){
        Utils.scrollToElement(driver, webPage.getemailField());
    }
    @Then("A new page opens")
    public void a_new_page_opens(){
        driver.getPageSource();

    }
    @Given("I am on the virtual page")
    public void i_am_on_the_virtual_page(){
      driver.getTitle();
    }

    @When("I click on virtual return button")
    public void i_click_on_virtual_return_button(){
        virtualPage.clickOnVirtualReturnButton();
    }

    @Then("I return to the web page")
    public void i_return_to_the_web_page(){
        driver.get("file:///C:/Users/poesi/OneDrive/Desktop/git%20clone/Testing-Env/routes/virtual.html");
    }

    @When("I click the hybrid read more button")
    public void i_click_the_hybrid_read_more_button(){
        Utils.scrollToElement(driver, webPage.getemailField());
        webPage.clickOnHybridReadMoreButton();

    }
    @Then("Hybrid page opens")
    public void hybrid_page_opens(){
        driver.getPageSource();

    }
    @Given("I am on the hybrid page")
    public void i_am_on_the_hybrid_page(){
        driver.get("file:///C:/Users/poesi/OneDrive/Desktop/git%20clone/Testing-Env/routes/hybrid.html");
    }
    @When("I click on the hybrid return button")
    public void i_am_on_the_hybrid_return_button(){
        hybridPage.clickOnHybridReturnButton();
    }
    @Then("I am taken to the web page")
    public void i_am_taken_to_the_web_page(){
        driver.getPageSource();

    }

    @When("I click on start the enrollment button")
    public void i_click_on_start_the_enrollment_button(){
        webPage.clickStartTheEnrollmentButton();

    }
    @Then("I am taken to the personal information form")
    public void i_am_taken_to_the_personal_information_form() {
        driver.get("file:///C:/Users/poesi/OneDrive/Desktop/git%20clone/Testing-Env/routes/enrollment.html");
    }

    @Given("I am on the personal information form")
    public void i_am_on_the_personal_information_form(){
        driver.get("file:///C:/Users/poesi/OneDrive/Desktop/git%20clone/Testing-Env/routes/enrollment.html");


    }
    @When("I write on the first name field as {string}")
    public void i_write_on_the_first_name_field(String string){
        enrollmentpage.writeToFirstNameField(string);
    }

    @When("I write on the last name field as {string}")
    public void i_write_on_the_last_name_field(String string){
        enrollmentpage.writeToLastNameField(string);
    }
    @When("I write on the username field as {string}")
    public void i_write_on_the_username_field(String string){
        enrollmentpage.writeToUsernameField(string);
    }
    @When("I write on the password field as {string}")
    public void i_write_on_password_field(String string){
        enrollmentpage.writeToUsernameField(string);
    }
    @When("I write on the cpassword field as {string}")
    public void i_write_on_the_cpassword_field(String string){
        enrollmentpage.writeToUsernameField(string);
    }




    @After
    public void cleanUp(){
        driver.quit();
    }



}



