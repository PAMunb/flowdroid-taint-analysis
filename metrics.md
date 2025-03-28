#### JSVFA metrics

### SUMMARY

> failed: 0, passed: 0, ignored: 0 of 103 tests.

|      Test       |    Σ    |   TP    | FP |
|:---------------:|:-------:|:-------:|:--:|
|    Aliasing     |   5/6   |  11/11  | 1  |
|      Array      |  6/10   |   9/9   | 5  |
|      Basic      |  39/42  |  57/61  | 1  |
|   Collection    |  12/14  |  13/14  | 1  |
|  DataStructure  |   6/6   |   5/5   | 0  | 
|     Factory     |   3/3   |   3/3   | 1  | 
|      Inter      |  13/14  |  15/16  | 0  |
|    ~~Pred~~     | ~~0/9~~ |    -    | -  |
| ~~Reflection~~  | ~~0/4~~ |    -    | -  |
| ~~Sanitizers~~  | ~~0/6~~ |    -    | -  |
|     Session     |   2/3   |   3/3   | 0  | 
|  StrongUpdate   |   4/5   |   0/1   | 0  |
|    **TOTAL**    | 90/103  | 116/123 | 9  |

- **Precision:** 0.93
- **Recall:** 0.94
- **F-score:** 0.94
- **Pass Rate:** 87.38%

### DETAILS

> Metrics for Pass Rate

|     Test      | Expected | Passed | Failed | Pass Rate |
|:-------------:|:--------:|:------:|:------:|:---------:|
|   Aliasing    |    6     |   5    |   1    |  83.33%   |    
|     Array     |    10    |   6    |   4    |    60%    |   
|     Basic     |    42    |   39   |   3    |  92.86%   |      
|  Collection   |    14    |   12   |   2    |  85.71%   |   
| DataStructure |    6     |   6    |   0    |   100%    |    
|    Factory    |    3     |   3    |   0    |   100%    |    
|     Inter     |    14    |   13   |   1    |  92.86%   |     
|    Session    |    3     |   2    |   1    |  66.67%   |      
| StrongUpdate  |    5     |   4    |   1    |    80%    |       
|   **TOTAL**   |   103    |   90   |   13   |  87.38%   |

> Metrics for Precision, Recall and F-score.

|     Test      | Expected | Actual | TP  | FP | Precision | Recall | F-score |
|:-------------:|:--------:|:-------|:---:|:--:|:---------:|:------:|:-------:|
|   Aliasing    |    11    | 12     | 11  | 1  |   0.92    |   1    |  0.96   |
|     Array     |    9     | 14     |  9  | 5  |   0.64    |   1    |  0.78   |
|     Basic     |    61    | 58     | 57  | 1  |   0.98    |  0.93  |  0.96   |
|  Collection   |    14    | 14     | 13  | 1  |   0.93    |  0.93  |  0.93   |
| DataStructure |    5     | 5      |  5  | 0  |     1     |   1    |    1    |
|    Factory    |    3     | 3      |  3  | 0  |     1     |   1    |    1    |
|     Inter     |    16    | 15     | 15  | 0  |     1     |  0.94  |  0.97   |
|    Session    |    3     | 4      |  3  | 1  |   0.75    |   1    |  0.86   |
| StrongUpdate  |    1     | 0      |  0  | 0  |     0     |   0    |    0    |
|   **TOTAL**   |   123    | 125    | 116 | 9  |   0.93    |  0.94  |  87.38  |

> Details

- ✅ : PASSED; ❌ : FAIL

- **AliasingTest** - failed: 1, passed: 5, ignored: 0 of 6 test.

|      Test      | Expected | Actual | Status | TP | FP | Precision | Recall | F-score |
|:--------------:|:--------:|:------:|:------:|:--:|:--:|:---------:|:------:|:-------:|
|   Aliasing1    |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|   Aliasing2    |    0     |   0    |   ✅    | 0  | 0  |     -     |   -    |    -    |
|   Aliasing3    |    0     |   1    |   ❌    | 0  | 1  |     -     |   -    |    -    |
|   Aliasing4    |    2     |   2    |   ✅    | 2  | 0  |     -     |   -    |    -    |
|   Aliasing5    |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|   Aliasing6    |    7     |   7    |   ✅    | 7  | 0  |     -     |   -    |    -    |
|     TOTAL      |    11    |   12   |  5/6   | 11 | 1  |   0.92    |   1    |  0.96   |


