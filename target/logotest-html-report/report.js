$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("app.feature");
formatter.feature({
  "line": 1,
  "name": "Test J.P Morgan logo is displayed in search result of Google",
  "description": "",
  "id": "test-j.p-morgan-logo-is-displayed-in-search-result-of-google",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 11,
  "name": "",
  "description": "",
  "id": "test-j.p-morgan-logo-is-displayed-in-search-result-of-google;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Open \"chrome\" and navigate to \"https://www.google.com/\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user need to search for \"J.P.Morgan\"",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "click on first result returned by google",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "logo should be displayed",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "chrome",
      "offset": 6
    },
    {
      "val": "https://www.google.com/",
      "offset": 31
    }
  ],
  "location": "LogoTest.Open_and_navigate_to(String,String)"
});
formatter.result({
  "duration": 8517123400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "J.P.Morgan",
      "offset": 25
    }
  ],
  "location": "LogoTest.user_need_to_search_for(String)"
});
formatter.result({
  "duration": 111646800,
  "status": "passed"
});
formatter.match({
  "location": "LogoTest.click_on_first_result()"
});
formatter.result({
  "duration": 2898975600,
  "status": "passed"
});
formatter.match({
  "location": "LogoTest.logo_should_be_displayed()"
});
formatter.result({
  "duration": 208528300,
  "status": "passed"
});
});