package com.cg.project.pagebeans;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class PaymentPageBean {

	@FindBy(how=How.NAME,name="txtFN")
	private WebElement cardHolderName ;

	@FindBy(how=How.NAME,name="debit")
	private WebElement debitCard;

	@FindBy(how=How.NAME,name="cvv")
	private WebElement cvv;

	@FindBy(how=How.NAME,name="month")
	private WebElement expirationMonth;

	@FindBy(how=How.NAME,name="year")
	private WebElement expirationYear;

	@FindBy(how=How.ID,id="btnPayment")
	private WebElement paymentBtn;

	
	
	public String getCardHolderName() {
		return cardHolderName.getAttribute("value");
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName.sendKeys(cardHolderName);
	}



	public String getDebitCard() {
		return debitCard.getAttribute("value");
	}



	public void setDebitCard(String debitCard) {
		this.debitCard.sendKeys(debitCard);
	}



	public String getCvv() {
		return cvv.getAttribute("value");
	}



	public void setCvv(String cvv) {
		this.cvv.sendKeys(cvv);
	}


	public String getExpirationMonth() {
		return expirationMonth.getAttribute("value");
	}



	public void setExpirationMonth(String expirationMonth) {
		this.expirationMonth.sendKeys(expirationMonth);
	}



	public String getExpirationYear() {
		return expirationYear.getAttribute("value");
	}



	public void setExpirationYear(String expirationYear) {
		this.expirationYear.sendKeys(expirationYear);
	}



	public WebElement getPaymentBtn() {
		return paymentBtn;
	}



	public void setPaymentBtn(WebElement paymentBtn) {
		this.paymentBtn = paymentBtn;
	}



	public void clickNext() {
		paymentBtn.click();
	}
	
}


