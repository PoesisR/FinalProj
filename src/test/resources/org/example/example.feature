Feature: An example

  Scenario: The example
    Given I am on the Web page
    When I write the email address of "test@tester.com"
    And I click the submit button
    Then the confirmation pop-up appears


  Scenario: Pop-ul appearing
    Given I am on the Web page
    When I write the email address of "test@tester.ro"
    And I click the submit button
    Then the confirmation pop-up appears

  Scenario: Negative #2
    Given I am on the Web page
    When I write the email address of "testsssstestsssstesssstestsss"
    And I click the submit button
    Then the confirmation button appears

  Scenario: Positive #3
    Given I am on the Web page
    And I click on the read more button in virtual
    Then a virtual header appears

  Scenario: Virtual "Read more"
    Given I am on the Web page
    When I click on the read more button in virtual
    Then A new page opens

  Scenario:Return from virtual
    Given I am on the virtual page
    When I click on virtual return button
    Then I return to the web page

  Scenario: Hybrid "Read more"
    Given I am on the hybrid page
    When I click the hybrid read more button
    Then Hybrid page opens

  Scenario: Return from hybrid
    Given I am on the hybrid page
    When I click on the hybrid return button
    Then I am taken to the web page

  Scenario: Start the Enrollment
    Given I am on the Web page
    When I click on start the enrollment button
    Then I am taken to the personal information form

  Scenario: Personal information form
    Given I am on the personal information form
    When I write on the first name field as "Gigel"
    When I write on the last name field as "Darius"
    When I write on the username field as "Gigeld"
    When I write on the password field as "Darius"
    When I write on ther cpassword field as "Darius"