- **ArraysTest** - failed: 4, passed: 6, ignored: 0 of 10 test.

|      Test      | Expected | Actual | Status | TP | FP | Precision | Recall | F-score |
|:--------------:|:--------:|:------:|:------:|:--:|:--:|:---------:|:------:|:-------:|
|     Array1     |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|     Array2     |    1     |   3    |   ❌    | 1  | 2  |     -     |   -    |    -    |
|     Array3     |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|     Array4     |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|     Array5     |    0     |   1    |   ❌    | 0  | 1  |     -     |   -    |    -    |
|     Array6     |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|     Array7     |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|     Array8     |    1     |   2    |   ❌    | 1  | 1  |     -     |   -    |    -    |
|     Array9     |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|    Array10     |    1     |   2    |   ❌    | 1  | 1  |     -     |   -    |    -    |
|     TOTAL      |    9     |   14   |  6/10  | 9  | 5  |   0.64    |   1    |  0.78   |


- **BasicTest** - failed: 3, passed: 39, ignored: 0 of 42 test.

|      Test      | Expected | Actual | Status | TP | FP | Precision | Recall | F-score |
|:--------------:|:--------:|:------:|:------:|:--:|:--:|:---------:|:------:|:-------:|
|     Basic1     |    1     |   1    |   ✅    | 0  | 0  |     -     |   -    |    -    |
|     Basic2     |    1     |   1    |   ✅    | 0  | 0  |     -     |   -    |    -    |
|     Basic3     |    1     |   1    |   ✅    | 0  | 0  |     -     |   -    |    -    |
|     Basic4     |    1     |   1    |   ✅    | 0  | 0  |     -     |   -    |    -    |
|     Basic5     |    3     |   3    |   ✅    | 0  | 0  |     -     |   -    |    -    |
|     Basic6     |    1     |   1    |   ✅    | 0  | 0  |     -     |   -    |    -    |
|     Basic7     |    1     |   1    |   ✅    | 0  | 0  |     -     |   -    |    -    |
|     Basic8     |    1     |   1    |   ✅    | 0  | 0  |     -     |   -    |    -    |
|     Basic9     |    1     |   1    |   ✅    | 0  | 0  |     -     |   -    |    -    |
|    Basic10     |    1     |   1    |   ✅    | 0  | 0  |     -     |   -    |    -    |
|    Basic11     |    2     |   2    |   ✅    | 0  | 0  |     -     |   -    |    -    |
|    Basic12     |    2     |   2    |   ✅    | 0  | 0  |     -     |   -    |    -    |
|    Basic13     |    1     |   1    |   ✅    | 0  | 0  |     -     |   -    |    -    |
|    Basic14     |    1     |   1    |   ✅    | 0  | 0  |     -     |   -    |    -    |
|    Basic15     |    1     |   1    |   ✅    | 0  | 0  |     -     |   -    |    -    |
|    Basic16     |    1     |   1    |   ✅    | 0  | 0  |     -     |   -    |    -    |
|    Basic17     |    1     |   1    |   ✅    | 0  | 0  |     -     |   -    |    -    |
|    Basic18     |    1     |   1    |   ✅    | 0  | 0  |     -     |   -    |    -    |
|    Basic19     |    1     |   1    |   ✅    | 0  | 0  |     -     |   -    |    -    |
|    Basic20     |    1     |   1    |   ✅    | 0  | 0  |     -     |   -    |    -    |
|    Basic21     |    4     |   4    |   ✅    | 0  | 0  |     -     |   -    |    -    |
|    Basic22     |    1     |   1    |   ✅    | 0  | 0  |     -     |   -    |    -    |
|    Basic23     |    3     |   3    |   ✅    | 0  | 0  |     -     |   -    |    -    |
|    Basic24     |    1     |   1    |   ✅    | 0  | 0  |     -     |   -    |    -    |
|    Basic25     |    1     |   1    |   ✅    | 0  | 0  |     -     |   -    |    -    |
|    Basic26     |    1     |   1    |   ✅    | 0  | 0  |     -     |   -    |    -    |
|    Basic27     |    1     |   1    |   ✅    | 0  | 0  |     -     |   -    |    -    |
|    Basic28     |    2     |   2    |   ✅    | 0  | 0  |     -     |   -    |    -    |
|    Basic29     |    2     |   3    |   ❌    | 2  | 1  |     -     |   -    |    -    |
|    Basic30     |    1     |   1    |   ✅    | 0  | 0  |     -     |   -    |    -    |
|    Basic31     |    3     |   0    |   ❌    | 0  | 0  |     -     |   -    |    -    |
|    Basic32     |    1     |   1    |   ✅    | 0  | 0  |     -     |   -    |    -    |
|    Basic33     |    1     |   1    |   ✅    | 0  | 0  |     -     |   -    |    -    |
|    Basic34     |    2     |   2    |   ✅    | 0  | 0  |     -     |   -    |    -    |
|    Basic35     |    6     |   6    |   ✅    | 0  | 0  |     -     |   -    |    -    |
|    Basic36     |    1     |   0    |   ❌    | 0  | 0  |     -     |   -    |    -    |
|    Basic37     |    1     |   1    |   ✅    | 0  | 0  |     -     |   -    |    -    |
|    Basic38     |    1     |   1    |   ✅    | 0  | 0  |     -     |   -    |    -    |
|    Basic39     |    1     |   1    |   ✅    | 0  | 0  |     -     |   -    |    -    |
|    Basic40     |    1     |   1    |   ✅    | 0  | 0  |     -     |   -    |    -    |
|    Basic41     |    1     |   1    |   ✅    | 0  | 0  |     -     |   -    |    -    |
|    Basic42     |    1     |   1    |   ✅    | 0  | 0  |     -     |   -    |    -    |
|     TOTAL      |    61    |   58   | 39/42  | 57 | 1  |   0.98    |  0.93  |  0.96   |


