Feature: Send intial Job proposal,Edit job proposal, Resend job proposal, Drop candidate

  Scenario: send intial job proposal to the jobseeker
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