# BalTour
======
**BalTour** is an android app that explain us about *Bali Tourism Place* . I upload this open source project, so you can clone it, download, etc.
![Banner](/app/screenshot/screenshot3.png)

It has now(v.1.83).

## Screenshot
This the screenshot of ***BalTour App***
![Screenshot Baltour](/app/screenshot/screenshot1.png) ![Screenshot Baltour](/app/screenshot/screenshot2.png)

## Gradle
* Project: BalTour
// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath 'com.android.tools.build:gradle:3.0.1'
        

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

task clean(type: Delete) {
    delete rootProject.buildDir
}

* Module: app
apply plugin: 'com.android.application'

android {
    compileSdkVersion 26
    defaultConfig {
        applicationId "com.gmail.farasabiyyu12.baltour"
        minSdkVersion 16
        targetSdkVersion 26
        versionCode 1
        versionName "1.0"
        testInstrumentationRunner "android.support.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android.txt'), 'proguard-rules.pro'
        }
    }
}

dependencies {
    implementation fileTree(dir: 'libs', include: ['*.jar'])
    implementation 'com.android.support:appcompat-v7:26.1.0'
    implementation 'com.android.support.constraint:constraint-layout:1.1.0'
    implementation 'com.android.support:design:26.1.0'
    testImplementation 'junit:junit:4.12'
    androidTestImplementation 'com.android.support.test:runner:1.0.1'
    androidTestImplementation 'com.android.support.test.espresso:espresso-core:3.0.1'

    implementation 'com.android.support:recyclerview-v7:26.1.0'
    implementation 'com.android.support:cardview-v7:26.1.0'

    implementation 'com.github.bumptech.glide:glide:3.7.0'
}

## Version
* 1.0

## Contributors
 * Farras Doko

## Contact
#### Farras Doko
* instagram: [farrasdoko](https://www.instagram.com/farrasdoko/)
* email: farras.abiyyu.doko@gmail.com
