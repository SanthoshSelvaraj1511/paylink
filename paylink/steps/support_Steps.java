package paylink.steps;

import cap.utilities.TestDataUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import paylink.PageInitializer;

public class support_Steps {
    private PageInitializer pageInitializer;

    public support_Steps(PageInitializer pageInitializer) {

        this.pageInitializer = pageInitializer;
    }
    @Then("I should verify the Leads page")
    public void iShouldVerifyTheLeadsPage() {
        Assert.assertTrue(pageInitializer.loginPage.verifyLeadPage());

    }
    @Given("I am on Support page")
    public void iAmOnSupportPage() {
        pageInitializer.supportpage.clickSupport();
        Assert.assertTrue(pageInitializer.supportpage.verifySupportPage());
    }

    @And("I Click Add New Button in support page")
    public void iClickAddNewButtonInSupportPage() {
        pageInitializer.supportpage.addNewSupport();
    }
    @When("I enter the data for New Tickets{string} {string} {string} {string} {string} {string} {string} And I Click save button")
    public void iEnterTheDataForNewTicketsAndIClickSaveButton(String strtitle, String strDescription, String strCategory, String strSubCategory, String strMerchant, String strAssignedTo, String ChooseFile) throws InterruptedException {


        pageInitializer.supportpage.supportEnterData(TestDataUtil.getValue(strtitle)
                , TestDataUtil.getValue(strDescription)
                , TestDataUtil.getValue(strCategory)
                , TestDataUtil.getValue(strSubCategory)
                , TestDataUtil.getValue(strMerchant)
                , TestDataUtil.getValue(strAssignedTo)
                , TestDataUtil.getValue(ChooseFile));
        pageInitializer.supportpage.clickSaveTicket();
    }
    @Then("I should see the newly added ticket by {string}")
    public void iShouldSeeTheNewTickets(String strticket) {

        Assert.assertTrue(pageInitializer.supportpage.newticketVerification(TestDataUtil.getValue(strticket)));
    }
    @When("I click On the add new button")
    public void iClickOnTheAddNewButton() {
        pageInitializer.supportpage.addNewSupport();
    }
    @Then("I should verify the add new ticket page")
    public void iShouldVerifyTheAddNewTicketPage() {
        Assert.assertTrue(pageInitializer.supportpage.verifyAddNewTicketPage());
    }
    @Given("I am in add new ticket page")
    public void iAmInAddNewTicketPage() {
        Assert.assertTrue(pageInitializer.supportpage.verifyAddNewTicketPage());
    }
    @When("I click on the back button in add new ticket page")
    public void iClickOnTheBackButtonInAddNewTicketPage() {
        pageInitializer.supportpage.setClickBackButtonInAddNewTicketPage();
    }
    @Then("I should move back to the support page")
    public void iShoulbMoveBackToTheSupportPage() {
        Assert.assertTrue(pageInitializer.supportpage.verifySupportPage());
    }
    @When("I click on add new button and click cancel button in add new ticket page")
    public void iClickOnAddNewButtonAndClickCancelButtonInAddNewTicketPage() {
        pageInitializer.supportpage.addNewSupport();
        pageInitializer.supportpage.setBtnCancelInAddNewTicketPage();
    }
    @When("I enter search {string} in search bar")
    public void iEnterSearchInSearchBar(String strTicket) {
        pageInitializer.supportpage.enterValueInSearchBar(TestDataUtil.getValue(strTicket));
    }


    @Then("I should see the corresponding search result {string} in support page")
    public void iShouldSeeTheCorrespondingSearchResultInSupportPage(String strticket) {
        Assert.assertTrue(pageInitializer.supportpage.newticketVerification(TestDataUtil.getValue(strticket)));
    }
    @When("I click sort button and click ascending in support page")
    public void iClickSortButtonAndClickAscendingInSupportPage() {
        pageInitializer.supportpage.setSortBy();
        pageInitializer.supportpage.setClickAscending();
    }
    @Then("I should see the tickets {string} in ascending order")
    public void iShouldSeeTheTicketsInAscendingOrder(String strticket) {
        Assert.assertTrue(pageInitializer.supportpage.newticketVerification(TestDataUtil.getValue(strticket)));
    }

