# Timber-Track
[![platform](https://img.shields.io/badge/platform-Android-yellow.svg)](https://www.android.com)
[![](https://jitpack.io/v/Toluwanimi9259/timber-track.svg)](https://jitpack.io/#Toluwanimi9259/timber-track)

Timber track is a light-weight, easy-to-use logging library written in kotlin that simplifies logging in apps

## Prerequisites

#### Groovy
Add this in your  `settings.gradle` file :

```gradle
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
      ...
      maven { url 'https://jitpack.io' }  // Add this Line
    }
}
```

#### Kotlin
Add this in your  `settings.gradle.kts` file :

```gradle
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        ...
        maven(url = "https://jitpack.io")  // Add this line 
    }
}
```

## Dependency

#### Groovy
Add this to your module's `build.gradle` file (make sure the version matches the JitPack badge above):
```gradle
dependencies {
	...
	implementation 'com.github.Toluwanimi9259:timber-track:1.2'
}
```

#### Kotlin
Add this to your module's `build.gradle.kts` file (make sure the version matches the JitPack badge above):
```gradle
dependencies {
	...
	implementation("com.github.Toluwanimi9259:timber-track:1.2")
}
```

# Usage

It is recommended to check the sample project to get a complete understanding of all the features offered by the library.

Here's an example of a basic log with default message and tag
```kotlin
TimberTrack.log()
```

Custom message with tag
```kotlin
TimberTrack.log(message = "This is a logging library", tag = "Custom Tag")
```

Custom message with a toast
```kotlin
val context = LocalContext.current
...
TimberTrack.log(message = "This is a logging library", showToast = true, context = context) // By default the toast is long
```

Custom message with a short toast
```kotlin
// Toast Length:  Long = 1 , Short = 0 can also use numbers for "toastLength"
TimberTrack.log(message = "This is a logging library", showToast = true, context = context, toastLength = Toast.LENGTH_SHORT)
```

## Contributing

You can contribute using
[pull requests](https://github.com/Toluwanimi9259/timber-track/pulls).

Any contributions, large or small, major features, bug fixes, are welcomed and appreciated.

### Contact
- [Twitter](https://twitter.com/_techafresh)
- [Github](https://github.com/Toluwanimi9259)
- [Linkedin](https://www.linkedin.com/in/toluwanimi-leigh-8468a61bb)
