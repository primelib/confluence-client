# Confluence REST Client

A java http client library for Confluence REST Client.

## Installation

```
implementation("io.github.primelib:confluence4j-rest-v1:<version>")
```

## Usage

**Create client instances using the factory, you can choose different interfaces by changing the `api` parameter.**

```java
ConfluenceRestClientApi client = ConfluenceRestClientFactory.create(spec -> {
    spec.api(ConfluenceRestClientApi.class);
    spec.baseUrl("https://{your-domain}/wiki/api/v2");
    spec.basicAuth(auth -> {
        auth.username("<admin>");
        auth.password("<password>");
    });
    //spec.meterRegistry(meterRegistry);
    //spec.logLevel("FULL");
});
```


## License

This project is licensed under the [MIT](https://github.com/primelib/confluence-client/blob/main/LICENSE) license.
