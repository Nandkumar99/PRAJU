 Feature: Employer Roll out offer letter, employer extends offer validity period,
  jobseeker Accept/reject/need more info on offer letter.

  Scenario: Offer letter
     Given Post new job
     Then Send job invitation to candidate
     Then jobseeker should be on home page
     Then jobseeker accept intial job proposal

   Scenario: schedules interview and roll out offer letter
      Given schedule an interview
      Then Select the candidate by cancelling schedules round
      Then roll out offer letter
      Then extends offer validity period

  Scenario: jobseeker accepts & need more info on offer letter
    Given jobseeker should be on home page
    Then jobseeker accepts the offer letter
    Then Jobseeker need more on offer letter

  Scenario: jobseeker rejects the offer letter
    Given jobseeker should be on home page
    Then jobseeker rejects the offer letter with work location is not suitable
    Given jobseeker accepts the offer letter
    Then jobseeker reject offer letter with salary not as per expection
    Given jobseeker accepts the offer letter
    Then jobseeker reject offer letter with availability constraint
    Given jobseeker accepts the offer letter
    Then jobseeker reject offer letter with other reason

