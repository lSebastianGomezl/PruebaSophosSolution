Feature: Reply cycle two
  as user
  I want to answer test cycle two correctly
  to pass the test

  @AnswerCycleTwoCorrectly
  Scenario: Respond cycle two
    Given Sebastian is on the test page
    When he indicates which is the corresponding date
    And he indicates which number is a multiple of seven
    And he wrote four hundred sixty times the letter o
    And he indicates how many worms there are
    And the click on the send button
    Then he should see the It is in cycle three of ten