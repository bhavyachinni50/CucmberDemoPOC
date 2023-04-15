package stepDefinations;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;
import pages.HomeLoan;
import utils.TestBase;

public class HomeLoanPageStepDefinations {

	HomeLoan Home;
	
	@Given("^user opens a browser$")
	public void user_opens_a_browser()   {
		TestBase.initialization();
		Home=new HomeLoan();  
	}
	
	@Then("^user is on Homepage$")
	public void verifyHomePageTitle() {
		Assert.assertEquals(Home.getPageTitle(), "Home loan borrowing power calculator | ANZ");

	}
	@Then("^User select application type as single$")
	public void selectApplicationType() {
		Home.SelectApplicationType();
	}
	@Then("^User select Home to live in$")
	public void selectHomeToLevin() {
		Home.selectHomeToLevin();
	}
	
	@Then("^user enetr nuber of dependents$")
	public void NumberOfDependents() {
		Home.selectDependends(0);
	}
	
	@Then("^user enter Anual income and anual other income$")
	public void EnterAnualIncome() {
		Home.eneterAnualIncome("80000");
		Home.eneterOtherAnualIncome("10000");
	}
	@Then("^user enter all expemces and credit card limit$")
	public void EnterOtherAnualIncome() {
		Home.eneterMonthlyLevingExpnce("500");
		Home.eneterCurrentHomeLoanrepayment("0");
		Home.eneterOtherLoanRepayment("100");
		Home.eneterOtherCommitments("0");
		Home.eneterOtherCreditCardLimits("10000");
	}
	@Then("^user click on workout how much i could borrow$")
	@Then("^user click workout how much i could borrow$")
	public void ClickOnWorkOutHowMuchICouldBarrow() {
		Home.clickOnHowMuchIcanBarrowbtn();
	}
	
	@Then("^user click on start over button$")
	public void ClickOnStartOver() {
		Home.clickOnStartOverBtn();
	}
	
	@Then("^user enter only montly living expence as 1$")
	public void eneterMonthlyLivingexp() {
		Home.eneterMonthlyLevingExpnce("1");
	}
	@Then("^user see results as error message$")
	public void verifyErrorMessage() {
		Assert.assertEquals(Home.GetErrorMessageText(), "Based on the details you've "
				+ "entered, we're unable to give you an estimate of your borrowing power"
				+ " with this calculator. For questions, call us on 1800 035 500.");
	}
	
}
