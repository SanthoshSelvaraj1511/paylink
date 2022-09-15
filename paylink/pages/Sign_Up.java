package paylink.pages;

import cap.common.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Sign_Up extends BasePage {
    public Sign_Up(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[text()='Lets Go']")
    protected WebElement btnLetsGo;

    @FindBy(xpath = "//h1[text()='Tell Us About Your Business']")
    protected WebElement tellUsAboutYourBusiness;

    @FindBy(xpath = "//h1[text()='Tell Us About Your Business']/following::button[text()='Previous']")
    protected WebElement btnPreviousInTellUsAboutYourBusiness;

    @FindBy(xpath = "//h3[text()='Business Information']/following::input[@type='text' and contains(@id,'react-select')]")
    protected WebElement TxtChooseIndustryInSingUppage;

    @FindBy(xpath = "//div[@class='business_info_select__menu-list css-11unzgr']")
    protected List<WebElement> lstChooseIndustry;

    @FindBy(id = "cp-email")
    protected WebElement txtEmailAddressInSignUpPage;

    @FindBy(xpath = "//label[text()='Email Address']")
    protected WebElement labelEmailAddress;

    @FindBy(xpath = "//label[text()='Estimated Monthly Processing Volume']")
    protected WebElement labelBusinessVolume;

    @FindBy(xpath = "//input[@id='volume']")
    protected WebElement txtBusinessVolumeInSignUpPage;

    @FindBy(xpath = "//h1[text()='Tell Us About Your Business']/following::button[text()='Next']")
    protected WebElement btnNextInTellUsAboutYourBusiness;

    @FindBy(xpath = "//h1[text()='Your Simple Pricing']")
    protected WebElement yourSimplePricing;

    @FindBy(xpath = "//h1[text()='Your Simple Pricing']/following::button[text()='Previous']")
    protected WebElement btnPreviousInYourSimplePricing;

    @FindBy(xpath = "//h1[text()='Your Simple Pricing']/following::button[text()='Next']")
    protected WebElement btnNextInYourSimplePricing;

    @FindBy(xpath = "//h3[text()='Create Your Account']")
    protected WebElement verifyCreateYourAccount;

    @FindBy(xpath = "//h3[text()='Create Your Account']/following::button[text()='Previous']")
    protected WebElement btnPreviousInCreateYourAccount;

    @FindBy(xpath = "//h3[text()='Create Your Account']/following::input[@id='password']")
    protected WebElement passwordInSignup;

    @FindBy(id = "retypepassword")
    protected WebElement confirmPasswordInSignup;

    @FindBy(xpath = "//p[text()='Password']/following::i[@class='view-pass icon-hide']")
    protected WebElement passwordEyeIcon;

    @FindBy(xpath = "//p[text()='Confirm Password']/following::i[@class='view-pass icon-hide']")
    protected WebElement confirmPasswordEyeIcon;

    @FindBy(xpath = "//p[text()='Password']/following::i[@class='view-pass icon-seen']")
    protected WebElement enablePassword;

    @FindBy(xpath = "//p[text()='Confirm Password']/following::i[@class='view-pass icon-seen']")
    protected WebElement enableConfirmPassword;


    public void clickLetsGo() {

        click(btnLetsGo);
    }

    public boolean verifyTellUsAboutYourBusiness() {
        waitForSeconds(2);
        waitForElement(tellUsAboutYourBusiness);
        return verifyElement(tellUsAboutYourBusiness);
    }

    public void clickBtnPreviousInTellUsAboutYourBusiness() {
        click(btnPreviousInTellUsAboutYourBusiness);
    }

    public void enterChooseIndustry(String strChooseIndustry) {
        waitForSeconds(1);
        waitForElement(TxtChooseIndustryInSingUppage);
        click(TxtChooseIndustryInSingUppage);
        jsEnterValue(TxtChooseIndustryInSingUppage, strChooseIndustry);

    }

    public void verifyDropdownInChooseIndustry() {
        //div[text()='MOTOR FREIGHT CARRIERS']
        waitForElements(lstChooseIndustry);
        for (WebElement elmntChooseIndustry : lstChooseIndustry) {
            System.out.println("\n elmntChooseIndustry ::::: " + elmntChooseIndustry.getText());
        }

    }


    public void enterEmailAddress(String strEmailAddress) {
        waitForElement(txtEmailAddressInSignUpPage);
        System.out.println("Element>>>>>>>>>>>>>>>>>>>>>>>>>");
        enterValue(txtEmailAddressInSignUpPage, strEmailAddress);
    }

    public void mouseOver() {
        mouseOver(labelBusinessVolume);
        click(labelBusinessVolume);
        waitForSeconds(2);
        mouseOver(txtEmailAddressInSignUpPage);
        waitForSeconds(5);
    }

    public boolean verifyEmailAddress() {
        waitForElement(labelEmailAddress);
        return verifyElement(labelEmailAddress);

    }

    public void setTellUsAboutYourBusiness(String strChooseIndustry, String strEmailAddress, String strBusinessVolume) {
        waitForElement(TxtChooseIndustryInSingUppage);
        click(TxtChooseIndustryInSingUppage);
        jsEnterValue(TxtChooseIndustryInSingUppage, strChooseIndustry);
        TxtChooseIndustryInSingUppage.sendKeys(Keys.ENTER);
        waitForElement(txtEmailAddressInSignUpPage);
        txtEmailAddressInSignUpPage.clear();
        enterValue(txtEmailAddressInSignUpPage, strEmailAddress);
        waitForElement(txtBusinessVolumeInSignUpPage);
        jsEnterValue(txtBusinessVolumeInSignUpPage, strBusinessVolume);
    }

    public void clickBtnNextInTellUsAboutYourBusiness() {
        jsClick(btnNextInTellUsAboutYourBusiness);
    }

    public boolean verifyYourSimplePricing() {
        waitForSeconds(2);
        waitForElement(yourSimplePricing);
        return verifyElement(yourSimplePricing);
    }

    public void clickBtnPreviousInYourSimplePricing() {
        click(btnPreviousInYourSimplePricing);
    }

    public void clickbtnNextInYourSimplePricing() {
        click(btnNextInYourSimplePricing);
    }

    public boolean setVerifyCreateYourAccount() {
        waitForElement(verifyCreateYourAccount);
        return verifyElement(verifyCreateYourAccount);
    }

    public void clickBtnPreviousInCreateYourAccount() {
        click(btnPreviousInCreateYourAccount);
    }

    public void enterpassword(String strPassword, String strConfirmPassword) {
        waitForElement(passwordInSignup);
        enterValue(passwordInSignup, strPassword);
        waitForSeconds(3);
        waitForElement(confirmPasswordInSignup);
        System.out.println("element found>>>>>>>>>>>>>>>>>>>>>>>>>>");
        jsEnterValue(confirmPasswordInSignup, strConfirmPassword);
        System.out.println("element entered>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }

    public void eyeIcon() {
        jsClick(passwordEyeIcon);
        jsClick(confirmPasswordEyeIcon);
    }

    public boolean verifyPassword(String strpassword, String strConfirmPassword) {

        String passwordInSignupText = passwordInSignup.getAttribute("value");
        String confirmPasswordText = confirmPasswordInSignup.getAttribute("value");
        System.out.println("System email ::::::" + passwordInSignupText);
        System.out.println("User email :::::::" + strpassword);
        System.out.println("System email ::::::" + confirmPasswordText);
        System.out.println("User email :::::::" + strConfirmPassword);
        if (passwordInSignupText.equals(strpassword) && confirmPasswordText.equals(strConfirmPassword)) {
            return true;
        } else
            return false;
    }

    public void enterpasswordForEnableEyeIcon(String strPassword, String strConfirmPassword) {
        passwordInSignup.clear();
        waitForElement(passwordInSignup);
        enterValue(passwordInSignup, strPassword);
        waitForSeconds(3);
        confirmPasswordInSignup.clear();
        waitForElement(confirmPasswordInSignup);
        System.out.println("element found>>>>>>>>>>>>>>>>>>>>>>>>>>");
        jsEnterValue(confirmPasswordInSignup, strConfirmPassword);
        System.out.println("element entered>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }

    public void enableEyeIcon() {
        jsClick(enablePassword);
        jsClick(enableConfirmPassword);
    }
}