- **CollectionTest** - failed: 2, passed: 12, ignored: 0 of 14 tests.

|      Test      | Expected | Actual | Status | TP | FP | Precision | Recall | F-score |
|:--------------:|:--------:|:------:|:------:|:--:|:--:|:---------:|:------:|:-------:|
|  Collection1   |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|  Collection2   |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|  Collection3   |    2     |   2    |   ✅    | 2  | 0  |     -     |   -    |    -    |
|  Collection4   |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|  Collection5   |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|  Collection6   |    1     |   2    |   ❌    | 1  | 1  |     -     |   -    |    -    |
|  Collection7   |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|  Collection8   |    1     |   0    |   ❌    | 0  | 0  |     -     |   -    |    -    |
|  Collection9   |    0     |   0    |   ✅    | 0  | 0  |     -     |   -    |    -    |
|  Collection10  |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|  Collection11  |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|  Collection12  |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|  Collection13  |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|  Collection14  |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|     TOTAL      |    14    |   14   | 12/14  | 13 | 1  |   0.93    |  0.93  |  0.93   |


- **DataStructureTest** - failed: 0, passed: 6, ignored: 0 of 6 tests.

|      Test      | Expected | Actual | Status | TP | FP  | Precision | Recall | F-score |
|:--------------:|:--------:|:------:|:------:|:--:|:---:|:---------:|:------:|:-------:|
| DataStructure1 |    1     |   1    |   ✅    | 1  |  0  |     -     |   -    |    -    |
| DataStructure2 |    1     |   1    |   ✅    | 1  |  0  |     -     |   -    |    -    |
| DataStructure3 |    1     |   1    |   ✅    | 1  |  0  |     -     |   -    |    -    |
| DataStructure4 |    0     |   0    |   ✅    | 0  |  0  |     -     |   -    |    -    |
| DataStructure5 |    1     |   1    |   ✅    | 1  |  0  |     -     |   -    |    -    |
| DataStructure6 |    1     |   1    |   ✅    | 1  |  0  |     -     |   -    |    -    |
|     TOTAL      |    5     |   5    |  6/6   | 5  |  0  |     1     |   1    |    1    |


