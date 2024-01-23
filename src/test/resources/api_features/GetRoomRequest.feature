@api @e2e
Feature: Get Room Request
  Scenario: Get request and assert response
    Given Get room ID
    When Send get request
    Then Assert the response