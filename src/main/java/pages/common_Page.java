package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
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
    By copyLink = By.xpath("//span[normalize-space()='Copy link']");
    By copyLinkSuccess = By.xpath("//span[normalize-space()='copied.']");
    By facebookEmail = By.id("email");
    By facebookPassword = By.id("pass");
    By facebookLogin = By.xpath("//input[@name=\"login\"]");
    By postToFacebook = By.xpath("//span[normalize-space()='Post to Facebook']");
    By postComments = By.xpath("(//span[text()='comments'])[1]");
    By allCategory = By.xpath("//span[normalize-space()='All Categories']");
    By myFavourite_cat = By.xpath("//span[normalize-space()='My Favorites']");
    By feed_post_body = By.xpath("(//div[@class='post_body_left'])");
    By single_cat = By.xpath("//span[normalize-space()='Single Category']");
    By everything_except = By.xpath("//span[normalize-space()='Everything Except']");
    By verify_sub_cat = By.cssSelector("span:nth-child(1) > a:nth-child(1)");
    By clearAll = By.xpath("//p[@class='catgery-dropdown-clrall clear-all-btns']");
    By verify_subcat = By.cssSelector(".item.search-filter-category-btn.except_cls");
    By like_avatar = By.xpath("(//ul[@class='circle-container-2021'])");
    By feedUsername = By.xpath("(//span[@class=\"userName\"])");
    By ellipsisIcon_profile = By.xpath("(//span[@class='icon-leftdot'])");
    By ellipsisIcon_post = By.xpath("(//a[@role='button']");
    By continue_btn = By.xpath("//div[@class='custom-common-but']");
    By message_to = By.xpath("//textarea[@placeholder='Message']");
    By send_btn = By.xpath("//div[contains(text(),'Send')]");




    /*Constructor*/
    public common_Page(WebDriver driver) {
        this.driver = driver;
    }

    /*Return Element*/
    public void acceptPopup() {
        driver.findElement(accept_popup).click();
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

    public List<WebElement> setVerifySubCat() {
        return driver.findElements(verify_sub_cat);
    }

    public WebElement setVerifySubCatAfterClear() {
        return driver.findElement(verify_subcat);
    }

    public List<WebElement> setFeedUserName() {
        return driver.findElements(feedUsername);
    }

    public List<WebElement> setLikeAvatar() {
        return driver.findElements(like_avatar);
    }
    public List<WebElement> setEllipsisIconProfile() {
        return driver.findElements(ellipsisIcon_profile);
    }

    public List<WebElement> setEllipsisIconPost() {
        return driver.findElements(ellipsisIcon_post);
    }

    public void setEllipsisIconSubMenu(String ellipsis_sub_menu) {
        By ellipsisIcon_submenu = By.xpath("//a[normalize-space()='"+ellipsis_sub_menu+"']");
        driver.findElement(ellipsisIcon_submenu).click();
    }

    public void setReportViolationCategory(String report_violation_category) {
        By reportViolation_category = By.xpath("//span[normalize-space()='"+report_violation_category+"']");
        driver.findElement(reportViolation_category).click();
    }

    public void setReportToTribelOrPostOwner(String report_to_tribel_or_user) {
        By report_to = By.xpath("//span[normalize-space()='"+report_to_tribel_or_user+"']");
        driver.findElement(report_to).click();
    }

    /*Methods*/
    public void nonUserAccCreateMessage() {
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

    public void setShareIcon() throws InterruptedException {
        driver.findElement(shareIcon).isDisplayed();
        driver.findElement(shareIcon).click();
        Thread.sleep(2000);

    }

    public void setShareTribel() {
        driver.findElement(shareTribel).isDisplayed();
        driver.findElement(shareTribel).click();
    }

    public void setCopyLink() throws InterruptedException {
        driver.findElement(copyLink).isDisplayed();
        driver.findElement(copyLink).click();
        Thread.sleep(2000);
        driver.findElement(copyLinkSuccess).isDisplayed();
    }

    public void setShareFacebook() throws InterruptedException {
        driver.findElement(shareFacebook).isDisplayed();
        driver.findElement(shareFacebook).click();

        String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
        String subWindowHandler = null;

        Set<String> handles = driver.getWindowHandles(); // get all window handles
        Iterator<String> iterator = handles.iterator();
        while (iterator.hasNext()) {
            subWindowHandler = iterator.next();
        }
        driver.switchTo().window(subWindowHandler); // switch to popup window

        // perform operations on popup
        driver.findElement(facebookEmail).sendKeys("mehercyra+remi@gmail.com");
        driver.findElement(facebookPassword).sendKeys("Agile123");
        driver.findElement(facebookLogin).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
        By Categrory = By.xpath("//span[normalize-space()='" + cat_name + "']");
        driver.findElement(Categrory).isDisplayed();
        driver.findElement(Categrory).click();
    }

    public void subCategoryName(String sub_cat_name) {
        By sub_Categrory = By.xpath("//span[normalize-space()='" + sub_cat_name + "']");
        driver.findElement(sub_Categrory).isDisplayed();
        driver.findElement(sub_Categrory).click();
    }

    public void feedPost() {
        if (setFeedPostBody().size() > 0) {
            System.out.println("Feed post count is : " + setFeedPostBody().size());
            System.out.println("---------------------------------------------");
            for (int i = 0; i < setFeedPostBody().size(); i++) {
                setFeedPostBody().get(i).isDisplayed();
                //*Print every feed post*//*
                System.out.println(setFeedPostBody().get(i).getText());
                System.out.println("---------------------------------------------");
            }
        } else {
            System.out.println("Feed post not found !!");
        }
    }

    public void single_Cat() {
        driver.findElement(single_cat).isDisplayed();
        driver.findElement(single_cat).click();
    }

    public void select_a_cat() {
        Actions build = new Actions(driver);
        build.doubleClick(driver.findElement(By.xpath("//input[@id='single_cat_input']"))).perform();
    }

    public void setEverything_except() {
        driver.findElement(everything_except).isDisplayed();
        driver.findElement(everything_except).click();
    }


    public void verifySubcategoryNotFound(String cat, String sub_cat) {
        System.out.println("Category count is : " + setVerifySubCat().size());
        System.out.println("---------------------------------------------");
        for (WebElement elements : setVerifySubCat()) {
            String data = elements.getText();
            //if (!(data.equals("Arts - Painting"))){
            if (!(data.equals(cat + "-" + sub_cat))) {
                System.out.println("Everything Except Category Not Found :" + elements.getText());
            } else {
                System.out.println("Everything Except Category Found :" + cat + "-" + sub_cat);
                System.exit(0);
            }
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


    public void clearAll() {
        driver.findElement(clearAll).isDisplayed();
        driver.findElement(clearAll).click();
    }


    public void likeAvatar() throws InterruptedException {
        for (int i = 0; i < setLikeAvatar().size(); i++) {
            int count = i + 3;
            if (count <= 5) {
                setLikeAvatar().get(count).isDisplayed();
                setLikeAvatar().get(count).click();
                Thread.sleep(5000);
                driver.navigate().back();
                Thread.sleep(5000);
            }
        }
    }


    public void postUsernameOnFeed(int feed_username_number){
        try{
            setFeedUserName().get(feed_username_number).isDisplayed();
            setFeedUserName().get(feed_username_number).click();
        }
        catch (Exception e){
            System.out.println("Feed post not found !");
        }
    }

    public void ellipsisIcon(String postellipsisName){
        try{
        if(Objects.equals(postellipsisName, "profile")){
            setEllipsisIconProfile().get(0).isDisplayed();
            setEllipsisIconProfile().get(0).click();
            Thread.sleep(5000);
        } else if (Objects.equals(postellipsisName, "post")) {
            setEllipsisIconPost().get(0).isDisplayed();
            setEllipsisIconPost().get(0).click();
            Thread.sleep(5000);
        }
    }
        catch (Exception e){
            System.out.println("Ellipsis Icon not found !");
        }





        /*try{
            setEllipsisIconProfile().get(num_of_post_ellipsis).isDisplayed();
            setEllipsisIconProfile().get(num_of_post_ellipsis).click();
        }
        catch (Exception e){
            System.out.println("Ellipsis Icon not found !");
        }*/
    }

    public void continueButton(){
        driver.findElement(continue_btn).isDisplayed();
        driver.findElement(continue_btn).click();
    }

    public void reportMessage(String message){
        driver.findElement(message_to).isDisplayed();
        driver.findElement(message_to).sendKeys(message);
    }

    public void sendButton(){
        driver.findElement(send_btn).isDisplayed();
        driver.findElement(send_btn).click();
    }
}




    