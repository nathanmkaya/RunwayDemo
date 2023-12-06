plugins {
    alias(libs.plugins.build.parameters)
}

buildParameters {
    string("version") {
        fromEnvironment("VERSION")
        defaultValue.set("0.0.0")
    }
    integer("buildNumber") {
        fromEnvironment("GITHUB_RUN_NUMBER")
        defaultValue.set(1)
    }
    string("storePassword") {
        fromEnvironment("KEYSTORE_PASSWORD")
    }
    string("keyPassword") {
        fromEnvironment("KEY_PASSWORD")
    }
    bool("isCI") {
        fromEnvironment("CI")
        defaultValue.set(false)
    }
}
