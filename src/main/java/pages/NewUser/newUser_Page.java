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


    public newUser_Page(WebDriver driver){
        this.driver= driver;
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
    public String currentURL(){
        return driver.getCurrentUrl();
    }
}







    