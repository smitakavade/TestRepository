package Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookTest {

	public static void main(String[] args) throws Exception {
	  System.setProperty("webdriver.chrome.driver", "G:\\Software\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	  System.out.println("Welcome to facebook");
	  
	  
	  //WebElement bm=new WebElement();
	  //List<Webelment>

	  //Locate  Text box
	  driver.findElement(By.xpath("//input[@name='email']"));
	  driver.findElement(By.xpath("//input[@name='pass']"));
	  
	  List<WebElement> radio=driver.findElements(By.xpath("//input[contains(@type,'ra')]")) ;
	  
	  radio.get(1).click();
	  Thread.sleep(30);
	  
	  radio.get(2).click();
	  Thread.sleep(30);
	 
	  radio.get(0).click();
	  Thread.sleep(30);
	  
	  //First way of Drop down list  button
	  List<WebElement> date=driver.findElements(By.xpath("//select[@id='day']/option"));
	  System.out.println("Total available dates"+date.size());
	  date.isEmpty();
	  date.get(30).click();
	  
	  //Second way of dropdown list
	  WebElement bm=driver.findElement(By.xpath("//*[@title='Month']")); //("//select[@title='Month']")); // this path will also work //*[@title='Month']
	  Select month=new Select(bm);
	  month.selectByVisibleText("Dec");
	  Thread.sleep(30);
	  month.selectByValue("5");
	  Thread.sleep(30);
	  month.selectByIndex(1);
	  Thread.sleep(30);
	 
	  //3rd way
	  WebElement year=driver.findElement(By.xpath("//*[@title='Year']"));
	  Select yr1=new Select(year);
	  List<WebElement> yr=yr1.getOptions();
	  	  
	  for (int i = 0; i < yr.size(); i++) {
		String birthyear=yr.get(i).getText();
		 if (birthyear.equalsIgnoreCase("1989")) {
			yr.get(i).click();
			
			System.out.println("your birth year is"+birthyear);
			
		} 
		 
	}
	  
	  
	  
	  
	}

}
