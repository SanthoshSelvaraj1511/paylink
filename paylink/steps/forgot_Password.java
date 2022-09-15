package paylink.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import paylink.PageInitializer;

public class forgot_Password {
    private PageInitializer pageInitializer;

    public forgot_Password(PageInitializer pageInitializer) {

        this.pageInitializer = pageInitializer;
    }

    @When("I click go back to login page button")
    public void iClickGoBackToLoginPageButton() {
        pageInitializer.loginPage.clickGoBackToLoginPage();
    }
    @Then("I should see the login page")
    public void iShouldSeeTheLoginPage() {
        Assert.assertTrue(pageInitializer.loginPage.verifyLogin());
    }
    @Given("I am in the Forgot password page")
    public void iAmInTheForgotPasswordPage() {
        pageInitializer.loginPage.defultWindow();
        Assert.assertTrue(pageInitializer.loginPage.setVerifyForgotPassword());
    }
}
