Feature: Login to Application

  @ValidCredentials
  Scenario: Login with valid credentials and logout

    When User enters username as "Admin" and password as "admin123"
    Then User should be able to login sucessfully and new page open