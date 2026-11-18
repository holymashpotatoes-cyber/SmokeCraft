# SmokeCraft — NeoForge 26.3 server prototype

This is a starter source project targeting Minecraft 26.3 and NeoForge 26.3.0.101.
It uses the NeoForge ModDevGradle plugin and Java 25, following the official
NeoForge 26.3 MDK configuration.

## Scope of this starter

This safe prototype is for an abstract environmental air-quality / player-condition
survival system. It does not implement tobacco, cigarettes, cigars, smoking,
substance use, or addiction mechanics.

## Build requirements

- JDK 25
- Gradle 9.x (or import the project into an IDE with Gradle support)
- Internet access so Gradle can download NeoForge and dependencies

## Build

From this folder, run:

```bash
gradle build
```

The mod jar, if the build succeeds, will be created in `build/libs/`.

## Server installation

Copy the resulting `smokecraft-0.1.0.jar` into the server's `mods` folder.
The server must be running the matching NeoForge 26.3 version.

## Current status

Starter scaffold only. It has not been compiled or tested yet. The current
execution environment had Java 21 and no Gradle installation/network access,
so a verified `.jar` could not be produced here.
