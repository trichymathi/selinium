package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //it waits 20 sec for every find element 
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@id='ext-gen248']")).sendKeys("Divya");
		driver.findElement(By.id("ext-gen334")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		String title = driver.getTitle();
		String title1 ="View Lead | opentaps CRM";
		System.out.println(title);
		driver.findElement(By.linkText("Edit")).click();
		WebElement comname = driver.findElement(By.id("updateLeadForm_companyName"));
		comname.click();
		comname.clear();
		comname.sendKeys("MRF");
		//System.out.println();
		driver.findElement(By.className("smallSubmit")).click();
		String text = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
		System.out.println(text);
		String text2 ="MRF (11329)";
				if(text2.equals(text)) {		
			System.out.println("correct");
		}else {
			System.out.println("Wrong");
		}
		driver.close();
		//driver.quit();
	}

}
