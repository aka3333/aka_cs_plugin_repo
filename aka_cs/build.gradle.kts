plugins {
    id("com.lagradost.cloudstream3.gradle") version "1.0.0"
}

version = "1.0.0"

cloudstream {
    language = "tr"
    description = "AKA CS plugin"
}

tasks.register("clean", Delete::class) {
    delete(buildDir)
}
