package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class VtigerCampaignPage extends SeleniumUtility{
	WebDriver driver;
	VtigerCampaignPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy (xpath="//button[@id='Campaigns_listView_basicAction_LBL_ADD_RECORD'])")
	private WebElement addCampaign;
	
	@FindBy(xpath="//input[@id='Campaigns_editView_fieldName_campaignname']")
	private WebElement Name;
	
	@FindBy(xpath="//td[@class=\"day\"]")
	private WebElement date;
	
	@FindBy(xpath="//button[@class='btn btn-success saveButton']")
	private WebElement savedata;
	
	public void  createCampaign()
	{
		clickOnElement(addCampaign);
		clickOnElement(Name);
		clickOnElement(date);
		clickOnElement(savedata);
		
		
	}


}
