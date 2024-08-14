package stepDefinitions;

import io.cucumber.java.en.*;
import io.cucumber.java.zh_cn.但是;
import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import pageObjects.LoginPage;

public class Steps {

    public WebDriver driver;
    public  LoginPage lp;
    @Given("User Launch The Chrome Bowser")
    public void user_launch_the_chrome_bowser() {
        driver = new EdgeDriver();
        lp = new LoginPage(driver);
    }

    @When("User Opens URL {string}")
    public void user_opens_url(String url) {
        driver.get(url);
    }

    @When("User enters Email as {string} and Password as {string}")
    public void user_enters_email_as_and_password_as(String email, String password) {
        lp.setTxtEmail(email);
        lp.setTxtPassword(password);
    }

    @When("User clicks Login")
    public void user_clicks_login() {
        lp.clickLogin();
    }

    @Then("Page Title should be {string}")
    public void page_title_should_be(String title1) {
        if(driver.getPageSource().contains("Login was unsuccessful")){
            driver.close();
            Assert.fail();
        }
        else{
            Assert.assertEquals(title1,driver.getTitle());
        }
    }

    @When("User click on Log out link")
    public void user_click_on_log_out_link() {
        lp.clickLnkLogout();
    }

//    @Then("Page Title is {string}")
//    public void page_title_is(String title2) {
//        if(driver.getPageSource().contains("Login was unsuccessful")){
//            driver.close();
//            Assert.fail();
//        }
//        else{
//            Assert.assertEquals(title2,driver.getTitle());
//        }
//
//    }

    @Then("Close browser")
    public void close_browser() {
        driver.quit();
    }


}
