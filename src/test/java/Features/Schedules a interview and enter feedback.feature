Feature: Schedules an interview and enter feedback
  Scenario: Employer Post new job for scheduling interviews
    Given Post new job for scheduling interviews
    Then Jobseeker accepts the intial job invitation

  Scenario: Schedules the coding round
    Then User should be on interview scheduling screen
    Given Schedules the coding round
    Then Enter feedbck of coding round as rejected
    Then Enter feedback of coding round as cleared

    Scenario: Schedules the telephonic round
      Then User should be on interview scheduling screen
      Given Schedules the Telephonic round
      Then Enter feedback of Telephonic round as rejected
      Then Enter feedback of telephonic round as selected

  Scenario: Schedules the Video conference round
    Then User should be on interview scheduling screen
    Given Schedules the video conference round
    Then Enter feedback of video conference round as rejected
    Then Enter feedback of video conference round as selected


  Scenario: Schedules the face to face round
  Then User should be on interview scheduling screen
    Given Schedules the face to face round round
    Then Enter feedback of face to face round as rejected
    Then Enter feedback of face to face round as selected


