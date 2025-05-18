Feature: Home Page Actions with Data from Scenario Outline
 
  Scenario Outline: TestCase 02- Home Page Map 
    Given the user navigates to the home page
    When the user initiates the home page interaction sequence
    And the user proceeds with the second page interaction sequence using "<locationData>"
    And the user selects various location types
    And the user specifies the required speciality
    And the user designates the service types
    And the user activates the direction button
    Then the user transitions to the secondary window and captures a screenshot
 
    Examples:
      | locationData |
      | Ohio         |