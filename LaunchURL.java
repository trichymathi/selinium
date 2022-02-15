package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchURL {

	public static void main(String[] args) {
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
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mathi");
	    //driver.get("createLeadForm_firstName");
		//String firstname=new String();
		//System.out.println(firstname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("MARAN");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("trichy");
		driver.findElement(By.id("createLeadForm_parentPartyId")).sendKeys("11024");
		WebElement DataSource = driver.findElement(By.name("dataSourceId"));
		Select text =new Select(DataSource);
		text.selectByVisibleText("Employee");
		WebElement Marketing = driver.findElement(By.name("marketingCampaignId"));
		Select text1 =new Select(Marketing);
		text1.selectByVisibleText("Automobile");
		driver.findElement(By.name("birthDate")).sendKeys("02/11/1999");		
		WebElement Industry = driver.findElement(By.name("industryEnumId"));
		Select text2 =new Select(Industry);
		text2.selectByVisibleText("Manufacturing");
		WebElement Owner = driver.findElement(By.name("ownershipEnumId"));
		Select text3 =new Select(Owner);
		text3.selectByVisibleText("Public Corporation");
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
		driver.findElement(By.name("primaryPhoneNumber")).sendKeys("6383585161");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abcdefghi@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("abcder");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https://github.com");
		driver.findElement(By.name("primaryPhoneExtension")).sendKeys("123456789");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("mathi");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("raj");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("56/2 kakkan colony");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("thiruvermbur");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("trichy");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("620013");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("620014");
		WebElement Country = driver.findElement(By.name("generalCountryGeoId"));
		Select text4 =new Select(Country);
		text4.selectByVisibleText("India");
		WebElement State = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select text5 =new Select(State);
		text5.selectByVisibleText("TAMILNADU");
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		String title1 = "View Lead | opentaps CRM";
		if(title.equals(title1))
			System.out.println("TestCase Pass");
		else 
			System.err.println("TestCase fail");
		driver.close();
}
	}

