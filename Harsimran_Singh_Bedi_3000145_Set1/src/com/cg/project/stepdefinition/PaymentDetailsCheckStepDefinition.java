package com.cg.project.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.project.pagebeans.ConferencePageBean;
import com.cg.project.pagebeans.PaymentPageBean;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PaymentDetailsCheckStepDefinition {
	
	
	private WebDriver driver;

	private PaymentPageBean pageBean;

	
	@Before
	public void setUpStepEnv() {
		System.setProperty("webdriver.chrome.driver",
				"driver/chromedriver.exe" );
		driver=new ChromeDriver();	
	}
	
	
	@Given("^User is on the Payment Details Page on Browser$")
	public void user_is_on_the_Payment_Details_Page_on_Browser() throws Throwable {
	    
		driver.get("C:\\\\Users\\\\gurjosin\\\\Desktop\\\\Important\\\\registrationBDD-master\\\\Set B\\\\PaymentDetails.html");
		pageBean = PageFactory.initElements(driver,PaymentPageBean.class);
	}

	@When("^user is trying submit data without entering 'Card holder name'$")
	public void user_is_trying_submit_data_without_entering_Card_holder_name() throws Throwable {
	    
		pageBean.clickNext();
		
	}

	@Then("^'Please fill the Card holder name' alert message should display$")
	public void please_fill_the_Card_holder_name_alert_message_should_display() throws Throwable {
		String expectedAlertMessage ="Please fill the Card holder name";
		String actualAlertMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}

	@When("^User is trying to submit request without entering 'Debit card Number'$")
	public void user_is_trying_to_submit_request_without_entering_Debit_card_Number() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.setCardHolderName("harsimran");
		pageBean.clickNext();
	}

	@Then("^'Please fill the Debit card Number' alert message should display$")
	public void please_fill_the_Debit_card_Number_alert_message_should_display() throws Throwable {
		String expectedAlertMessage ="Please fill the Debit card Number";
		String actualAlertMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}

	@When("^User is trying to submit request without entering 'CVV'$")
	public void user_is_trying_to_submit_request_without_entering_CVV() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.setDebitCard("909012345");
		pageBean.clickNext();
		
	}

	@Then("^'Please fill the CVV' alert message should display$")
	public void please_fill_the_CVV_alert_message_should_display() throws Throwable {
		String expectedAlertMessage ="Please fill the CVV";
		String actualAlertMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}

	@When("^User is trying to submit request without entering valid 'expiration month'$")
	public void user_is_trying_to_submit_request_without_entering_valid_expiration_month() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.setCvv("2345412");
		pageBean.clickNext();
		
	}

	@Then("^'Please fill expiration month' alert message should display$")
	public void please_fill_expiration_month_alert_message_should_display() throws Throwable {
		String expectedAlertMessage ="Please fill expiration month";
		String actualAlertMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}

	@When("^User is trying to submit request without selecting 'expiration year'$")
	public void user_is_trying_to_submit_request_without_selecting_expiration_year() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.setExpirationMonth("april");
		pageBean.clickNext();
		
	}

	@Then("^'Please fill the expiration year' alert message should display$")
	public void please_fill_the_expiration_year_alert_message_should_display() throws Throwable {
		String expectedAlertMessage ="Please fill the expiration year";
		String actualAlertMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}
	
	@Given("^User is accessing the Payment Details Page on Browser$")
	public void user_is_accessing_the_Payment_Details_Page_on_Browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("C:\\\\Users\\\\gurjosin\\\\Desktop\\\\Important\\\\registrationBDD-master\\\\Set B\\\\PaymentDetails.html");
		pageBean = PageFactory.initElements(driver,PaymentPageBean.class);
	}
	
	@Then("^'Conference Room Booking successfully done!!!' alert message should display$")
	public void conference_Room_Booking_successfully_done_alert_message_should_display() throws Throwable {
		String expectedAlertMessage ="Please fill the expiration year";
		String actualAlertMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}

	
	@After
	public void tearDownStepEnv() {
		driver.switchTo().alert().dismiss();
		driver.close();
	}


}
