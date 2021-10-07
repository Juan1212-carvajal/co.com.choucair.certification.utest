# Autor:Juan
@stories
Feature: utest
  As a developer I will automate the registration of the utest page

  @scenario:
  Scenario Outline: search for automation on the utest page
    Given click register

    When  record of each steps
      | strFirstName   | strLastName   | strEmail   | strPassword   | strPasswordConfirmed   |
      | <strFirstName> | <strLastName> | <strEmail> | <strPassword> | <strPasswordConfirmed> |
    Then verify that the user registration is correct

    Examples:
      | strFirstName | strLastName | strEmail               | strPassword       | strPasswordConfirmed |
      | Juan         | Carvajal    | juancarvajal@gmail.com | JuanCarvajal1999* | JuanCarvajal1999*    |
