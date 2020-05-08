import lt.markmerkk.Versions

plugins {
    id("java")
    id("maven")
}

group = "net.rcarz"
version = "0.6-SNAPSHOT"

description = "jira-client"

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

dependencies {
    implementation("org.apache.httpcomponents:httpclient:4.2.5")
    implementation("org.apache.httpcomponents:httpmime:4.2.5")
    implementation(group = "net.sf.json-lib", name = "json-lib", version = "2.4", classifier = "jdk15")
    implementation("joda-time:joda-time:${Versions.jodaTime}")
    implementation("org.scribe:scribe:1.3.7")

    testImplementation("junit:junit:4.8.2")
    testImplementation("org.powermock:powermock-module-junit4:1.6.3")
    testImplementation("org.powermock:powermock-api-mockito:1.6.3")
    testImplementation("org.assertj:assertj-core:2.2.0")
}
