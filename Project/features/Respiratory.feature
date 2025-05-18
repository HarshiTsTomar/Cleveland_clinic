Feature: Search and Verification of Respiratory Information on Cleveland Clinic
 

Scenario: TestCase 01 - Respiratory operation
  Given the keyword "Respiratory" is searched
  When the first search result is opened and relevant content is verified
  Then filters for male and female specialists are applied, and a doctor's profile is selected
  And verify the profile page displays detailed information