Feature: Employer Enters histroric feedback and then hide candidate profile

  Scenario: Employer Post new job for historic rounds
    Given Employer Post new job for historic feedback
    Then Jobseeker accepts the job invitation

    Scenario: Employer enter "SELECT" historic feedback of rounds
       Given user should be on feedback screen
      Then Enter select feedback for telephonic round
      Then Enter select feedback for video conference round
      Then Enter select feedback for Face to face round
      Then Enter select feedback for coding round

  Scenario: Employer enters "REJECT" historic feedback of rounds and then hide's the candidate profile
    Given user should be on feedback screen
    Then Enter reject feedback for telephonic round
    Then Enter reject feedback for video conference round
    Then Enter reject feedback for Face to face round
    Then Enter reject feedback for coding round
    Then Hide the candidate profile





