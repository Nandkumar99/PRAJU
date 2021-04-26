Feature: VeryFyl Login
  Scenario: VeryFyl Login Functionality
    When I open Employer Standard Login page
#    Then I Open Home page
    And close browser

  Scenario: Premium Employer Login
    When I open employer premium login page
    Then I open Home page
    And close browser




  Scenario: Jobseeker Login through Google
    When I open Jobbseeker Linkedin login
    Then Enter Linkden userid and password
    And close browser

    Scenario: Jobseeker Login through Linkedin
      When I open Jobseeker google login
      Then Enter google userid and password
      And close browser