    @When("I click sort button and click descending in support page")
    public void iClickSortButtonAndClickDescendingInSupportPage() {
        pageInitializer.supportpage.setClickAscending();
        pageInitializer.supportpage.setClickDescending();
    }

    @Then("I should see the tickets in {string} descending order")
    public void iShouldSeeTheTicketsInDescendingOrder(String strticket) {
        Assert.assertTrue(pageInitializer.supportpage.newticketVerification(TestDataUtil.getValue(strticket)));

    }
    @And("I Click on the Ticket {string} in Tickets Page")
    public void iClickOnTheTicketTITLEInTicketsPage(String strTicket) {
        pageInitializer.supportpage.clickNewticketVerification(TestDataUtil.getValue(strTicket));
    }
    @When("I Edit The {string} with new {string} in edit ticket page")
    public void iEditTheInEditTicketPage(String strClickTicket, String editTitle) {
        pageInitializer.supportpage.editCreatedTicket(TestDataUtil.getValue(strClickTicket),TestDataUtil.getValue (editTitle));
        pageInitializer.supportpage.clickOnSaveInEditSupport();
    }
    @Then("I should see the Edited Ticket with new {string}")
    public void iShouldSeeTheEditedTicket(String strEticket) {
        Assert.assertTrue(pageInitializer.supportpage.editTicketVerification(TestDataUtil.getValue(strEticket)));
    }
    @Given("I am in existing Ticket page {string} in Support")
    public void iAmInExistingTicketPageInSupport(String strEticket) {
        Assert.assertTrue(pageInitializer.supportpage.editTicketVerification(TestDataUtil.getValue(strEticket)));
    }
    @When("I click edit {string} and click cancel button")
    public void iClickEditAndClickCancelButton(String strClickTicket) {
        pageInitializer.supportpage.cancelInEditTicket(TestDataUtil.getValue(strClickTicket));
        pageInitializer.supportpage.setClickCancelButtonInEditTicketPage();

    }
    @Then("The edit ticket page {string} should close")
    public void theEditTicketPageShouldClose(String strEticket) {
        Assert.assertTrue(pageInitializer.supportpage.editTicketVerification(TestDataUtil.getValue(strEticket)));
    }
    @When("I click edit {string} and click back button")
    public void iClickEditAndClickBackButton(String strClickTicket) {
        pageInitializer.supportpage.cancelInEditTicket(TestDataUtil.getValue(strClickTicket));
        pageInitializer.supportpage.setClickBackButtonInEditTicketPage();
    }
    @When("I add {string} document")
    public void iAddDocument(String strAttachment) {
        pageInitializer.supportpage.addAttachment(TestDataUtil.getValue(strAttachment));
    }
    @Then("I should see the added attachment")
    public void iShouldSeeTheAddedAttachment() {

    }
    @When("I click edit {string} and click members")
    public void iClickEditAndClickMembers(String strClickTicket) {
        pageInitializer.supportpage.memberInEditTicketPage(TestDataUtil.getValue(strClickTicket));
        pageInitializer.supportpage.setMemberInEditTicketPage();
    }
    @Then("I should see the member page")
    public void iShouldSeeTheMemberPage() {
        Assert.assertTrue(pageInitializer.supportpage.verifyMemberPage());
    }

    @Given("I am in member page")
    public void iAmInMemberApge() {
        Assert.assertTrue(pageInitializer.supportpage.verifyMemberPage());
    }
    @When("I enter value member text field {string} in member page")
    public void iEnterValueMemberTextFieldInMemberPage(String strMember) {
        pageInitializer.supportpage.enterMember(TestDataUtil.getValue(strMember));
        pageInitializer.supportpage.clickMember(TestDataUtil.getValue(strMember));

    }

