Feature: Enter histroric round feedback
  Scenario: Post new job And jobseeker accept intial job invitation
    Given Post new job for historic feedback
    Given Jobseeker accepts the job invitation

    Scenario: Employer enter historic feedback of Telephonic round
      Given user should be on feedback screen
      Then Enter reject feedback for telephonic round
      Then Enter select feedback for telephonic round

      Scenario: Employer enter historic feedback of video conference round
        Given user should be on feedback screen
        Then Enter reject feedback for video conference round
        Then Enter select feedback for video conference round

  Scenario: Employer enter historic feedback of Face to face round
   Given user should be on feedback screen
    Then Enter reject feedback for Face to face round
    Then Enter select feedback for Face to face round



  Scenario: Employer enter historic feedback of coding round
    Given user should be on feedback screen
    Then Enter reject feedback for coding round
    Then Enter select feedback for coding round

