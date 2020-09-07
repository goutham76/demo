package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class window_handling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GouthamPutha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.msn.com/en-in/weather/today/new-delhidelhiindia/we-city?iso=IN&el=LCSOtmrltA1MYWAgFElBFQ%3d%3d");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		Thread.sleep(20000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,5000)");
		Actions actobj =new Actions(driver);
		WebElement fb= driver.findElement(By.xpath("//li[@id='fbcount']/iframe"));
		actobj.moveToElement(fb).click().build().perform();
		Thread.sleep(30000);
		driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
		driver.getTitle();
		driver.close();
		
		Thread.sleep(3000);
		driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());
		
		WebElement twitter= driver.findElement(By.xpath("//li[@id='twcount']/iframe"));
		
		actobj.moveToElement(twitter).click().build().perform();
		driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());
		
		for(int i=0;i<=6;i++) {
			actobj.sendKeys(Keys.PAGE_UP).build().perform();
		
		}
		WebElement delhi=driver.findElement(By.xpath("//span[@class='current']"));
	String del=	delhi.getText();
		System.out.println(del);

		driver.findElement(By.xpath("(//*[@class='mylocations']/div/a)[1]")).click();
		driver.findElement(By.xpath("(//*[@class='add-loc-as-container']/input)[1]")).sendKeys("bangalore");
		Thread.sleep(3000);
		
		
		if(driver.findElement(By.xpath("//*[contains(text(),'Bengaluru,Karnataka,India')]")).isDisplayed())
		{
		System.out.println(true);
		}
		
		driver.findElement(By.xpath("//*[contains(text(),'Bengaluru,Karnataka,India')]")).click();
		
		
	}
}


