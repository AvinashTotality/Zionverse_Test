Feature: EnableTwoFactorAuthentication

  Scenario Outline: Verify that user should be able to enabled 2fa successfully
    Given Landing on the zionverse page
    When Enter email id <Email> and password <Password>
    And Click on the login button
    Then Verify user login successfully
    When User Click on the profile button
    And Click on the setting button in menu
    And Click on the 2fa security button
    And Click on the activate 2fa button
    And Enter account password <Password> in password field
    And Click on the continue button
    And Enter 2fa auth code
    And Click on the activate button
    Then Verify 2fa security activate successfully 

    Examples: 
      | Email                            | Password      |
      | "cauxetoibraki-1302@yopmail.com" | "Avinash@123" |
