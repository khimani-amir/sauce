package com.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.PageObjects.PageObjectsLogin;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class testcasesLogin  {
	private WebDriver driver;
	private String URL="http://www.gmail.com";
	
	@Before
	public void startup() throws Exception{
	//driver=new FirefoxDriver();
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ameer.khimani\\Desktop\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	System.out.println("Chrome browser started");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(URL);
	System.out.println("URL is entered");
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}


@After
public void stop() throws Exception{
	driver.close();
	System.out.println("browser is closed");
}

@Given("^User is on gmail page$")
public void user_is_on_gmail_page() throws Throwable {
	//PageObjectsLogin loginobject=PageFactory.initElements(driver,PageObjectsLogin.class);
	
}

@When("^User tries to login with Username \"(.*?)\" and Password \"(.*?)\"$")
public void user_tries_to_login_with_Username_and_Password(String arg1, String arg2) throws Throwable {
	PageObjectsLogin loginobject=PageFactory.initElements(driver,PageObjectsLogin.class);
	
loginobject.enterUserName("khimani.amir");
System.out.println("username is entered");
loginobject.enterPassword("Khimani1");
System.out.println("passowrd is entered");
loginobject.signInButton();
System.out.println("sign in button is clicked");
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
loginobject.clickImage();
System.out.println("signout image is clicked");
loginobject.clicksignOut();
System.out.println("signout button is clicked");
}

@Then("^User can get into inbox page and click sign out$")
public void user_can_get_into_inbox_page_and_click_sign_out() throws Throwable {
   
}


}



