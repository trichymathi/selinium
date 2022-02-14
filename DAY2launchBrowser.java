package week2;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DAY2launchBrowser {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//driver.findElement(By.name("USERNAME")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mathi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("MARAN");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("trichy");
		driver.findElement(By.id("createLeadForm_parentPartyId")).sendKeys("11024");
		driver.findElement(By.id("createLeadForm_marketingCampaignId")).sendKeys("12345");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("mathi");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Family");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("RSGM");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("20002356");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("621152");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("sales");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("55");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("25");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("WORK HARD");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("DONT LIE");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("0431");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("2554559");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abcdefghi@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("abcder");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https://github.com");
		//driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("mathi");
		//driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("raj");
		//driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("56/2 kakkan colony");
		//driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("thiruvermbur");
		//driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("trichy");
		//driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("620013");
		//driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("620014");
		//driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).click();
		driver.findElement(By.className("smallSubmit")).click();
		//driver.findElement(By.id("createLeadForm_dataSourceId")).click();
	}

}
   