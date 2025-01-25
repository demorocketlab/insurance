Feature: sample karate test script

  Background:
#    examples:
#    * call read('login.feature')
#    * configure afterFeature = function(){ karate.call('after-feature.feature'); }

    * call read 'classpath:pages/home/home.json'
    * driver baseURL
    * def driverObj = karate.get('driver')
    * def Pages = Java.type('pages.Pages')
    * def pg = new Pages(driverObj)

  @Test0
  Scenario: open google search
    * driver 'https://google.com/'
    * waitFor("//button/div[contains(text(),'Accept all')]").click()
    * input('textarea[name=q]', 'method get')
    * click('input[name=btnK]')
    * screenshot()

  @Test1
  Scenario: open google search
    * driver baseURL
    * waitFor(consents.AcceptAll).click()
    * input(home.searchInput, 'method get')
    * click(home.submit)
    * screenshot()

  @Test2
  Scenario: open google search
    * pg.homePage.acceptAllConsents()
    * pg.homePage.inputSearchWords('method get')
