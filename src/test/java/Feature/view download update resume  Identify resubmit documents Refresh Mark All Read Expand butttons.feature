Feature: view download update resume, Identify resubmit documents, Refresh Mark All Read Expand/collapse butttons.feature

  Scenario: for update download view resume and identify documesnts employer posts new job
    Given emp post new job for view update resumes
    Then job seeker accepts the job proposal proposed by employer

  Scenario: Employer View Download and update jobseekers resume
    Then employer view jobseeker resume
    Then employer download jobseeker resume
    Then employer update jobseeker resume

  Scenario: REFRESH LIST, MARK ALL READ & COLLAPSE BUTTON
    Then REFRESH LIST button
    Then MARK ALL READ button
    Then COLLAPSE Button

  Scenario: Identify and resubmit the documents
    Then employer request for resubmit the documents
    Then Jobseeker resubmit the documents

