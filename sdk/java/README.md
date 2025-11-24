# Confluence Client

A java http client library for Confluence Client.

## Core Library

**Coordinates**

```
implementation("io.github.primelib:confluence4j-rest-v1:<version>")
```

**Create client instances using the factory, you can choose different interfaces by changing the `api` parameter.**

```java
ConfluenceClientApi client = ConfluenceClientFactory.create(spec -> {
    spec.api(ConfluenceClientApi.class);
    spec.baseUrl("https://{your-domain}/wiki/api/v2");
    spec.basicAuth(auth -> {
        auth.username("<admin>");
        auth.password("<password>");
    });
    //spec.meterRegistry(meterRegistry);
    //spec.logLevel("FULL");
});
```

## Spring Boot Starter

**Coordinates**

```
implementation("io.github.primelib:confluence4j-rest-v1-spring-boot-starter:<version>")
```

**Auto Configuration**

| Property                                                   | Description                      | Default Value    | Allowed Values                     |
|------------------------------------------------------------|----------------------------------|------------------|------------------------------------|
| confluence-client.url                       | Base URL of the API              | ""               |                                    |
| confluence-client.backend-name              | Backend name for metrics tagging | ""               |                                    |
| confluence-client.log-level                 | Log level for HTTP client        | ""               | none, full                         |
| confluence-client.insecure                  | Disable SSL verification         | false            | false, true                        |
| confluence-client.auth.type                 | Type of authentication           | ""               | oauth2-client, oauth2-user, bearer |
| confluence-client.auth.token-endpoint       | Full token endpoint URL          | ""               | oauth2 token endpoint              |
| confluence-client.auth.client-id            | Client ID for authentication     | ""               | oauth2 client id                   |
| confluence-client.auth.client-secret        | Client secret for authentication | ""               | oauth2 client secret               |
| confluence-client.auth.username             | Username for authentication      | ""               | oauth2 username (oauth2-user)      |
| confluence-client.auth.password             | Password for authentication      | ""               | oauth2 password (oauth2-password)  |
| confluence-client.auth.token                | Token / API Key                  | ""               |                                    |
| confluence-client.auth.token-property-key   | Header key to pass the token in  | "Authorization"  |                                    |
| confluence-client.auth.token-value-template | Template to generate token value | "Bearer {token}" |                                    |


## License

This project is licensed under the [MIT](https://github.com/primelib/confluence-client/blob/main/LICENSE) license.
