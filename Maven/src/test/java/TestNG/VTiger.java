package TestNG;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class VTiger extends SeleniumUtility {
WebDriver driver;
	@BeforeSuite
	public void login()
	{
		driver=setUp("chrome","https://demo.vtiger.com/vtigercrm/index.php");
		WebElement username=driver.findElement(By.id("username"));
		username.clear();
		username.sendKeys("admin");
		WebElement password=driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("Test@123");
		WebElement button=driver.findElement(By.className("buttonBlue"));
		button.click();	
		
	}
	
	
	@Test(priority=0)
	public void add() throws InterruptedException
	{
		WebElement burger=driver.findElement(By.xpath("//div[@class=\"row app-navigator\"]"));
		  burger.click();
		  WebElement MARKETING =driver.findElement(By.xpath("//div[@id=\"MARKETING_modules_dropdownMenu\"]"));
		  Actions act=new Actions(driver);
		  act.moveToElement(MARKETING).perform();
		  Thread.sleep(2000);
		  WebElement campaign =driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/li[1]/a/span[2]"));	
		  Actions act2=new Actions(driver);
		  act2.moveToElement(campaign).perform();
		  campaign.click();
		  WebElement addelement=driver.findElement(By.xpath("//*[@id=\"Campaigns_listView_basicAction_LBL_ADD_RECORD\"]"));
		  addelement.click();
		  WebElement campaignname=driver.findElement(By.xpath("//input[@id=\"Campaigns_editView_fieldName_campaignname\"]"));
		  campaignname.sendKeys("raavan");
		  WebElement calander=driver.findElement(By.xpath("//*[@id=\"Campaigns_editView_fieldName_closingdate\"]"));
		  calander.click();
		  WebElement nextmonth = driver.findElement(By.xpath("/html/body/div[7]/div[1]/table/thead/tr[1]/th[3]"));
		  nextmonth.click();
		  WebElement nov2=driver.findElement(By.xpath("/html/body/div[7]/div[1]/table/tbody/tr[1]/td[4]"));
		  nov2.click();
		  WebElement save=driver.findElement(By.xpath("//button[text()=\"Save\"]"));
		  save.click();
		  WebElement camp = driver.findElement(By.xpath("//*[@id=\"page\"]/nav/div[2]/div/div[3]/div/div[1]/a/h4"));
		  camp.click();
		  WebElement checkbox= driver.findElement(By.xpath("//*[@id=\"Campaigns_listView_row_1\"]/td[1]/div/span[1]/input"));
		  checkbox.click();
		  WebElement edit= driver.findElement(By.xpath("//*[@id=\"Campaigns_listView_massAction_LBL_EDIT\"]"));
		  edit.click();
		  WebElement dropdown1=driver.findElement(By.xpath("//*[@id=\"s2id_autogen15\"]"));
		  dropdown1.click();
		  WebElement name=driver.findElement(By.xpath("//*[@id=\"select2-results-16\"]/li[2]/ul/li"));
		  name.click(); 
		  WebElement save2=driver.findElement(By.xpath("//*[@id=\"massEdit\"]/div/footer/center/button"));
		  save2.click();
		  Thread.sleep(2000);
		  WebElement chechbox2=driver.findElement(By.xpath("//*[@id=\"Campaigns_listView_row_1\"]/td[1]/div/span[1]/input"));
		  chechbox2.click();
		  WebElement delete=driver.findElement(By.xpath("//*[@id=\"Campaigns_listView_massAction_LBL_DELETE\"]"));
		  delete.click();
		  WebElement Confirm=driver.findElement(By.xpath("/html/body/div[10]/div[2]/div/div[2]/button[2]"));
		  Confirm.click();
		}

	@Test(priority=1)
	
		public void leads() throws InterruptedException {
		  WebElement burger=driver.findElement(By.xpath("//div[@class=\"row app-navigator\"]"));
		  burger.click();
		  WebElement MARKETING =driver.findElement(By.xpath("//div[@id=\"MARKETING_modules_dropdownMenu\"]"));
			  Actions act=new Actions(driver);
			  act.moveToElement(MARKETING).perform();
			  Thread.sleep(2000);
			  WebElement leads=driver.findElement(By.xpath("//*[@id=\"mCSB_16_container\"]/li[2]/a/span[2]"));
			  leads.click();
			  Actions act3=new Actions(driver);
			  act3.moveToElement(leads).perform();
			  WebElement addelementlead=driver.findElement(By.xpath("//*[@id=\"Leads_listView_basicAction_LBL_ADD_RECORD\"]"));
			  addelementlead.click();
	}


}
	

