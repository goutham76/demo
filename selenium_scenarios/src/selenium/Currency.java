package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Currency {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	//System.setProperty("webdriver.chrome.driver","\"C:\\\\\\\\Users\\\\\\\\GouthamPutha\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\GouthamPutha\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	driver.get("https://www.msn.com/en-in/money");
	driver.manage().window().maximize();
	
	//navigating to currency page
	driver.findElement(By.xpath("(//a[contains(text(),'Currency Converter')])")).click();
	Thread.sleep(3000);
	
	//clicking on drop down
	WebElement dropdown=driver.findElement(By.id("frmmenu"));
	dropdown.click();
	
	//selecting value in dropdown
	
	Select ddvalue=new Select(driver.findElement(By.id("frmmenu")));
	
	ddvalue.selectByVisibleText("United States Dollar");
	
	//sending value 
	WebElement value1=driver.findElement(By.id("frmtxtbx"));
	value1.click();
	value1.clear();
	value1.sendKeys("5");
	
	if(driver.findElement(By.xpath("//*[@id='tomenu']//following::*[contains(text(),'Indian')]")).isDisplayed())
	{
	System.out.println(true);
	
	}		
	else {
		Select ddvalueto=new Select(driver.findElement(By.id("tomenu")));
		ddvalueto.selectByVisibleText("Indian Rupee");
		
		
	}
	String us=driver.findElement(By.id("totxtbx")).getAttribute("value");
	System.out.println(us);
	
	// selcting australian 
	
ddvalue.selectByVisibleText("Australian Dollar");
	
	//sending value 
	
	value1.click();
	value1.clear();
	value1.sendKeys("5");
	
//fetching in india
	String aus=driver.findElement(By.id("totxtbx")).getAttribute("value");
	System.out.println(aus);
//changing sting to float	
	
	float us1=Float.parseFloat(us);
	float aus1=Float.parseFloat(aus);
	Float diff=aus1-us1;
	System.out.println(diff);
	
	}

}
