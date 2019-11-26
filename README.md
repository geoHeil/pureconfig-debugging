# gradle scala compilation failure

a:

```bash
gradle clean
gralde compilescala
```

works fine for a minimalistic configuration, and fails with:

```
Foo.scala:18: could not find implicit value for parameter A: pureconfig.ConfigReader[pconfigdebugging.other.bar.ExtremelyComplexConfig]
```

How can this be fixed, but still keep JDK8 scala 2.11 compliant?

