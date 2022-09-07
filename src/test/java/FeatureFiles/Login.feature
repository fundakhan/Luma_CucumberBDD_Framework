Feature:Login Functionality

  Scenario:Login process with valid information
    Given Navigate to Luma Website
    And Click to sign in menu button
    And Fill in the email input as "toffee@gmail.com"
    And Fill in the password input as "Tof1234tof"
    When Click to sign in button
    Then Verify that you are logged in