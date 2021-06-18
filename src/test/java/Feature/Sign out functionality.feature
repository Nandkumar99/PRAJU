Feature: sign out functionality

  Scenario: standard employer sign out functionality
    When standard employer should be on home page
    Then signout

    Scenario: premium employer sign out functionality
      When premium employer should be on home page
      Then signout

     Scenario: Jobseeker sign out functionality
       When jobseeker should on home page
       Then signout

