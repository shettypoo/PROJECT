package p1.p11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utility.ExcelUtility;

public class bookticket {
	private WebDriver driver;
	
	
	@Test(priority=1)
	  public void findFlight()
	  {
		Select p=new Select(driver.findElement(By.name("passCount"))); 
		p.selectByValue("2");
		Select d=new Select(driver.findElement(By.name("fromPort"))); 
		d.selectByValue("London");
		Select m=new Select(driver.findElement(By.name("fromMonth"))); 
		m.selectByValue("1");
		driver.findElement(By.name("servClass")).click();
		driver.findElement(By.xpath("C:\\\\Users\\\\A06438_P5.Training\\\\Documents\\\\p1.xlsx")).click();
	  }
	
	
	@Test(priority=2)
	public void findflight() {
		
		driver.get("http://newtours.demoaut.com/mercuryreservation.php");
		//By.cssSelector("[input(="tripType")value='roundtrip']"))
		Select pass1= new Select(driver.findElement(By.name("passCount")));
		//Select pass = new Select(driver.findElements(By.name("passCount")));
		pass1.selectByValue("1");
		
		Select pass2= new Select(driver.findElement(By.name("fromPort")));
		pass2.selectByValue("London");
		
		Select pass3= new Select(driver.findElement(By.name("fromMonth")));
		pass3.selectByValue("3");
		
		Select pass4= new Select(driver.findElement(By.name("fromDay")));
		pass4.selectByValue("11");
		
		Select pass5= new Select(driver.findElement(By.name("toPort")));
		pass5.selectByValue("New York");
		
		Select pass6= new Select(driver.findElement(By.name("toMonth")));
		pass6.selectByValue("8");
		
		Select pass7= new Select(driver.findElement(By.name("toDay")));
		pass7.selectByValue("4");
		
		Select pass8= new Select(driver.findElement(By.name("airline")));
		pass8.selectByValue("No Preference");
		
		driver.findElement(By.name("findFlights")).click();
		
		
		
		
		
		
	}
		
	
	
		@DataProvider(name = "logindata")
		public String[][] login_data()throws Exception{
			ExcelUtility.setExcelPath("sheet1", "C:\\Users\\A06438_P5.Training\\Documents\\p1.xlsx");
			String username = ExcelUtility.getCellData(1, 1);
			String password = ExcelUtility.getCellData(1, 2);
			
			return new String[][] {
				new String[] {username,password},
				
			};
		}
		
		
		
	  @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver","C:\\Selenium Drivers1\\chromedriver_win32(1)\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get("http://newtours.demoaut.com/");
	  PageFactory.initElements(driver,poo123.class);
	  }

	  @AfterTest
	  public void afterTest() {
	  }

}
