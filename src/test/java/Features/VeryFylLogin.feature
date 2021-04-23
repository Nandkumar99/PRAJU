Feature: VeryFyl Login
  Scenario: VeryFyl Login Functionality
    When I open VeryFyl Login page
    Then I Open VeryFyl Home page
    Then close browser


  Scenario: Premium Employer Login
    When I open premium login page
    Then Enter Id And Password

  Scenario: Jobseeker Login through Google
    When I open Jobbseeker Linkedin login
    Then Enter Linkden userid and password

    Scenario: Jobseeker Login through Linkedin
      When I open Jobseeker google login
      Then Enter google userid and password
