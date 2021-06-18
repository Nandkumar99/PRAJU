Feature:search and filter functionality

  Scenario: employer search by job title
    When employer should be on home page
    Then employer search by job title

  Scenario: employer filter by location, Filter by Listing Date & Filter by No. of Positions :
    When employer should be on home page
    Then filter by no of position
    Then filter by listing date
    Then filter by location
