Feature: Login

  Scenario: Successful login with valid credentials
    Given User Launch The Chrome Bowser
    When  User Opens URL "https://admin-demo.nopcommerce.com/login/"
    And   User enters Email as "admin@yourstore.com" and Password as "admin"
    And   User clicks Login
    Then  Page Title should be "Dashboard"
    When  User click on Log out link
    Then  Page Title is "Welcome, please sign in!"
    And   Close browser


