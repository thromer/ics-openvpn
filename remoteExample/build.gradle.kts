plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "de.blinkt.openvpn.remote"
    compileSdk = 36
    defaultConfig {
        applicationId = "de.blinkt.openvpn.remote"
        minSdk = 24
	targetSdk  = 36
	versionCode = 1
	versionName = "0.1"
        ndk {
            abiFilters += listOf("armeabi-v7a")
        }
    }
    
    buildTypes {
        debug {
            signingConfig = signingConfigs.getByName("debug")
        }
        release {
            signingConfigs.getByName("debug")
            isMinifyEnabled = false
        }
    }
    
    buildFeatures {
        aidl = true
    }
}
