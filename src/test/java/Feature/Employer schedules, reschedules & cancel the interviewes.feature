Feature: Employer schedules, reschedules, cancel the interview round and reject candidate by 'candidate not interested'

  Scenario: Employer schedules reschedules cancel the interview.feature
   Given Employer Post new job for schedules reschedules and cancel interview
    Then Job seeker accepts the job invitation for scheduling round

    Scenario: Employer Schedules Reschedule and cancel telephonic round
      Given Employer should be on feedback screen
      Then Employer Schedules telephonic round
      Then Employer Reschedules Telephonic round
      Then Employer cancels Telephonic round

  Scenario: Employer Schedules Reschedule and cancel video conference round
    Given Employer should be on feedback screen
    Then Employer Schedules video conference round
    Then Employer Reschedules video conference round
    Then Employer cancels video conference round

  Scenario: Employer Schedules Reschedule and cancel Face to face round
    Given Employer should be on feedback screen
    Then Employer Schedules Face to face round
    Then Employer Reschedules Face to face round
    Then Employer cancels Face to face round

  Scenario: Employer Schedules Reschedule and cancel coding round
    Given Employer should be on feedback screen
    Then Employer Schedules coding round
    Then Employer Reschedules coding round
    Then Employer cancels coding round with candidate not interested