package pages;
import pages.NewUser.gmail_page;
import pages.NewUser.newUser_Page;
import org.openqa.selenium.WebDriver;

public class PageObjectManager {

    public WebDriver driver;
    public newUser_Page newUserPage;
    public gmail_page gmailPage;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public newUser_Page getNewUserPage() {
        newUserPage = new newUser_Page(driver);
        return newUserPage;
    }

    public gmail_page getGmailPage() {
        gmailPage = new gmail_page(driver);
        return gmailPage;
    }
}
