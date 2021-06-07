Feature: Schedules an interview and enter feedback

  Scenario:post new job for schedules interviews
    When employer post new job for scheduling interview round
    Then Jobseeker accepts the intial job invitation

  Scenario: Schedules the coding round
    Then User should be on interview scheduling screen
    Given Schedules the coding round
    Then Enter feedback of coding round

  Scenario: Schedules the telephonic round
    Then User should be on interview scheduling screen
    Given Schedules the Telephonic round
    Then Enter feedback of telephonic round

  Scenario: Schedules the Video conference round
    Then User should be on interview scheduling screen
    Given Schedules the video conference round
    Then Enter feedback of video conference round

  Scenario: Schedules the face to face round
    Then User should be on interview scheduling screen
     Given Schedules the face to face round round
    Then Enter feedback of face to face round


