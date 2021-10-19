Feature: Genre

  Scenario: The Genre is Dystopian
    Given Genre is Dystopian
    When I ask whether it's Dystopian
    Then I should be told "Yes"

  Scenario: The Genre is Horror
    Given Genre is Horror
    When I ask whether it's Dystopian
    Then I should be told "No"


