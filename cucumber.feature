@tag
Feature: User login the web application and add device then check device in mobile application
  @tag1
  Scenario: User login the web application and add device then check device in mobile application
    Given open web 
    When click web "email"
    And type web "emailAdd" "email"
    And click web "password"
    And type web "passwordInput" "password"
    And click web "loginWeb"
    And click web "deviceManagement"
    Then click web "addChargePoint"
    And click web "deviceName"
    And type web "name" "deviceName"
    And click web "save"
    Given open app
    When click app "skipApp"
    And click app "searchBar"
    Then type app "name" "searchBar"
    And the search results should contain "name"
    
