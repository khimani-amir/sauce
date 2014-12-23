Feature: To check the gmail inbox and signout

  As a User
  I want to login
  So I can check my inbox and sign out after checking the inbox
@Login
  Scenario: User can Login
    Given User is on gmail page
    When User tries to login with Username "khimani.amir" and Password "Khimani1"
    Then User can get into inbox page and click sign out
 