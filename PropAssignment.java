package Com.google.sample.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PropAssignment {

	WebDriver driver;

	@BeforeMethod

	public void Setup()

	{
		
		 WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("https://vast-dawn-73245.herokuapp.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Test
	public void propine()

	{
	
		driver.findElement(By.xpath("//input[@placeholder='date']")).sendKeys("17-March-2020");
		driver.findElement(By.xpath("//input[@class='btn btn-default']")).click();

		driver.findElement(By.xpath("//input[@placeholder='date']")).sendKeys("17-March-20");
		driver.findElement(By.xpath("//input[@class='btn btn-default']")).click();
		

		driver.findElement(By.xpath("//input[@placeholder='date']")).sendKeys("17-March-20");
		driver.findElement(By.xpath("//input[@class='btn btn-default']")).click();
		

		driver.findElement(By.xpath("//input[@placeholder='date']")).sendKeys("17-Mar-20");
		driver.findElement(By.xpath("//input[@class='btn btn-default']")).click();
		

		driver.findElement(By.xpath("//input[@placeholder='date']")).sendKeys("17-03-2020");
		driver.findElement(By.xpath("//input[@class='btn btn-default']")).click();
		

		driver.findElement(By.xpath("//input[@placeholder='date']")).sendKeys("17-03-20");
		driver.findElement(By.xpath("//input[@class='btn btn-default']")).click();
		

		driver.findElement(By.xpath("//input[@placeholder='date']")).sendKeys("March-17-2020");
		driver.findElement(By.xpath("//input[@class='btn btn-default']")).click();
		

		driver.findElement(By.xpath("//input[@placeholder='date']")).sendKeys("March-17-20");
		driver.findElement(By.xpath("//input[@class='btn btn-default']")).click();
		

		driver.findElement(By.xpath("//input[@placeholder='date']")).sendKeys("Mar-17-20");
		driver.findElement(By.xpath("//input[@class='btn btn-default']")).click();
		
		
		driver.findElement(By.xpath("//input[@placeholder='date']")).sendKeys("03-17-2020");
		driver.findElement(By.xpath("//input[@class='btn btn-default']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='date']")).sendKeys("03-17-20");
		driver.findElement(By.xpath("//input[@class='btn btn-default']")).click();
		
		
	}
	@Test
		public void propilnedot()
		{
		

		driver.findElement(By.xpath("//input[@placeholder='date']")).sendKeys("17.March.2020");
		driver.findElement(By.xpath("//input[@class='btn btn-default']")).click();

		driver.findElement(By.xpath("//input[@placeholder='date']")).sendKeys("17.March.20");
		driver.findElement(By.xpath("//input[@class='btn btn-default']")).click();
		

		driver.findElement(By.xpath("//input[@placeholder='date']")).sendKeys("17.March.20");
		driver.findElement(By.xpath("//input[@class='btn btn-default']")).click();
		

		driver.findElement(By.xpath("//input[@placeholder='date']")).sendKeys("17.Mar.20");
		driver.findElement(By.xpath("//input[@class='btn btn-default']")).click();
		

		driver.findElement(By.xpath("//input[@placeholder='date']")).sendKeys("17.03.2020");
		driver.findElement(By.xpath("//input[@class='btn btn-default']")).click();
		

		driver.findElement(By.xpath("//input[@placeholder='date']")).sendKeys("17.03.20");
		driver.findElement(By.xpath("//input[@class='btn btn-default']")).click();
		

		driver.findElement(By.xpath("//input[@placeholder='date']")).sendKeys("March.17.2020");
		driver.findElement(By.xpath("//input[@class='btn btn-default']")).click();
		

		driver.findElement(By.xpath("//input[@placeholder='date']")).sendKeys("March.17.20");
		driver.findElement(By.xpath("//input[@class='btn btn-default']")).click();
		

		driver.findElement(By.xpath("//input[@placeholder='date']")).sendKeys("Mar.17.20");
		driver.findElement(By.xpath("//input[@class='btn btn-default']")).click();
		
		
		driver.findElement(By.xpath("//input[@placeholder='date']")).sendKeys("03.17.2020");
		driver.findElement(By.xpath("//input[@class='btn btn-default']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='date']")).sendKeys("03.17.20");
		driver.findElement(By.xpath("//input[@class='btn btn-default']")).click();
		
	
	
	
		}
	
	@Test
	public void propilneslash()
	{
	

	driver.findElement(By.xpath("//input[@placeholder='date']")).sendKeys("17/March/2020");
	driver.findElement(By.xpath("//input[@class='btn btn-default']")).click();

	driver.findElement(By.xpath("//input[@placeholder='date']")).sendKeys("17/March/20");
	driver.findElement(By.xpath("//input[@class='btn btn-default']")).click();
	

	driver.findElement(By.xpath("//input[@placeholder='date']")).sendKeys("17/March/20");
	driver.findElement(By.xpath("//input[@class='btn btn-default']")).click();
	

	driver.findElement(By.xpath("//input[@placeholder='date']")).sendKeys("17/Mar/20");
	driver.findElement(By.xpath("//input[@class='btn btn-default']")).click();
	

	driver.findElement(By.xpath("//input[@placeholder='date']")).sendKeys("17/03/2020");
	driver.findElement(By.xpath("//input[@class='btn btn-default']")).click();
	

	driver.findElement(By.xpath("//input[@placeholder='date']")).sendKeys("17/03/20");
	driver.findElement(By.xpath("//input[@class='btn btn-default']")).click();
	

	driver.findElement(By.xpath("//input[@placeholder='date']")).sendKeys("March/17/2020");
	driver.findElement(By.xpath("//input[@class='btn btn-default']")).click();
	

	driver.findElement(By.xpath("//input[@placeholder='date']")).sendKeys("March/17/20");
	driver.findElement(By.xpath("//input[@class='btn btn-default']")).click();
	

	driver.findElement(By.xpath("//input[@placeholder='date']")).sendKeys("Mar/17/20");
	driver.findElement(By.xpath("//input[@class='btn btn-default']")).click();
	
	
	driver.findElement(By.xpath("//input[@placeholder='date']")).sendKeys("03/17/2020");
	driver.findElement(By.xpath("//input[@class='btn btn-default']")).click();
	
	driver.findElement(By.xpath("//input[@placeholder='date']")).sendKeys("03/17/20");
	driver.findElement(By.xpath("//input[@class='btn btn-default']")).click();
	



	}

	@AfterMethod
	public void Teardown()
	{
		driver.quit();
	}


}
