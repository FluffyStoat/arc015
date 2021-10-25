plugins {
    id("su.ermine.java-spring-boot-conventions")
}

version = "0.0.1-SNAPSHOT"

dependencies {
    implementation(project(":containers"))
    implementation(project(":materials"))
    implementation(project(":packages"))
    implementation(project(":pictures"))

    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("org.springframework.boot:spring-boot-starter-jooq")
    implementation("org.springframework.boot:spring-boot-starter-oauth2-client")
    implementation("org.springframework.boot:spring-boot-starter-rsocket")
    implementation("org.springframework.boot:spring-boot-starter-security")
    implementation("org.springframework.boot:spring-boot-starter-webflux")
    //implementation 'com.google.cloud:spring-cloud-gcp-starter-pubsub'
    //implementation 'com.google.cloud:spring-cloud-gcp-starter-storage'
    //implementation 'org.apache.kafka:kafka-streams'
    implementation("org.flywaydb:flyway-core")
    implementation("org.springframework.cloud:spring-cloud-starter-circuitbreaker-reactor-resilience4j")
    implementation("org.springframework.cloud:spring-cloud-starter-loadbalancer")
    implementation("org.springframework.cloud:spring-cloud-starter-sleuth")
    implementation("com.google.cloud:spring-cloud-gcp-starter-data-datastore")
    //implementation 'org.springframework.cloud:spring-cloud-stream'
    //implementation 'org.springframework.cloud:spring-cloud-stream-binder-kafka-streams'
    implementation("org.springframework.security:spring-security-messaging")
    implementation("org.springframework.security:spring-security-rsocket")
    developmentOnly("org.springframework.boot:spring-boot-devtools")
    runtimeOnly("com.h2database:h2")
    runtimeOnly("org.postgresql:postgresql")
    annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("io.projectreactor:reactor-test")
    testImplementation("io.rest-assured:spring-web-test-client")
    testImplementation("org.springframework.cloud:spring-cloud-starter-contract-stub-runner")
    testImplementation("org.springframework.cloud:spring-cloud-starter-contract-verifier")
    testImplementation("org.springframework.security:spring-security-test")
    testImplementation("org.testcontainers:junit-jupiter")
    testImplementation("org.testcontainers:kafka")
    testImplementation("org.testcontainers:postgresql")

    modules {
        module("org.aspectj:aspectjrt") {
            replacedBy("org.aspectj:aspectjweaver", "aspectjweaver is a superset of aspectjrt")
        }
    }
}