import org.checkerframework.gradle.plugin.CheckerFrameworkExtension

// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.2.2" apply false
    id("org.checkerframework") version "0.6.45"
}

apply(plugin = "org.checkerframework")

configure<CheckerFrameworkExtension> {
    checkers = listOf(
            "org.checkerframework.checker.confidential.ConfidentialChecker"
    )
}

if (project.hasProperty("cfLocal")) {
    val cfHome = System.getenv("CHECKERFRAMEWORK")
    dependencies {
        compileOnly(files(cfHome + "/checker/dist/checker-qual.jar"))
        testCompileOnly(files(cfHome + "/checker/dist/checker-qual.jar"))
        checkerFramework(files(cfHome + "/checker/dist/checker.jar"))
    }
}