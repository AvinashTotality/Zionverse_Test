Feature: CompleteKYC

  @Sanity
  Scenario Outline: Complete KYC succefully with pan card
    Given Landing on the zionverse page
    When Enter email id <Email> and password <Password>
    And Click on the login button
    Then Verify user login successfully
    When User click on the KYC button

    #And Verify user details on the complete your KYC
    #And Click on the proceed button
    #And Click on the agree radio and proceed button
    #And Click on the pan button and proceed button
    #And Click on the upload id button
    #And Click on the upload link and select document
    Examples: 
      | Email                        | Password      |
      | "panorama.avinash@gmail.com" | "Avinash@123" |