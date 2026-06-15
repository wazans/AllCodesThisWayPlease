# TestNG Tutorial Project

This is a standalone Maven project created only to explain TestNG in a structured way.

## Project Structure

- `src/test/java/testngtopics`
  Contains the main topic-based TestNG classes.
- `src/test/java/testngtopics/listeners`
  Contains a custom listener used by the listener demo.
- `src/test/java/testngtopics/packagelevel`
  Contains classes used for package-level execution examples.
- `suites`
  Contains separate `testng.xml` suite files for focused runs.

## Topic Map

- `Topic01_TestNGIntroduction`
  Intro, simple `@Test`, and multiple test methods in one class.
- `Topic02_AnnotationsAndBenefits`
  Lifecycle annotations and why they are useful.
- `Topic03_TestNgXmlAndIgnoringTests`
  XML execution, `enabled = false`, include and exclude ideas.
- `Topic04_Assertions`
  Hard assert, soft assert, and why `assertAll()` matters.
- `Topic05_ParallelExecution`
  Method-level parallel execution.
- `Topic06_GroupsDemo`
  `sanity`, `regression`, and `smoke` groups.
- `Topic07_DependenciesDemo`
  `dependsOnMethods` and `dependsOnGroups`.
- `Topic08_ParametersFromXml`
  Suite or test level parameters from XML.
- `Topic09_DataProviderWithoutExcel`
  `@DataProvider` with in-memory test data.
- `Topic10_DataProviderWithExcel`
  Generates and reads an Excel file using Apache POI.
- `Topic11_ListenersDemo`
  Uses a custom TestNG listener.
- `Topic12_ExceptionsInTestNG`
  Expected exceptions and failure examples.
- `Topic15_OrangeHrmParameters`
  OrangeHRM login example using `@Parameters` from XML.
- `Topic16_OrangeHrmDataProvider`
  OrangeHRM login example using `@DataProvider`.
- `Topic17_OrangeHrmDataProviderWithExcel`
  OrangeHRM login example using Excel-driven `@DataProvider`.
- `Topic18_ReportNgOrangeHrm`
  OrangeHRM Selenium example for ReportNG with one pass and one intentional failure.

## Package-Level Execution

- `testngtopics.packagelevel.Topic13_HomeLoanTests`
- `testngtopics.packagelevel.Topic14_CarLoanTests`

These are included in a separate package-level suite file.

## How To Run

Run the default suite:

```bash
mvn test
```

If IntelliJ says a Java file is "outside" the project:

```text
Open or reload the Maven project from TestNG_Tutorial_Project/pom.xml
```

This happens because the tutorial is a separate Maven project inside the current workspace.

Run a specific suite:

```bash
mvn -Dsurefire.suiteXmlFiles=suites/suite-groups-regression.xml test
```

Other suite files:

- `suites/suite-all-topics.xml`
- `suites/suite-groups-regression.xml`
- `suites/suite-parallel-methods.xml`
- `suites/suite-parameters.xml`
- `suites/suite-package-level.xml`
- `suites/suite-method-include-exclude.xml`
- `suites/suite-orangehrm.xml`
- `suites/suite-reportng-orangehrm.xml`

## Notes

- TestNG XML is the central place to arrange suites, tests, groups, classes, packages, parameters, and parallel settings.
- Running from `testng.xml` means you do not manually run one Java class at a time. The suite drives execution order.
- The project uses only test classes because the goal is learning TestNG, not building application code.

## ReportNG

ReportNG dependency used here:

- `org.testng:reportng:1.2.2`

Source used for this setup:

- TestNG ReportNG page: https://testng.org/reportng/
- Maven Central listing via javadoc index: https://javadoc.io/doc/org.testng/reportng

### What was added

- ReportNG dependency in `pom.xml`
- ReportNG demo class:
  [Topic18_ReportNgOrangeHrm.java](/C:/Users/wasim/IdeaProjects/AllCodesThisWayPlease/TestNG_Tutorial_Project/src/test/java/testngtopics/Topic18_ReportNgOrangeHrm.java:1)
- Dedicated suite:
  [suite-reportng-orangehrm.xml](/C:/Users/wasim/IdeaProjects/AllCodesThisWayPlease/TestNG_Tutorial_Project/suites/suite-reportng-orangehrm.xml:1)

### What this demo does

- Opens OrangeHRM with Selenium
- Runs one passing test
- Runs one intentionally failing test
- Writes `Reporter.log(...)` messages so they are visible in the report

### How to install

If Maven is available, open this project folder:

```bash
cd TestNG_Tutorial_Project
```

Then Maven will download ReportNG automatically the first time you run tests:

```bash
mvn test
```

If you are using IntelliJ:

1. Open or reload `TestNG_Tutorial_Project/pom.xml`
2. Wait for Maven dependencies to finish downloading
3. Make sure `org.testng:reportng:1.2.2` appears under External Libraries

### How to run only the ReportNG example

From Maven:

```bash
mvn -Dsurefire.suiteXmlFiles=suites/suite-reportng-orangehrm.xml test
```

From IntelliJ:

1. Open [suite-reportng-orangehrm.xml](/C:/Users/wasim/IdeaProjects/AllCodesThisWayPlease/TestNG_Tutorial_Project/suites/suite-reportng-orangehrm.xml:1)
2. Right-click it
3. Run as TestNG Suite

### Where the reports are generated

After the run, check these folders inside `TestNG_Tutorial_Project`:

- `test-output`
  This is the main TestNG output folder.
- `test-output/html`
  ReportNG HTML pages are typically generated here.
- `test-output/index.html`
  Default TestNG report entry page may also appear here.
- `target/surefire-reports`
  Maven Surefire execution details usually appear here when you run with Maven.

### Which file to open

Start with these:

- `TestNG_Tutorial_Project/test-output/html/index.html`
- `TestNG_Tutorial_Project/test-output/index.html`

If `html/index.html` exists, that is usually the ReportNG page you want first.

### What you should see

- One passed OrangeHRM test
- One failed OrangeHRM test
- Logged messages such as page title or field detection
- A clearer pass/fail summary than the default HTML report
