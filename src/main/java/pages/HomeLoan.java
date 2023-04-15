package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utils.TestBase;

public class HomeLoan extends TestBase{
	
	@FindBy(id="application_type_single")
	WebElement ApplicationTypeSingle;
	
	@FindBy(xpath="//select[@title='Number of dependants']")
	WebElement DependentsDropdown;
	
	@FindBy(xpath="//label[normalize-space()='Home to live in']")
	WebElement HomeToLiveIn;
	
	@FindBy(xpath = "(//input[@value='0'])[1]")
	WebElement YourAnnualIncome;
	
	@FindBy(xpath = "(//input[contains(@value,'0')])[1]")
	WebElement OtherAnnualIncome;
	
	@FindBy(xpath ="//input[@id='expenses']")
	WebElement MonthlyLivingExpence;
	
	@FindBy(xpath ="//input[@id='homeloans']")
	WebElement CurrentHomeLoan;
	
	@FindBy(xpath = "//input[@id='otherloans']")
	WebElement OtherExpenceMontly;
	
	@FindBy(xpath = "(//input[@value='0'])[8]")
	WebElement OtherMonthlyRepayments;
	
	@FindBy(xpath = "//input[@id='credit']")
	WebElement TotalCreditacrtdLimit;
	
	@FindBy(xpath = "//button[@id='btnBorrowCalculater']")
	WebElement WorkOutHowMuchIcouldBorrow;
	
	@FindBy(xpath = "//button[contains(text(),'Start over')]")
	WebElement StartOver;
	
	@FindBy(xpath="//div[@class='borrow__error__text']")
	WebElement ErrorMessage;
	
	public HomeLoan(){
		PageFactory.initElements(driver, this);
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public void SelectApplicationType() {
		ApplicationTypeSingle.click();
	}
	
	public void selectDependends(int index) {
		Select sel= new Select(DependentsDropdown);
		sel.selectByIndex(index);
	}
	public void selectHomeToLevin() {
		HomeToLiveIn.click();
	}
	public void eneterAnualIncome(String value) {
		YourAnnualIncome.sendKeys(value);
	}
	
	public void eneterOtherAnualIncome(String value) {
		OtherAnnualIncome.sendKeys(value);
	}
	
	public void eneterMonthlyLevingExpnce(String value) {
		MonthlyLivingExpence.sendKeys(value);
	}
	public void eneterCurrentHomeLoanrepayment(String value) {
		CurrentHomeLoan.sendKeys(value);
	}
	
	public void eneterOtherLoanRepayment(String value) {
		OtherExpenceMontly.sendKeys(value);
	}
	
	public void eneterOtherCommitments(String value) {
		OtherMonthlyRepayments.sendKeys(value);
	}
	
	public void eneterOtherCreditCardLimits(String value) {
		TotalCreditacrtdLimit.sendKeys(value);
	}
	
	public void clickOnHowMuchIcanBarrowbtn() {
		WorkOutHowMuchIcouldBorrow.click();
	}
	
	public void clickOnStartOverBtn() {
		StartOver.click();
	}
	
	public String GetErrorMessageText() {
		return ErrorMessage.getText();
	}
	
	
	

}
