plugins {
    id("su.ermine.java-common-conventions")
}

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}
