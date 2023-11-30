@regression
Feature: Testing Registering Patient functionality

  Scenario: User registers new patient info
    Given  user login with username and password and select Location "Inpatient Ward" and click login button Then validate the home page is visible "Home"
    And user clicks register a patient application
    When user provides 'Donald' as patients Given name and 'Duck' as family name
    Then user selects 'Male' as patient's gender
    And user provides the patients birth date '9','June' and '1934'
    And user input the patients address '123st','la','ca','us','12345'
    And user enters the patients phone number '1234567890'
    Then user selects the patients relationship type 'Friend' and persons name 'Goofy'
    Then user confirms the patient's information


