$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/com/gocanvas/features/SeleniumChallenge.feature");
formatter.feature({
  "name": "Automating gocanvas webpage",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User should be able to create and publish an App",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@challenge"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user logs in using valid username and password",
  "keyword": "Given "
});
formatter.match({
  "location": "SeleniumChanllengeStepDefs.user_logs_in_using_valid_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on Create App",
  "keyword": "And "
});
formatter.match({
  "location": "SeleniumChanllengeStepDefs.the_user_clicks_on_Create_App()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user selects the template \"Blank\"",
  "keyword": "And "
});
formatter.match({
  "location": "SeleniumChanllengeStepDefs.the_user_selects_the_template(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "fills all required field information",
  "keyword": "And "
});
formatter.match({
  "location": "SeleniumChanllengeStepDefs.fills_all_required_field_information()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user saves the changes to template",
  "keyword": "When "
});
formatter.match({
  "location": "SeleniumChanllengeStepDefs.the_user_saves_the_changes_to_template()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to publish the template",
  "keyword": "Then "
});
formatter.match({
  "location": "SeleniumChanllengeStepDefs.the_user_should_be_able_to_publish_the_template()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});