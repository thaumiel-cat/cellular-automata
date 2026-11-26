plugins {
    application
}

group = "org.wildcat"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(27)
    }
}

application {
    mainClass = "Main"
}

tasks.withType<JavaCompile>().configureEach {
    options.encoding = "UTF-8"
}
