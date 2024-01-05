plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.weinc.themoviedb"
    compileSdk = Config.compileSdk

    defaultConfig {
        applicationId = "com.weinc.themoviedb"
        minSdk = Config.minSdk
        targetSdk = Config.targetSdk
        versionCode = Config.versionCode
        versionName = Config.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
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