package tests;

import Pages.HomePage;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest {

    WebDriver driver;
    HomePage homePage;
    LoginPage loginPage;
    String url = "https://www.demoblaze.com/";

    @BeforeMethod
    public void setup(){
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
    }
    @Test
    public void test(){
        homePage.clickLogin();
        loginPage.username("Lokki1996");
        loginPage.password("Testuser@0412");
        loginPage.loginButton();
        String str = driver.getTitle();
        Assert.assertEquals(str, "STORE");
        System.out.println("The Title of the page: " + str);


    }

    @AfterMethod
    public void tearDown(){
        //driver.quit();
    }
}
