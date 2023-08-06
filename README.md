# *Confluence4J*

> A java client for the Confuence REST API.

## Module: REST-V2

[![Maven Central](https://img.shields.io/maven-central/v/io.github.primelib/confluence4j-rest-v2)](https://central.sonatype.com/artifact/io.github.primelib/confluence4j-rest-v2)
[![javadoc](https://javadoc.io/badge2/io.github.primelib/confluence4j-rest-v2/javadoc.svg)](https://javadoc.io/doc/io.github.primelib/confluence4j-rest-v2)

### Installation

```gradle
implementation("io.github.primelib:confluence4j-rest-v2:<latestVersion>")
```

[Click to view instructions for other build tools](https://central.sonatype.com/artifact/io.github.primelib/confluence4j-rest-v2).

### Usage

```java
ConfluenceRESTV2ConsumerApi client = ConfluenceRESTV2Factory.create(spec -> {
    spec.baseUrl("https://templates.atlassian.net/wiki/api/v2");
    spec.api(ConfluenceRESTV2ConsumerApi.class);
});

MultiEntityResultPage result = client.getPages(spec -> {
    spec.limit(5);
});
```

## Module: REST-V1

[![Maven Central](https://img.shields.io/maven-central/v/io.github.primelib/confluence4j-rest-v1)](https://central.sonatype.com/artifact/io.github.primelib/confluence4j-rest-v1)
[![javadoc](https://javadoc.io/badge2/io.github.primelib/confluence4j-rest-v1/javadoc.svg)](https://javadoc.io/doc/io.github.primelib/confluence4j-rest-v1)

### Installation

```gradle
implementation("io.github.primelib:confluence4j-rest-v1:<latestVersion>")
```

[Click to view instructions for other build tools](https://central.sonatype.com/artifact/io.github.primelib/confluence4j-rest-v1).

### Usage

```java
ConfluenceRESTV1ConsumerApi client = ConfluenceRESTV1Factory.create(spec -> {
    spec.baseUrl("https://templates.atlassian.net");
    spec.api(ConfluenceRESTV1ConsumerApi.class);
});

ContentArray result = client.searchContentByCQL(spec -> {
    spec.cql("type=page");
    spec.limit(5);
});
```

## Links

- [Documentation](https://primelib.github.io)
- [Contribute](https://primelib.github.io/contribution/)

## License

Released under the [MIT License](./LICENSE).
