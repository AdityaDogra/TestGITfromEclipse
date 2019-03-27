$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("G:/Selenium Projects/Timesheet_Creation/src/test/java/Feature/FillTime.feature");
formatter.feature({
  "line": 1,
  "name": "Fill Timesheet",
  "description": "",
  "id": "fill-timesheet",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Fill the missing time in the timesheet",
  "description": "",
  "id": "fill-timesheet;fill-the-missing-time-in-the-timesheet",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "the time is missing",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "verify the days for which time is missing",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "fill the missing time in the timesheet",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "verify the total working hours of the week",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.the_time_is_missing()"
});
formatter.result({
  "duration": 61601414380,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.verify_the_days_for_which_time_is_missing()"
});
formatter.result({
  "duration": 539934801,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.fill_the_missing_time_in_the_timesheet()"
});
formatter.result({
  "duration": 74732,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.verify_the_total_working_hours_of_the_week()"
});
formatter.result({
  "duration": 50035,
  "status": "passed"
});
formatter.after({
  "duration": 121559,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Find Total on the Timesheet",
  "description": "",
  "id": "fill-timesheet;find-total-on-the-timesheet",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "Total is there",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "how many toatal hours are there",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "show us the hours",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.total_is_there()"
});
formatter.result({
  "duration": 72268166,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.how_many_toatal_hours_are_there()"
});
formatter.result({
  "duration": 44116232,
  "error_message": "junit.framework.ComparisonFailure: expected:\u003c[45:00]\u003e but was:\u003c[18:57]\u003e\r\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\r\n\tat stepdefinition.StepDefinition.how_many_toatal_hours_are_there(StepDefinition.java:90)\r\n\tat ✽.Then how many toatal hours are there(G:/Selenium Projects/Timesheet_Creation/src/test/java/Feature/FillTime.feature:14)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinition.show_us_the_hours()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 482279032,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Find if tiemsheet is submitted",
  "description": "",
  "id": "fill-timesheet;find-if-tiemsheet-is-submitted",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 19,
  "name": "the timesheet is there",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "verify what statuc is there",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "tell us the status",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.the_timesheet_is_there()"
});
formatter.result({
  "duration": 291228,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.verify_what_statuc_is_there()"
});
formatter.result({
  "duration": 54728093,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.tell_us_the_status()"
});
formatter.result({
  "duration": 39027760,
  "status": "passed"
});
formatter.after({
  "duration": 80183,
  "status": "passed"
});
});