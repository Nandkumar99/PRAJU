Feature: Manage Policies

  Scenario: add and remove policies
    Given Employer should be on policy page
    Then Employer Flip policy
    Then Employer View policy
    Then Employer Remove policy
    Then Employer Add policy
    Then Employer Edit policy
