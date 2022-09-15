package paylink.pages;

import cap.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.File;

public class supportPage extends BasePage {
    public supportPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[normalize-space()='Support']")
    protected WebElement btnSupport;

    @FindBy(xpath = "//button[@type='button']")
    protected WebElement btnAddNewSupport;

    @FindBy(xpath = "//b[text()='Support']")
    protected WebElement verifySupport;

    @FindBy(id = "title")
    protected WebElement txtTitle;

    @FindBy(id = "description")
    protected WebElement txtDescription;

    @FindBy(xpath = "//textarea[@id='description']/following::input[1]")
    protected WebElement txtCategory;

    @FindBy(xpath = "//label[normalize-space()='Sub Category']//preceding::input[@type='text' and contains(@id,'react-select')][1]")
    protected WebElement subCategory;

    @FindBy(xpath = "//label[normalize-space()='Merchant']//preceding::input[@type='text' and contains(@id,'react-select')][1]")
    protected WebElement txtMerchant;

    @FindBy(xpath = "//label[normalize-space()='Assigned To']//preceding::input[@type='text' and contains(@id,'react-select')][1]")
    protected WebElement txtAssignedTo;

    @FindBy(xpath = "//input[@type='file']")
    protected WebElement chooseFile;

    @FindBy(xpath = "//button[text()='Save']")
    protected WebElement saveTicket;

    @FindBy(xpath = "//li[normalize-space()='Edit']")
    protected WebElement clickEditIcon;

    @FindBy(xpath = "//h4[text()='Add New Ticket']")
    protected WebElement verifyAddNewTicketPage;

    @FindBy(xpath = "//i[@class='icon-left-arrow log-arw fntSz20 pl-3 pr-2']")
    protected WebElement clickBackButtonInAddNewTicketPage;

    @FindBy(xpath = "//h4[text()='Add New Ticket']/following::button[.='Cancel']")
    protected WebElement btnCancelInAddNewTicketPage;

    @FindBy(xpath = "//input[@type='search']")
    protected WebElement txtSearch;

    @FindBy(xpath = "//div[text()='Sort By']")
    protected WebElement sortBy;

    @FindBy(xpath = "//div[text()='Ascending']")
    protected WebElement clickAscending;

    @FindBy(xpath = "//div[text()='Descending']")
    protected WebElement clickDescending;

    @FindBy(xpath = "//i[@class='icon-left-arrow log-arw fntSz20 pl-3 pr-2']")
    protected WebElement clickBackButtonInEditTicketPage;

    @FindBy(xpath = "//h4[text()='Edit Ticket']/following::button[.='Cancel']")
    protected WebElement clickCancelButtonInEditTicketPage;

    @FindBy(xpath = "//li[@class='popup_icon_cont_member']")
    protected WebElement MemberInEditTicketPage;

    @FindBy(xpath = "//div[normalize-space()='Members']")
    protected WebElement verifyMemberPage;

    @FindBy(id = "member-search")
    protected WebElement txtMember;

    @FindBy(xpath = "//input[@name='Assign To']")
    protected WebElement txtAssignedMember;

    @FindBy(xpath = "//i[@class='icon-down-arrow com-arw']")
    protected WebElement btnBackInMember;

    @FindBy(xpath = "//input[@id='support-attachment']")
    protected WebElement addAttachment;

    @FindBy(xpath = "//a[text()='Members']")
    protected WebElement clickMemberInExistingTicketPage;

    @FindBy(xpath = "//h3[text()='Members']")
    protected WebElement getVerifyMemberPage;

    @FindBy(xpath = "//h3[text()='Assigned To']")
    protected WebElement getVerifyMemberPage1;

    @FindBy(xpath = "//h3[text()='Members']/following::i[@class='icon-edit grd-icon-big side-menu'][1]")
    protected WebElement clickEditInMember;

    @FindBy(xpath = "//h3[text()='Assigned To']/following::i[@class='icon-edit grd-icon-big side-menu']")
    protected WebElement clickEditInAssignedMember;

