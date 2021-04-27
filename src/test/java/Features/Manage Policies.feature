Feature: Manage Policies
  Scenario: add and remove users
    Given Remove user
   Then Flip policy
   Then View policy
   Then Add policy
   Then Edit policy
