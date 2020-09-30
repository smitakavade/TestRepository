package Package;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class FlipkartCheckbox {
	private static final FileHandler FileUtils = null;
	// private Webdriver driver;

	public static void main(String[] args) throws Exception {
		// Object fileutils;
		Logger logger=Logger.getLogger("FlipkartCheckbox");
		PropertyConfigurator.configure("G:\\Software\\Workspace\\JavaProject\\JavaProject\\log4j.properties");
		FlipkartCheckbox fc = new FlipkartCheckbox();
		String screenshotname = null;
		System.setProperty("webdriver.chrome.driver", "G:\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		logger.info("Chromedriver open");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		logger.info("Implicit wait initialize");
		driver.manage().window().maximize();
		logger.info("windpw maximize");

		driver.get("https://www.flipkart.com/mobile-phones-store?otracker=nmenu_sub_Electronics_0_Mobiles");
		System.out.println("welcome to flipkart page");
		fc.searchMobile(driver);
		fc.selectRange(driver);
		fc.selectCheckbox(driver);		
		Screenshot(driver, screenshotname);
	}

	public void selectCheckbox(WebDriver driver) {

		List<WebElement> cb = driver.findElements(By.xpath("//section[4]//*[contains(@title,'2 GB')]"));
		for (int i = 0; i < cb.size(); i++) {

			String RAM1 = cb.get(i).getText();
			System.out.println("value of ram is" + RAM1);

			cb.get(i).click();

		}

	}

	public void searchMobile(WebDriver driver) {
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"))
				.sendKeys("samsung mobiles");
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"))
		.sendKeys("0x0A");
		 
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	public void selectRange(WebDriver driver) throws Exception
	{
		
		List<WebElement>pr=driver.findElements(By.xpath("//select[@xpath='1']/option"));
		System.out.println(pr.size());
		pr.get(4).click();//not able to handle ruppee symbol so used index
		Thread.sleep(3000);
	   /* for (int i=0;i<pr.size();i++) {
	    	String str=pr.get(i).getText();
	    	
	    	
	    	
	    	/*if (str.equalsIgnoreCase("10000"))//not able to handle ruppee symbol so used index 
	    		{
	    		pr.get(i).click();
	    	}
	    }*/
	}
	
	
	public static void Screenshot(WebDriver driver, String screenshotname) {

		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File DestFile = new File("G:/smita salenium/screen1");
			FileUtils.copy(source, new File("./Screenshots/" + screenshotname + ".png"));
			// copyFile(source,new File("./smi/screen1+".png));
			// FileHandler.copy(source,DestFile);
			System.out.println("Screenshot traken");
			// driver.quit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
