Feature: Calculator
  Scenario: Receiving no numbers
    Given the input is {empty}
    Then print 0

  Scenario: Receiving one number
    Given the input is 2
    Then print 2

  Scenario: Receiving two numbers
    Given the first input is 8
    And the second input is 3
    Then print 11

  Scenario: Receiving unknown amount of numbers
    Given the first input is 1
    And the second input is 2
    And the third input is 2
    And the fourth input is 5
    And the fifth input is 10
    And the sixth input is 3
    And the seventh input is 2
    Then print 25

  Scenario: Receiving one string with several numbers
    Given the input is "3,3,3,3,3,3,3,3"
    Then print 24

  Scenario: newline or commas for delimiter
    Given the input is "3,3\n3\n3"
    Then print 12

  Scenario: custom delimiters
    Given the input is "//;\n1;2"
    Then print 3



