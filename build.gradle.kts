plugins {
    scala
    application
}

application {
    mainClassName = "pconfigdebugging.Foo"
}

repositories {
    jcenter()
}

dependencies {
    implementation("org.scala-lang:scala-library:2.11.12")
    implementation("com.github.pureconfig:pureconfig_2.11:0.12.1")
}
