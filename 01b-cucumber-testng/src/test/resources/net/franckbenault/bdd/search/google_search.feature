Feature: Example of Hooks with Cucumber.

	@Web
  Scenario: Search an item with google and found wiki page
    Given the google search page
    When I search "Dog"
    Then I should find a list results of "Dog"