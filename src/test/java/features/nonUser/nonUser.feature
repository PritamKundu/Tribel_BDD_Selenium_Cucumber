Feature: Verify New User Functionality

  #TID 001
  @NonUser
  Scenario: Check that by clicking on Tribel.com icon the non user will be redirected to Tribel.com home page
    Given Go to Tribel.com
    Then Click on the tribel.com icon

  #TID 002
  @NonUser
  Scenario: Check if the non user can create new post by clicking on New post button
    Given Go to Tribel.com
    Then Click on "New Post"

  #TID 003
  @NonUser
  Scenario: Check that the non user can not see the star contributors
    Given Go to Tribel.com
    Then Click on star contributors

  #TID 004
  @NonUser
  Scenario: Check that the non user is not allowed to see the Groups
    Given Go to Tribel.com
    Then Click on "Groups"

  #TID 005
  @NonUser
  Scenario: Check that the non-user is not allowed to go to the invite friends page
    Given Go to Tribel.com
    Then Click on "Invite Friends"

  #TID 006
  @NonUser
  Scenario: Verify that non-users will not be able to see Friends feed
    Given Go to Tribel.com
    Then Click on "Friends"

  #TID 007
  @NonUser
  Scenario: Verify that non-users will not be able to see Following Feed
    Given Go to Tribel.com
    Then Click on "Following"

  #TID 008
  @NonUser
  Scenario: Check if the non user can see Breaking Feed posts
    Given Go to Tribel.com
    Then Click on "Breaking" feed posts

  #TID 009
  @NonUser
  Scenario: Check if the non user can See Trending Feed posts
    Given Go to Tribel.com
    Then Click on "Trending" feed posts

  #TID 010
  Scenario: Check if the user is redirected to Trending feed after clicking on Home button
    Given Go to Tribel.com
    Then Click on the "Home" menu

  #TID 011
  Scenario: Check if Clicking on Sign in button takes the user to Sign in page
    Given Go to Tribel.com
    Then Click on Sign-in

  #TID 012
  Scenario: Check if the non user can like on posts in feed
    Given Go to Tribel.com
    Then Click like on posts in the feed

  #TID 013
  Scenario: Check if the non user can comment on any posts
    Given Go to Tribel.com
    Then Click on comment on any posts

