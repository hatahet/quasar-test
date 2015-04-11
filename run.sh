#!/bin/bash
java -Dco.paralleluniverse.fibers.verifyInstrumentation -javaagent:target/dependency/quasar-core-0.6.2.jar -cp ./target/my-app-1.0-SNAPSHOT.jar com.mycompany.app.App
