# MqlParser

This is a simple Mongodb query language parser, which will later be used in [Polypheny](https://polypheny.org).

The repo is under heavy construction and only a limited amount of functionality is working for now.

## Running
To test the parser, the gradlew task ```build``` has to be executed and the content of the ```src/main/java``` 
has to be copied to ```build/generated/javacc```. After this the Example.java has to be compiled and can be started via Java.

### Credits
- [JavaCC](https://javacc.github.io/javacc/)
