# Java Collections in Selenium Framework

This folder explains how Java collections are used in Selenium WebDriver code.

## Why collections matter in Selenium

Selenium rarely works with only one element. In real automation, you often handle:

- multiple rows from a table
- many checkboxes, links, or buttons
- unique values collected from a page
- key-value data such as `name -> status`
- ordered test steps in a framework
- shared results during parallel execution

That is why Java collections are important in Selenium.

## Main collections used in Selenium

### 1. List

`List` is the most common collection in Selenium.

Typical use:

- `findElements()` returns `List<WebElement>`
- reading table rows
- iterating over checkboxes, links, dropdown options

Example:

```java
List<WebElement> rows = driver.findElements(By.cssSelector("#mixedTable tbody tr"));
```

### 2. Set

`Set` stores only unique values.

Typical use:

- removing duplicate texts
- storing unique link names
- storing unique roles, categories, or labels from a page

Example:

```java
Set<String> uniqueRoles = new LinkedHashSet<>();
```

### 3. Map

`Map` stores data as key-value pairs.

Typical use:

- storing `employeeName -> status`
- storing `locatorName -> locator`
- storing `testCaseId -> result`

Example:

```java
Map<String, String> employeeStatus = new LinkedHashMap<>();
```

### 4. Queue

`Queue` is useful when a framework executes steps in order.

Typical use:

- step-by-step action execution
- retry task handling
- ordered processing of windows, tabs, or jobs

### 5. Concurrent collections

Concurrent collections are useful in parallel execution.

Typical use:

- storing thread-safe results
- collecting logs from parallel tests
- sharing execution status safely

Example:

```java
ConcurrentHashMap<String, String> results = new ConcurrentHashMap<>();
```

## Files in this folder

- `A_ListInSelenium.java`:
  demonstrates `List<WebElement>` using the local dynamic table
- `B_SetAndMapInSelenium.java`:
  demonstrates unique values and key-value extraction from the same page
- `C_QueueAndParallelResultDemo.java`:
  demonstrates framework-level use of `Queue` and `ConcurrentHashMap`

## Notes

- These examples use `resources/DynamicTable.html` already present in this project.
- They are written for learning, so the focus is on clarity instead of framework abstraction.
- Driver setup can be changed to `EdgeDriver` if that is what you use locally.