- **FactoryTest** - failed: 0, passed: 3, ignored: 0 of 3 tests.

|      Test      | Expected | Actual | Status | TP | FP  | Precision | Recall | F-score |
|:--------------:|:--------:|:------:|:------:|:--:|:---:|:---------:|:------:|:-------:|
|    Factory1    |    1     |   1    |   ✅    | 1  |  0  |     -     |   -    |    -    |
|    Factory2    |    1     |   1    |   ✅    | 1  |  0  |     -     |   -    |    -    |
|    Factory3    |    1     |   1    |   ✅    | 1  |  0  |     -     |   -    |    -    |
|     TOTAL      |    3     |   3    |  3/3   | 3  |  0  |     1     |   1    |    1    |


- **InterTest** - failed: 1, passed: 13, ignored: 0 of 14 tests

|      Test      | Expected | Actual | Status | TP | FP  | Precision | Recall | F-score |
|:--------------:|:--------:|:------:|:------:|:--:|:---:|:---------:|:------:|:-------:|
|     Inter1     |    1     |   1    |   ✅    | 1  |  0  |     -     |   -    |    -    |
|     Inter2     |    2     |   2    |   ✅    | 2  |  0  |     -     |   -    |    -    |
|     Inter3     |    1     |   1    |   ✅    | 1  |  0  |     -     |   -    |    -    |
|     Inter4     |    1     |   1    |   ✅    | 1  |  0  |     -     |   -    |    -    |
|     Inter5     |    1     |   1    |   ✅    | 1  |  0  |     -     |   -    |    -    |
|     Inter6     |    1     |   0    |   ❌    | 0  |  0  |     -     |   -    |    -    |
|     Inter7     |    1     |   1    |   ✅    | 1  |  0  |     -     |   -    |    -    |
|     Inter8     |    1     |   1    |   ✅    | 1  |  0  |     -     |   -    |    -    |
|     Inter9     |    2     |   2    |   ✅    | 2  |  0  |     -     |   -    |    -    |
|    Inter10     |    1     |   1    |   ✅    | 1  |  0  |     -     |   -    |    -    |
|    Inter11     |    1     |   1    |   ✅    | 1  |  0  |     -     |   -    |    -    |
|    Inter12     |    1     |   1    |   ✅    | 1  |  0  |     -     |   -    |    -    |
|    Inter13     |    1     |   1    |   ✅    | 1  |  0  |     -     |   -    |    -    |
|    Inter14     |    1     |   1    |   ✅    | 1  |  0  |     -     |   -    |    -    |
|     TOTAL      |    16    |   15   | 13/14  | 15 |  0  |     1     |  0.94  |  0.97   |


- **SessionTest** - failed: 1, passed: 2, ignored: 0 of 3 tests.

|      Test      | Expected | Actual | Status | TP | FP | Precision | Recall | F-score |
|:--------------:|:--------:|:------:|:------:|:--:|:--:|:---------:|:------:|:-------:|
|    Session1    |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|    Session2    |    1     |   2    |   ❌    | 1  | 1  |     -     |   -    |    -    |
|    Session3    |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|     TOTAL      |    3     |   4    |  2/3   | 3  | 1  |   0.75    |   1    |  0.86   |


- **StrongUpdateTest** - failed: 1, passed: 4, ignored: 0 of 5 tests.

|      Test      | Expected | Actual | Status | TP  | FP  | Precision | Recall | F-score |
|:--------------:|:--------:|:------:|:------:|:---:|:---:|:---------:|:------:|:-------:|
| StrongUpdate1  |    0     |   0    |   ✅    |  0  |  0  |     -     |   -    |    -    |
| StrongUpdate2  |    0     |   0    |   ✅    |  0  |  0  |     -     |   -    |    -    |
| StrongUpdate3  |    0     |   0    |   ✅    |  0  |  0  |     -     |   -    |    -    |
| StrongUpdate4  |    1     |   0    |   ❌    |  0  |  0  |     -     |   -    |    -    |
| StrongUpdate5  |    0     |   0    |   ✅    |  0  |  0  |     -     |   -    |    -    |
|     TOTAL      |    1     |   0    |  4/5   |  0  |  0  |     0     |   0    |    0    |