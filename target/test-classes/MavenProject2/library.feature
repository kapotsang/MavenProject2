Feature: Library

  Scenario: The Genre is Dystopian
    Given Fiction is Dystopian
    When I ask whether it's Dystopian
    Then I should be told "Yes"

  Scenario: The Genre is Horror
    Given Fiction is Horror
    When I ask whether it's Dystopian
    Then I should be told "No"