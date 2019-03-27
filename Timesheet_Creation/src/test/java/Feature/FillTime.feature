Feature: Fill Timesheet

Scenario: Fill the missing time in the timesheet

When the time is missing 
Then verify the days for which time is missing
Then fill the missing time in the timesheet
And verify the total working hours of the week


Scenario: Find Total on the Timesheet

When Total is there
Then how many toatal hours are there
And show us the hours

Scenario: Find if tiemsheet is submitted

When the timesheet is there
Then verify what statuc is there
And tell us the status