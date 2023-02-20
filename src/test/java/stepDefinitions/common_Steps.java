package stepDefinitions;

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


public class common_Steps {

    TestContextSetup testContextSetup;
    nonUser_Page nonUserPage;
    common_Page commonPage;
    FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//src//test//resources//global.properties");
    Properties prop = new Properties();

    /*Constructor*/
    public common_Steps(TestContextSetup testContextSetup) throws IOException {
        this.testContextSetup = testContextSetup;
        this.nonUserPage = testContextSetup.pageObjectManager.getNonUserPage();
        this.commonPage = testContextSetup.pageObjectManager.getCommonPage();
        prop.load(fis);
    }

    /*Implementation of Gherkin Syntex*/
    @Given("Go to {string}")
    public void goTo(String url) {
        testContextSetup.testBase.driver.get(url);
        testContextSetup.testBase.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        commonPage.acceptPopup();
    }

    @Given("Go to Tribel.com")
    public void goToTribelCom() throws InterruptedException {
        testContextSetup.testBase.driver.get(prop.getProperty("Url"));
        testContextSetup.testBase.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        commonPage.acceptPopup();
        Thread.sleep(6000);
    }

    @Then("Click on {string}")
    public void clickOnMenu(String menu) {
        testContextSetup.testBase.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        nonUserPage.setMenuName(menu);
        nonUserPage.setMenuName(menu);
        testContextSetup.testBase.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        Assert.assertEquals(commonPage.accCreateMessage().getText(), prop.getProperty("signInPageVerify"));
        commonPage.nonUserAccCreateMessage();
    }

    @Then("Click on {string} feed posts")
    public void clickOnFeedPosts(String feed) throws InterruptedException {
        Thread.sleep(2000);
        nonUserPage.setFeedName(feed);
        nonUserPage.setFeedName(feed);
        Thread.sleep(2000);
        String braekingurl = prop.getProperty("BreakingUrl");
        String trendingurl = prop.getProperty("TrendingUrl");

        String currentURL = testContextSetup.testBase.driver.getCurrentUrl();
        if (currentURL.equals(braekingurl)) {
            System.out.println(currentURL);
        } else if (currentURL.equals(trendingurl)) {
            System.out.println(currentURL);
        }
        Thread.sleep(2000);

        if (nonUserPage.setFeedPostBody().size()>0) {
            System.out.println("Feed post count is : " +nonUserPage.setFeedPostBody().size());
            System.out.println("---------------------------------------------");
            for (int i = 0; i < nonUserPage.setFeedPostBody().size(); i++) {
                nonUserPage.setFeedPostBody().get(i).isDisplayed();
                //*Print every feed post*//*
                System.out.println(nonUserPage.setFeedPostBody().get(i).getText());
                System.out.println("---------------------------------------------");
            }
        }else{
            System.out.println("Feed post not found !!");
        }
    }

    @Then("Click on Sign-in")
    public void clickOnSignIn() {
        commonPage.signIn();
        Assert.assertEquals(testContextSetup.testBase.driver.getCurrentUrl(), prop.getProperty("SignInUrl"));
    }

    @Then("Click like on posts in the feed")
    public void clickLikeOnPostsInTheFeed(){
        commonPage.likeIcon();
        testContextSetup.testBase.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        Assert.assertEquals(commonPage.accCreateMessage().getText(), prop.getProperty("signInPageVerify"));
        commonPage.nonUserAccCreateMessage();
    }

    @Then("Click on comment on any posts")
    public void clickOnCommentOnAnyPosts() {
        commonPage.commentIcon();
        testContextSetup.testBase.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        Assert.assertEquals(commonPage.accCreateMessage().getText(), prop.getProperty("signInPageVerify"));
        commonPage.nonUserAccCreateMessage();
    }
}




