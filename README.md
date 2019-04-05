### Required things to run
1. java
```bash
sudo apt-get install default-jre
```
2. maven
```bash
Google.
```
### How to build

```bash
mvn clean install -DskipTests
```

### How to Run all tests

```bash
mvn test
```

### How to run specific tests

```bash
mvn test -Dtest=ATest
```

### Results parsing

Results are present in target/surefire-reports/ in xml format. One XML will be generated for each Test class.
