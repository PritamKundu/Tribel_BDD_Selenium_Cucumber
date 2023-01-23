package stepDefinitions.NewUser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.NewUser.newUser_Page;
import utils.TestContextSetup;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class newUser_Steps {
    TestContextSetup testContextSetup;
    newUser_Page newUserPage;
    FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//src//test//resources//global.properties");
    Properties prop = new Properties();

    /*Constructor*/
    public newUser_Steps(TestContextSetup testContextSetup) throws IOException {
        this.testContextSetup = testContextSetup;
        this.newUserPage = testContextSetup.pageObjectManager.getNewUserPage();
        prop.load(fis);
    }


    /*Gherkin Syntex*/
    @Given("Click on the tribel.com icon")
    public void click_on_the_tribel_com_icon() throws InterruptedException {
        newUserPage.setAcceptPopup().click();
        newUserPage.setTribelLogo().isDisplayed();
        newUserPage.setTribelLogo().click();
        Thread.sleep(2000);
        String trendingURL = prop.getProperty("TrendingUrl");
        Assert.assertEquals(newUserPage.currentURL(), trendingURL);
        Thread.sleep(2000);
    }

    @Then("Click on the new post")
    public void clickOnTheNewPost() throws InterruptedException {
        newUserPage.setNewPost().click();
        Thread.sleep(2000);
        Assert.assertEquals(newUserPage.setSignInSignUp_Suggestion().getText(), "You need to create an account and/or sign in to use this feature.");
        Thread.sleep(2000);
    }
}

