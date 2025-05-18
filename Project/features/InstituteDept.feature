Feature: Cleveland Clinic
 
    Scenario: TestCase 09 - Health Library
    And user clicked on Health Library
    Then user clicked on Body Systems and Organs
    And user search for "Eyes" 
    Then user clicked on red eyes and redirected to the resultPage
 
    Scenario: TestCase 10 - Institutes and Departments
    And user clicked on Institute and departments
    Then user clicked on Blood Management
    And redirected to result resultPage
    Then navigate back to the previous Page
    And clicked on Pharmacy link and click takesurvey

 
