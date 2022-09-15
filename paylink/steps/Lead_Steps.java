package paylink.steps;

import cap.helpers.Constants;
import cap.utilities.RandomGeneratorUtil;
import cap.utilities.TestDataUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import paylink.PageInitializer;

public class Lead_Steps {
    private PageInitializer pageInitializer;

    public Lead_Steps(PageInitializer pageInitializer) {

        this.pageInitializer = pageInitializer;
    }

    @Given("I am on Lead Page")
    public void iAmOnLeadPage() {
        Assert.assertTrue(pageInitializer.homePage.leadPageVerify());
    }

    @And("I Click Add New in Lead page")
    public void iClickAddNewInLeadPage() {
        pageInitializer.leadpage.clickAddnew();
    }

    @When("I enter the {string} {string} {string} {string} {string} {string} {string} {string} and Click Save button")
    public void iEnterTheAndClickSaveButton(String Business_name, String Business_type, String BusinessEmail, String BusinessVolume, String Average_saleAmount, String Tax_ID, String Business_Phone, String Busines_Website) {

        String BusinessNewEmail = "";
        if (BusinessEmail.contains(Constants.RANDOM_STRING)) {
            BusinessNewEmail = new StringBuilder().append(TestDataUtil.getValue(BusinessEmail))
                    .append(RandomGeneratorUtil.getExecutionIDOne()).append(Constants.MAILNATOR).toString();
        }
        pageInitializer.leadpage.enterLeadDetails(TestDataUtil.getValue(Business_name)
                , TestDataUtil.getValue(Business_type)
                , TestDataUtil.getValue(BusinessNewEmail)
                , TestDataUtil.getValue(BusinessVolume)
                , TestDataUtil.getValue(Average_saleAmount)
                , TestDataUtil.getValue(Tax_ID)
                , TestDataUtil.getValue(Business_Phone)
                , TestDataUtil.getValue(Busines_Website));
        pageInitializer.leadpage.clickSaveButton();
    }

    @Then("I should see the newly added {string} lead")
    public void iShouldSeeTheNewlyAddedLead(String strBusinessName) {
        Assert.assertTrue(pageInitializer.leadpage.newLeadVerification(TestDataUtil.getValue(strBusinessName)));
    }

    @When("I Click Add New in Lead page and I click cancel button")
    public void iClickAddNewInLeadPageAndIClickCancelButton() {
        pageInitializer.leadpage.clickAddnew();
        pageInitializer.leadpage.clickCancel();
    }

    @Then("The add new page should close")
    public void theAddNewPageShouldClose() {
        Assert.assertTrue(pageInitializer.loginPage.verifyLeadPage());
    }

    @When("I Click Add New in Lead page and I click back button")
    public void iClickAddNewInLeadPageAndIClickBackButton() {
        pageInitializer.leadpage.clickAddnew();
        pageInitializer.leadpage.clickBackButton();
    }

    @When("I enter the data in search bar {string} in Lead page")
    public void iEnterTheDataInSearchBarInLeadPage(String strSearchInLead) {
        pageInitializer.leadpage.enterValueInSearchBarInLeadPage(TestDataUtil.getValue(strSearchInLead));

    }

    @Then("I verify the search {string} result")
    public void iVerifyTheSearchResult(String strSearchInLead) {
        Assert.assertTrue(pageInitializer.leadpage.searchLeadVerification(TestDataUtil.getValue(strSearchInLead)));

    }

    @When("I click on the sort button and click ascending")
    public void iClickOnTheSortButtonAndClickAscending() {
        pageInitializer.leadpage.setSortBy();
        pageInitializer.leadpage.setAscending();
    }


    @Then("I should see the results in {string} ascending order")
    public void iShouldSeeTheResultsInAscendingOrder(String strAscending) {
        Assert.assertTrue(pageInitializer.leadpage.searchLeadVerification(TestDataUtil.getValue(strAscending)));
    }
    @When("I click on the sort button and click Descending")
    public void iClickOnTheSortButtonAndClickDescending() {
        pageInitializer.leadpage.setAscending();
        pageInitializer.leadpage.setDescending();
    }


