package paylink.steps;

import cap.utilities.TestDataUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import paylink.PageInitializer;

public class Login_steps {
    private PageInitializer pageInitializer;

    public Login_steps(PageInitializer pageInitializer) {

        this.pageInitializer = pageInitializer;
    }
    @Given("I launch The PayLink application")
    public void iLaunchThePaylinkApplication() {

        pageInitializer.loginPage.VisitPayLinkApplicationURL();
        Assert.assertTrue(pageInitializer.loginPage.WaitForPayLinkLoginForm());
    }
    @And("I enter the {string} and {string} in Login page")
    public void iEnterTheAndInLoginPage(String strUsername, String strPassword) {

        pageInitializer.loginPage.enterUsernameAndPassword(TestDataUtil.getValue(strUsername),TestDataUtil.getValue(strPassword));
    }
    @When("I click remember me check box and Login Button")
    public void iClickRememberMeCheckBoxAndLoginButton() {

        pageInitializer.loginPage.clickRemembermeAndLoginButton();
    }
    @Then("I should navigate to the Leads page")
    public void iShouldNavigateToTheLeadsPage() {
        Assert.assertTrue(pageInitializer.loginPage.verifyLeadPage());
    }
    @Given("I am in Lead page")
    public void iAmInLeadPage() {
        Assert.assertTrue(pageInitializer.loginPage.iamInLeadPage());
    }
    @And("I go to click on profile icon and click Logout")
    public void iGoToClickOnProfileIconAndClickLogout() {
        pageInitializer.loginPage.clickIconAndLogout();
    }

    @When("I click on forgot password")
    public void iClickOnForgotPassword() {
        pageInitializer.loginPage.clickOnForgotPassword();

    }
    @Then("I should see the forgot password page")
    public void iShouldSeeTheForgotPasswordPage() {
        Assert.assertTrue(pageInitializer.loginPage.setVerifyForgotPassword());
    }
    @Given("I am in forgot password page")
    public void iAmInForgotPasswordPage() {

        Assert.assertTrue(pageInitializer.loginPage.setVerifyForgotPassword());
    }

    @And("I go to the login page")
    public void iGoToTheLoginPage() {
        pageInitializer.loginPage.clickGoBackToLoginPage();

    }
    @When("I click on sign Up button")
    public void iClickOnSignUpButton() {
        pageInitializer.loginPage.btnSignUp();

    }
    @Then("I should navigate to sign up page")
    public void iShouldNavigateToSignUpPage() {
        Assert.assertTrue(pageInitializer.loginPage.verifyTheSignUp());

    }
    @When("I disable eye icon in password text field")
    public void iDisableEyeIconInPasswordTextField() {

        pageInitializer.loginPage.setDisableEyeIcon();
    }
    @Then("I should see the entered character should display in password text field {string} in login page")
    public void iShouldSeeTheEnteredCharacterShouldDisplayInPasswordTextFieldInLoginPage(String strPassword) {
        Assert.assertTrue(pageInitializer.loginPage.verifyEyeIcon(TestDataUtil.getValue(strPassword)));
    }
    @Given("I am in a Login page")
    public void iAmInALoginPage() {
        Assert.assertTrue(pageInitializer.loginPage.verifyLogin());
    }
    @When("I enter the  {string} in Login page and I enable eye icon in password text field")
    public void iEnterTheInLoginPage(String strPassword) {
        pageInitializer.loginPage.enterPassword(TestDataUtil.getValue(strPassword));
        pageInitializer.loginPage.setEnableEyeIcon();
    }
    @Then("I should see the entered character should display in dot format at password text field {string} in login page")
    public void iShouldSeeTheEnteredCharacterShouldDisplayInDotFormatAtPasswordTextFieldInLoginPage(String strPassword) {
        Assert.assertTrue(pageInitializer.loginPage.verifyEyeIcon(TestDataUtil.getValue(strPassword)));
    }
    @When("I scroll the the page")
    public void iScrollTheThePage() {
        pageInitializer.loginPage.pageScroll();
    }
    @Then("I should see the page scroll")
    public void iShouldSeeThePageScroll() {
        Assert.assertTrue(pageInitializer.loginPage.verifyLogin());
    }
    @When("I go to click the Privacy policy")
    public void iGoToClickThePrivacyPolicy() {

        pageInitializer.loginPage.btnPrivacyPolicy();

    }
    @Then("I should See the Privacy policy page")
    public void iShouldSeeThePrivacyPolicyPage() {
        pageInitializer.loginPage.verifyPrivacyPolicyPage();


    }

    @Given("I am on Privacy Policy page")
    public void iAmOnPrivacyPolicyPage() {
        pageInitializer.loginPage.verifyPrivacyPolicyPage();
    }

    @And("I navigate to login page")
    public void iNavigateToLoginPage() {
        pageInitializer.loginPage.defultWindow();
        Assert.assertTrue(pageInitializer.loginPage.verifyLogin());
    }
    @When("I click Terms of use")
    public void iClickTermsOfUse() {
        pageInitializer.loginPage.btnTermsOfUse();
    }
    @Then("I should see the Terms of use page")
    public void iShouldSeeTheTermsOfUsePage() {
        Assert.assertTrue(pageInitializer.loginPage.verifyTermsOfUsePage());

    }
    @Given("I am in Login page")
    public void iAmInLoginPage() {
        pageInitializer.loginPage.defultWindow();
        Assert.assertTrue(pageInitializer.loginPage.verifyLogin());
    }
    @When("I click on Eye icon")
    public void iClickOnEyeIcon() {
        pageInitializer.loginPage.enbleEyeIcon();

    }
    @Then("I should see the Username and Password{string} and {string} in Login page")
    public void iShouldSeeTheUsernameAndPasswordAndInLoginPage(String strEmail, String strPassword) {
        Assert.assertTrue(pageInitializer.loginPage.verifyEmail(TestDataUtil.getValue(strEmail)));
        Assert.assertTrue(pageInitializer.loginPage.verifyPassword(TestDataUtil.getValue(strPassword)));
        pageInitializer.loginPage.enbleEyeIcon();
        pageInitializer.loginPage.clickLogin();
    }
}
