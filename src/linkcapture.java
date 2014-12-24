



import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class linkcapture {
		public static void main(String[]args) throws Exception{
		
			WebDriver driver=null;

		
			
			String vbrowser="InternetExplorer";
			String browser="Firefox";
			String cbrowser = "chrome";
			
			//selecting one of the available browsers on the system
			
		//	else
			
			
			 if(cbrowser.equals("chrome"))
			
			
			{
				System.setProperty("webdriver.chrome.driver", "C://Users//ameer.khimani//Desktop//chromedriver_win32//chromedriver.exe");
			 driver=new ChromeDriver();
				driver.get("http://sports.williamhill.com/bet/en-gb");
				System.out.println("browser used is: "+cbrowser);


			}
			 else if( vbrowser.equals("InternetExplorer"))
				{
					System.setProperty("webdriver.ie.driver", "C://Users//ameer.khimani//Desktop//IEDriverServer_Win32_2.44.0//IEDriverServer.exe");
					//System.setProperty(key, value)
				driver=new InternetExplorerDriver();
				driver.get("http://sports.williamhill.com/bet/en-gb");
				System.out.println("browser used is: "+vbrowser);

				}
			
			else
			
			{
				
				driver=new FirefoxDriver();
			driver.get("http://sports.williamhill.com/bet/en-gb");
			System.out.println("browser used is: "+browser);

			
			
			 
			}
			


		/*System.setProperty("webdriver.ie.driver", "C://webdrivers/IEDriverServer.exe");
		//System.setProperty("webdriver.opera.driver", "C://webdrivers/operadriver-v1.1.zip/operadriver-v1.1.exe");
		
	//	DesiredCapabilities capabilities = DesiredCapabilities.opera();  

		//capabilities.setCapability("opera.binary","C://Program Files (x86)/Opera/19.0.1326.63/opera.exe");
		//capabilities.setCapability("opera.binary","C://webdrivers/opera.exe");
		//System.setProperty("opera.binary","C://webdrivers/opera.exe");
		//Path will be something like  
		//C:\Users\<username>\AppData\Local\Programs\Opera\opera.exe   
		//driver = new OperaDriver(); 
		WebDriver driver= new InternetExplorerDriver();
		driver.get("http://www.google.com");
		//driver.get("http://www.coral.co.uk/splash");
		 * 
		 */
			

		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		List<WebElement> myLinks= driver.findElements(By.tagName("a"));
		int myL = myLinks.size();
		System.out.println("number of links in this page are: " +myL);
		for(int i=0;i<myL;i++){
			if(myLinks.get(i).getText().equals("")){
				
			
			System.out.println("link text is: " +myLinks.get(i).getText());
			System.out.println(""+""+""+""+""+"");
			System.out.println("url is: " +myLinks.get(i).getAttribute("href"));
			System.out.println("");
			
			
			}
			
		}
		 driver.findElement(By.xpath("//*[@ id='american_football']")).click();
		//screen-capture
		File myimage=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String myp= "C://capture/williamhill.jpg";
	FileUtils.copyFile(myimage,new File(myp));
		
	}
	
		}



