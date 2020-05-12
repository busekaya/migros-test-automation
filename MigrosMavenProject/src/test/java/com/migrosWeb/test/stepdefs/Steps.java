package com.migrosWeb.test.stepdefs;

import org.openqa.selenium.support.PageFactory;

import com.migrosWeb.test.main.BaseClass;
import com.migrosWeb.test.pages.BasketPage;
import com.migrosWeb.test.pages.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Steps extends BaseClass{
	

	//HomePage home = new HomePage();
	 
	// and initialise any WebElement fields in it.
    HomePage home = PageFactory.initElements(driver, HomePage.class);
    BasketPage basket = PageFactory.initElements(driver, BasketPage.class);
    
    String price;
    
	@Given("^Home Page is already opened$")
	 public void checkHomePage(){
		
		 home.checkTitle();
	 }

	 
	 @When("^The user clicks on the Et Tavuk Menu$")
	 public void mouseOverEtTavukMenu() {
		 
		 home.clickOn_EtTavukBtn();
	 }

	 
	 @Then("^Kırmızı Et menu should be appeared$")
	 public void clickOnKirmiziEtBtn() {
		 
		 home.clickOn_KirmiziEtBtn();
	 }

	 @When("^The user enters Dana Haslamalık Et to search box$")
	 public void entersToSearchbox() {
		 
		 home.enters_SearchBox();
	 }

	 @And("^The user clicks right result$")
	 public void clicksRightResult() throws Exception {
		 
		 home.clicksOn_Result();
	 }
	   
	 @Then("^Selected data should be right$")
	 public void checkSelectedData() {
		 
		 home.check_SelectedData();
	 }
	 
	 @When("^The user enters 120 gramlık paketler şeklinde hazırlanmasını istiyorum to note textbox$")
	 public void enterTheNote() {
		 
		 home.enters_NoteTxtbx();
	 }
	 
	 @And("^The user clicks Sepete Ekle button$")
	 public void clicksOnAddToBasket() throws InterruptedException {
		 
		 home.clicksOn_AddToBasket();
	 }
	 
	 @And("^The user clicks - button 5 times$")
	 public void clicksOnDecreaseBtn(){
		 
		 basket.clicksOn_DecreaseBtn();
	 }
	 
	
	 @And("^The user opens the basket$")
	 public void clicksOnBasketBtn() throws InterruptedException {
		 
		 basket.clicksOn_BasketBtn();
	 }
	 
	 @And("^The user adds product for min limit$")
	 public void clicksOnIncreaseBtn() {
		 
		 basket.clicksOn_IncreaseBtn();
	 }
	 
	 @Then("^Information of the product should be right$")
	 public void checkTheInfoOfProduct() throws InterruptedException {
		 
		 basket.check_InformationOfProduct();
	 }
	     
	 @When("^The user clicks on Sepeti Onayla button$")
	 public void clicksOnConfirmBasket() {
		 
		 basket.clicksOn_ConfirmBasket();
	 }
	      
	
	 @Then("^Selecting Adress page should be opened$")
	 public void checkSelectingAdress() {
		 
		 basket.check_SelectingAdress();
	 }
	 
	 @And("^Price should be correct$")
	 public void checkPrice() {
		 
		 basket.check_Price();
	 }
	   

	 
	 
	 
}
