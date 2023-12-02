Feature: Testing the patient search functionality


  Scenario: User searches for a patient
    Given  user login with username and password and select Location "Inpatient Ward" and click login button Then validate the home page is visible "Home"
    And user clicks Find Patient Record application
    Then user searches for a patient 'Donald Duck'
    And clicks on the patient profile
    Then user validates the patient name is visible

