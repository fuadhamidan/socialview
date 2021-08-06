buildscript {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        google()
        maven { setUrl("https://jitpack.io") }
    }
    dependencies {
        classpath(kotlin("gradle-plugin", VERSION_KOTLIN))
        classpath(android)
        classpath(`git-publish`)
    }
}

allprojects {
    repositories {
        mavenCentral()
        google()
        maven { setUrl("https://jitpack.io") }
    }
}