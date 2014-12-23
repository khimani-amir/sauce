package com.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageObjectsLogin {
	private WebElement Email;
	private WebElement Passwd;
	private WebElement gb_71;
	private WebElement signIn;
	@FindBy(how=How.XPATH,using="//*[@id='gb']/div[1]/div[1]/div[2]/div[5]/div[1]/a/span")
	private WebElement gb;
	
	public void enterUserName(String text){
		//Thread.sleep(1000);
		Email.clear();
		Email.sendKeys(text);
		
		
	}
	public void enterPassword(String text){
		Passwd.clear();
		Passwd.sendKeys(text);
	}
	public void signInButton(){
		signIn.click();
	}
	public void clickImage(){
		gb.click();
	}
	public void clicksignOut(){
	gb_71.click();	
	}
	
	

}
