package paylink.pages;

import cap.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Lead_page extends BasePage {
    public Lead_page(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[text()='Add New']")
    protected WebElement btnAddnew;

    @FindBy(id = "businessname")
    protected WebElement txtBusinessName;

    @FindBy(id = "react-select-3-input")
    protected WebElement txtBusinessType;
    @FindBy(id = "business_email")
    protected WebElement txtBusinessEmail;
    @FindBy(xpath = "//input[@id='business_volume']")
    protected WebElement txtBusinessVolume;
    @FindBy(id = "avgsaleamount")
    protected WebElement txtAvgSalesAmount;
    @FindBy(id = "taxidnumber")
    protected WebElement txtTaxID;
    @FindBy(id = "businessphone")
    protected WebElement txtBusinessPhone;
    @FindBy(id = "businesswebsite")
    protected WebElement Txt_BusinessWebsite;
    @FindBy(xpath = "//button[contains(@class,'button') and text()='Save']")
    protected WebElement btnSave;
    @FindBy(xpath = "//button[text()='Cancel']")
    protected WebElement btnCancel;
    @FindBy(xpath = "//h4[text()='Merchant Lead']")
    protected WebElement verifyCancel;
    @FindBy(xpath = "//i[@class='icon-left-arrow log-arw fntSz20 pl-3 pr-2']")
    protected WebElement btnBack;
    @FindBy(xpath = "//input[@name='search']")
    protected WebElement searchBar;
    @FindBy(xpath = "//div[text()='Sort By']")
    protected WebElement sortBy;
    @FindBy(xpath = "//div[text()='Ascending']")
    protected WebElement Ascending;
    @FindBy(xpath = "//div[text()='Descending']")
    protected WebElement Descending;
    @FindBy(xpath = "//h4[text()='Supreme Interior Design']")
    protected WebElement supremeInteriorDesing;
    @FindBy(xpath = "//h3[text()='General Information']/following::i[@class='icon-edit grd-icon-big side-menu']")
    protected WebElement editBtnInGeneralInformation;
    @FindBy(xpath = "//label[text()='Email Address']/following::input[@type='text' and contains(@id,'react-select')][1]")
    protected WebElement TxtChooseIndustry;
    @FindBy(xpath = "//button[text()='Save']")
    protected WebElement saveBtnInGeneralInformation;
    @FindBy(xpath = "//button[text()='Cancel']")
    protected WebElement cancelBtninGeneralinformation;
    @FindBy(xpath = "//h3[text()='General Information']")
    protected WebElement cancelFunctionalityInGeneralInflormatoin;
    @FindBy(id = "cp-email")
    protected WebElement txtEmailAddress;
    @FindBy(xpath = "//h3[text()='Business Information']/following::i[@class='icon-edit grd-icon-big side-menu']")
    protected WebElement editBtnInBusinessInformation;
    @FindBy(xpath = "//input[@id='merchant_name']")
    protected WebElement businessName1;
    @FindBy(id = "AddressLine1")
    protected WebElement txtAddressLine1;
    @FindBy(id = "AddressLine2")
    protected WebElement txtAddressLine2;
    @FindBy(xpath = "//span[@class='slider round']")
    protected WebElement sliderRound;
    @FindBy(id = "Mailing-Address2")
    protected WebElement myMailingAddress2;
    @FindBy(xpath = "//input[@id='MailingAddress1']")
    protected WebElement myMailingAddress;
    @FindBy(xpath = "//button[text()='Next']")
    protected WebElement nextBtnInBusinessInformation;
    @FindBy(xpath = "//button[text()='Cancel']")
    protected WebElement cancelBtnInBusinessInformation;
    @FindBy(xpath = "//h3[text()='Business Information']")
    protected WebElement BusinessInformation;
    @FindBy(xpath = "//label[text()='TIDEL Park, Rajiv Gandhi IT Expressway, Tharamani, Chennai, Tamil Nadu, India']")
    protected WebElement businessAddress1;
    @FindBy(xpath = "//label[text()='133 East De La Guerra Street, Santa Barbara, CA, USA']")
    protected WebElement mailingAddress;
    @FindBy(xpath = "//h3[text()='Authorized Representative']/following::i[@class='icon-edit grd-icon-big side-menu']")
    protected WebElement editAuthorizedRepresentative;
    @FindBy(xpath = "//h3[text()='Authorized Representative']")
    protected WebElement verifyAuthorizedRepresentative;
    @FindBy(id = "SSN")
    protected WebElement txtSSN;
    @FindBy(xpath = "//input[@type='text' and contains(@id,'Representative-FirstName')]")
    protected WebElement txtFirstName;
    @FindBy(id = "Representative-LastName")
    protected WebElement txtLastName;
    @FindBy(id = "Representative-birthdate")
    protected WebElement txtBirthday;
    @FindBy(id = "Representative-MobileNumber")
    protected WebElement txtMobileNumber;
    @FindBy(id = "Representative-EmailAddress")
    protected WebElement txtEmailAddressInAuthorizedRepresentative;
    @FindBy(id = "Representative-BusinessPosition")
    protected WebElement txtBusinessPosition;
    @FindBy(id = "Representative-OwnerPercentage")
    protected WebElement txtOwnerPercentage;
    @FindBy(id = "Representative-AddressLine1")
    protected WebElement RepresentativeAddressLine1;
    @FindBy(id = "Representative-AddressLine2")
    protected WebElement RepresentativeAddressLine2;
    @FindBy(xpath = "//button[text()='Add Additional Owners']")
    protected WebElement btnAddAdditionalOwners;
    @FindBy(id = "SSN")
    protected WebElement txtSSN1;
    @FindBy(id = "owner1-FirstName")
    protected WebElement txtFirstName1;
    @FindBy(id = "owner1-LastName")
    protected WebElement txtLastName1;
    @FindBy(id = "owner1-birthdate")
    protected WebElement txtBirthday1;
    @FindBy(id = "owner1-MobileNumber")
    protected WebElement txtMobileNumber1;
    @FindBy(id = "owner1-EmailAddress")
    protected WebElement txtEmailAddressInAdditionalOwners;
    @FindBy(id = "owner1-BusinessPosition")
    protected WebElement txtBusinessPosition1;
    @FindBy(id = "owner1-OwnerPercentage")
    protected WebElement txtOwnerPercentage1;
    @FindBy(id = "owner1-AddressLine1")
    protected WebElement ownerAddressLine1;
    @FindBy(id = "owner1-AddressLine2")
    protected WebElement ownerAddressLine2;
    @FindBy(xpath = "//h3[text()='Additional Owner 1']")
    protected WebElement verifyAdditionalOwner;


    protected String newLead = new StringBuilder()
            .append("//h6[text()='")
            .append("<<LEAD>>")
            .append("']").toString();

    public void clickAddnew() {
        waitForElement(btnAddnew);
        jsClick(btnAddnew);
    }

    public void enterLeadDetails(String Business_name, String Business_type, String BusinessEmail, String BusinessVolume, String Average_saleAmount, String Tax_ID, String Business_Phone, String Busines_Website) {
        waitForElement(txtBusinessName);
        waitForSeconds(2);
        enterValue(txtBusinessName, Business_name);
        waitForSeconds(2);
        enterValue(txtBusinessType, Business_type);
        txtBusinessType.sendKeys(Keys.ENTER);
        waitForSeconds(2);
        enterValue(txtBusinessEmail, BusinessEmail);
        waitForElement(txtBusinessVolume);
        jsClick(txtBusinessVolume);
        waitForSeconds(2);
        jsEnterValue(txtBusinessVolume, BusinessVolume);
        waitForSeconds(2);
        enterValue(txtAvgSalesAmount, Average_saleAmount);
        waitForSeconds(2);
        enterValue(txtTaxID, Tax_ID);
        waitForSeconds(2);
        enterValue(txtBusinessPhone, Business_Phone);
        waitForSeconds(2);
        enterValue(Txt_BusinessWebsite, Busines_Website);
    }

    public void clickSaveButton() {
        waitForElement(btnSave);
        click(btnSave);
    }

    public boolean newLeadVerification(String strBusinessName) {
        waitForSeconds(2);
        WebElement Lead = waitForElement(By.xpath(newLead.replace("<<LEAD>>", strBusinessName)));
        System.out.println("New Xpath>>>>>>>" + Lead);
        return verifyElement(Lead);
    }

    public void clickCancel() {
        click(btnCancel);
    }

    public boolean verifyCancelButton() {
        waitForElement(verifyCancel);
        return verifyElement(verifyCancel);
    }

    public void clickBackButton() {
        click(btnBack);
    }

    public void enterValueInSearchBarInLeadPage(String strSearchInLead) {
        waitForElement(searchBar);
        enterValue(searchBar, strSearchInLead);
    }

    protected String searchLead = new StringBuilder()
            .append("//h6[text()='")
            .append("<<SEARCHLEAD>>")
            .append("']").toString();

    public boolean searchLeadVerification(String strSearchInLead) {
        waitForSeconds(2);
        WebElement leadSearch = waitForElement(By.xpath(searchLead.replace("<<SEARCHLEAD>>", strSearchInLead)));
        System.out.println("New Xpath>>>>>>>" + leadSearch);
        return verifyElement(leadSearch);
    }

    public void setSortBy() {
        click(sortBy);
    }

    public void setAscending() {
        click(Ascending);
    }

    public void setDescending() {
        waitForSeconds(2);
        click(Descending);
    }

    public boolean verifySupremeInteriorDesign() {
        waitForElement(supremeInteriorDesing);
        return verifyElement(supremeInteriorDesing);
    }

    public void clickExistingLead(String strSearchInLead) {
        waitForSeconds(2);
        WebElement leadSearch = waitForElement(By.xpath(searchLead.replace("<<SEARCHLEAD>>", strSearchInLead)));
        System.out.println("New Xpath>>>>>>>" + leadSearch);
        click(leadSearch);
    }

    public void clickEditBtnInGeneralInformation() {
        jsClick(editBtnInGeneralInformation);
    }

    public void enterDataInGeneralInformation(String strEmailAddress, String strChooseIndustry, String strEstimatedMonthlyProcessingVolume)
    {
        waitForElement(txtEmailAddress);
        txtEmailAddress.clear();
        jsEnterValue(txtEmailAddress, strEmailAddress);
        waitForElement(TxtChooseIndustry);
        jsClick(TxtChooseIndustry);
        jsEnterValue(TxtChooseIndustry, strChooseIndustry);
        TxtChooseIndustry.sendKeys(Keys.ENTER);
        waitForElement(txtBusinessVolume);
        jsClick(txtBusinessVolume);
        jsEnterValue(txtBusinessVolume, strEstimatedMonthlyProcessingVolume);

    }

    public void clickSaveBtnInGeneralInformation() {
        click(saveBtnInGeneralInformation);
    }
/*    protected String emailAddress = new StringBuilder()
            .append("//h6[text()='")
            .append("<<SEARCHLEAD>>")
            .append("']").toString();
    //input[@field-not-empty='true']
    public boolean verifyGeneralInformation(String strEmailAddress) {
        waitForSeconds(2);
        WebElement EmailAddress = waitForElement(By.xpath(emailAddress.replace("<<SEARCHLEAD>>", strEmailAddress)));
        System.out.println("New Xpath>>>>>>>" + EmailAddress);
        return verifyElement(EmailAddress);
    }*/

    public boolean verifyGeneralInformation(String strEmailAddress) {
        click(txtBusinessEmail);
        String emailAddress = txtBusinessEmail.getText();
        System.out.println("System email ::::::" + emailAddress);
        System.out.println("User email :::::::" + strEmailAddress);
        if (emailAddress.contains(strEmailAddress)) {
            return true;
        } else
            return false;
    }

    public void clickCancelBtninGeneralinformation() {
        click(cancelBtninGeneralinformation);
    }

    public boolean verifyCancelFunctionalityInGeneralInflormatoin() {
        waitForElement(cancelFunctionalityInGeneralInflormatoin);
        return verifyElement(cancelFunctionalityInGeneralInflormatoin);
    }

    public void clickEditBtnInBusinessInformation() {
        jsClick(editBtnInBusinessInformation);
    }

    public void enterDataInBusinessInformation(String strBusinessname1, String strAddressLine1, String strAddressLine2) {
        waitForElement(businessName1);
        enterValue(businessName1, strBusinessname1);
        System.out.println(">>>>>>>.>>>>>>>>>>>>>>>>>>");
        waitForElement(txtAddressLine1);
        System.out.println("address...............");
        waitForSeconds(8);
        enterValue(txtAddressLine1, strAddressLine1);
        click(businessAddress1);
        enterValue(txtAddressLine2, strAddressLine2);
    }

    public void clickNextInBusinessInformation() {
        click(nextBtnInBusinessInformation);
    }

    public void enableSliderRound() {
        click(sliderRound);
    }

    public void enterDataInMyMailingAddress(String strMailingAddress) {
        waitForElement(myMailingAddress);
        jsEnterValue(myMailingAddress, strMailingAddress);
        click(mailingAddress);
        waitForSeconds(5);
    }

    public boolean verifyBusinessInformation(String strBusinessName1) {

        click(businessName1);
        String emailAddress = businessName1.getText();
        System.out.println("System email ::::::" + emailAddress);
        System.out.println("User email :::::::" + strBusinessName1);
        if (emailAddress.contains(strBusinessName1)) {
            return true;
        } else
            return false;
    }

    public void clickBtncancelInBusinessInformation() {
        click(cancelBtnInBusinessInformation);
    }

    public boolean verifyBusinessInformation() {
        waitForElement(BusinessInformation);
        return verifyElement(BusinessInformation);
    }

    public void clickEditInAuthorizedRepresentativePage() {
        click(editAuthorizedRepresentative);
    }

    public boolean verifyAuthorizedRepresentativePage() {
        waitForElement(verifyAuthorizedRepresentative);
        return verifyElement(verifyAuthorizedRepresentative);
    }

    public void entervalueInAuthorizedRepresentative(String strSSN, String strFirstName, String strLastName, String strBirthday, String strMobileName, String strEmailAddress, String strPosition, String strOwnerShipPercentage, String strHomeAddressLine1, String strHomeAddressLine2) {
        waitForElement(txtSSN);
        enterValue(txtSSN, strSSN);
        waitForElement(txtFirstName);
        jsEnterValue(txtFirstName, strFirstName);
        waitForElement(txtLastName);
        enterValue(txtLastName, strLastName);
        waitForElement(txtBirthday);
        enterValue(txtBirthday, strBirthday);
        waitForElement(txtMobileNumber);
        enterValue(txtMobileNumber, strMobileName);
        waitForElement(txtEmailAddressInAuthorizedRepresentative);
        enterValue(txtEmailAddressInAuthorizedRepresentative, strEmailAddress);
        waitForElement(txtBusinessPosition);
        enterValue(txtBusinessPosition, strPosition);
        waitForElement(txtOwnerPercentage);
        enterValue(txtOwnerPercentage, strOwnerShipPercentage);
        waitForElement(RepresentativeAddressLine1);
        enterValue(RepresentativeAddressLine1, strHomeAddressLine1);
        click(businessAddress1);
        waitForElement(RepresentativeAddressLine2);
        enterValue(RepresentativeAddressLine2, strHomeAddressLine2);
    }

    public void clickBtnAdditionalOwner() {
        click(btnAddAdditionalOwners);
    }

    public boolean verifyAdditionalOwner() {
        waitForElement(verifyAdditionalOwner);
        return verifyElement(verifyAdditionalOwner);
    }

    public void entervalueInAdditionalOwnerPage(String strSSN1, String strFirstName1, String strLastName1, String strBirthday1, String strMobileName1, String strEmailAddress1, String strPosition1, String strOwnerShipPercentage1, String strOwnerAddress1, String strOwnerAddress2) {
        waitForElement(txtSSN1);
        enterValue(txtSSN1, strSSN1);
        waitForElement(txtFirstName1);
        jsEnterValue(txtFirstName1, strFirstName1);
        waitForElement(txtLastName1);
        enterValue(txtLastName1, strLastName1);
        waitForElement(txtBirthday1);
        enterValue(txtBirthday1, strBirthday1);
        waitForElement(txtMobileNumber1);
        enterValue(txtMobileNumber1, strMobileName1);
        waitForElement(txtEmailAddressInAdditionalOwners);
        enterValue(txtEmailAddressInAdditionalOwners, strEmailAddress1);
        waitForElement(txtBusinessPosition1);
        enterValue(txtBusinessPosition1, strPosition1);
        waitForElement(txtOwnerPercentage1);
        enterValue(txtOwnerPercentage1, strOwnerShipPercentage1);
        waitForElement(ownerAddressLine1);
        enterValue(ownerAddressLine1, strOwnerAddress1);
        waitForElement(ownerAddressLine2);
        enterValue(ownerAddressLine2, strOwnerAddress2);
    }

}
