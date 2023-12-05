Feature: Delete Patient functionality
  Scenario: Testing the delete patient functionality
    Given  user login with username and password and select Location "Inpatient Ward" and click login button Then validate the home page is visible "Home"
    And user clicks Find Patient Record application
    Then user searches for a patient 'Donald Duck'
    And clicks on the patient profile
    And user clicks the delete patient button and types the reason as "Patient Discharged" and clicks confirm button