    @Then("I should see the results in {string} descending order")
    public void iShouldSeeTheResultsInDescendingOrder(String strDescending) {
            Assert.assertTrue(pageInitializer.leadpage.searchLeadVerification(TestDataUtil.getValue(strDescending)));
        }
    @When("I click on the Existing Lead {string} in lead page")
    public void iClickOnTheExistingLeadInLeadPage(String strExistingLead) {
        pageInitializer.leadpage.clickExistingLead(TestDataUtil.getValue(strExistingLead));
    }
    @Then("I should navigate to Supreme Lead page")
    public void iShouldNavigateToSupremeLeadPage() {
        Assert.assertTrue(pageInitializer.leadpage.verifySupremeInteriorDesign());
    }
    @Given("I am in Supreme Lead page")
    public void iAmInSupremeLeadPage() {
        Assert.assertTrue(pageInitializer.leadpage.verifySupremeInteriorDesign());
    }
    @And("I click Edit in General information")
    public void iClickEditInGeneralInformation() {
        pageInitializer.leadpage.clickEditBtnInGeneralInformation();
    }
    @When("I enter the data {string} {string} {string} and click save button")
    public void iEnterTheDataAndClickSaveButton(String strEmailAddress, String strChooseIndustry, String strEstimatedMonthlyProcessingVolume) {
        pageInitializer.leadpage.enterDataInGeneralInformation(TestDataUtil.getValue(strEmailAddress)
                ,TestDataUtil.getValue(strChooseIndustry)
                ,TestDataUtil.getValue(strEstimatedMonthlyProcessingVolume));
        pageInitializer.leadpage.clickSaveBtnInGeneralInformation();
    }
    @Then("I should see the edited General information{string}")
    public void iShouldSeeTheEditedGeneralInformation(String strEmailAddress) {
        Assert.assertTrue(pageInitializer.leadpage.verifyGeneralInformation(TestDataUtil.getValue(strEmailAddress)));
    }
    @When("I click edit in General information and click cancel button")
    public void iClickEditInGeneralInformationAndClickCancelButton() {
        pageInitializer.leadpage.clickEditBtnInGeneralInformation();
        pageInitializer.leadpage.clickCancelBtninGeneralinformation();
    }
    @Then("The edit page should close")
    public void theEditPageShouldClose() {
        Assert.assertTrue(pageInitializer.leadpage.verifyCancelFunctionalityInGeneralInflormatoin());
    }
    @And("I enter the data {string} {string} and {string} in Business information")
    public void iEnterTheDataInBusinessInformationAndClickSaveButton(String strBusinessName1, String strAddressLine1, String strAddressLine2) {
        pageInitializer.leadpage.enterDataInBusinessInformation(TestDataUtil.getValue(strBusinessName1)
                ,TestDataUtil.getValue(strAddressLine1),strAddressLine2);
    }
    @When("I enter data in my mailing Address {string} and click next button")
    public void iEnterDataInMyMailingAddressAndClickNextButton(String strMyMailingAddress) {
        pageInitializer.leadpage.enterDataInMyMailingAddress(TestDataUtil.getValue(strMyMailingAddress));
        pageInitializer.leadpage.clickNextInBusinessInformation();
    }
    @Then("I should see the edited Business information {string}")
    public void iShouldSeeTheEditedBusinessInformation(String strBusnessName1) {
        Assert.assertTrue(pageInitializer.leadpage.verifyBusinessInformation(strBusnessName1));
    }
    @When("I click edit in Business information and click cancel button")
    public void iClickEditInBusinessInformationAndClickCancelButton() {
        pageInitializer.leadpage.clickEditBtnInBusinessInformation();
        pageInitializer.leadpage.clickBtncancelInBusinessInformation();
    }

    @Then("Edit Business information should close")
    public void editBusinessInformationShouldClose() {
        Assert.assertTrue(pageInitializer.leadpage.verifyBusinessInformation());

    }
    @And("I click edit in Business information")
    public void iClickEditInBusinessInformation() {
        pageInitializer.leadpage.clickEditBtnInBusinessInformation();
    }
    @And("I click edit in Authorized Representative and verify Authorized Reprresentative page")
    public void iClickEditInAuthorizedRepresentative() {
        pageInitializer.leadpage.clickEditInAuthorizedRepresentativePage();
        Assert.assertTrue(pageInitializer.leadpage.verifyAuthorizedRepresentativePage());

    }
    @And("I enter data {string} {string} {string} {string} {string} {string} {string} {string} {string} and {string} in Authorized Representative")
    public void iEnterDataInAuthorizedRepresentative(String strSSN, String strFirstName, String strLastName, String strBirthday, String strMobileName, String strEmailAddress, String strPosition, String strOwnerShipPercentage, String strHomeAddressLine1, String strHomeAddressLine2) {
        pageInitializer.leadpage.entervalueInAuthorizedRepresentative(TestDataUtil.getValue(strSSN)
                ,TestDataUtil.getValue(strFirstName)
                ,TestDataUtil.getValue(strLastName)
                ,TestDataUtil.getValue(strBirthday)
                ,TestDataUtil.getValue(strMobileName)
                ,TestDataUtil.getValue(strEmailAddress)
                ,TestDataUtil.getValue(strPosition)
                ,TestDataUtil.getValue(strOwnerShipPercentage)
                ,TestDataUtil.getValue(strHomeAddressLine1),strHomeAddressLine2);
    }
    @And("I click Add additional owner and verify Add additional owner")
    public void iClickAddAdditionalOwner() {
        pageInitializer.leadpage.clickBtnAdditionalOwner();
        Assert.assertTrue(pageInitializer.leadpage.verifyAdditionalOwner());
    }

    @When("I enter data in Additional owner{string} {string} {string} {string} {string} {string} {string} {string} {string} and {string} and click next button")
    public void iEnterDataInAdditionalOwnerAndClickNextButton(String strSSN1, String strFirstName1, String strLastName1, String strBirthday1, String strMobileName1, String strEmailAddress1, String strPosition1, String strOwnerShipPercentage1, String strOwnerAddressLine1, String strOwnerAddressLine2) {
        pageInitializer.leadpage.entervalueInAdditionalOwnerPage(TestDataUtil.getValue(strSSN1)
                ,TestDataUtil.getValue(strFirstName1)
                ,TestDataUtil.getValue(strLastName1)
                ,TestDataUtil.getValue(strBirthday1)
                ,TestDataUtil.getValue(strMobileName1)
                ,TestDataUtil.getValue(strEmailAddress1)
                ,TestDataUtil.getValue(strPosition1)
                ,TestDataUtil.getValue(strOwnerShipPercentage1)
                ,TestDataUtil.getValue(strOwnerAddressLine1),strOwnerAddressLine2);
    }



    }
