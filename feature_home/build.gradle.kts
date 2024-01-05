plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.weinc.feature_home"
    compileSdk = Config.compileSdk

    defaultConfig {
        minSdk = Config.minSdk

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    api(Deps.androidx_compose_foundation_layout)
    api(Deps.androidx_compose_material)
    api(Deps.androidx_compose_material_icons)
    api(Deps.androidx_compose_ui)
    api(Deps.androidx_compose_ui_tooling)
    api(Deps.androidx_compose_runtime)
    api(Deps.androidx_core)
    api(Deps.androidx_activity_compose)

    implementation(Deps.lifecycle_viewmodel)
    implementation(Deps.lifecycle_viewmodel_ktx)
    implementation(Deps.lifecycle_livedata)
    implementation(Deps.lifecycle_savedstate)
    implementation(Deps.lifecycle_runtime_ktx)


    testImplementation(TestDeps.testlib_junit)
    androidTestImplementation(TestDeps.test_androidx_junit)
    androidTestImplementation(TestDeps.test_androidx_espresso_core)
    androidTestImplementation(platform(TestDeps.compose_bom))
}