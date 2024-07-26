
repositories {
  maven("https://repo.papermc.io/repository/maven-public/")
  maven("https://repo1.maven.org/maven2/")
  maven("https://oss.sonatype.org/content/repositories/snapshots")
  maven("https://oss.sonatype.org/content/repositories/central")
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
    archivesBaseName = "Bssentials"
    version = "Bukkit"
    group = "com.javazilla.mods"
}



sourceSets {
    main {
        java {
            srcDir("src/main/java")
            srcDir("${rootProject.projectDir}/Bssentials-Common/src/main/java")
        }
    }
}

dependencies {
  compileOnly("io.papermc.paper:paper-api:1.20.6-R0.1-SNAPSHOT")
}
