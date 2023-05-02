plugins {
    kotlin("jvm") version "1.6.21"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.flyway)
    testImplementation(libs.junit.jupiter)
    testImplementation(libs.assertj)
}
tasks.test {
    useJUnitPlatform()
}

