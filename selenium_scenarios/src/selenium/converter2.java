package selenium;import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class converter2 {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GouthamPutha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.msn.com/en-in/weather/today/new-delhidelhiindia/we-city?iso=IN&el=LCSOtmrltA1MYWAgFElBFQ%3d%3d");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,5000)");
		Thread.sleep(10000);
		WebElement fbfrmae=driver.findElement(By.xpath("//li[@id='fbcount']/iframe"));
	//	WebElement fblike=driver.findElement(By.xpath("//button[contains(@title, 'Page on Facebook')]/span\")"));
		Actions actobj =new Actions(driver);
		actobj.moveToElement(fbfrmae).click().build().perform();
		Thread.sleep(5000);
		driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
		
		String title=driver.getTitle();
		System.out.println(title);
	//	driver.switchTo().window("Log in to Facebook | Facebook");
		driver.manage().window().maximize();
		driver.close();
		Thread.sleep(3000);
		driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());
		WebElement twitter=driver.findElement(By.xpath("//li[@id='twcount']/iframe"));
		actobj.moveToElement(twitter).click().build().perform();
		
driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
		
		String title1=driver.getTitle();
		System.out.println(title1);
	//	driver.switchTo().window("Log in to Facebook | Facebook");
		driver.manage().window().maximize();
		driver.close();
		Thread.sleep(3000);
		driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());
		Thread.sleep(3000);
	String msn=	driver.getTitle();
	System.out.println(msn);
		
		for(int i=0;i<=6;i++) {
		actobj.sendKeys(Keys.PAGE_UP).build().perform();
		
		}
	
	}

}
