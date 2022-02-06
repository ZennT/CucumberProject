#All feature files must start with Feature keyword. There can be ONLY 1 Feature keyword per file.
#  Feature describes the overall test cases.
#  It can be the user story name
#  Google_Search_Functionality
# Google Search Functionality

@google_search
Feature: Google_Search_Functionality
#  Scenario = Test Case
#  Under Scenario, we will have TEST STEPS
#  Given, And, Then, When, But, * annotations
#  These are Gherkin language
#  EACH STEP MUST START WITH A GHERKEN KEYWORD
#  Given should be used as preconditions
#  Then should be used for verifications
#  And and When should be used in hhe middle steps

  Background: user is on the google page
#    Background is used for repeated pre conditions.
#    It can not be used after Scenario keyword, so use it first
#    It is like @Before or @BeforeMethod
    Given user is on the google page

  @iphone_search
  Scenario: TC01_iphone_search
#    Given user is on the google page  --> it is under background, we don't need it here anymore
    When user search for iPhone on google
    Then verify the result has iPhone related results
    Then capture the screenshot
    Then close the application


#    We can create multiple Scenarios
  @teapot_search
  Scenario: TC02_teapot_search
#    Given user is on the google page  --> it is under background, we don't need it here anymore
    When user search for Tea Pot on google
    Then verify the result has Tea Pot related results
    Then capture the screenshot
    Then close the application

#    flower scenario
  @flower_search @wip #work in progress
    Scenario: TC03_flower_search
#      Given user is on the google page  --> it is under background, we don't need it here anymore
      When user search for flower on google
      Then verify the result has flower related results
      Then capture the screenshot
      Then close the application

    #What is a feature file?
#We write our test scenarios in feature files.
#We use Gherkin language in the feature files such as Feature, Scenario, Given, And, Then, When, But, Background,...
#It is written in plain English
#Known as non technical part. Everybody can read and understand

#What is a step definition?
#We write our Java code in the step definitions
#This has the technical part.Only technical people can understand
