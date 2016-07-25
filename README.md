# Failure case for mixed use of Kotlin and Java

I've updated the Kotlin and Java mixed use [example project](https://github.com/JetBrains/kotlin-examples/tree/master/gradle/mixed-java-kotlin-hello-world) and modified by adding a repository class which extends a couple querydsl classes. This example is simply used to create a reason for the `MongoAnnotationProcessor` to run as part of the build.

The build fails if we reference the Kotlin class from a class that has Spring annotations on it (`GreetinController` in this case).
