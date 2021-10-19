Feature: Topic

  Scenario: The topic is Lego
    Given Topic is Lego
    When I ask is the topic Lego
    Then the answer is yes
    
    Scenario: The topic is nature
      Given Topic is nature
      When I ask is the topic Lego
      Then the answer is no