    @FindBy(xpath = "//a[text()='Communications']")
    protected WebElement clickCommunication;

    @FindBy(xpath = "//h4[text()='Communications']")
    protected WebElement verifyCommunication;

    @FindBy(xpath = "//span[text()='New Email']")
    protected WebElement btnNewEmail;

    @FindBy(xpath = "//i[@class='icon-cir-cross pointer']")
    protected WebElement cancelIconInEmail;

    @FindBy(xpath = "//a[text()='SMS']")
    protected WebElement btnSMS;


    public void clickSupport() {
        click(btnSupport);
    }

    public boolean verifySupportPage() {
        waitForElement(verifySupport);
        return verifyElement(verifySupport);
    }

    public void addNewSupport() {
        jsClick(btnAddNewSupport);
    }

    public boolean verifyAddNewTicketPage() {
        waitForElement(verifyAddNewTicketPage);
        return verifyElement(verifyAddNewTicketPage);
    }

    public void supportEnterData(String Title, String Description, String Category, String SubCategory, String Merchant, String AssignedTo, String ChooseFile) throws InterruptedException {
        waitForElement(txtTitle);
        jsClick(txtTitle);
        System.out.println("title>>>>>>" + Title);
        jsEnterValue(txtTitle, Title);
        jsEnterValue(txtDescription, Description);
        jsEnterValue(txtCategory, Category);
        txtCategory.sendKeys(Keys.ENTER);
        jsEnterValue(subCategory, SubCategory);
        jsClick(subCategory);
        subCategory.sendKeys(Keys.ENTER);
        jsEnterValue(txtMerchant, Merchant);
        txtMerchant.sendKeys(Keys.ENTER);
        jsEnterValue(txtAssignedTo, AssignedTo);
        txtAssignedTo.sendKeys(Keys.ENTER);
        chooseFile.sendKeys(getFile4(ChooseFile));
    }

    String getFile4(String strFileName) {
        String FilePath = new StringBuilder()
                .append("Documents/")
                .append(strFileName)
                .toString();
        System.out.println("filePath>>>>>" + FilePath);
        return new File(FilePath).getAbsolutePath();
    }

    public void clickSaveTicket() {
        jsClick(saveTicket);
    }

    public void setClickBackButtonInAddNewTicketPage() {
        jsClick(clickBackButtonInAddNewTicketPage);
    }

    public void setBtnCancelInAddNewTicketPage() {
        click(btnCancelInAddNewTicketPage);
    }

    protected String CreatedTicket = new StringBuilder()
            .append("//h6[text()='")
            .append("<<TICKET>>")
            .append("']").toString();

    public boolean newticketVerification(String strTicket) {
        waitForSeconds(2);
        WebElement Tickets = waitForElement(By.xpath(CreatedTicket.replace("<<TICKET>>", strTicket)));
        System.out.println("New Xpath>>>>>>>" + Tickets);
        return verifyElement(Tickets);
    }

    public void clickNewticketVerification(String strticket) {
        waitForSeconds(2);
        WebElement Tickets = waitForElement(By.xpath(CreatedTicket.replace("<<TICKET>>", strticket)));
        System.out.println("New Xpath>>>>>>>" + Tickets);
        jsClick(Tickets);
    }

    protected String ClickEllipsis = new StringBuilder()
            .append("//h3[text()='")
            .append("<<NEWTICKET>>")
            .append("']/following::i[@class='icon-status1 status dropbtn']").toString();


    public void editCreatedTicket(String strEllipsis, String editTitle) {
        waitForSeconds(2);
        WebElement clickEllpsis = waitForElement(By.xpath(ClickEllipsis.replace("<<NEWTICKET>>", strEllipsis)));
        System.out.println("New Xpath>>>>>>>" + clickEllpsis);
        jsClick(clickEllpsis);
        jsClick(clickEditIcon);
        jsEnterValue(txtTitle, editTitle);
    }

