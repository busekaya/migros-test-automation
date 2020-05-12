package com.migrosWeb.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import com.migrosWeb.test.main.BaseClass;

public class BasketPage extends BaseClass{
	
	@FindBy(className = "shopping-cart-amount")
	WebElement basketDown_Btn_ClassName;
	@FindBy(xpath = "(//*[@class='go-to-basket-button market'])[1]")
	WebElement goToBasket_Btn_ClassName;
	@FindBy(xpath = "(.//*[@class='icon plus-orange'])[1]")
	WebElement increase_Btn_Xpath;
	@FindBy(className = "minimum-required-price")
	WebElement minimumRequiredprice_Txt_Id;
	@FindBy(xpath = "(.//*[@class='product-amount'])[1]")
	WebElement productAmount_Txt_Xpath;
	@FindBy(xpath = ".//*[@class='product-title']//a")
	WebElement productName_Txt_Xpath;
	@FindBy(xpath = "(.//*[@class='open-action--text'])[1]")
	WebElement showProductNote_Btn_Xpath;
	@FindBy(xpath = "")
	WebElement productNote_Txt_Xpath;
	@FindBy(id = "in-cart-next-button")
	WebElement confirmBasket_Txt_Id;
	@FindBy(xpath = "//button[contains(@class,'button orange next-button')]")
	WebElement next_Btn_Xpath;
	@FindBy(xpath = "(.//*[@class='address'])[1]")
	WebElement adress_Txt_Xpath;
	@FindBy(xpath = "(.//*[@class='part product-minus']//i)[1]")
	WebElement decrease_Btn_ClassName;
	@FindBy(xpath = "(.//*[@class='progress-bar-text'])[1]")
	WebElement progressData_Txt_Xpath;
	@FindBy(xpath = ".//*[@class='modal-footer']//button")
	WebElement campaign_Btn_ClassName;
	@FindBy(id = "summaryRevenue")
	WebElement price_Txt_Id;
	
    String price = "61,95 TL";
	
	public void clicksOn_BasketBtn() throws InterruptedException {
		
		goToBasket_Btn_ClassName.click();
		Thread.sleep(2000);
		if(campaign_Btn_ClassName.isDisplayed()) {
			campaign_Btn_ClassName.click();
		}
		
	}

	public void clicksOn_IncreaseBtn() {
		
		if(minimumRequiredprice_Txt_Id.isDisplayed()) {
		
			increase_Btn_Xpath.click();
		}
	}
	
	
    public void clicksOn_DecreaseBtn(){
    	
    	basketDown_Btn_ClassName.click();
		visibleElementWait(goToBasket_Btn_ClassName);	
		decrease_Btn_ClassName.click();
		visibleElementWait(progressData_Txt_Xpath);
	}
	

	public void check_InformationOfProduct() throws InterruptedException {
		
		Thread.sleep(3000);
		Assert.assertTrue(productAmount_Txt_Xpath.getAttribute("value").contains("1"));
		Assert.assertEquals(price_Txt_Id.getText(),price);		
	}

	public void clicksOn_ConfirmBasket() {
		
		confirmBasket_Txt_Id.click();
		
	}
	


	public void check_SelectingAdress() {

		visibleElementWait(next_Btn_Xpath);

	}


	public void check_Price() {
		Assert.assertEquals(price_Txt_Id.getText(),price);		
	}

}
