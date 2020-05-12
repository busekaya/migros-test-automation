$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Case.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: buseeky@gmail.com"
    }
  ],
  "line": 3,
  "name": "Open Home Page",
  "description": "",
  "id": "open-home-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 7,
  "name": "Home Page",
  "description": "",
  "id": "open-home-page;home-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Home Page is already opened",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "The user mouse hover on the Et Tavuk Menu",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Kırmızı Et menu should be appeared",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "The user enters Dana Haslamalık Et to search box",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "The user clicks Sepete Ekle button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "The user clicks right result",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Selected data should be right",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "The user enters 120 gramlık paketler şeklinde hazırlanmasını istiyorum to note textbox",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "The user clicks - button 5 times",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "The user opens the basket",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "The user adds product for min limit",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Information of the product should be right",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "The user clicks on Sepeti Onayla button",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "Selecting Adress page should be opened",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "Price should be correct",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.checkHomePage()"
});
formatter.result({
  "duration": 416703840,
  "status": "passed"
});
formatter.match({
  "location": "Steps.mouseOverEtTavukMenu()"
});
formatter.result({
  "duration": 1352473856,
  "status": "passed"
});
formatter.match({
  "location": "Steps.clickOnKirmiziEtBtn()"
});
formatter.result({
  "duration": 878611256,
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d81.0.4044.129)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027odeal\u0027, ip: \u0027127.0.1.1\u0027, os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00274.15.0-1076-oem\u0027, java.version: \u002711.0.7\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 81.0.4044.129, chrome: {chromedriverVersion: 81.0.4044.138 (8c6c7ba89cc9..., userDataDir: /tmp/.com.google.Chrome.baDoYG}, goog:chromeOptions: {debuggerAddress: localhost:38813}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: LINUX, platformName: LINUX, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: f1e5c8ef2b5a84cde2b289e27e6c912f\n*** Element info: {Using\u003dxpath, value\u003d(.//*[@class\u003d\u0027category-filter \u0027])[1]}\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy24.isDisplayed(Unknown Source)\n\tat org.openqa.selenium.support.ui.ExpectedConditions.elementIfVisible(ExpectedConditions.java:314)\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$000(ExpectedConditions.java:43)\n\tat org.openqa.selenium.support.ui.ExpectedConditions$10.apply(ExpectedConditions.java:300)\n\tat org.openqa.selenium.support.ui.ExpectedConditions$10.apply(ExpectedConditions.java:297)\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:249)\n\tat com.migrosWeb.test.main.BaseClass.visibleElementWait(BaseClass.java:84)\n\tat com.migrosWeb.test.pages.HomePage.clickOn_KirmiziEtBtn(HomePage.java:58)\n\tat com.migrosWeb.test.stepdefs.Steps.clickOnKirmiziEtBtn(Steps.java:42)\n\tat ✽.Then Kırmızı Et menu should be appeared(Case.feature:10)\n",
  "status": "failed"
});
formatter.match({
  "location": "Steps.entersToSearchbox()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.clicksOnAddToBasket()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.clicksRightResult()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.checkSelectedData()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.enterTheNote()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.clicksOnDecreaseBtn()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.clicksOnBasketBtn()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.clicksOnIncreaseBtn()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.checkTheInfoOfProduct()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.clicksOnConfirmBasket()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.checkSelectingAdress()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.checkPrice()"
});
formatter.result({
  "status": "skipped"
});
});