Feature: Author

  Scenario: The Author is George Orwell
    Given Author is George Orwell
    When I ask is Orwell the author
    Then the answer is "Yes"

  Scenario: The Author is HP Lovecraft
    Given Author is HP Lovecraft
    When I ask is Orwell the author
    Then the answer is "No"

