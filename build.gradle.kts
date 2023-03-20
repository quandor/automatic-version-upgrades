plugins {
    kotlin("jvm") version "1.6.21"
}

dependencies {
    implementation("org.flywaydb:flyway-core:9.11.0")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.3.1")
    testImplementation("org.assertj:assertj-core:3.12.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.3.1")
}

