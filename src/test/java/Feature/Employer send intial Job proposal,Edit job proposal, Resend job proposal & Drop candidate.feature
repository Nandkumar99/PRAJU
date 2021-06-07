Feature: Send intial Job proposal to jobseeker ,Edit job proposal and resemd
  ,Resend job proposal, Drop candidate from ongoing process

  Scenario: send intial job invitation
    Given Employer should be on home page
    Then send intial job invite to jobseeker

Scenario: Edit the job proposal and send to the jobseeker
  Given Employer should be on home page
  Then edit job proposal

  Scenario: Resend job invite to the jobseeker
   Given Employer should be on home page
    Then resend job proposal

    Scenario: Drop the candidate after sending intial invite
      Given Employer should be on home page
      Then drop the the candidate