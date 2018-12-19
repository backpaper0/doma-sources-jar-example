# doma-sources-jar-example

- https://qiita.com/backpaper0@github/items/59a6381d224bc6683d63

# Requirements

- JDK11
- Nexus3

```
docker run -d --name nexus -p 8081:8081 -v nexus-data:/nexus-data sonatype/nexus3
```

# Maven

```
cd maven-demo
./mvnw -s settings.xml deploy
```

## Gradle

```
cd gradle-demo
./gradlew publish
```

