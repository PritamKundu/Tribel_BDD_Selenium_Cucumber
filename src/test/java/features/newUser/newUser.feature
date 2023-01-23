Feature: Verify New User Functionality

  @NewUser
  Scenario: Check that by clicking on Tribel.com icon the non user will be redirected to Tribel.com home page
    Given Click on the tribel.com icon

  @NewUser
  Scenario: Check if the non user can create new post by clicking on New post button
    Given Click on the tribel.com icon
    Then Click on the new post

  @NewUser
  Scenario: Check that the non user can not see the star contributors
    Given Click on the tribel.com icon
    Then Click on the new post

