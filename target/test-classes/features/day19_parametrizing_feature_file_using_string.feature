@parameter_search
Feature: Search_Functi onality
  Background: user_is_on_the_page
    Given user is on the google page

  @i_search
  Scenario: TC01_iphone_search
    When user search for "iPhone"
    Then verify the result has "iPhone"
    Then close the application

  Scenario: TC02 teapot search
      When user search for "tea pot"
      Then verify the result has "tea pot"
      Then close the application

  Scenario: TC03 tesla search
    When user search for "tesla"
    Then verify the result has "tesla"
    Then close the application

  Scenario: TC04 honda search
    When user search for "honda"
    Then verify the result has "honda"
    Then close the application


