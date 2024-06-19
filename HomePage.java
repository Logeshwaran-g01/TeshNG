package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;
    //Login
    @FindBy(xpath = "//a[@id='login2']")
    WebElement loginButton;
    //Signup
    @FindBy(xpath = "//a[@id='signin2']")
    WebElement signupButton;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    public void clickLogin(){
        loginButton.click();
    }

    public void clickSignup(){
        signupButton.click();
    }
}
