package pages;
import pages.NewUser.newUser_Page;
import org.openqa.selenium.WebDriver;

public class PageObjectManager {

    public WebDriver driver;
    public newUser_Page newUserPage;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public newUser_Page getNewUserPage() {
        newUserPage = new newUser_Page(driver);
        return newUserPage;
    }
}
