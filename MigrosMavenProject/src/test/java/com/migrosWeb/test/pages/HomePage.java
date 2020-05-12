package com.migrosWeb.test.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import com.migrosWeb.test.main.BaseClass;


public class HomePage extends BaseClass{

	String price,name; 
	
	@FindBy(xpath = "(//span[contains(text(),'Tüm Kategoriler')])[1]")
	WebElement title;
	@FindBy(xpath = "(.//*[@class='header-menu-bar-list-item '])[2]")
	WebElement etTavuk_Btn_Xpath;
	@FindBy(xpath = "(.//*[@class='category-filter '])[1]")
	WebElement kirmiziEt_Btn_Xpath;
	@FindBy(xpath = "(.//*[@class='menu-title'])[1]")
	WebElement menuTitle_Txt_ClassName;
	@FindBy(id = "product-search")
	WebElement productSearch_SearchBx_Id;
	@FindBy(xpath = ".//*[@class='title product-card-title']//a")
	WebElement product_Btn_Xpath;
	@FindBy(xpath = ".//*[@class='seo title']")
	WebElement productName_Txt_ClassName;
	@FindBy(id = "store-product-primary-price")
	WebElement value_Txt_ClassName;
	@FindBy(xpath = "(.//*[@type='submit'])[5]")
	WebElement addToBasket_Btn_ClassName;
	@FindBy(id = "product-detail-note-textarea")
	WebElement noteArea_Txt_ClassName;
	@FindBy(xpath = "//span[contains(text(),'Kaydet')]")
	WebElement save_Btn_Xpath;
	@FindBy(xpath = "(.//*[@id='main-search']//button)[1]")
	WebElement search_Btn_Xpath;
	@FindBy(xpath = ".//*[@class='value']")
	WebElement price_Txt_Xpath;
	@FindBy(xpath = ".//*[@class='title product-card-title']//a")
	WebElement productName_Txt_Xpath;
	
	
	public void checkTitle(){
		
		visibleElementWait(search_Btn_Xpath);
        Assert.assertEquals(menuTitle_Txt_ClassName.getText(),"Tüm Kategoriler");

	}
	
	public void clickOn_EtTavukBtn() {
		
		etTavuk_Btn_Xpath.click();
		
	}

	public void clickOn_KirmiziEtBtn() {
		visibleElementWait(kirmiziEt_Btn_Xpath);
		kirmiziEt_Btn_Xpath.click();
	}

	public void enters_SearchBox() {
		
		visibleElementWait(productSearch_SearchBx_Id);
		productSearch_SearchBx_Id.click();
		productSearch_SearchBx_Id.sendKeys("Haslamalık Dana Et");
		productSearch_SearchBx_Id.sendKeys(Keys.ENTER); 
		
	}
	
	
	public void clicksOn_AddToBasket() throws InterruptedException {

		Thread.sleep(3000);
		price = price_Txt_Xpath.getText();
		name = productName_Txt_Xpath.getText();
		addToBasket_Btn_ClassName.click();
		
		
	}

	public void clicksOn_Result() throws Exception {

		Thread.sleep(3000);	
		product_Btn_Xpath.click();
		
	}

	public void check_SelectedData() {

		visibleElementWait(save_Btn_Xpath);
		Assert.assertEquals(productName_Txt_ClassName.getText(),name);
		Assert.assertEquals(value_Txt_ClassName.getText(), price);	
	}

	public void enters_NoteTxtbx() {
		
		noteArea_Txt_ClassName.click();
		noteArea_Txt_ClassName.sendKeys("120 gramlık paketler şeklinde hazırlanmasını istiyorum");
		save_Btn_Xpath.click();
		
	}
	

}
