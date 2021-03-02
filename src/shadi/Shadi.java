package shadi;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Shadi {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium support\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.marathishaadi.com/");
		driver.findElement(By.xpath("//button[@data-testid='lets_begin']")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("hogalesubhash2@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("8446017389");
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		
		WebElement list = driver.findElement(By.xpath("//div[@aria-haspopup='listbox']"));
		act.moveToElement(list).click().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@role='option'][1]")).click();
		driver.findElement(By.xpath("//input[@id='gender_male']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("subhash");
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("hohale");
		WebElement day = driver.findElement(By.xpath("//div[@class='Dropdown-control day_selector']"));
		act.moveToElement(day).click().perform();
		driver.findElement(By.xpath(" //div[text()='17']")).click();
		WebElement month = driver.findElement(By.xpath(" //div[text()='Month']"));
		act.moveToElement(month).click().perform();
		driver.findElement(By.xpath(" //div[text()='Mar']")).click();
		WebElement year = driver.findElement(By.xpath(" //div[text()='Year']"));
		act.moveToElement(year).click().perform();
		driver.findElement(By.xpath(" //div[text()='1989']")).click();
		WebElement religion = driver.findElement(By.xpath(" //div[@class='Dropdown-control community_selector']"));
		act.moveToElement(religion).click().perform();
		driver.findElement(By.xpath(" //div[text()='Hindu']")).click();
		WebElement country = driver.findElement(By.xpath(" //div[@class='Dropdown-control countryofresidence_selector']"));
		act.moveToElement(country).click().perform();
		driver.findElement(By.xpath(" //div[text()='India']")).click();
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		
		
		

	}

}
