package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;


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
    By shareIcon = By.xpath("(//span[@class='dropbtn'][normalize-space()='Share'])[1]");
    By shareTribel = By.xpath("//a[@class='share_Tribel']");
    By shareFacebook = By.xpath("//span[normalize-space()='Share on Facebook']");
    By facebookEmail = By.id("email");
    By facebookPassword = By.id("pass");
    By facebookLogin = By.xpath("//input[@name=\"login\"]");
    By postToFacebook = By.xpath("//span[normalize-space()='Post to Facebook']");
    By postComments = By.xpath("(//span[text()='comments'])[1]");
    By allCategory = By.xpath("//span[normalize-space()='All Categories']");
    By myFavourite_cat = By.xpath("//span[normalize-space()='My Favorites']");
    By feed_post_body = By.xpath("(//div[@class='post_body_left'])");
    By single_cat = By.xpath("//span[normalize-space()='Single Category']");
    By everything_except= By.xpath("//span[normalize-space()='Everything Except']");
    By verify_sub_cat= By.cssSelector("span:nth-child(1) > a:nth-child(1)");


    /*Constructor*/
    public common_Page(WebDriver driver) {
        this.driver = driver;
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

    public List<WebElement> setFeedPostBody() {
        return driver.findElements(feed_post_body);
    }

/*    public List<WebElement> setVerifySubCat() {
        return driver.findElements(verify_sub_cat);
    }*/



    /*Methods*/
    public void nonUserAccCreateMessage(){
        signUpButton().isDisplayed();
        signUpButton().isEnabled();
        signInButton().isDisplayed();
        signInButton().isEnabled();
        closePopup().click();
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

    public void setShareIcon() {
        driver.findElement(shareIcon).isDisplayed();
        driver.findElement(shareIcon).click();
    }

    public void setShareTribel() {
        driver.findElement(shareTribel).isDisplayed();
        driver.findElement(shareTribel).click();
    }

    public void setShareFacebook() throws InterruptedException {
        driver.findElement(shareFacebook).isDisplayed();
        driver.findElement(shareFacebook).click();

        String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
        String subWindowHandler = null;

        Set<String> handles = driver.getWindowHandles(); // get all window handles
        Iterator<String> iterator = handles.iterator();
        while (iterator.hasNext()){
            subWindowHandler = iterator.next();
        }
        driver.switchTo().window(subWindowHandler); // switch to popup window

        // perform operations on popup
        driver.findElement(facebookEmail).sendKeys("mehercyra+remi@gmail.com");
        driver.findElement(facebookPassword).sendKeys("Agile123");
        driver.findElement(facebookLogin).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        driver.findElement(postToFacebook).click();
        Thread.sleep(3000);
        driver.switchTo().window(parentWindowHandler);
    }

    public void setPostComments() {
        driver.findElement(postComments).isDisplayed();
        driver.findElement(postComments).click();
    }

    public void allCategory() {
        driver.findElement(allCategory).isDisplayed();
        driver.findElement(allCategory).click();
    }

    public void myFavourite_cat() {
        driver.findElement(myFavourite_cat).isDisplayed();
        driver.findElement(myFavourite_cat).click();
    }

    public void personalizeYourFeed() {
        //driver.findElement(personalizeYourFeed).isDisplayed();
        Actions build = new Actions(driver); // heare you state ActionBuider
        build.doubleClick(driver.findElement(By.xpath("//input[@placeholder='Personalize your feed...']"))).perform();
    }

    public void categoryName(String cat_name) {
        By Categrory = By.xpath("//span[normalize-space()='"+cat_name+"']");
        driver.findElement(Categrory).isDisplayed();
        driver.findElement(Categrory).click();
    }

    public void subCategoryName(String sub_cat_name) {
        By sub_Categrory = By.xpath("//span[normalize-space()='"+sub_cat_name+"']");
        driver.findElement(sub_Categrory).isDisplayed();
        driver.findElement(sub_Categrory).click();
    }

    public void feedPost(){
        if (setFeedPostBody().size()>0) {
            System.out.println("Feed post count is : " +setFeedPostBody().size());
            System.out.println("---------------------------------------------");
            for (int i = 0; i <setFeedPostBody().size(); i++) {
                setFeedPostBody().get(i).isDisplayed();
                //*Print every feed post*//*
                System.out.println(setFeedPostBody().get(i).getText());
                System.out.println("---------------------------------------------");
            }
        }else{
            System.out.println("Feed post not found !!");
        }
    }

    public void single_Cat() {
        driver.findElement(single_cat).isDisplayed();
        driver.findElement(single_cat).click();
    }

    public void select_a_cat() {
        Actions build = new Actions(driver); // heare you state ActionBuider
        build.doubleClick(driver.findElement(By.xpath("//input[@id='single_cat_input']"))).perform();
    }

    public void setEverything_except() {
        driver.findElement(everything_except).isDisplayed();
        driver.findElement(everything_except).click();
    }

    public void verifySubcategory(){
      WebElement elems = (WebElement) driver.findElements(By.cssSelector("span:nth-child(1) > a:nth-child(1)"));
        for (int i = 0; i <setVerifySubCat().size(); i++) {
            String allData[] = new String[]{setVerifySubCat().get(i).getText()};
            //System.out.println(setVerifySubCat().get(i).getText());
        }
            String subcat  = "Technology - Social Media";
            if (!allData.equals(subcat)){
                setVerifySubCat().get(i).isDisplayed();
            }
            else if (setVerifySubCat().get(i).getText().equals(subcat)) {
                System.out.println("Except category not working properly !!");
            }
        }


        /*try{
            if (setVerifySubCat().size()>0) {
                System.out.println("Feed post count is : " +setVerifySubCat().size());
                System.out.println("---------------------------------------------");
                for (int i = 0; i <setVerifySubCat().size(); i++) {
                    String subcat = "Advice - Dating";
                    if (!setVerifySubCat().get(i).getText().equals(subcat)){
                        setVerifySubCat().get(i).isDisplayed();
                    }
                    else if (setVerifySubCat().get(i).getText().equals(subcat)) {
                        System.out.println("Except category not working properly !!");
                    }
                }
            }else{
                System.out.println("Feed post not found !!");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }*/



    }

}






    