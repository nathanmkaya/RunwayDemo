plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.kotlinAndroid) apply false
    alias(libs.plugins.file.encrypt)
}

gradleFileEncrypt {
    plainFiles.from("api-6606706446287510446-244527-289ca6441abf.json")
}
