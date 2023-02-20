package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class common_Page {

    WebDriver driver;

    /*Locators*/
    By accept_popup = By.xpath("//a[normalize-space()=\"Accept\"]");
    By accCreateMessage = By.xpath("//span[@class='featute-alert-21']");
    By signInButton = By.xpath("//button[normalize-space()='Sign In']");
    By signUpButton = By.xpath("//a[@class='btn btn-default']");
    By closePopup = By.xpath("//button[@class=\"overview_close_button fly_clos\"]");
    By signIn = By.xpath("//a[normalize-space()='Sign In']");
    By likeIcon = By.xpath("(//span[@class='icon-like likeIconSvg my_streamcontent2_icon'])[1]");
    By commentIcon = By.xpath("(//span[@class=\"icon-comment\"])[1]");

    /*Constructor*/
    public common_Page(WebDriver driver) {
        this.driver = driver;
    }

    /*Common methods*/
    public void nonUserAccCreateMessage(){
        signUpButton().isDisplayed();
        signUpButton().isEnabled();
        signInButton().isDisplayed();
        signInButton().isEnabled();
        closePopup().click();
    }





    /*Return Element*/
    public void acceptPopup() {
        driver.findElement(accept_popup).click();;
    }

    public WebElement accCreateMessage() {
        return driver.findElement(accCreateMessage);
    }

    public WebElement signInButton() {
        return driver.findElement(signInButton);
    }

    public WebElement signUpButton() {
        return driver.findElement(signUpButton);
    }

    public WebElement closePopup() {
        return driver.findElement(closePopup);
    }

    public void signIn() {
        driver.findElement(signIn).isDisplayed();
        driver.findElement(signIn).isEnabled();
        driver.findElement(signIn).click();
    }

    public void likeIcon() {
        driver.findElement(likeIcon).isDisplayed();
        driver.findElement(likeIcon).click();
    }

    public void commentIcon() {
        driver.findElement(commentIcon).isDisplayed();
        driver.findElement(commentIcon).click();
    }

}






    