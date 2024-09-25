# SecuriBench

This is a fork from the `securibench` component of FlowDroid.

### Execute the Benchmark

All test: `mvn compile test`

Specific test file: `mvn test -Dtest=BasicTests`

Specific test: `mvn test -Dtest=BasicTests#basic34`

### Status

Currently, out of 104 unit tests, 13 are broken.


Summary

```
[INFO] 
[ERROR] Tests run: 104, Failures: 13, Errors: 1, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  01:27 min
[INFO] Finished at: 2024-09-25T00:50:12Z
[INFO] ------------------------------------------------------------------------
```

## TEST

###### failed: 33, passed: 71, ignored: 0 of 104 test (68.27%)

- **AliasingTest** - failed: 1, passed: 5, ignored: 0 of 6 test `(83.33%)`
  - [3]

- **ArraysTest** - failed: 4, passed: 6, ignored: 0 of 10 test `(60%)`
  - [2]
  - [5]
  - [8]
  - [10]

- **BasicTest** - failed: 3, passed: 40, ignored: 0 of 43 test `(93.02%)`
  - [29]
  - [31]
  - [36]
  
- **CollectionTest** - failed: 2, passed: 12, ignored: 0 of 14 test `(85.71%)`
  - [6]
  - [8]

- **DataStructureTest** - failed: 0, passed: 6, ignored: 0 of 6 test `(100%)`

- **FactoryTest** - failed: 0, passed: 3, ignored: 0 of 3 test `(100%)`

- **InterTest** - failed: 1, passed: 13, ignored: 0 of 14 test `(92.86%)`
  - [6]

- **SessionTest** - failed: 1, passed: 2, ignored: 0 of 3 test `(66.67%)`
  - [2]

- **StrongUpdateTest** - failed: 1, passed: 4, ignored: 0 of 5 test `(80%)`
  - [4]

### Authors

   * Rodrigo Bonifácio
   * José Vicente
   * Bruno Berto de Oliveira Ribeiro 