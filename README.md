# Project Setup 
**Project dependencies**
```groovy
 // https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api
    testImplementation 'org.junit.jupiter:junit-jupiter-api:5.8.2'
    // https://mvnrepository.com/artifact/org.junit.platform/junit-platform-launcher
    testImplementation 'org.junit.platform:junit-platform-launcher:1.8.2'

    // https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-engine
    testImplementation 'org.junit.jupiter:junit-jupiter-engine:5.8.2'


    // This dependency is used by the application.
    implementation 'com.google.guava:guava:30.1.1-jre'

    // https://mvnrepository.com/artifact/io.rest-assured/rest-assured
    testImplementation 'io.rest-assured:rest-assured:5.1.1'

```

In this project I'm using junit5, this is quite different from regular setup with junit4 
To get gradle to work with junit5 the following configurations on the `test` task has to be 
made 
```groovy
test{
    useJUnitPlatform()
}
```

JUnit 5 requires JUnitPlatform and JUnit Engine as runners.

One thing different in this project, is this is a pure test project,
there is no main classes.

although I have used default project setup, the folder holding test files can be 
configured further in gradle by
```groovy
 sourceSets {
     main{
         java{
             srcDirs "path"
         }
         resources{
            srcDirs "path"
         }
     }
    
    test {
        java{
            srcDirs "path"
        }
        
        resources{
            srcDirs "path"
        }
    }
    
 }
```