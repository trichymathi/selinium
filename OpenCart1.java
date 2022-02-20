package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCart1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("input-username")).sendKeys("trichymathi");
		driver.findElement(By.id("input-firstname")).sendKeys("MATHI");
		driver.findElement(By.id("input-lastname")).sendKeys("MARAN R");
		driver.findElement(By.id("input-email")).sendKeys("maranmathi3@gmail.com");
		WebElement country = driver.findElement(By.xpath("//select[@id='input-country']"));
		Select count = new Select(country);
		count.selectByVisibleText("India");
		Thread.sleep(1000);
		driver.findElement(By.id("input-password")).sendKeys("6383585161");
		driver.close();
		
			
		}
		

	}


