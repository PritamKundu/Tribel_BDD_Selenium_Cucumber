package pages.NewUser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class newUser_Page {

    WebDriver driver;

    /*Locators*/
    By tribelLogo = By.id("Layer_1");
    By acceptPopup = By.xpath("//a[normalize-space()=\"Accept\"]");
    By trendingMenu = By.xpath("(//h6[normalize-space()='Trending'])[1]");
    By newPost = By.id("new_post_modal_box");
    By signInSignUp_Suggestion = By.xpath("//span[@class='featute-alert-21']");
    By closePopup = By.xpath("//button[@class=\"overview_close_button fly_clos\"]");
    By starContributor = By.xpath("//h6[normalize-space()='Star Contributors']");
    By signInPage = By.xpath("//h3[normalize-space()='Sign In']");
    By menuName = By.xpath("//h2[normalize-space()=['']");


    public newUser_Page(WebDriver driver) {
        this.driver = driver;
    }

    public String currentURL() {
        return driver.getCurrentUrl();
    }

    public WebElement setTribelLogo() {
        return driver.findElement(tribelLogo);
    }

    public WebElement setTrendingMenu() {
        return driver.findElement(trendingMenu);
    }

    public WebElement setAcceptPopup() {
        return driver.findElement(acceptPopup);
    }

    public WebElement setNewPost() {
        return driver.findElement(newPost);
    }

    public WebElement setSignInSignUp_Suggestion() {
        return driver.findElement(signInSignUp_Suggestion);
    }

    public WebElement setClosePopup() {
        return driver.findElement(closePopup);
    }

    public WebElement setStarContributor() {
        return driver.findElement(starContributor);
    }

    public WebElement setSignInPage() {
        return driver.findElement(signInPage);
    }

    public WebElement setMenuName(String menu_name) {
        By menuName = By.xpath("//h6[normalize-space()='" + menu_name + "']");
        return driver.findElement(menuName);
    }

    public WebElement setFeedName(String feed_name) {
        By feedName = By.xpath("//h6[normalize-space()='" + feed_name + "']");
        return driver.findElement(feedName);
    }
}







    