plugins {
    id("ivy.feature")
}

android {
    namespace = "com.ivy.releases"
}

dependencies {
    implementation(projects.ivyBase)
    implementation(projects.ivyDomain)
    implementation(projects.ivyResources)
    implementation(projects.ivyDesign)
    implementation(projects.ivyNavigation)
    implementation(projects.ivyCommonUi)

    implementation(libs.bundles.ktor)
}