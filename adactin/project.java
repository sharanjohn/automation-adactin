package project;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class project {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\GOD\\eclipse-workspace\\seleium\\driver\\chromedriver_win32 new\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	//driver.manage().window().maximize();
	
  WebElement user = driver.findElement(By.id("username"));
	user.sendKeys("sharanjohn");
	
WebElement password = driver.findElement(By.id("password"));
	password.sendKeys("CADP8V");
	
	driver.findElement(By.name("login")).click();
	Thread.sleep(2000);
	
WebElement location = driver.findElement(By.id("location"));
	location.click();
	
Select a = new Select(location);
	a.selectByIndex(8);
	Thread.sleep(2000);
	
WebElement location1 = driver.findElement(By.id("location"));
	location1.click();
	Thread.sleep(2000);
	
WebElement hotels = driver.findElement(By.id("hotels"));
	hotels.click();
	
Select a1 = new Select(hotels);
	a1.selectByIndex(4);
	
WebElement hotels1 = driver.findElement(By.id("hotels"));
	hotels1.click();
	
WebElement room = driver.findElement(By.id("room_nos"));
	room.click();
	 
	
Select a2 = new Select(room);
	a2.selectByIndex(4);
	
	
WebElement room1= driver.findElement(By.id("room_nos"));
	room1.click();
	Thread.sleep(2000);
	
WebElement perperson = driver.findElement(By.id("adult_room"));
	perperson.click();
	
	Select a3 = new Select(perperson);
	a3.selectByIndex(2);
	
	WebElement perperson1 = driver.findElement(By.id("adult_room"));
	perperson1.click();
	Thread.sleep(2000);
	
	WebElement child = driver.findElement(By.name("child_room"));
	child.click();
	
	Select a4 = new Select(child);
	a4.selectByIndex(0);
	
	WebElement child1 = driver.findElement(By.name("child_room"));
	child1.click();
	Thread.sleep(2000);
	
	 driver.findElement(By.name("Submit")).click();
	Thread.sleep(2000);
	 driver.findElement(By.name("radiobutton_3")).click();
	 Thread.sleep(2000);
	 
	 driver.findElement(By.name("continue")).click();
	 
	WebElement name = driver.findElement(By.name("first_name"));
	 name.sendKeys("sharan");
	 
	 WebElement last = driver.findElement(By.name("last_name"));
	 last.sendKeys("john");
	 
	 WebElement address = driver.findElement(By.name("address"));
	 address.sendKeys("trichy,tamilnadu,india");
	 
	 WebElement card = driver.findElement(By.name("cc_num"));
	 card.sendKeys("1234567890123456");
	 
	 WebElement cctype = driver.findElement(By.name("cc_type"));
	 cctype.click();
	 
	 Select a5 = new Select(cctype);
		a5.selectByIndex(2);
	 
	WebElement cctype1 = driver.findElement(By.name("cc_type"));
		 cctype1.click();
	
	 WebElement ccm = driver.findElement(By.name("cc_exp_month"));
		 ccm.click();
		 
	 Select a6 = new Select(ccm);
		a6.selectByIndex(3);
		Thread.sleep(2000);	
		WebElement ccm1 = driver.findElement(By.name("cc_exp_month"));
	    ccm1.click();
			

	WebElement ccy = driver.findElement(By.id("cc_exp_year"));
		ccy.click();

	Select a7= new Select(ccy);
		a7.selectByIndex(9);
		Thread.sleep(2000);
				
	WebElement ccy1 = driver.findElement(By.id("cc_exp_year"));
			 ccy1.click();
				 
	WebElement ccv = driver.findElement(By.name("cc_cvv"));
		 ccv.sendKeys("2345677");
		 Thread.sleep(2000);
			 
			 
	driver.findElement(By.xpath("//input[@type='button']")).click();
	
	Thread.sleep(2000);
	
			 
			 
}
}

