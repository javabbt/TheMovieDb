import org.gradle.api.JavaVersion

object Config {
    const val minSdk = 24
    const val compileSdk = 34
    const val targetSdk = 33
    const val versionCode = 1
    const val versionName = "1.0"
    val javaVersion = JavaVersion.VERSION_1_8
}

object Versions {
    const val androidx_fragment_version = "1.3.6"
    const val androidx_navigation_version = "2.4.1"
    const val androidx_navigation_compose_version = "2.5.2"
    const val dagger_version = "2.45"
    const val androidx_hilt_navigation_compose = "1.0.0"
    const val androidx_compose = "1.3.3"
    const val androidx_compose_foundation = "1.3.1"
    const val androidx_activity = "1.4.0"
    const val androidx_core_version = "1.9.0"
    const val lifecycle_version = "2.5.1"
    const val junit_version = "4.13.2"
    const val junit5_version = "5.9.0"
    const val androidx_espresso = "3.4.0"
    const val junit_ext_version = "1.1.3"
    const val compose_bom = "2023.08.00"
    const val kotlin_compiler_extension = "1.4.0"
}

object Deps {
    const val androidx_fragment =
        "androidx.fragment:fragment-ktx:${Versions.androidx_fragment_version}"
    const val androidx_navigation_fragment =
        "androidx.navigation:navigation-fragment-ktx:${Versions.androidx_navigation_version}"
    const val androidx_navigation_ui =
        "androidx.navigation:navigation-ui-ktx:${Versions.androidx_navigation_version}"
    const val androidx_navigation_safe_args =
        "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.androidx_navigation_version}"
    const val androidx_navigation_compose =
        "androidx.navigation:navigation-compose:${Versions.androidx_navigation_compose_version}"

    const val dagger = "com.google.dagger:dagger:${Versions.dagger_version}"
    const val dagger_hilt = "com.google.dagger:hilt-android:${Versions.dagger_version}"
    const val dagger_hilt_testing =
        "com.google.dagger:hilt-android-testing:${Versions.dagger_version}"
    const val dagger_hilt_gradle_plugin =
        "com.google.dagger:hilt-android-gradle-plugin:${Versions.dagger_version}"
    const val androidx_hilt_navigation_compose =
        "androidx.hilt:hilt-navigation-compose:${Versions.androidx_hilt_navigation_compose}"

    const val lifecycle_viewmodel =
        "androidx.lifecycle:lifecycle-viewmodel:${Versions.lifecycle_version}"
    const val lifecycle_livedata =
        "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle_version}"
    const val lifecycle_savedstate =
        "androidx.lifecycle:lifecycle-viewmodel-savedstate:${Versions.lifecycle_version}"
    const val lifecycle_viewmodel_ktx =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle_version}"
    const val lifecycle_runtime_ktx =
        "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle_version}"

    const val androidx_compose_runtime = "androidx.compose.runtime:runtime:${Versions.androidx_compose}"
    const val androidx_core = "androidx.core:core-ktx:${Versions.androidx_core_version}"
    const val androidx_compose_foundation = "androidx.compose.foundation:foundation:${Versions.androidx_compose_foundation}"
    const val androidx_compose_foundation_layout = "androidx.compose.foundation:foundation-layout:${Versions.androidx_compose_foundation}"
    const val androidx_compose_ui = "androidx.compose.ui:ui:${Versions.androidx_compose}"
    const val androidx_compose_ui_tooling = "androidx.compose.ui:ui-tooling:${Versions.androidx_compose}"
    const val androidx_compose_material = "androidx.compose.material:material:${Versions.androidx_compose_foundation}"
    const val androidx_compose_material_icons = "androidx.compose.material:material-icons-extended:${Versions.androidx_compose_foundation}"
    const val androidx_activity_compose = "androidx.activity:activity-compose:${Versions.androidx_activity}"
}

object TestDeps {
    const val testlib_junit = "junit:junit:${Versions.junit_version}"
    const val testlib_junit5 = "org.junit.jupiter:junit-jupiter:${Versions.junit5_version}"
    const val test_androidx_espresso_core =
        "androidx.test.espresso:espresso-core:${Versions.androidx_espresso}"
    const val test_androidx_junit = "androidx.test.ext:junit:${Versions.junit_ext_version}"
    const val compose_bom = "androidx.compose:compose-bom:${Versions.compose_bom}"
}