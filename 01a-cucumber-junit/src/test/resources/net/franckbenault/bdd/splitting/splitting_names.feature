Feature: Splitting Names
  
  To help personalise our mailshots we want to have the first name and last name of the customer. 
  Unfortunately the customer data that we are supplied only contains full names.
  
  The system therefore attempts to break a supplied full name into its constituents by splitting around whitespace.

  Scenario: basic
    Given the full name Jane Smith
    When this full name is broken
    Then the first name is Jane
    And the last name is Smith

  Scenario: no last name
    Given the full name Sting
    When this full name is broken
    Then the first name is Sting
    But the last name is (null)

  Scenario Outline: tabs
    Given the full name <fullName>
    When this full name is broken
    Then the first name is <firstName>
    And the last name is <lastName>

    Examples: 
      | fullName            | firstName | lastName      |
      | Jane Smith          | Jane      | Smith         |
      | Sting               | Sting     | (null)        |
      | Sir Bob Geldof      | Bob       | Geldof        |
      | Maria de los Santos | Maria     | de los Santos |
