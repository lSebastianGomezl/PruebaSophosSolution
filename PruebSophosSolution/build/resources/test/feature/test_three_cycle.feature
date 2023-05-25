Feature: three response cycle
  as user
  I want to answer test cycle three correctly
  to pass the test

  @AnswerCycleThreeCorrectly
  Scenario: response cycle three
   Given Sebastian is on the test page.
    When he completes the mathematical operation
    And he indicates the result of the operation
    And he indicates the corresponding date
    And he indicates the numbers that are multiples
    And the click on the send button
    Then you should see the he is in cycle four of ten