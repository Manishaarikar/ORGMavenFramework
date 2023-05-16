$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("loginfeature/AssignLeaveFeature.feature");
formatter.feature({
  "line": 1,
  "name": "Assign Leave Feature",
  "description": "",
  "id": "assign-leave-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8350571400,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Verify user able to login",
  "description": "",
  "id": "assign-leave-feature;verify-user-able-to-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@CUCUMBER-1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user enter username as \"Admin\" login page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enter password as \"U@h10IOYrn\" login page",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user click on login button on login page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user should navigate to dashboard page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 24
    }
  ],
  "location": "LoginSteps.user_enter_username_as_login_page(String)"
});
formatter.result({
  "duration": 171743600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "U@h10IOYrn",
      "offset": 24
    }
  ],
  "location": "LoginSteps.user_enter_password_as_login_page(String)"
});
formatter.result({
  "duration": 92657200,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_click_on_login_button_on_login_page()"
});
formatter.result({
  "duration": 4384924100,
  "status": "passed"
});
formatter.match({
  "location": "DashboardSteps.user_should_navigate_to_dashboard_page()"
});
formatter.result({
  "duration": 49222100,
  "status": "passed"
});
formatter.after({
  "duration": 39600,
  "status": "passed"
});
formatter.before({
  "duration": 85500,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Validate Assign Leave Scenario",
  "description": "",
  "id": "assign-leave-feature;validate-assign-leave-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@Cucumber-2"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "User is  on Dashboard Page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "user clicks on Assign Leave widget",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Verify that user is on Assign Leave Page",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "User enters/select Employee as \"Aaliyah Haq\"",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "Validate that user able to select the Leave Type",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user select Today from clender",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "user should be able to write comment as \"Not Feeling Well\"",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Validate that user able to submit leave by clicking on Assign",
  "keyword": "Then "
});
formatter.match({
  "location": "AssignLeaveSteps.user_is_on_dashboard_page()"
});
formatter.result({
  "duration": 1650006400,
  "status": "passed"
});
formatter.match({
  "location": "AssignLeaveSteps.user_clicks_on_assign_leave_widget()"
});
formatter.result({
  "duration": 3482777900,
  "status": "passed"
});
formatter.match({
  "location": "AssignLeaveSteps.verify_that_user_is_on_assign_leave_page()"
});
formatter.result({
  "duration": 5336500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Aaliyah Haq",
      "offset": 32
    }
  ],
  "location": "AssignLeaveSteps.user_entersselect_employee_as_something(String)"
});
