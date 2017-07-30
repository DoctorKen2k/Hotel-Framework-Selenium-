package testingFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Holiday_Inn_Test {

	public static void main(String[] args) {
		//Google driver.  Starts Google browser.
		WebDriver driver = new ChromeDriver();
		//Opens Holiday Inn website.
		driver.get("http://www.holidayinn.com/");
		//Maximize window.
		driver.manage().window().maximize();
		//Implicit wait for 10 seconds
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Enter city and state for hotel destination.
		driver.findElement(By.xpath(".//*[@placeholder='City, Airport, Attraction or Address']"))
			.sendKeys("Memphis, TN");
		//Select check in date
		driver.findElement(By.xpath(".//*[@class='cal-icon']")).click();
		driver.findElement(By.xpath("id('ui-datepicker-div')/div[2]/table[1]/tbody[1]/tr[1]/td[6]/a[1]")).click();
		//driver.findElement(By.xpath(".//*[@class='ui-state-default]'"));
		//driver.findElement(By.xpath(".//*[@href='#'][14]")).click();
		
		
		

	}

}
