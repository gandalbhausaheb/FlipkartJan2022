package support;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class One 
{
	public static WebDriver driver=null;
	
	public static Hashtable<String, Object> Outputparameters=new Hashtable<String, Object>();
	
	//browserlaunch
	public static  Hashtable<String, Object> browserLaunch(Object[]inputparameters)
	{
		try {
		String strBrowserName=(String) inputparameters[0];
		String webDriverExePath=(String) inputparameters[1];
		
		if(strBrowserName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", webDriverExePath);
			driver=new ChromeDriver();
			driver.manage().window().maximize(); 
		}
		else if(strBrowserName.equalsIgnoreCase("firFox"))
		{
			System.setProperty("webdriver.gecko.driver", webDriverExePath);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
		}
		
		 Outputparameters.put("STATUS", "PASS");
		 Outputparameters.put("MESSAGE", "methodused:browserLaunch, Input_Data :" + inputparameters[1].toString());
		
		}catch(Exception e)
		{
			 Outputparameters.put("STATUS", "FAIL");
			 Outputparameters.put("MESSAGE", "methodused:browserLaunch, Input_Data :" + inputparameters[1].toString());
		}
		return Outputparameters;
	}
		//open application
		public static Hashtable<String, Object> OpenApplication(Object[]inputparameters)
		{
			try {
			String strUrl=(String) inputparameters[0];
			driver.get(strUrl);
			 Outputparameters.put("STATUS", "PASS"); 
			 Outputparameters.put("MESSAGE", "methodused:OpenApplication, Input_Data :" + inputparameters[0].toString());
			
			}catch(Exception e)
			{
				Outputparameters.put("STATUS", "FAIL"); 
				 Outputparameters.put("MESSAGE", "methodused:OpenApplication, Input_Data :" + inputparameters[0].toString());
			
			}
			return Outputparameters; 
		}
		
		//click on cancel
		public static Hashtable<String, Object> clickonElement(Object[]inputparameters)
		{
			try {
			String xpath=(String) inputparameters[0];
			driver.findElement(By.xpath(xpath)).click(); 
			 Outputparameters.put("STATUS", "PASS");
			 Outputparameters.put("MESSAGE", "methodused:clickonElement, Input_Data :" + inputparameters[0].toString());
			}catch(Exception e)
			{
				Outputparameters.put("STATUS", "FAIL");
				 Outputparameters.put("MESSAGE", "methodused:clickonElement, Input_Data :" + inputparameters[0].toString());
			}
			return Outputparameters;
		}
		
		//move on element
		public static Hashtable<String, Object> moveonElement(Object[]inputparameters)
		{
			try {
			String xpath=(String) inputparameters[0];
			Actions act=new Actions(driver);
			WebElement value=driver.findElement(By.xpath(xpath));
			act.moveToElement(value).build().perform();
			 Outputparameters.put("STATUS", "PASS");
			 Outputparameters.put("MESSAGE", "methodused:moveonElement, Input_Data :" + inputparameters[0].toString());
			}catch(Exception e)
			{
				Outputparameters.put("STATUS", "FAIL");
				 Outputparameters.put("MESSAGE", "methodused:moveonElement, Input_Data :" + inputparameters[0].toString());
			}
			return Outputparameters;
		}
		
		//ener userid	
		public static Hashtable<String, Object> LoginId(Object[]inputparameters)
		{
			try {
			String xpath=(String) inputparameters[0];
			String xpath1=(String) inputparameters[1];
			WebElement login=driver.findElement(By.xpath(xpath));
					   login.sendKeys(xpath1);
					   Outputparameters.put("STATUS", "PASS"); 
						 Outputparameters.put("MESSAGE", "methodused:LoginId, Input_Data :" + inputparameters[1].toString());
			}catch(Exception e)
			{
				 Outputparameters.put("STATUS", "FAIL");
				 Outputparameters.put("MESSAGE", "methodused:LoginId, Input_Data :" + inputparameters[1].toString());
			}
			return Outputparameters;
		}
		
		public static Hashtable<String, Object> gettext(Object[]inputparameters) throws Throwable
		
		{	try {
			Thread.sleep(5000);
			String xpath=(String) inputparameters[0];
			WebElement abc=driver.findElement(By.xpath(xpath));
			           String hello=abc.getText();
			String text=(String) inputparameters[1];
			
			if(text.equalsIgnoreCase(hello))
			{
				System.out.println("Test case passed");
			}
			else
			{
				System.out.println("Test case failed");
			}
			 Outputparameters.put("STATUS", "PASS");
			 Outputparameters.put("MESSAGE", "methodused:gettext, Input_Data :" + inputparameters[0].toString());
		}catch(Exception e)
		{
			Outputparameters.put("STATUS", "FAIL");
			 Outputparameters.put("MESSAGE", "methodused:gettext, Input_Data :" + inputparameters[0].toString());
		}
		return Outputparameters;
		}
		
	
	

}
