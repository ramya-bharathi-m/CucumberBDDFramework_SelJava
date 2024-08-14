package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public WebDriver driver;
    public LoginPage(WebDriver rdriver){
        driver = rdriver;
        PageFactory.initElements(rdriver, this);
    }
    //Adding all the elements in the login page with
    //@FindBy

    @FindBy(id = "Email")
    @CacheLookup
    WebElement txtEmail;

    @FindBy(id = "Password")
    @CacheLookup
    WebElement txtPassword;

    @FindBy(xpath = "//*[contains(text(),\"Log in\")]")
    @CacheLookup
    WebElement btnLogin;

    @FindBy(linkText = "Logout")
    @CacheLookup
    WebElement lnkLogout;

    public void setTxtEmail(String email){
        txtEmail.clear();
        txtEmail.sendKeys(email);
    }

    public void setTxtPassword(String pass){
        txtPassword.clear();
        txtPassword.sendKeys(pass);
    }

    public void clickLogin(){
        btnLogin.click();
    }

    public void clickLnkLogout(){
        lnkLogout.click();
    }
}
