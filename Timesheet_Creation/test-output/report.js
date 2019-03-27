$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("G:/Selenium Projects/Timesheet_Creation/src/test/java/Feature/FillTime.feature");
formatter.feature({
  "line": 1,
  "name": "Fill Timesheet",
  "description": "",
  "id": "fill-timesheet",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1216871,
  "status": "passed"
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
  "duration": 20703684163,
  "error_message": "junit.framework.AssertionFailedError: expected:\u003ctrue\u003e but was:\u003cfalse\u003e\r\n\tat junit.framework.Assert.fail(Assert.java:57)\r\n\tat junit.framework.Assert.failNotEquals(Assert.java:329)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:78)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:174)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:181)\r\n\tat stepdefinition.StepDefinition.the_time_is_missing(StepDefinition.java:55)\r\n\tat ✽.When the time is missing(G:/Selenium Projects/Timesheet_Creation/src/test/java/Feature/FillTime.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinition.verify_the_days_for_which_time_is_missing()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.fill_the_missing_time_in_the_timesheet()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.verify_the_total_working_hours_of_the_week()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 488296676,
  "status": "passed"
});
formatter.before({
  "duration": 260117,
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
  "duration": 3106684389,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//dl[@class\u003d\u0027tsSummaryTotal\u0027]/dt/span\"}\n  (Session info: chrome\u003d73.0.3683.86)\n  (Driver info: chromedriver\u003d72.0.3626.69 (3c16f8a135abc0d4da2dff33804db79b849a7c38),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.5.3\u0027, revision: \u0027a88d25fe6b\u0027, time: \u00272017-08-29T12:42:44.417Z\u0027\nSystem info: host: \u0027YP1009097DT\u0027, ip: \u002710.8.100.251\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_31\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, timeouts\u003d{implicit\u003d0, pageLoad\u003d300000, script\u003d30000}, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:50895}, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, platformName\u003dXP, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003dignore, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d72.0.3626.69 (3c16f8a135abc0d4da2dff33804db79b849a7c38), userDataDir\u003dC:\\Users\\ADITYA~1.DOG\\AppData\\Local\\Temp\\scoped_dir5800_6021}, takesHeapSnapshot\u003dtrue, unhandledPromptBehavior\u003dignore, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d73.0.3683.86, browserConnectionEnabled\u003dfalse, proxy\u003dProxy(), nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: d2b7b7aaad31c466a97768fd6344ec73\n*** Element info: {Using\u003dxpath, value\u003d//dl[@class\u003d\u0027tsSummaryTotal\u0027]/dt/span}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:82)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:45)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:646)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:416)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:518)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:408)\r\n\tat stepdefinition.StepDefinition.total_is_there(StepDefinition.java:88)\r\n\tat ✽.When Total is there(G:/Selenium Projects/Timesheet_Creation/src/test/java/Feature/FillTime.feature:13)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinition.how_many_toatal_hours_are_there()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.show_us_the_hours()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 390078105,
  "status": "passed"
});
formatter.before({
  "duration": 229968,
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
  "duration": 107125,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.verify_what_statuc_is_there()"
});
formatter.result({
  "duration": 3054742847,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//span[@class\u003d\u0027tsStatusLabelText\u0027]\"}\n  (Session info: chrome\u003d73.0.3683.86)\n  (Driver info: chromedriver\u003d72.0.3626.69 (3c16f8a135abc0d4da2dff33804db79b849a7c38),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.5.3\u0027, revision: \u0027a88d25fe6b\u0027, time: \u00272017-08-29T12:42:44.417Z\u0027\nSystem info: host: \u0027YP1009097DT\u0027, ip: \u002710.8.100.251\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_31\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, timeouts\u003d{implicit\u003d0, pageLoad\u003d300000, script\u003d30000}, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:50895}, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, platformName\u003dXP, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003dignore, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d72.0.3626.69 (3c16f8a135abc0d4da2dff33804db79b849a7c38), userDataDir\u003dC:\\Users\\ADITYA~1.DOG\\AppData\\Local\\Temp\\scoped_dir5800_6021}, takesHeapSnapshot\u003dtrue, unhandledPromptBehavior\u003dignore, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d73.0.3683.86, browserConnectionEnabled\u003dfalse, proxy\u003dProxy(), nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: d2b7b7aaad31c466a97768fd6344ec73\n*** Element info: {Using\u003dxpath, value\u003d//span[@class\u003d\u0027tsStatusLabelText\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:82)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:45)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:646)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:416)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:518)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:408)\r\n\tat stepdefinition.StepDefinition.verify_what_statuc_is_there(StepDefinition.java:111)\r\n\tat ✽.Then verify what statuc is there(G:/Selenium Projects/Timesheet_Creation/src/test/java/Feature/FillTime.feature:20)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinition.tell_us_the_status()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 478512313,
  "status": "passed"
});
});