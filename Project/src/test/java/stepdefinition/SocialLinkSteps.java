package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.HomePageActions;

public class SocialLinkSteps {

    HomePageActions homepageActions = new HomePageActions();


    @When("I click on the Facebook link")
    public void i_click_on_the_facebook_link() {
        homepageActions.clickFaceBook();
    }

    @And("I click on the Twitter link")
    public void i_click_on_the_twitter_link() {
        homepageActions.clickTwitter();
    }

    @And("I click on the YouTube link")
    public void i_click_on_the_youtube_link() {
        homepageActions.clickYoutube();
    }

    @And("I click on the Instagram link")
    public void i_click_on_the_instagram_link() {
        homepageActions.clickInstagram();
    }

    @And("I click on the LinkedIn link")
    public void i_click_on_the_linkedin_link() {
        homepageActions.clickLinkedIn();
    }

    @And("I click on the Pinterest link")
    public void i_click_on_the_pinterest_link() {
        homepageActions.clickPinterest();
    }

    @And("I click on the Snapchat link")
    public void i_click_on_the_snapchat_link() {
        homepageActions.clickSnapchat();
    }
}
