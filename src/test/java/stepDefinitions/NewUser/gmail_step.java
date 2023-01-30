package stepDefinitions.NewUser;

import io.cucumber.java.en.Given;
import pages.NewUser.gmail_page;
import pages.NewUser.newUser_Page;
import utils.TestContextSetup;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class gmail_step {
    TestContextSetup testContextSetup;
    newUser_Page newUserPage;
    gmail_page gmailPage;

    /*Constructor*/
    public gmail_step(TestContextSetup testContextSetup) throws IOException {
        this.testContextSetup = testContextSetup;
        this.newUserPage = testContextSetup.pageObjectManager.getNewUserPage();
        this.gmailPage = testContextSetup.pageObjectManager.getGmailPage();
    }

    @Given("open the url")
    public void openTheUrl() {
    }
}
