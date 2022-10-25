Feature: Reset functionality on login page of Application

Scenario Outline: Verification of Reset button
  Given Open the Chrome and launch app the application
  When Enter the <username> and <password>
  Then Reset the credential

  Examples:
    | username | password |
    | user1  | pass1  |
    | user2  | pass2  |
    | user3  | pass3  |
