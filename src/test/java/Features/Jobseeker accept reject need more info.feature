Feature: Accept reject need more info for intial job proposal

  Scenario: jobseeker need more information
    Given I post new job and send intial job invite to jobseeker
    Then jobseeker should be on list job page
    Then jobseeker do need more info

    Scenario: jobseeker accepts the job proposal
      Given jobseeker should be on list job page
      Then jobseeker accepts the job proposal

      Scenario: Jobseeker rejects the job proposal
        Given jobseeker should be on list job page
        Then jobseeker reject the job proposal