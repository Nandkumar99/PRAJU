Feature: jobseeker need more info, reject & resend job proposal

  Scenario: post new job and send intial job invitation to jobseeker
    Given I post new job and send intial job invite to jobseeker

  Scenario: Jobseeker do need more info on intial job proposal
    Then jobseeker should be on list job page
    Then jobseeker do need more info

  Scenario: Jobseeker rejects the job proposal
    Then jobseeker should be on list job page
    Then jobseeker reject the job proposal

  Scenario: Resend jobproposal & Jobseeker accept job proposal
    Then Resend job proposal to jobseeker
    Then jobseeker should be on list job page
    Then jobseeker accepts the job proposal