    public void cancelInEditTicket(String strEllipsis) {
        waitForSeconds(2);
        WebElement clickEllpsis = waitForElement(By.xpath(ClickEllipsis.replace("<<NEWTICKET>>", strEllipsis)));
        System.out.println("New Xpath>>>>>>>" + clickEllpsis);
        jsClick(clickEllpsis);
        jsClick(clickEditIcon);

    }

    public void memberInEditTicketPage(String strEllipsis) {
        waitForSeconds(2);
        WebElement clickEllpsis = waitForElement(By.xpath(ClickEllipsis.replace("<<NEWTICKET>>", strEllipsis)));
        System.out.println("New Xpath>>>>>>>" + clickEllpsis);
        jsClick(clickEllpsis);
    }

    public void clickOnSaveInEditSupport() {
        jsScroll();
        jsClick(saveTicket);
    }

    public void setClickCancelButtonInEditTicketPage() {
        jsScroll();
        click(clickCancelButtonInEditTicketPage);
    }

    public void setClickBackButtonInEditTicketPage() {
        jsScroll();
        click(clickBackButtonInEditTicketPage);
    }

    public void setMemberInEditTicketPage() {
        click(MemberInEditTicketPage);
    }

    protected String EticketVerification = new StringBuilder()
            .append("//h3[text()='")
            .append("<<ETICKET>>")
            .append("']").toString();

    public boolean editTicketVerification(String Eticketver) {
        waitForSeconds(2);
        WebElement Eticket = waitForElement(By.xpath(EticketVerification.replace("<<ETICKET>>", Eticketver)));
        System.out.println("New Xpath>>>>>>>" + Eticket);
        return verifyElement(Eticket);
    }

    public void enterValueInSearchBar(String strSearch) {
        waitForElement(txtSearch);
        enterValue(txtSearch, strSearch);
    }

    public void setSortBy() {
        click(sortBy);
    }

    public void setClickAscending() {
        click(clickAscending);
    }

    public void setClickDescending() {
        click(clickDescending);
    }

    public boolean verifyMemberPage() {
        waitForElement(verifyMemberPage);
        return verifyElement(verifyMemberPage);
    }

    public void enterMember(String strMember) {
        waitForElement(txtMember);
        enterValue(txtMember, strMember);
    }

    protected String Member = new StringBuilder()
            .append("//label[.='Search Member']/following::label[text()='")
            .append("<<MEMBER>>")
            .append("'][1]").toString();

    public void clickMember(String member) {
        waitForSeconds(2);
        WebElement Editmember = waitForElement(By.xpath(Member.replace("<<MEMBER>>", member)));
        System.out.println("New Xpath>>>>>>>" + Editmember);
        click(Editmember);
    }

    protected String verifyMember = new StringBuilder()
            .append("//h3[text()='")
            .append("<<VERIFYMEMBER>>")
            .append("']").toString();

    public boolean verifyEditMember(String VerifyMember) {
        waitForSeconds(2);
        WebElement verifyEditMember = waitForElement(By.xpath(verifyMember.replace("<<VERIFYMEMBER>>", VerifyMember)));
        System.out.println("New Xpath>>>>>>>" + verifyEditMember);
        return verifyElement(verifyEditMember);
    }

    public void enterAssignedMember(String strAssignedMember) {
        waitForElement(txtAssignedMember);
        enterValue(txtAssignedMember, strAssignedMember);
    }

    protected String assignedMember = new StringBuilder()
            .append("//label[text()='Assign To']/following::label[text()='")
            .append("<<ASSIGNEDMEMBER>>")
            .append("']").toString();

    public void clickAssignedMember(String member) {
        waitForSeconds(2);
        WebElement EditAssignedmember = waitForElement(By.xpath(assignedMember.replace("<<ASSIGNEDMEMBER>>", member)));
        System.out.println("New Xpath>>>>>>>" + EditAssignedmember);
        click(EditAssignedmember);
    }

