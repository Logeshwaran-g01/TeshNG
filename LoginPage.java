package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    @FindBy(xpath = "//input[@id='loginusername']")
    WebElement loginUsername;

    @FindBy(xpath = "//input[@id='loginpassword']")
    WebElement loginPassword;

    @FindBy(xpath = "//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")
    WebElement clickLoginButton;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void username(String enterUsername){
        loginUsername.sendKeys(enterUsername);
    }

    public void password(String enterPassword){
        loginPassword.sendKeys(enterPassword);
    }

    public void loginButton(){
        clickLoginButton.click();
    }


}
