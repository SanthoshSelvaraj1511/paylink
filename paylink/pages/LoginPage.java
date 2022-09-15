package paylink.pages;

import cap.common.BasePage;
import cap.utilities.TestDataUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.CSS, using = "form#loginForm")
    protected WebElement elmntLoginForm;

    @FindBy(xpath = "//input[@class='form-field ']")
    protected WebElement txtEmail;

    @FindBy(id = "login-pwd")
    protected WebElement txtPassword;

    @FindBy(xpath = "//button[@type='submit']/preceding::label[2]")
    protected WebElement checkboxRememberMe;

    @FindBy(xpath = "//i[@class='view-pass icon-hide']")
    protected WebElement Eyeicon;

    @FindBy(xpath = "//p[text()='Password']/following::i[@class='view-pass icon-hide']")
    protected WebElement disableEyeIcon;

    @FindBy(xpath = "//p[text()='Password']/following::i[@class='view-pass icon-seen']")
    protected WebElement enableEyeIcon;

    @FindBy(xpath = "//button[@type='submit']")
    protected WebElement btnLogin;

    @FindBy(xpath = "//h3[text()='Leads']")
    protected WebElement verifylogin;
    //scenario 2
    @FindBy(xpath = "//i[@class='icon-down-arrow dropbtn']")
    protected WebElement clickProfileIcon;

    @FindBy(xpath = "//li[text()='Logout']")
    protected WebElement clickLogout;

    @FindBy(xpath = "//a[text()='Forgot Password']")
    protected WebElement clickForgotPassword;

    @FindBy(xpath = "//h3[text()='Forgot Password']")
    protected WebElement verifyForgotPassword;

    @FindBy(xpath = "//a[text()='Go back to login page']")
    protected WebElement goBackToLoginPage;

    @FindBy(xpath = "//a[text()='Sign Up']")
    protected WebElement signUp;

    @FindBy(xpath = "//h3[text()='Signup For A Payzli Account']")
    protected WebElement verifySignUp;

    @FindBy(xpath = "//div[@class='d-flex justify-content-center flex-wrap']//child::a[text()=' Privacy Policy ']")
    protected WebElement privacyPolicy;

    @FindBy(xpath = "//h1[text()='Privacy Policy']")
    protected WebElement verifyPrivacyPolicy;

    @FindBy(xpath = "//h3[text()='Login']")
    protected WebElement loginPage;

    @FindBy(xpath = "//div[@class='d-flex justify-content-center flex-wrap']//child::a[text()='Terms Of Use']")
    protected WebElement termsOfUses;

    @FindBy(xpath = "//div[@class='sub-banner']//child::h4[text()='Terms']")
    protected WebElement verifyTermsOfUse;


    public void VisitPayLinkApplicationURL() {
        attachStepLog("URL", TestDataUtil.getValue("&URL&"));
        visit(TestDataUtil.getValue("&URL&"));
    }

    public boolean WaitForPayLinkLoginForm() {
        waitForElement(elmntLoginForm);
        return verifyElement(elmntLoginForm);
    }

    public void enterUsernameAndPassword(String strUsername, String strPassword) {
        enterValue(txtEmail, strUsername);
        enterValue(txtPassword, strPassword);
    }

    public void enterPassword(String strPassword) {
        txtPassword.clear();
        enterValue(txtPassword, strPassword);
    }

    public void clickRemembermeAndLoginButton() {
        click(checkboxRememberMe);
        click(btnLogin);
    }

    public boolean verifyLeadPage() {
        waitForElement(verifylogin);
        return verifyElement(verifylogin);
    }

    public boolean iamInLeadPage() {
        waitForElement(verifylogin);
        return verifyElement(verifylogin);
    }

    public void clickIconAndLogout() {
        waitForElement(clickProfileIcon);
        jsClick(clickProfileIcon);
        waitForElement(clickLogout);
        jsClick(clickLogout);
    }

    public void enbleEyeIcon() {
        click(Eyeicon);
    }

    public void setDisableEyeIcon() {
        jsClick(disableEyeIcon);
    }

    public void setEnableEyeIcon() {
        jsClick(enableEyeIcon);
    }

    public boolean verifyEyeIcon(String strPassword) {
        String passwordInLogin = txtPassword.getAttribute("value");
        System.out.println("element>>>>>>>>>>>>>" + strPassword);
        System.out.println("element>>>>>>>>>>>>>" + passwordInLogin);
        if (strPassword.contains(passwordInLogin)) {
            return true;
        } else
            return false;
    }

    public void pageScroll() {
        jsScroll();
    }

    public boolean verifyEmail(String strEmail) {

        click(txtEmail);
        String email = txtEmail.getText();
        System.out.println("System email ::::::" + email);
        System.out.println("User email :::::::" + strEmail);
        if (email.contains(strEmail)) {
            return true;
        } else
            return false;
    }

    public boolean verifyPassword(String strPassword) {
        click(txtPassword);
        String password = txtPassword.getText();
        if (password.contains(strPassword)) {
            return true;
        }
        return false;
    }

    public void clickLogin() {
        waitForElement(btnLogin);
        click(btnLogin);
    }

    public void clickOnForgotPassword() {
        waitForElement(clickForgotPassword);
        click(clickForgotPassword);
        click(clickForgotPassword);
    }

    public boolean setVerifyForgotPassword() {
        waitForSeconds(2);
        waitForElement(verifyForgotPassword);
        return verifyElement(verifyForgotPassword);
    }

    public void clickGoBackToLoginPage() {
        waitForElement(goBackToLoginPage);
        click(goBackToLoginPage);
    }

    public void btnSignUp() {
        waitForElementClickable(signUp);
        click(signUp);
    }

    public boolean verifyTheSignUp() {
        waitForSeconds(3);
        waitForElement(verifySignUp);
        return verifyElement(verifySignUp);
    }

    public void btnPrivacyPolicy() {
        waitForElement(privacyPolicy);
        verifyElement(privacyPolicy);
        jsClick(privacyPolicy);
        waitForSeconds(3);
        focusWindow(2);

    }

    public boolean verifyPrivacyPolicyPage() {
        waitForElement(verifyPrivacyPolicy);
        String verifyprivacy = driver.getTitle();
        System.out.println("privacypage>>>>>>>>>>>>>>" + verifyprivacy);
        return verifyElement(verifyPrivacyPolicy);

    }

    public void defultWindow() {
        waitForSeconds(2);
        closeWindow(2);
        waitForSeconds(2);
        focusWindow(1);
    }

    public void navigation() {

        navigatesTo("https://sandbox.paylink.payzli.com/");
    }

    public boolean verifyLogin() {
        waitForElement(loginPage);
        return verifyElement(loginPage);
    }

    public void btnTermsOfUse() {
        waitForElement(termsOfUses);
        waitForSeconds(2);
        jsClick(termsOfUses);


    }

    public boolean verifyTermsOfUsePage() {
        focusWindow(2);
        waitForElement(verifyTermsOfUse);
        return verifyElement(verifyTermsOfUse);
    }


}
