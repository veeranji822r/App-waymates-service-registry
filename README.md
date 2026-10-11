# App-waymates-service-registry

Hosts Eureka registration and discovery for the other applications.

This is an independent Git repository with its own Maven wrapper, build, executable JAR and Docker image. Requires JDK 21.

From this checkout:

```bash
./mvnw verify
java -jar target/app-waymates-service-registry-0.0.1-SNAPSHOT.jar
```

On Windows use `.\mvnw.cmd verify`. The default host port is 8761.

Open `http://localhost:8761` to inspect registrations. This server does not register itself as a client.

Keep the four checkouts side by side under one parent folder. Full local connection and deployment instructions live in the sibling `App-waymates-config-server/README.md`; its `deployment/docker-compose.yml` coordinates the independent images.
