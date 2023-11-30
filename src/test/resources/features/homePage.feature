@regression
Feature: Validating the Home Page

  Scenario Outline: user validates each applications name
    Given  user login with username and password and select Location "Inpatient Ward" and click login button Then validate the home page is visible "Home"
    When '<expectedName>' matches the actual name of the application user clicks to open new page
    Examples:
      |expectedName|
      |Find Patient Record|
      |Active Visits      |
      |Capture Vitals     |
      |Register a patient |
      |Appointment Scheduling|
      |Reports               |
      |Data Management       |
      |Configure Metadata    |
      |System Administration |