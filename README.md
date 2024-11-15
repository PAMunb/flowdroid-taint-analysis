# FLOWDROID Taint Analysis + SecuriBench

The goals of this repository is to perfom Taint Analysis using the tool FLOWDROID


<!-- This is a fork from the `securibench` component of FlowDroid. -->

- **V1:** failed: 33, passed: 70, ignored: 0 of 103 test `(67.96%)`
- **V2:** failed: 13, passed: 90, ignored: 0 of 103 test `(87.38%)`

## SETUP

Clone the "benchmark" as a submodule
```
git submodule add https://github.com/PAMunb/securibench-micro.git src/main/java/securibench
```

## TEST

### Run

All test: `mvn compile test`

Specific test: `mvn test -Dtest=AliasingTests#aliasing1`

Specific group of test:

<!-- ## v1
```
mvn test -Dtest=AliasingV1Tests
mvn test -Dtest=ArrayV1Tests
mvn test -Dtest=BasicV1Tests
mvn test -Dtest=CollectionV1Tests
mvn test -Dtest=DatastructureV1Tests
mvn test -Dtest=FactoryV1Tests
mvn test -Dtest=InterV1Tests
mvn test -Dtest=SessionV1Tests
mvn test -Dtest=StrongUpdateV1Tests
```

## v2
```
mvn test -Dtest=AliasingV2Tests
mvn test -Dtest=ArrayV2Tests
mvn test -Dtest=BasicV2Tests
mvn test -Dtest=CollectionV2Tests
mvn test -Dtest=DatastructureV2Tests
mvn test -Dtest=FactoryV2Tests
mvn test -Dtest=InterV2Tests
mvn test -Dtest=SessionV2Tests
mvn test -Dtest=StrongUpdateV2Tests 
```
-->

### Result

- **V1:** failed: 33, passed: 70, ignored: 0 of 103 test `(67.96%)`
- **V2:** failed: 13, passed: 90, ignored: 0 of 103 test `(87.38%)`

### Comparison

**AliasingTest**
| v1 `(66.67%)`                                   | v2 `(83.33%)`                                  |
| :---:                                           | :---:                                          |
| **failed: 2, passed: 4, ignored: 0 of 6 test**  | **failed: 1, passed: 5, ignored: 0 of 6 test** |
|  [3]                                            |  [3]                                           |
|  [4]                                            |                                                |


**ArraysTest**
| v1 `(60%)`                                      | v2 `(60%)`                                      |
| :---:                                           | :---:                                           |
| **failed: 4, passed: 6, ignored: 0 of 10 test** | **failed: 4, passed: 6, ignored: 0 of 10 test** |
|  [2]                                            |  [2]                                            |
|  [5]                                            |  [5]                                            |
|  [8]                                            |  [8]                                            |
|  [10]                                           |  [10]                                           |


**BasicTest**
| v1 `(61.90%)`                                           | v2 `(93.02%)`                                     |
| :---:                                                   | :---:                                             |
| **failed: 16, passed: 26, ignored: 0 of 42 test**       | **failed: 3, passed: 40, ignored: 0 of 42 test**  |
| [3]                                                     |  [29]                                             |
| [5]                                                     |  [31]                                             |
| [6]                                                     |  [36]                                             |
| [7]                                                     |                                                   |
| [11]                                                    |                                                   |
| [21]                                                    |                                                   |
| [22]                                                    |                                                   |
| [23]                                                    |                                                   |
| [24]                                                    |                                                   |
| [25]                                                    |                                                   |
| [26]                                                    |                                                   |
| [29]                                                    |                                                   |
| [31]                                                    |                                                   |
| [33]                                                    |                                                   |
| [34]                                                    |                                                   |
| [36]                                                    |                                                   |


**CollectionTest**
| v1 `(85.71%)`                                           | v2 `(85.71%)`                                     |
| :---:                                                   | :---:                                             |
| **failed: 2, passed: 12, ignored: 0 of 14 test**        | **failed: 2, passed: 12, ignored: 0 of 14 test**  |
|  [6]                                                    |  [6]                                              |
|  [8]                                                    |  [8]                                              | 


**DataStructureTest**
| v1 `(66.67%)`                                   | v2 `(100%)`                                     |
| :---:                                           | :---:                                           |
| **failed: 2, passed: 4, ignored: 0 of 6 test**  | **failed: 0, passed: 6, ignored: 0 of 6 test**  |
|  [1]                                            |                                                 |
|  [5]                                            |                                                 |


**FactoryTest**
| v1 `(0%)`                                       | v2 `(100%)`                                     |
| :---:                                           | :---:                                           |
| **failed: 2, passed: 1, ignored: 0 of 3 test**  | **failed: 0, passed: 3, ignored: 0 of 3 test**  |
|  [1]                                            |                                                 |
|  [2]                                            |                                                 |


**InterTest**
| v1 `(92.86%)`                                     | v2 `(92.86%)`                                     |
| :---:                                             | :---:                                             |
| **failed: 1, passed: 13, ignored: 0 of 14 test**  | **failed: 1, passed: 13, ignored: 0 of 14 test**  |
|  [6]                                              |   [6]                                             |   


**SessionTest**
| v1 `(0%)`                                       | v2 `(66.67%)`                                   |
| :---:                                           | :---:                                           |
| **failed: 3, passed: 0, ignored: 0 of 3 test**  | **failed: 1, passed: 2, ignored: 0 of 3 test**  |
| [1]                                             |   [2]                                           | 
| [2]                                             |                                                 |
| [3]                                             |                                                 |  


**StrongUpdateTest**
| v1 `(80%)`                                      | v2 `(80%)`                                      |
| :---:                                           | :---:                                           |
| **failed: 1, passed: 4, ignored: 0 of 5 test**  | **failed: 1, passed: 4, ignored: 0 of 5 test**  |
|  [4]                                            |  [4]                                            |


### Authors

   * Rodrigo Bonifácio
   * José Vicente