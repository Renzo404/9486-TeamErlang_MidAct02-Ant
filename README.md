# LeetCode Pair Programming Archive

This repository contains a collection of Java solutions managed by a robust **Apache Ant** build script. The configuration automates the entire development, testing (using JUnit 5), and packaging process, ensuring a consistent build across your group.

## Dependencies (The `lib` Folder)

This project requires external JUnit 5 libraries. These dependencies have been committed directly to the **`lib`** folder, ensuring that the Ant build is self-contained and works immediately for all collaborators without requiring external tools like Maven or Gradle.

## Core Capabilities

The centralized **`build.xml`** file is configured to handle all project workflow stages:

* **Setup:** Deleting old artifacts (`clean`) and preparing output directories.
* **Compilation:** Compiling the main Java code and the separate test code (`compile` and `compile-tests`).
* **Full Testing:** The **`execute-main`** target runs the test runner to execute **all integrated JUnit test cases**.
* **Single Testing:** The **`execute-single`** target allows rapid execution of *only one* test class for focused debugging.
* **Packaging:** Creating two distinct JAR files in the **`dist/`** directory: one for compiled classes and one for Javadoc documentation.

## Getting Started & Execution

1.  Ensure **Apache Ant** is installed and configured in your system environment path.
2.  Ensure you have run `git pull` and the **`lib`** folder contains all the necessary `.jar` files.

### Primary Build Targets

| Target | Description | Command | 
| :----- | :----- | :----- | 
| **`build`** | Runs the full sequence: **compile**, **javadoc**, and **package** (creating the output JARs). | `ant build` | 
| **`clean`** | Deletes the generated `build`, `dist`, and `doc` directories. | `ant clean` | 

### Testing Targets (Runs Test Runner - `Main.java`)

| Target | Description | Command | 
| :----- | :----- | :----- | 
| **`execute-main`** | Executes the test runner (`Main.java`) to run **ALL** test classes found in the `test.java` package. | `ant execute-main` | 
| **`execute-single`** | Executes the test runner to run **ONLY ONE** specified test class (e.g., `ValidNumberTest`). | `ant -Dclass=ValidNumberTest execute-single` | 
| **`execute-single`** | (Example for TwoSum) | `ant -Dclass=TwoSumTest execute-single` | 

## Project Structure (Managed by Ant)