    @Then("I should see the {string} corresponding member")
    public void iShouldSeeTheCorrespondingMember(String strMember) {
        Assert.assertTrue(pageInitializer.supportpage.verifyEditMember(TestDataUtil.getValue(strMember)));
    }
    @When("I enter the value {string} in Assigned to text field")
    public void iEnterTheVaueInAssignedToTextField(String strAssignedMember) {
        pageInitializer.supportpage.enterAssignedMember(TestDataUtil.getValue(strAssignedMember));
        pageInitializer.supportpage.clickAssignedMember(TestDataUtil.getValue(strAssignedMember));
    }

    @Then("I should see the {string} corresponding Assigned member")
    public void iShouldSeeTheCorrespondingAssignedMember(String strAssignedMember) {
        Assert.assertTrue(pageInitializer.supportpage.verifyEditAssignedMember(TestDataUtil.getValue(strAssignedMember)));
    }

    @When("I delete {string} the member")
    public void userDeleteTheMember(String strMember) {
        pageInitializer.supportpage.clickDeleteMember(TestDataUtil.getValue(strMember));
    }


    @Then("The member {string} should delete")
    public void theMemberShouldDelete(String strDeletedMember) {
        Assert.assertTrue(pageInitializer.supportpage.verifyDeletedMember(TestDataUtil.getValue(strDeletedMember)));
    }

    @When("I delete {string} the Assigned member")
    public void userDeleteTheAssignedMember(String strDeleteAssignedMember) {
        pageInitializer.supportpage.clickDeleteAssignedMember(TestDataUtil.getValue(strDeleteAssignedMember));
    }

    @Then("The Assigned member {string} should delete")
    public void theAssignedMemberShouldDelete(String verifyDeletedAssignedMember) {
        Assert.assertTrue(pageInitializer.supportpage.verifyDeletedAssignedMember(verifyDeletedAssignedMember));
    }
    @When("I click on the back button in member page")
    public void iClickOnTheBackButtonInMemberPage() {
        pageInitializer.supportpage.btnBackInMemberPage();
    }
    @Then("I should move back to the {string} existing ticket page")
    public void iShouldMoveBackToTheExistingTicketPage(String strEticket) {
        Assert.assertTrue(pageInitializer.supportpage.editTicketVerification(TestDataUtil.getValue(strEticket)));
    }
    @When("I click on the member in existing ticket page")
    public void iClickOnTheMemberInSupportPage() {
        pageInitializer.supportpage.setClickMemberInExistingTicketPage();
    }
    @Then("I should navigate to member page")
    public void iShouldNavigateToMemberPage() {
        Assert.assertTrue(pageInitializer.supportpage.navMemberPage());
    }
    @Given("I am in a member dashboard page")
    public void iAmInAMemberPage() {
        Assert.assertTrue(pageInitializer.supportpage.navMemberPage());
    }
    @When("I click on edit in member")
    public void iClickOnEditInMember() {
        pageInitializer.supportpage.setClickEidtInMember();
    }
    @When("I click on edit in Assigned member")
    public void iClickOnEditInAssignedMember() {
        pageInitializer.supportpage.setClickEditInAssignedMember();
    }

    @Then("I naviagte to the member dashBoard page")
    public void iNaviagteToTheMemberDashBoardPage() {
        Assert.assertTrue(pageInitializer.supportpage.navMemberPage());
    }

    @When("I ckick on the communication")
    public void iCkickOnTheCommunication() {
        pageInitializer.supportpage.setClickCommunication();
    }

    @Then("User verify the communication page")
    public void userVerifyTheCommunicationPage() {
        Assert.assertTrue(pageInitializer.supportpage.setVerifyCommunicationPage());

    }

    @Given("I am in communication page")
    public void iAmInCommunicationPage() {
        Assert.assertTrue(pageInitializer.supportpage.setVerifyCommunicationPage());

    }

    @When("I click on new Email and click cancel icon in email card")
    public void iClickOnNewEmailAndClickCancelIconInEmailCard() {
        pageInitializer.supportpage.clickNewEmail();
        pageInitializer.supportpage.clickCancelIconInEmail();
    }

    @Then("The email card should close")
    public void theEmailCardShouldClose() {
        Assert.assertTrue(pageInitializer.supportpage.setVerifyCommunicationPage());
    }
}
