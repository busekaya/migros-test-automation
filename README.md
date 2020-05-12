# migros-test-automation

#### Pre-requisites
1. Java indirilmelli
2. Maven indirilmelli


* Scriptler **config.properties** dosyasında tanımlandığı gibi **Chrome** browserda başarılı bir şekilde çalışmaktadır.

* Scriptin koşacağı site **config.properties** dosyasında tanımlandığı gibi başarılı bir şekilde açılmaktadır.

* Scriptler hem firefox hem de chrome üzerinde koşabilir.

* Bu proje Java'da Page Object Model kullanılarak Selenium, Cucumber, Maven, ve TestNG kullanılarak bir Web Otomasyon Framework olarak design edilmiştir.

#### Writing Features
```
 Feature: Open Home Page

 
 @test
  Scenario: Home Page
    Given Home Page is already opened
    When The user clicks on the Et Tavuk Menu
    Then Kırmızı Et menu should be appeared
    When The user enters Dana Haslamalık Et to search box
    And The user clicks Sepete Ekle button
    And The user clicks right result
    Then Selected data should be right
    When The user enters 120 gramlık paketler şeklinde hazırlanmasını istiyorum to note textbox
    And The user clicks - button 5 times
    And The user opens the basket
    And The user adds product for min limit
    Then Information of the product should be right
    When The user clicks on Sepeti Onayla button
    Then Selecting Adress page should be opened
    And Price should be correct
```


#### Writing Step Definitions

```
 @Then("^Kırmızı Et menu should be appeared$")
	 public void clickOnKirmiziEtBtn() {
		 
		 home.clickOn_KirmiziEtBtn();
	 }
```


#### Cucumber Options

```
 @CucumberOptions(
		glue = {"com/migrosWeb/test/stepdefs"}, 
		tags= {"@test"},
		plugin = {"html:target/cucumber-reports/cucumber-pretty","json:target/json-cucumber-reports/default/cukejson.json",
		"testng:target/testng-cucumber-reports/cuketestng.xml" }, 
		features = {"src/test/resources/features"})

```



###Framework Architecture
--------------
	MigrosMavenProject
		|
		|_src/test/java
		|	|_com.migrosWeb.test.main
		|	|	|_BaseClass.java
		|	|_com.migrosWeb.test.stepdefs
		|	|	|_Steps.java
                |       |_com.migrosWeb.test.pages
		|	|	|_BasketPage.java
		|	|	|_HomePage.java
		|	|_com.migrosWeb.test.runner
		|	|	|_TestRunner.java
		|_src/test/resources
		|	|_features
		|	|	|_Case.feature
		|       |       |
                |       |_config
                                |_config.properties


* **com.migrosWeb.test.main** package altında BaseClass'ın içinde config file tanımlanmıştır ve browser setup yapılmıştır.
* **com.migrosWeb.test.stepdefs** package altında Steps'ın içinde feature steps tanımlamaları yapılmıştır.
* **com.migrosWeb.test.pages** package altında bütün sayfaların elementleri tanımlanmıştır.
* **com.migrosWeb.test.runner** Bu package ise glue code location (Steps) ve test resultlarının ne şekilde saklanmasını istediğimizi, features file tanımladığımız cucumber runner bulunmaktadır.
* **features** bütün senaryoları yazdığımız file.
* **config** browserType ve url set ettiğimiz dosya.
