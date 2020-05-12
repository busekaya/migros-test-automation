#Author: buseeky@gmail.com

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
    
