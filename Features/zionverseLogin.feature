Feature: Login

  Scenario Outline: Verify that user should able to login successfully with 2fa security
    Given Landing on the zionverse page
    When Enter email id <Email> and password <Password>
    And Click on the login button
    And Enter valid two authenticator code
    Then Verify user login successfully

    Examples: 
      | Email                      | Password      |
      | "avinash@totalitycorp.com" | "Avinash@123" |

  Scenario Outline: Verify that user should able to login successfully without 2fa security.
    Given Landing on the zionverse page
    When Enter email id <Email> and password <Password>
    And Click on the login button
    Then Verify user login successfully

    Examples: 
      | Email                        | Password      |
      | "panorama.avinash@gmail.com" | "Avinash@123" |
