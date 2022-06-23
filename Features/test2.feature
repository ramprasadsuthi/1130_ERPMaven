Feature: Calculator
  I want to use this for arthematic operations

  @tag1
  Scenario: Add two numbers
    Given User reads <a> and <b> values
    When User calculates sum of a,b 
    Then Display the Results
    And  Validate the Results <expResult>
  Examples:
    | a   | b  | expResult |
    | 100 | 50 |   150     |
    | 200 | 50 |   150     |
    | 300 | 50 |   350     |
    
  @tag1
  Scenario: Multiplication of two numbers
    Given User reads <a> and <b> values
    When User calculates mul of a,b 
    Then Display the Results
  Examples:
    | a   | b  |
    | 20  | 50 |
