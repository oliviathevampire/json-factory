plugins {
    java
    kotlin("jvm")
    application
    id("com.jfrog.artifactory")
    `maven-publish`
}

base {
    archivesBaseName = "json-factory-gui"
}

val local = true

repositories {
    maven(url = "http://server.bbkr.space:8081/artifactory/libs-release")
}

dependencies {
    if (local) {
        implementation(project(":"))
    } else {
        implementation("io.github.cottonmc:json-factory:$version")
    }
    implementation("com.miglayout:miglayout-swing:5.2")
}

application {
    mainClassName = "io.github.cottonmc.jsonfactory.gui.MainKt"
}

tasks.withType<Jar> {
    manifest {
        attributes["Main-Class"] = "io.github.cottonmc.jsonfactory.gui.MainKt"
    }
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
            artifact(tasks["distZip"])
            artifact(tasks["sourcesJar"])
        }
    }
}
