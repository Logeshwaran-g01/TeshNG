package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {

    WebDriver driver;
    //Username
    @FindBy(xpath = "//input[@id='sign-username']")
    WebElement usernameField;
    //Password
    @FindBy(xpath = "//input[@id='sign-password']")
    WebElement passwordField;
    //Clicking Signup
    @FindBy(xpath = "//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")
    WebElement signupButton;

    public SignupPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void setUsernameField(String username){
        usernameField.sendKeys(username);
    }
    public void setPasswordField(String password){
        passwordField.sendKeys(password);
    }
    public void setSignupButton(){
        signupButton.click();
    }
}
