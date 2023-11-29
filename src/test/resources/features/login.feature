Feature: Testing the login functionality

  Scenario Outline: (negative path) the user navigate to OpenMRS and login
    When user provide wrung username '<username>' and password '<password>' and select Location '<location>' and click login button and Validate the Alert '<Alert>'
    Then user user click cant long in button validate the message 'Please contact your System Administrator.' then click okay button
    Then user click  Open mrs title logo to clean the userN and Password input boxes
    Examples:
      | username | password | location       | Alert                                        |
      | admin    | admin123 | Inpatient Ward | Invalid username/password. Please try again. |
      | Admin123 | admin    | Isolation Ward | Invalid username/password. Please try again. |
      | Admin    | admin123 | Laboratory     | Invalid username/password. Please try again. |
      #| Admin    | Admin123 |                | You must choose a location!                  |

@regression
  Scenario Outline: (Happy path) the user navigate to OpenMRS and login
    Given  user provide username and password and select Location '<location>' and click login button Then validate the home page is visible '<title>'


    Examples:
      | location       | title |
      | Inpatient Ward | Home  |