package com.cg.project.pagebeans;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class ConferencePageBean {
	
	@FindBy(how=How.NAME,name="txtFN")
	private WebElement firstName ;

	@FindBy(how=How.NAME,name="txtLN")
	private WebElement lastName;

	@FindBy(how=How.NAME,name="Email")
	private WebElement email;

	@FindBy(how=How.NAME,name="Phone")
	private WebElement contactNo;

	@FindBy(how=How.NAME,name="size")
	private WebElement noOfPeopleAttending;

	@FindBy(how=How.NAME,name="Address")
	private WebElement buildingNameRoomNo;
	
	@FindBy(how=How.NAME,name="Address2")
	private WebElement areaName;
	
	@FindBy(how=How.NAME,name="city")
	private WebElement city;
	
	@FindBy(how=How.NAME,name="state")
	private WebElement state;

	@FindBy(how=How.NAME,name="memberStatus")
	private List<WebElement> memberStatus;

	@FindBy(how=How.LINK_TEXT,linkText="Next")
	private WebElement nextBtn;

	public String getFirstName() {
		return firstName.getAttribute("value");
	}

	public void setFirstName(String firstName) {
		this.firstName.sendKeys(firstName);
	}

	public String getLastName() {
		return lastName.getAttribute("value");
	}

	public void setLastName(String lastName) {
		this.lastName.sendKeys(lastName);
	}

	public String getEmail() {
		return email.getAttribute("value");
	}

	public void setEmail(String Email) {
		this.email.clear();
		this.email.sendKeys(Email);
	}

	public String getContactNo() {
		return contactNo.getAttribute("value");
	}

	public void setContactNo(String contactNo) {
		this.contactNo.sendKeys(contactNo);
	}

	public String getNoOfPeopleAttending() {
		return new Select(this.noOfPeopleAttending).getFirstSelectedOption().getText();
	}

	public void setNoOfPeopleAttending(String noOfPeopleAttending) {
		Select select=new Select(this.noOfPeopleAttending);
		select.selectByVisibleText(noOfPeopleAttending);
	}

	public String getBuildingNameRoomNo() {
		return buildingNameRoomNo.getAttribute("value");
	}

	public void setBuildingNameRoomNo(String buildingNameRoomNo) {
		this.buildingNameRoomNo.sendKeys(buildingNameRoomNo);
	}

	public String getAreaName() {
		return areaName.getAttribute("value");
	}

	public void setAreaName(String areaName) {
		this.areaName.sendKeys(areaName);
	}

	public String getCity() {
		return new Select(this.city).getFirstSelectedOption().getText();
	}

	public void setCity(String city) {
		Select select=new Select(this.city);
		select.selectByVisibleText(city);
	}

	public String getState() {
		return new Select(this.state).getFirstSelectedOption().getText();
	}

	public void setState(String state) {
		Select select=new Select(this.state);
		select.selectByVisibleText(state);
	}

	public String getMemberStatus() {
		for (WebElement webElement : memberStatus) 
			if(webElement.isSelected())
				return webElement.getAttribute("value");
			return null;
	}
	
	public void setMemberStatus(String memberStatus) {
		if(memberStatus.equalsIgnoreCase("Conference full-Access(member)(1000 Rs.)"))
			this.memberStatus.get(0).click();
		else 
			this.memberStatus.get(1).click();
	}
	
	public WebElement getNextBtn() {
		return nextBtn;
	}

	public void setNextBtn(WebElement nextBtn) {
		this.nextBtn = nextBtn;
	}
	
	public void clickNext() {
		nextBtn.click();
	}
	
	

	

}
