# Custom Ktor Rest API

<img src="https://user-images.githubusercontent.com/65896669/185248723-fbda8767-0bf4-4398-8e99-301b4b7a5c29.gif" width="336" align="right" hspace="20">

[![Kotlin Version](https://img.shields.io/badge/Kotlin-1.7.10-black.svg)](https://kotlinlang.org)
[![AGP](https://img.shields.io/badge/AGP-7.2.1-black?style=flat)](https://developer.android.com/studio/releases/gradle-plugin)
[![Gradle](https://img.shields.io/badge/Gradle-7.3.3-black?style=flat)](https://gradle.org)
[![Gradle](https://img.shields.io/badge/Compose-1.0.2-black.svg?style=flat)](https://developer.android.com/jetpack/compose)

## The project
The purpose of the project is to create custom Rest API using Ktor, 

populate it and use the data via showcase application.


### Custom Rest Api

The custom rest api is create with Ktor and populated with simple data -                                
computer images and information about their processors.                                

* __Build system__ used is `Gradle Kotlin`.
* __Engine__ is `Netty`
* __Pluggins for specific backend bahaviour__

    * __Rounting__ - to define routes for response
    * __Static Content__ - allow application to call a specific road
    * __Content Negotiation__ - for automatic Json parsing of API response
    * __Call Logging__ - log client request to the server
    * __kotlinx.serialization__ - handles JSON serialization

### Showcase Application

The simple showcase Android application is created with JetPack Compose.                                
The whole app is just main screen with `ImageView`, `TextViews` and a `Button`.                                
When the button is clicked, application performed a call to the Custom Ktor Rest Api                                                                
and retreive the data - information about a random computer. Than just populate                                                                
the `ImageView` and the `TextViews` with the data                                

## Project characteristics and tech-stack

This project takes advantage of best practices, many popular libraries and tools 
in the Android ecosystem. Most of the libraries are in the stable version unless 
there is a good reason to use non-stable dependency.

* Tech-stack
    * [100% Kotlin](https://kotlinlang.org/) + [Coroutines](https://kotlinlang.org/docs/reference/coroutines-overview.html) - perform background operations
    * [Retrofit](https://square.github.io/retrofit/) - networking
    * [Jetpack](https://developer.android.com/jetpack)
        * [StateFlow](https://developer.android.com/kotlin/flow/stateflow-and-sharedflow) - notify views about database change
        * [Lifecycle](https://developer.android.com/topic/libraries/architecture/lifecycle) - perform an action when lifecycle state changes
        * [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) - store and manage UI-related data in a lifecycle conscious way
    * [Hilt](https://dagger.dev/hilt/) - dependency injection
    * [Coil](https://coil-kt.github.io/coil/compose/) - image loading library

* Modern Architecture
    * Clean Architecture (at feature module level)
    * Single activity architecture using [Navigation component](https://developer.android.com/guide/navigation/navigation-getting-started)
  * [GitHub Actions](https://github.com/features/actions)
  * Automatic PR verification including tests, linters and 3rd online tools
* UI
    * [JetPack Compose](https://material.io/design)
* Gradle
    * [Gradle Kotlin DSL](https://docs.gradle.org/current/userguide/kotlin_dsl.html)


## Getting started

There are a few ways to open this project.

### IntelliJ Idea & Android Studio

1. `IntelliJ Idea` -> `File` -> `New` -> `From Version control` -> `Git`
2. Enter `https://github.com/YosifKalchev/Ktor-Rest-Api/tree/main/RestApi` into URL field an press `Clone` button
3.`Android Studio` -> `File` -> `New` -> `From Version control` -> `Git`
4. Enter `https://github.com/YosifKalchev/Ktor-Rest-Api/tree/main/ComputersApp` into URL field an press `Clone` button

### Command-line + IntelliJ Idea & Android Studio

1. Run `https://github.com/YosifKalchev/Ktor-Rest-Api.git` command to clone project
2. Open `IntelliJ Idea` and select `File | Open...` from the menu. Select `RestApi` folder in cloned directory and press `Open` button
3. Open `Android Studio` and select `File | Open...` from the menu. Select `ComputersApp` folder in cloned directory and press `Open` button

```
NOTE: You need to run the RestApi first
```

## Author
[![Follow me](https://img.shields.io/twitter/follow/YosifKalchev?style=social)](https://twitter.com/yosifkalchev)

