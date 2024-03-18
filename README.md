# XposedBridgeAPI <a href="settings.gradle.kts"><img src="https://img.shields.io/badge/PASS-Malt?style=for-the-badge&label=BUILD&labelColor=%230A69DA"/></a>
The Java part of the Xposed framework. 

#### Quick Start
```java
// https://mvnrepository.com/artifact/de.robv.android.xposed/api
implementation 'de.robv.android.xposed:api:82'
```
The latest version introduced 参考[build.gradle.kts(:core)](core/core/build.gradle.kts)
```java
api(project(":api"))
implementation(libs.commons.lang3)
implementation(projects.hiddenapi.bridge)
compileOnly(projects.hiddenapi.stubs)
```

## 参考资料
[Welcome to the Javadoc reference of the Xposed Framework API. ](https://api.xposed.info/reference/packages.html)

## License<a href="LICENSE">  <img src="https://img.shields.io/badge/Apache%20License%202.0-Malt?style=flat&label=License&labelColor=%23E77333"></a>
如果您发现本项目有侵犯您的知识产权，请与我取得联系，我会及时修改或删除。
