$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/co/silverrailtech/resources/featurefile/home.feature");
formatter.feature({
  "line": 1,
  "name": "United Kingdom office address feature",
  "description": "\r\nCustomer  can navigate to UK office successfully",
  "id": "united-kingdom-office-address-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 18881903300,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User can search UK office address successfully",
  "description": "",
  "id": "united-kingdom-office-address-feature;user-can-search-uk-office-address-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I am on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on contact us link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on our office",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I should see UK office address",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmOnHomePage()"
});
formatter.result({
  "duration": 1227831400,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnContactUsLink()"
});
formatter.result({
  "duration": 2615554600,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnOurOffice()"
});
formatter.result({
  "duration": 154640900,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iShouldSeeUKOfficeAddress()"
});
formatter.result({
  "duration": 27800,
  "status": "passed"
});
formatter.after({
  "duration": 76100,
  "status": "passed"
});
});