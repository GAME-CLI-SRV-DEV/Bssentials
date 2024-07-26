
repositories {
  maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
  maven("https://hub.spigotmc.org/nexus/content/repositories/public/")
  maven("https://repo1.maven.org/maven2/")
  maven("https://oss.sonatype.org/content/repositories/snapshots")
  maven("https://oss.sonatype.org/content/repositories/central")
  maven("https://repo.papermc.io/repository/maven-public/")
}

plugins {
    id ("maven-publish")
	id ("java-library")
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

base {
    archivesBaseName = "Bssentials-Common"
    version = "1"
    group = "com.javazilla.mods"
}

sourceSets {
    main {
        java {
            srcDir("src/main/java")
        }
    }
}

dependencies {
  compileOnly("io.papermc.paper:paper-api:1.20.6-R0.1-SNAPSHOT")
  //compileOnly("cloud.commandframework", "cloud-core", "1.6.0")
}
