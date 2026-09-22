# Upgrade Plan: assign2 (20260922130826)

- **Generated**: 2026-09-22
- **HEAD Branch**: main
- **HEAD Commit ID**: N/A (not exposed by the version-control status tool)

## Available Tools

**JDKs**
- JDK 25.0.4.1: `C:\Program Files\Eclipse Adoptium\jdk-25.0.4.101-hotspot\bin` (target runtime)

**Build Tools**
- Maven: **<TO_BE_INSTALLED>** (no system Maven or Maven Wrapper detected; required for baseline and validation)

## Guidelines

> Note: You can add any specific guidelines or constraints for the upgrade process here if needed, bullet points are preferred.

- Preserve existing application and test behavior.
- Do not overwrite unrelated uncommitted user changes.
- Run in auto-execution mode.

## Options

- Working branch: `appmod/java-upgrade-20260922130826`
- Run tests before and after the upgrade: true

## Upgrade Goals

- Java runtime and compilation target: 25 (latest LTS as of 2026-09-22)

## Technology Stack

| Technology/Dependency | Current | Min Compatible Version | Why Incompatible |
| --------------------- | ------- | ---------------------- | ---------------- |
| Java | 25.0.4.1 installed; POM uses `25.0.4.101-hotspot` | 25 | Maven compiler `source`/`target` require a language level, not a full JDK runtime identifier |
| Maven | Not installed; no wrapper | 3.9+ | Required to execute the Maven lifecycle with Java 25 |
| maven-compiler-plugin | 3.11.0 | 3.11.0 | Compatible; retain while replacing malformed compiler properties with `release` |
| maven-surefire-plugin | 2.22.1 | 3.5.3 | Upgrade recommended for reliable Java 25 test execution |
| JUnit | 4.11 | 4.13.2 | Existing API is compatible; patch-level upgrade improves current-runtime compatibility |
| Other application dependencies | None | N/A | No additional runtime dependencies found in the POM |

## Derived Upgrades

- Set Maven compilation to Java release `25`, because the current full runtime identifier is not a valid compiler language level.
- Install Maven 3.9.15 because no Maven executable or wrapper is available.
- Upgrade Surefire to 3.5.3 for current Java runtime test-provider compatibility.
- Upgrade JUnit 4.11 to 4.13.2 as a compatible test dependency patch upgrade.

## Impact Analysis

### Dependency Changes

| File | Dependency | Current | Action | Target | Reason |
|------|------------|---------|--------|--------|--------|
| `pom.xml` | `maven.compiler.source` / `maven.compiler.target` | `25.0.4.101-hotspot` | replace | `maven.compiler.release=25` | Compiler properties must express a Java language release, not the JDK build identifier |
| `pom.xml` | `maven-surefire-plugin` | 2.22.1 | upgrade | 3.5.3 | Current test plugin is old for Java 25 execution |
| `pom.xml` | `junit:junit` | 4.11 | upgrade | 4.13.2 | Compatible patch upgrade for test infrastructure |

### Source Code Changes

| File | Location | Current | Required Change | Reason |
|------|----------|---------|----------------|--------|
| None | N/A | No Java 25-incompatible imports or APIs identified in the available source | No source change | The runtime-target change is confined to Maven configuration |

### Configuration Changes

| File | Property/Setting | Current | Required Change | Reason |
|------|------------------|---------|----------------|--------|
| `pom.xml` | compiler properties | Full JDK identifier in `source` and `target` | Replace with `maven.compiler.release=25` | Produces Java 25 bytecode and compiles against the Java 25 API |

### CI/CD Changes

| File | Location | Current | Required Change |
|------|----------|---------|----------------|
| None found | N/A | No CI/CD configuration detected in the project scope | None | No hardcoded runtime references require updating |

### Risks & Warnings

- **Existing uncommitted files**: The repository contains user changes and generated class files before this upgrade. Branch preparation must preserve them and the upgrade commit must include only intended project changes.
- **Old Maven plugins**: Several lifecycle plugins are old, but only Surefire is directly relevant to Java 25 test execution. Avoid unrelated plugin churn unless validation proves it necessary.
- **No runtime integration coverage**: The project has a unit test but no identified integration test suite. Successful compile and test execution validate the requested build/runtime configuration, not untested external behavior.

## Upgrade Steps

- Step 1: Setup Environment
  - **Rationale**: Make Java 25 and Maven 3.9.15 available for all reproducible checks.
  - **Changes to Make**: Install Maven 3.9.15; retain the installed JDK 25.0.4.1.
  - **Verification**: List JDKs and Maven installations; expected Java 25 and Maven 3.9.15 are available.

- Step 2: Setup Baseline
  - **Rationale**: Establish the pre-change build/test result. The existing malformed compiler configuration is expected to expose the current failure.
  - **Changes to Make**: No project-file changes.
  - **Verification**: Run `mvn clean compile test-compile -q` and `mvn clean test -q` with JDK 25; record results.

- Step 3: Normalize Java 25 Maven Configuration
  - **Rationale**: Replace the invalid compiler target and modernize only the test dependencies needed for Java 25.
  - **Changes to Make**: Apply all Dependency Changes and Configuration Changes above in `pom.xml`.
  - **Verification**: Run `mvn clean test-compile -q` with JDK 25; expected main and test compilation succeeds.

- Step 4: CVE Validation and Fix
  - **Rationale**: Check direct dependency versions after the upgrade and remediate any reported vulnerabilities.
  - **Changes to Make**: Upgrade only dependencies with confirmed available fixes; preserve behavior and recompile.
  - **Verification**: Dependency scan, `mvn clean test-compile -q`, then a second dependency scan; expected no unresolved remediable CVEs.

- Step 5: Final Validation
  - **Rationale**: Confirm the target Java release, clean build, and complete test suite.
  - **Changes to Make**: Resolve any validation failures in the same upgrade slice; leave no temporary workaround unresolved.
  - **Verification**: Run `mvn clean test -q` with JDK 25; expected 100% of tests pass.
