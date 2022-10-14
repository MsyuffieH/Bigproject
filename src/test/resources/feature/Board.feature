@Board

Feature: Board feature
  Background: Already in Staging Cicle App HomePage
    Given I on  the staging cicle App website
    When I click team
    And I click Board

  @TC-001
  Scenario: I can Create new list
    Given I on board page
    And I click add list button
    And I type list name "planning"
    When I click create button
    Then I should be success create new list

  @TC-002
  Scenario: I can Create private card
    Given I on board page
    And I click add card
    And I type card name "private"
    And I click private card
    When I click add
    Then I should be success create new card


  @TC-002
  Scenario: I can Create a card
  Given I on board page
    And I click add card
    And I type card name "Daily"
    When I click add
    Then I should be success create new card

  @TC-003
  Scenario: I can Create new list using empty name
    Given I on board page
    And I click add list button
    When I click create button
    Then I should be failed create new list

  @TC-004
  Scenario: I can Create new card using empty name
    Given I on board page
    And I click add card
    When I click add
    Then I should be failed create new card
  @TC-005
  Scenario: I can comment in the card
    Given I on board page
    And I click the card on the list
    And I click comment
    And I type "Hallo" in field comment
    When I click post in card feature
    Then I should be success create comment

  @TC-007
  Scenario: I can Archive the card
    Given I on board page
    And I click more button
    When I click archive all card in this list
    Then I should be success archive all card

  @TC-008
  Scenario: I can Archive the list
    Given I on board page
    And I click more button
    When I click archive the list
    Then I should be success archive this list



