Feature: United Kingdom office address feature

  Customer  can navigate to UK office successfully

Scenario: User can search UK office address successfully
  Given I am on Home Page
  When I click on contact us link
  And I click on our office
  Then I should see UK office address
