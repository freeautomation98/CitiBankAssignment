Feature: Test OrangeHRM Application

  Scenario: Test OrangeHRM application LoginPage Functionality
    Given User is on LoginPage
    When User enter valid username  "Admin" and password  "admin123" and click on loginButton
    Then user will be on Homepage

  Scenario: Test OrageHRM application Add user functionality in PIM page
    Given user click on menu button and user is on PIMPage
    Then click on add employee and first name,last name and click on save button
      | FirstName | LastName |
      | Abc       | Pqr     |
      | snehal    | Ghavare  |
   
   Scenario:  Test OrangeHRM application Search and delete user functionality in PIM Page
    Given user click on menu button and user is on PIMPage
    When user enter employee name as "snehal" and click on search and delete button 
    
