package com.cg.project.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.project.pagebeans.ConferencePageBean;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ConferenceRegistrationCheckStepDefinition {
	
	

	private WebDriver driver;

	private ConferencePageBean pageBean;

	@Before
	public void setUpStepEnv() {
		System.setProperty("webdriver.chrome.driver",
				"driver/chromedriver.exe" );
		driver=new ChromeDriver();	
	}
	
	@Given("^User is on the Conference Registartion Page on Browser$")
	public void user_is_on_the_Conference_Registartion_Page_on_Browser() throws Throwable {
		
		driver.get("C:\\Users\\gurjosin\\Desktop\\Important\\registrationBDD-master\\Set B\\ConferenceRegistartion.html");
		pageBean = PageFactory.initElements(driver,ConferencePageBean.class);
	   
	}

	@When("^user is trying submit data without entering 'First Name'$")
	public void user_is_trying_submit_data_without_entering_First_Name() throws Throwable {
		pageBean.clickNext();	
	}

	@Then("^'Please fill the First Name' alert message should display$")
	public void please_fill_the_First_Name_alert_message_should_display() throws Throwable {
	   
		String expectedAlertMessage ="Please fill the First Name";
		String actualAlertMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
		
	}

	@When("^User is trying to submit request without entering 'Last Name'$")
	public void user_is_trying_to_submit_request_without_entering_Last_Name() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.setFirstName("harsimran");
		Thread.sleep(5000);
		pageBean.clickNext();
	}

	@Then("^'Please fill the Last Name' alert message should display$")
	public void please_fill_the_Last_Name_alert_message_should_display() throws Throwable {
	   
		String expectedAlertMessage ="Please fill the Last Name";
		String actualAlertMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
		
	}

	@When("^User is trying to submit request without entering 'Email'$")
	public void user_is_trying_to_submit_request_without_entering_Email() throws Throwable {
	    
		driver.switchTo().alert().dismiss();
		pageBean.setLastName("Singh Bedi");
		//pageBean.setEmail("hsb");
		pageBean.clickNext();
		
	}

	@Then("^'Please fill the Email' alert message should display$")
	public void please_fill_the_Email_alert_message_should_display() throws Throwable {
	   
		String expectedAlertMessage ="Please fill the Email";
		String actualAlertMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}

	@When("^User is trying to submit request without entering valid 'Contact No'$")
	public void user_is_trying_to_submit_request_without_entering_valid_Contact_No() throws Throwable {
	   
		driver.switchTo().alert().dismiss();
		pageBean.setEmail("hsb1497@gmail.com");
		pageBean.clickNext();
		
	}

	@Then("^'Please fill the Contact No' alert message should display$")
	public void please_fill_the_Contact_No_alert_message_should_display() throws Throwable {
	    
		String expectedAlertMessage ="Please fill the Contact No.";
		String actualAlertMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
		
	}

	@When("^User is trying to submit request without selecting 'No of people attending'$")
	public void user_is_trying_to_submit_request_without_selecting_No_of_people_attending() throws Throwable {
	    
		driver.switchTo().alert().dismiss();
		pageBean.setContactNo("8950497717");
		//pageBean.setNoOfPeopleAttending(null);
		pageBean.clickNext();
		
	}

	@Then("^'Please fill the Number of people attending' alert message should display$")
	public void please_fill_the_Number_of_people_attending_alert_message_should_display() throws Throwable {
		String expectedAlertMessage="Please fill the Number of people attending";
		String actualAlertMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}

	@When("^User is trying to submit request without entering 'Building Name and Room no'$")
	public void user_is_trying_to_submit_request_without_entering_Building_Name_and_Room_no() throws Throwable {
	   
		driver.switchTo().alert().dismiss();
		pageBean.setNoOfPeopleAttending("2");
		pageBean.clickNext();
		
	}

	@Then("^'Please fill the Building & Room No' alert message should display$")
	public void please_fill_the_Building_Room_No_alert_message_should_display() throws Throwable {
		String expectedAlertMessage="Please fill the Building & Room No";
		String actualAlertMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}

	@When("^User is trying to submit request without entering 'Area Name'$")
	public void user_is_trying_to_submit_request_without_entering_Area_Name() throws Throwable {
	    
		 
		driver.switchTo().alert().dismiss();
		pageBean.setBuildingNameRoomNo("Manas");
		pageBean.clickNext();
		
	}

	@Then("^'Please fill the Area name' alert message should display$")
	public void please_fill_the_Area_name_alert_message_should_display() throws Throwable {
		String expectedAlertMessage="Please fill the Area name";
		String actualAlertMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}

	@When("^User is trying to submit request without selecting 'city'$")
	public void user_is_trying_to_submit_request_without_selecting_city() throws Throwable {
	   
		driver.switchTo().alert().dismiss();
		pageBean.setAreaName("Vip Road");
		pageBean.clickNext();		
		
	}

	@Then("^'Please select city' alert message should display$")
	public void please_select_city_alert_message_should_display() throws Throwable {
	   
		String expectedAlertMessage="Please select city";
		String actualAlertMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}

	@When("^User is trying to submit request without selecting 'state'$")
	public void user_is_trying_to_submit_request_without_selecting_state() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.setAreaName("Vip Road");
		pageBean.setCity("Pune");
		pageBean.clickNext();		
		
		
	}

	@Then("^'Please select state' alert message should display$")
	public void please_select_state_alert_message_should_display() throws Throwable {
		String expectedAlertMessage="Please select state";
		String actualAlertMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
	}

	@When("^User is trying to submit request without selecting 'Membership Status'$")
	public void user_is_trying_to_submit_request_without_selecting_Membership_Status() throws Throwable {
	    
		driver.switchTo().alert().dismiss();
		pageBean.setState("Maharashtra");
		pageBean.clickNext();
	}

	@Then("^'Please Select MemeberShip status' alert message should display$")
	public void please_Select_MemeberShip_status_alert_message_should_display() throws Throwable {
		String expectedAlertMessage="Please Select MemeberShip status";
		String actualAlertMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
		driver.switchTo().alert().dismiss();
	}

	
