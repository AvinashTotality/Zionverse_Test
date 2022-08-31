Feature: Login

  @Sanity
  Scenario Outline: Login with valid credentials
    Given Landing on the zionverse page
    When Enter email id <Email> and password <Password>
    And Click on the login button
    Then Verify user login successfully

  
    
    Examples:
    
    | Email | Password  |
    | "panorama.avinash@gmail.com" | "Avinash@123" |

