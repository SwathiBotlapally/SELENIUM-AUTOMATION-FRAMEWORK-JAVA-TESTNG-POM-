package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    By user = By.id("username");
    By pass = By.id("password");
    By loginBtn = By.id("submit");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterUsername(String uname){
        driver.findElement(user).sendKeys(uname);
    }

    public void enterPassword(String pwd){
        driver.findElement(pass).sendKeys(pwd);
    }

    public void clickLogin(){
        driver.findElement(loginBtn).click();
    }
}
