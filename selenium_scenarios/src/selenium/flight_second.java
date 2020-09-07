package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flight_second {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\GouthamPutha\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://flights.msn.com/en-in"
				+ "/flight-search/#");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//div[@class='place-selector__root clearfix']/a)[1]")).click();
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		act.sendKeys("mumbai").build().perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.ENTER).build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys("chennai").build().perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.ENTER).build().perform();
		act.sendKeys(Keys.TAB,Keys.TAB,Keys.ENTER).build().perform();
		driver.findElement(By.xpath("(//div[@class='ss-icon-arrow-right ss-icon'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='picker__day picker__day--infocus' and contains(text(),'7')])[1]")).click();
		Thread.sleep(3000);
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='picker__day picker__day--infocus' and contains(text(),'13')])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//b[@class='ss-icon ss-icon-triangle-down'])[1]")).click();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//b[@class='ss-icon ss-icon-triangle-down'])[2]")).click();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//b[@class='ss-icon ss-icon-triangle-down'])[3]")).click();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER).build().perform();
		Thread.sleep(3000);
		
		
		
	}

}
