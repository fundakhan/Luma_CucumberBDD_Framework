Feature: Address Functionality

  Background:
    Given Navigate to Luma Website
    And Click to sign in menu button
    And Fill in the email input as "toffee@gmail.com"
    And Fill in the password input as "Tof1234tof"
    Then Click to sign in button

  Scenario Outline: Add Address Process

    And Click to My Account Menu button
    And Click to Manage Address button
    And Click to Add New Address button
    And Fill in the Company input as "<company>"
    And Fill in the Phone Number input as "<phone>"
    And Fill in the Street addres first input as "<address>"
    And Fill in the city input as "<city>"
    And Fill in the Zip Code input as "<zipcode>"
    And Select a state
    And Select a country
    When Click to save address button
    Then Saved message should be displayed
    And Click to address sign out button

    Examples:
      | company | phone    | address          | city    | zipcode |
      | Mersys  | 12525396 | 452 Lakeview Dr. | Weston  | 33326   |
      | Campus  | 14296566 | Newyork Street   | Dallas  | 12345   |