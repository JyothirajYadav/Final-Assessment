Feature: Change to Kannada

  @Kannada
  Scenario: Successfully change language to Kannada
    Given I land on Home page
    When I click on Account Tab
    And I click on Change Language button
    Then I click on Kannada Button
    And I Click on change language button
    And I change language to english

    @Bengali
  Scenario: Successfully change language to Bengali
    Given Land on Home page
    When Click on Account tab
    And Click on Change Language button
    And Change Language to Bengali
    And Change back to English