    protected String verifyAssignedMember = new StringBuilder()
            .append("//h3[text()='")
            .append("<<VERIFYASSIGNEDMEMBER>>")
            .append("']").toString();

    public boolean verifyEditAssignedMember(String VerifyAssignedMember) {
        waitForSeconds(2);
        WebElement verifyEditAssignedmember = waitForElement(By.xpath(verifyAssignedMember.replace("<<VERIFYASSIGNEDMEMBER>>", VerifyAssignedMember)));
        System.out.println("New Xpath>>>>>>>" + verifyEditAssignedmember);
        return verifyElement(verifyEditAssignedmember);
    }

    public void btnBackInMemberPage() {
        waitForElement(btnBackInMember);
        click(btnBackInMember);
    }

    protected String deleteMember = new StringBuilder()
            .append("//h3[text()='")
            .append("<<DELETEMEMBER>>")//h3[text()='subin.archunan@codoid.com']/following::i[@class='icon-delete delete'][1]
            .append("']/following::i[@class='icon-delete delete'][1]").toString();

    public void clickDeleteMember(String verifyDeleteMember) {
        waitForSeconds(2);
        WebElement verifyDeletemember = waitForElement(By.xpath(deleteMember.replace("<<DELETEMEMBER>>", verifyDeleteMember)));
        System.out.println("New Xpath>>>>>>>" + verifyDeletemember);
        click(verifyDeletemember);
    }

    public boolean verifyDeletedMember(String verifyDeletedMember) {
        waitForSeconds(2);
        By by = By.xpath(verifyMember.replace("<<VERIFYMEMBER>>", verifyDeletedMember));
        waitForSeconds(3);
        return notVerifyElement(driver, by);

    }

    protected String deleteAssignedMember = new StringBuilder()
            .append("//h3[text()='")
            .append("<<DELETEASSIGNEDMEMBER>>")
            .append("']/following::i[@class='icon-delete delete'][1]").toString();

    public void clickDeleteAssignedMember(String VerifyDeleteAssignedMember) {
        waitForSeconds(2);
        WebElement verifyDeleteAsssignedMember = waitForElement(By.xpath(deleteAssignedMember.replace("<<DELETEASSIGNEDMEMBER>>", VerifyDeleteAssignedMember)));
        System.out.println("New Xpath>>>>>>>" + verifyDeleteAsssignedMember);
        click(verifyDeleteAsssignedMember);
    }

    public boolean verifyDeletedAssignedMember(String verifyDeletedAssignedMember) {
        waitForSeconds(2);
        By by = By.xpath(verifyAssignedMember.replace("<<VERIFYASSIGNEDMEMBER>>", verifyDeletedAssignedMember));
//        System.out.println("New Xpath>>>>>>>" + VerifyDeletedAssignedMember);
        return notVerifyElement(driver,by);
    }

    public void setClickMemberInExistingTicketPage() {
        waitForElement(clickMemberInExistingTicketPage);
        click(clickMemberInExistingTicketPage);
    }

    public boolean navMemberPage() {
        waitForElement(getVerifyMemberPage);
        return verifyElement(getVerifyMemberPage);
    }

    public void setClickEidtInMember() {
        click(clickEditInMember);
    }

    public void setClickEditInAssignedMember() {
        click(clickEditInAssignedMember);
    }

    public void addAttachment(String strAttachment) {
        click(addAttachment);
        waitForElement(addAttachment);
        uploadFile(addAttachment, strAttachment);
        System.out.println("added>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

    }
    public void setClickCommunication(){
        click(clickCommunication);
    }

    public boolean setVerifyCommunicationPage(){
        waitForElement(verifyCommunication);
        return verifyElement(verifyCommunication);
    }

    public void clickNewEmail(){
        waitForElement(btnNewEmail);
        click(btnNewEmail);
    }

    public void clickCancelIconInEmail(){
        waitForElement(cancelIconInEmail);
        click(cancelIconInEmail);
    }


}
