Feature: Zionverse Logout

  Scenario Outline: Verify that user should be able to logout account successfully
    Given Landing on the zionverse page
    When Enter email id <Email> and password <Password>
    And Click on the login button
    Then Verify user login successfully
    When User Click on the profile button
    And Click on the logout button
    Then Verify user logout successffully

    Examples: 
      | Email                            | Password      |
      | "cauxetoibraki-1302@yopmail.com" | "Avinash@123" |
