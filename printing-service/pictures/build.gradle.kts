plugins {
    id ("su.ermine.java-library-conventions")
}

dependencies {
    implementation(project(":common"))

    implementation("com.google.cloud:spring-cloud-gcp-starter-data-datastore")
    implementation("org.springframework:spring-webflux")
    implementation("com.google.cloud:google-cloud-storage")
}