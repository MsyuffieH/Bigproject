@DocsAndFiles

Feature: Docs and file feature
  Background: Already in Staging Cicle App HomePage
    Given I on  the staging cicle App website
    When I click team
    And I click Docs & Files


  @TC-001B
  Scenario: I can Add new docs with empty data
    Given I on Doc and files page
    And I click on add item here
    And I choose add new docs
    When I click publish
    Then I see notification Add docs is success

  @TC-002B
  Scenario: I can Add files on document
    Given I on Doc and files page
    And I click on add item here
    And I choose add new docs
    And I type "document one" the document name
    And I click insert file
    And I upload files
    When I click publish
    Then I see notification Add docs is success

  @TC-003B
  Scenario: I can Create new folder
    Given I on Doc and files page
    And I click on add item here
    And I click create new folder
    And I type "document zero" the folder name
    When I click save
    Then I see notification Create bucket success

  @TC_004B
  Scenario: I can Upload files
    Given I on Doc and files page
    And I click on add item here
    When I click upload files
    Then I see notification upload success

  @TC-005B
  Scenario: I can Add comment in document
    Given I on Doc and files page
    And I click my document
    And I click add comment
    And I type "nice" in comment field
    When I click post
    Then I see notification create comment success

  @TC-006B
  Scenario: I can Edit the document
    Given I on Doc and files page
    And I click my document
    And I click more button in the document
    And I click edit
    When I click publish changes
    Then I see notification Update doc success

  @TC-007B
  Scenario: I can Archive the document
    Given I on Doc and files page
    And I click my document
    And I click more button in the document
    When I click archive this docs
    Then I see notification Archive docs is success




