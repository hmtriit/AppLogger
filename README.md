# AppLogger
This is AppLoger

Installation
=================

In your project's `build.gradle` file add the following line to the `dependencies` group:

	implementation 'com.hmt.android:applogger:1.0.0'

Now add this in root level `settings.gradle` or root level `build.gradle` (old gradle version) file:

```gradle
repositories {
   maven {
       url = "https://maven.pkg.github.com/hmtriit/AppLogger"
       credentials {
           username = GITHUB_USER
           password = GITHUB_TOKEN
       }
   }
}
```

Usage
=================

```java
LoggerFactory.Logger logger = LoggerFactory.getLogger("MainActivity", LoggerFactory.LoggerType.Console);

// optional, set a minimum filter level
// logger.setLevel(Log.INFO);

logger.info("Info message: %s", "test string");
logger.verbose("Verbose message: %d", 1);
logger.debug("Debug message: %b", false);
logger.error("Error message: %g", 1.5f);
logger.warn("Warning message");
```