//	  @Given("^User is accessing Conference Registartion Page on Browser$") public
//	  void user_is_accessing_Conference_Registartion_Page_on_Browser() throws
//	  Throwable {
//		  driver.get("C:\\Users\\gurjosin\\Desktop\\Important\\registrationBDD-master\\Set B\\ConferenceRegistartion.html");
//			pageBean = PageFactory.initElements(driver,ConferencePageBean.class);
//	  
//	  }
	 
	@Given("^User is accessing the Conference Registartion Page on Browser$")
	public void user_is_accessing_the_Conference_Registartion_Page_on_Browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("C:\\Users\\gurjosin\\Desktop\\Important\\registrationBDD-master\\Set B\\ConferenceRegistartion.html");
		pageBean = PageFactory.initElements(driver,ConferencePageBean.class);
	}
	@When("^User is trying to submit request after entring valid set of information$")
	public void user_is_trying_to_submit_request_after_entring_valid_set_of_information() throws Throwable {
		pageBean.setFirstName("harsimran");
		pageBean.setLastName("Singh Bedi");
		pageBean.setEmail("hsb1497@gmail.com");
		pageBean.setContactNo("8950497717");	
		pageBean.setNoOfPeopleAttending("2");
		pageBean.setBuildingNameRoomNo("Manas");
		pageBean.setAreaName("Vip Road");
		pageBean.setCity("Pune");
		pageBean.setState("Maharashtra");
		pageBean.setMemberStatus("Conference full-Access(member)(1000 Rs.)");
		pageBean.clickNext();
	}

	@Then("^'Personal details are validated\\.' alert message should display$")
	public void personal_details_are_validated_alert_message_should_display() throws Throwable {
		String expectedAlertMessage="Conference Room Booking successfully done!!!";
		String actualAlertMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
		driver.switchTo().alert().dismiss();
	}
	
	@After
	public void tearDownStepEnv() {
		driver.switchTo().alert().dismiss();
		driver.close();
	}

}
