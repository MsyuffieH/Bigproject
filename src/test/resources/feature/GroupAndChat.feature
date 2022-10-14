@GroupChat

Feature: Group & chat feature
  Background: Already in Staging Cicle App HomePage
    Given I on  the staging cicle App website
    When I click team
    And I click group and chat

  @TC-001C
  Scenario: I can Send message
    Given I on group chat page
    And I type "welcome" in the message field
    When I click button send
    Then I see the message has been sent success

  @TC-002C
  Scenario: I can Delete message
    Given I on group chat page
    And I type "Thank you" in the message field
    And I click button send
    When I delete a message
    Then I see the message has been delete success

  @TC-003C
  Scenario: Fill message with space
    Given I on group chat page
    And I type " " in the message field
    When I click button send
    Then I see an empty message

  @TC-004C
  Scenario: Attach File
    Given I on group chat page
    When I send a files
    Then I see notification attach file is success
  @TC-005C
  Scenario: Delete the attached file
    Given I on group chat page
    And I send a files
    When I delete the file
    Then I see notification delete the file is success