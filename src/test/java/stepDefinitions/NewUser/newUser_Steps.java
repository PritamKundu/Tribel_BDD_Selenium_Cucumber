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
        Thread.sleep(2000);
        newUserPage.setAcceptPopup().click();
        newUserPage.setTribelLogo().isDisplayed();
        newUserPage.setTribelLogo().click();
        Thread.sleep(2000);
        Assert.assertEquals(newUserPage.currentURL(), prop.getProperty("TrendingUrl"));
        Thread.sleep(2000);
    }

    /* @Then("Click on the new post")
    public void clickOnTheNewPost() throws InterruptedException {
        newUserPage.setNewPost().click();
        Thread.sleep(2000);
        Assert.assertEquals(newUserPage.setSignInSignUp_Suggestion().getText(), prop.getProperty("signInPageVerify"));
        newUserPage.setClosePopup().click();
        Thread.sleep(2000);
    }*/

    @Then("Non-user can not see the star contributors")
    public void nonUserCanNotSeeTheStarContributors() throws InterruptedException {
        newUserPage.setStarContributor().isDisplayed();
        newUserPage.setStarContributor().click();
        Thread.sleep(2000);
        newUserPage.setSignInPage().isDisplayed();
        Assert.assertEquals(newUserPage.setSignInPage().getText(), "Sign In");
        testContextSetup.testBase.driver.navigate().back();
    }

    @Then("Non-user can not see {string}")
    public void nonUserCanNotSee(String menu) throws InterruptedException {
        Thread.sleep(2000);
        newUserPage.setMenuName(menu).isDisplayed();
        newUserPage.setMenuName(menu).click();
        Thread.sleep(2000);
        Assert.assertEquals(newUserPage.setSignInSignUp_Suggestion().getText(), prop.getProperty("signInPageVerify"));
        newUserPage.setClosePopup().click();
    }

    @Then("Non-user is not be able to see {string} Feed")
    public void nonUserIsNotBeAbleToSeeFeed(String feed) throws InterruptedException {
        Thread.sleep(2000);
        newUserPage.setFeedName(feed).isDisplayed();
        newUserPage.setFeedName(feed).click();
        Thread.sleep(2000);
        Assert.assertEquals(newUserPage.setSignInSignUp_Suggestion().getText(), prop.getProperty("signInPageVerify"));
        newUserPage.setClosePopup().click();
    }

    @Then("Non-User can see {string} feed posts")
    public void nonUserCanSeeFeedPosts(String feed) throws InterruptedException {
        Thread.sleep(2000);
        newUserPage.setFeedName(feed).isDisplayed();
        newUserPage.setFeedName(feed).click();
        Thread.sleep(2000);
        Assert.assertEquals(testContextSetup.testBase.driver.getCurrentUrl(), prop.getProperty("BreakingUrl"));
    }
}

