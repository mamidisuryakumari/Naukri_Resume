Feature: Upload REsume

@uploadresume
  Scenario: Upload resume
    Given I am on the naukri page
    When I login with below details
    #  | UserName | sandhya.qa2018@gmail.com |
   #   | Password | 70133@3160               |
    Then user should be navigated to homepage
    When I update the naukri profile
    Then profile saved successfully
  
