Feature: Splitting Names

To help personalise our mailshots we want to have the first name and last name of the customer. 
Unfortunately the customer data that we are supplied only contains full names.

The system therefore attempts to break a supplied full name into its constituents by splitting around whitespace.

Rules:
  - the titles like sir must be ignored 

  Scenario: basic
	Given the full name Jane Smith
	When this full name is broken 
	Then the first name is Jane 
	And the last name is Smith