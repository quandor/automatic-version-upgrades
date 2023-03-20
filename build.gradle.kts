plugins {
    kotlin("jvm")
}

repositories {
    // without specifying at least one repository
    // refreshVersions will fail with:
    // "Cannot get version candidates with an empty fetchers list."
    mavenCentral()
}

dependencies {
    // The '_' is a necessary placeholder for refreshVersions to work
    implementation("org.flywaydb:flyway-core:_")
    // For well known dependencies, it even offers type safe objects.
    // They will help you in your IDE via auto-completion.
    testImplementation(Testing.junit.jupiter.api)
    testImplementation(Testing.assertj.core)
    testRuntimeOnly(Testing.junit.jupiter.engine)
}
