package selenium;

import java.awt.Window;
import java.awt.event.WindowStateListener;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class flight_search {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\GouthamPutha\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://flights.msn.com/en-in"
				+ "/flight-search/#");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		Actions actobf=new Actions(driver);
	//	driver.findElement(By.linkText())
		driver.findElement(By.xpath("(//div[@class='place-selector__root clearfix']/a)[1]")).click();
		actobf.sendKeys("delhi").build().perform();
		Thread.sleep(5000);
		actobf.sendKeys(Keys.ENTER).build().perform();
		actobf.sendKeys(Keys.TAB).build().perform();
		actobf.sendKeys("chennai").build().perform();
		Thread.sleep(5000);
		actobf.sendKeys(Keys.ENTER).build().perform();
		actobf.sendKeys(Keys.TAB).build().perform();
		actobf.sendKeys(Keys.TAB).build().perform();
		actobf.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='ss-icon-arrow-right ss-icon'])[1]")).click();
		driver.findElement(By.xpath("(//*[@class='picker__day picker__day--infocus' and contains(text(),'6')])[1]")).click();
		Thread.sleep(3000);
		actobf.sendKeys(Keys.TAB).build().perform();
		
		actobf.sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("(//*[@class='picker__day picker__day--infocus' and contains(text(),'11')])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='ss-icon ss-icon-triangle-down'])[1]")).click();
		Thread.sleep(3000);
		actobf.sendKeys(Keys.ARROW_DOWN,Keys.ENTER).build().perform();

		driver.findElement(By.xpath("(//*[@class='ss-icon ss-icon-triangle-down'])[2]")).click();
		Thread.sleep(3000);
		actobf.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER).build().perform();
		
		driver.findElement(By.xpath("(//*[@class='ss-icon ss-icon-triangle-down'])[3]")).click();
		Thread.sleep(3000);
		actobf.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER).build().perform();
		
	WebElement cl =	driver.findElement(By.xpath("//*[@class='field-box search-button js-search-button']"));
		actobf.moveToElement(cl).click().build().perform();
		Thread.sleep(30000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		String price=driver.findElement(By.xpath("(//*[@class='price-text '])[1]")).getText();
		System.out.println("the price is" + price);


		
		
		
	}

}
