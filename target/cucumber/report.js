$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test.feature");
formatter.feature({
  "line": 1,
  "name": "Open Example Website",
  "description": "",
  "id": "open-example-website",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Open Example Website",
  "description": "",
  "id": "open-example-website;open-example-website",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is on \"http://www.example.com\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user refreshes the browser",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user closes the browser",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.example.com",
      "offset": 12
    }
  ],
  "location": "stepDefination.user_is_on_something(String)"
});
formatter.result({
  "duration": 3438817498,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.user_refreshes_the_browser()"
});
formatter.result({
  "duration": 25499010,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.user_closes_the_browser()"
});
formatter.result({
  "duration": 5093922991,
  "status": "passed"
});
});