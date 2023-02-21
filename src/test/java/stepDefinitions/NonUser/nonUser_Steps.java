package stepDefinitions.NonUser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.NonUser.nonUser_Page;
import pages.common_Page;
import utils.TestContextSetup;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class nonUser_Steps {

    TestContextSetup testContextSetup;
    nonUser_Page nonUserPage;
    common_Page commonPage;
    FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//src//test//resources//global.properties");
    Properties prop = new Properties();

    /*Constructor*/
    public nonUser_Steps(TestContextSetup testContextSetup) throws IOException {
        this.testContextSetup = testContextSetup;
        this.nonUserPage = testContextSetup.pageObjectManager.getNonUserPage();
        this.commonPage = testContextSetup.pageObjectManager.getCommonPage();
        prop.load(fis);
    }

    /*Gherkin Syntex*/
    @Given("Click on the tribel.com icon")
    public void clickOnTribelIcon() throws InterruptedException {
        testContextSetup.testBase.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        nonUserPage.setTribelLogo();
        Thread.sleep(3000);
        //testContextSetup.testBase.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        Assert.assertEquals(nonUserPage.currentURL(), prop.getProperty("TrendingUrl"));
        testContextSetup.testBase.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
    }

    @Then("Click on star contributors")
    public void nonUserStarContributors() throws InterruptedException {
        nonUserPage.setStarContributor();
        testContextSetup.testBase.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        Assert.assertEquals(testContextSetup.testBase.driver.getCurrentUrl(), prop.getProperty("NonUser_SignIn"));
        testContextSetup.testBase.driver.navigate().back();
    }

    @Then("Non-user is not be able to see {string} Feed")
    public void nonUserIsNotBeAbleToSeeFeed(String feed) throws InterruptedException {
        Thread.sleep(2000);
        nonUserPage.setFeedName(feed);
        Thread.sleep(2000);
        Assert.assertEquals(nonUserPage.setSignInSignUp_Suggestion().getText(), prop.getProperty("signInPageVerify"));
        nonUserPage.setClosePopup();
    }

    @Then("Click on the {string} menu")
    public void clickOnTheMenu(String menu){
        nonUserPage.setHeaderMenuName(menu);
        Assert.assertEquals(testContextSetup.testBase.driver.getCurrentUrl(), prop.getProperty("TrendingUrl"));
    }

}




