package tests;

import Pages.HomePage;
import Pages.SignupPage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class SignUpTest {

    WebDriver driver;
    HomePage homePage;
    SignupPage signupPage;
    String url = "https://www.demoblaze.com/";

    @BeforeMethod
    public void setup(){
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        signupPage = new SignupPage(driver);
    }

    @Test
    public void test() throws InterruptedException {
        homePage.clickSignup();
        signupPage.setUsernameField("Lokki2001");
        signupPage.setPasswordField("Testuser@0412");
        signupPage.setSignupButton();
        Thread.sleep(3000);
        //Using Alert
        Alert alert =driver.switchTo().alert();
        String alertMsg = alert.getText();
        System.out.println("Alert Message: " + alertMsg);
        //Assertions
        Assert.assertEquals(alertMsg,"Sign up successful.");
        alert.accept();

    }

    @AfterMethod
    public void tearDown(){
       // driver.quit();
    }
}
