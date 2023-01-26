Feature: Verify New User Functionality

  @NewUser
  Scenario: Check that by clicking on Tribel.com icon the non user will be redirected to Tribel.com home page
    Given Click on the tribel.com icon


  @NewUser
  Scenario: Check if the non user can create new post by clicking on New post button
    Given Click on the tribel.com icon
    Then Non-user can not see "New Post"

  @NewUser
  Scenario: Check that the non user can not see the star contributors
    Given Click on the tribel.com icon
    When Non-user can not see "New Post"
    Then Non-user can not see the star contributors

  @NewUser
  Scenario: Check that the non user is not allowed to see the Groups
    Given Click on the tribel.com icon
    When Non-user can not see "New Post"
    And Non-user can not see the star contributors
    Then Non-user can not see "Groups"

  @NewUser
  Scenario: Check that the non-user is not allowed to go to the invite friends page
    Given Click on the tribel.com icon
    When Non-user can not see "New Post"
    And Non-user can not see the star contributors
    And Non-user can not see "Groups"
    Then Non-user can not see "Invite Friends"

  @NewUser
  Scenario: Verify that non-users will not be able to see Friends feed
    Given Click on the tribel.com icon
    When Non-user can not see "New Post"
    And Non-user can not see the star contributors
    And Non-user can not see "Groups"
    And Non-user can not see "Invite Friends"
    Then Non-user is not be able to see "Friends" Feed


  @NewUser
  Scenario: Verify that non-users will not be able to see Following Feed
    Given Click on the tribel.com icon
    When Non-user can not see "New Post"
    And Non-user can not see the star contributors
    And Non-user can not see "Groups"
    And Non-user can not see "Invite Friends"
    And Non-user is not be able to see "Friends" Feed
    Then Non-user is not be able to see "Following" Feed

  @NewUser
  Scenario: Check if the non user can see Breaking Feed posts
    Given Click on the tribel.com icon
    When Non-user can not see "New Post"
    And Non-user can not see the star contributors
    And Non-user can not see "Groups"
    And Non-user can not see "Invite Friends"
    And Non-user is not be able to see "Friends" Feed
    And Non-user is not be able to see "Following" Feed
    Then Non-User can see "Breaking" feed posts

