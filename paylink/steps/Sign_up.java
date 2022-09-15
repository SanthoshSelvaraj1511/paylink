package paylink.steps;

import cap.utilities.TestDataUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import paylink.PageInitializer;

public class Sign_up {
    private PageInitializer pageInitializer;

    public Sign_up(PageInitializer pageInitializer) {

        this.pageInitializer = pageInitializer;
    }
    @Given("I am in signup For A Payzli Account page")
    public void iAmInSignupForAPayzliAccountPage() {
        Assert.assertTrue(pageInitializer.loginPage.verifyTheSignUp());
    }
    @When("I click on Lets go button")
    public void iClickOnLetsGoButton() {
        pageInitializer.signUp.clickLetsGo();
    }
    @Then("I should see the Tell Us About Your Business page")
    public void iShouldSeeTheTellUsAboutYourBusinessPage() {
        Assert.assertTrue(pageInitializer.signUp.verifyTellUsAboutYourBusiness());
    }
    @Given("I am in Tell Us About Your Business page")
    public void iAmInTellUsAboutYourBusinessPage() {
        Assert.assertTrue(pageInitializer.signUp.verifyTellUsAboutYourBusiness());
    }
    @When("I click on the previous button in Tell Us About Your Business page")
    public void iClickOnThePreviousButtonInTellUsAboutYourBusinessPage() {
        pageInitializer.signUp.clickBtnPreviousInTellUsAboutYourBusiness();
    }

    @Then("I should move back to the signup For A Payzli Account page")
    public void iShouldMoveBackToTheSignupForAPayzliAccountPage() {
        Assert.assertTrue(pageInitializer.loginPage.verifyTheSignUp());
    }
    @When("I enter three charater {string} in choose your industry field")
    public void iEnterThreeCharaterInChooseYourIndustryField(String strChooseIndustry) {
        pageInitializer.signUp.enterChooseIndustry(strChooseIndustry);

    }
    @Then("I should see the result for related to three characters")
    public void iShouldSeeTheResultForRelatedToThreeCharacters() {
        pageInitializer.signUp.verifyDropdownInChooseIndustry();
    }
    @When("I enter text {string} in Email address text field and mouseover to the entered text")
    public void iEnterTextInEmailAddressTextField(String strEmailAddress) {
        pageInitializer.signUp.enterEmailAddress(strEmailAddress);
        pageInitializer.signUp.mouseOver();
    }
    @Then("I should see the pop up message")
    public void iShouldSeeThePopUpMessage() {
        Assert.assertTrue(pageInitializer.signUp.verifyEmailAddress());
    }
    @When("I enter the value {string} {string} and {string} and click next button in Tell Us About Your Business page")
    public void iEnterTheValueAndAndClickNextButtonInTellUsAboutYourBusinessPage(String strChooseIndustry, String strEmailAddress, String strBusinessVolume) {
        pageInitializer.signUp.setTellUsAboutYourBusiness(TestDataUtil.getValue(strChooseIndustry)
                ,TestDataUtil.getValue(strEmailAddress)
                ,TestDataUtil.getValue(strBusinessVolume));
        pageInitializer.signUp.clickBtnNextInTellUsAboutYourBusiness();

    }
    @Then("I should see the your simple pricing page")
    public void iShouldSeeTheSimplePricingPage() {
        Assert.assertTrue(pageInitializer.signUp.verifyYourSimplePricing());
    }
    @Given("I am in your simple pricing page")
    public void iAmInYourSimplePricingPage() {
        Assert.assertTrue(pageInitializer.signUp.verifyYourSimplePricing());
    }
    @When("I click on the previous button in your simple pricing page")
    public void iClickOnThePreviousButtonInYourSimplePricingPage() {
        pageInitializer.signUp.clickBtnPreviousInYourSimplePricing();
    }
    @Then("I should move back to the Tell Us About Your Business page")
    public void iShouldMoveBackToTheTellUsAboutYourBusinessPage() {
        Assert.assertTrue(pageInitializer.signUp.verifyTellUsAboutYourBusiness());
    }
    @And("I click next button in Tell Us About Your Business page")
    public void iClickNextButtonInTellUsAboutYourBusinessPage() {
        pageInitializer.signUp.clickBtnNextInTellUsAboutYourBusiness();
    }
    @When("I click next button in Your simple pricing page")
    public void iClickNextButtonInYourSimplePricingPage() {
        pageInitializer.signUp.clickbtnNextInYourSimplePricing();
    }
    @Then("I should see the create your account page")
    public void iShouldSeeTheCreateYourAccountPage() {
        Assert.assertTrue(pageInitializer.signUp.setVerifyCreateYourAccount());
    }
    @Given("I am in create your account page")
    public void iAmInCreateYourAccountPage() {
        Assert.assertTrue(pageInitializer.signUp.setVerifyCreateYourAccount());
    }
    @When("I click on the previous button in create your account page")
    public void iClickOnThePreviousButtonInCreateYourAccountPage() {
        pageInitializer.signUp.clickBtnPreviousInCreateYourAccount();
    }
    @Then("I move back to the Your simple pricing page")
    public void iMoveBackToTheYourSimplePricingPage() {
        Assert.assertTrue(pageInitializer.signUp.verifyYourSimplePricing());
    }
    @Given("I am in simple pricing page")
    public void iAmInSimplePricingPage() {
        Assert.assertTrue(pageInitializer.signUp.verifyYourSimplePricing());
    }
    @When("I enter password {string} and {string} in password text field and disable eye icon")
    public void iEnterPasswordAndInPasswordTextFieldAndDisableEyeIcon(String strPassword, String strConfirmPassword) {
        pageInitializer.signUp.enterpassword(TestDataUtil.getValue(strPassword),TestDataUtil.getValue(strConfirmPassword));
        pageInitializer.signUp.eyeIcon();
    }
    @Then("I should see the entered character should display in password text field {string} and {string}")
    public void iShouldSeeTheEnteredCharacterShouldDisplayInPasswordTextFieldAnd(String strpassword, String strConfirmPassword) {
        Assert.assertTrue(pageInitializer.signUp.verifyPassword(TestDataUtil.getValue(strpassword),TestDataUtil.getValue(strConfirmPassword)));
    }
    @Then("I should see the entered character should display in dot format at password text field {string} and {string}")
    public void iShouldSeeTheEnteredCharacterShouldDisplayInDotFormatAtPasswordTextFieldAnd(String strpassword, String strConfirmPassword) {
        Assert.assertTrue(pageInitializer.signUp.verifyPassword(TestDataUtil.getValue(strpassword),TestDataUtil.getValue(strConfirmPassword)));
    }
    @When("I enter password {string} and {string} in password text field and enable eye icon")
    public void iEnterPasswordAndInPasswordTextFieldAndEnableEyeIcon(String strPassword, String strConfirmPassword) {
        pageInitializer.signUp.enterpasswordForEnableEyeIcon(TestDataUtil.getValue(strPassword),TestDataUtil.getValue(strConfirmPassword));
        pageInitializer.signUp.enableEyeIcon();

    }

}
