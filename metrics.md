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
- **F-score:** git
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
|   **TOTAL**   |   123    | 125    | 116 | 9  |   0.93    |  0.94  |  0.94  |

> Details

- ✅ : PASSED; ❌ : FAIL

- **AliasingTest** - failed: 2, passed: 4 of 6 tests. `(66.67%)`

| Test      | Found | Expected | Status | TP | FP | FN | Precision | Recall | F1   |
|-----------|-------|----------|--------|----|----|----|-----------|--------|------|
| Aliasing1 | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Aliasing2 | 0     | 0        | PASS   | 0  | 0  | 0  | 0.00      | 0.00   | 0.00 |
| Aliasing3 | 1     | 0        | FAIL   | 0  | 1  | 0  | 0.00      | 0.00   | 0.00 |
| Aliasing4 | 1     | 2        | FAIL   | 0  | 0  | 1  | 0.00      | 0.00   | 0.00 |
| Aliasing5 | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Aliasing6 | 7     | 7        | PASS   | 7  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| TOTAL     | 11    | 11       | 4/6    | 9  | 1  | 1  | 0.90      | 0.90   | 0.90 |


- **ArraysTest** - failed: 4, passed: 6 of 10 tests. `(60.00%)`

| Test     | Found | Expected | Status | TP | FP | FN | Precision | Recall | F1   |
|----------|-------|----------|--------|----|----|----|-----------|--------|------|
| Arrays1  | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Arrays2  | 3     | 1        | FAIL   | 0  | 2  | 0  | 0.00      | 0.00   | 0.00 |
| Arrays3  | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Arrays4  | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Arrays5  | 1     | 0        | FAIL   | 0  | 1  | 0  | 0.00      | 0.00   | 0.00 |
| Arrays6  | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Arrays7  | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Arrays8  | 2     | 1        | FAIL   | 0  | 1  | 0  | 0.00      | 0.00   | 0.00 |
| Arrays9  | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Arrays10 | 2     | 1        | FAIL   | 0  | 1  | 0  | 0.00      | 0.00   | 0.00 |
| TOTAL    | 14    | 9        | 6/10   | 6  | 5  | 0  | 0.55      | 1.00   | 0.71 |



- **BasicTest** - failed: 16, passed: 26 of 42 tests. `(61.90%)`

| Test    | Found | Expected | Status | TP | FP | FN | Precision | Recall | F1   |
|---------|-------|----------|--------|----|----|----|-----------|--------|------|
| Basic1  | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Basic2  | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Basic3  | 0     | 1        | FAIL   | 0  | 0  | 1  | 0.00      | 0.00   | 0.00 |
| Basic4  | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Basic5  | 0     | 3        | FAIL   | 0  | 0  | 3  | 0.00      | 0.00   | 0.00 |
| Basic6  | 0     | 1        | FAIL   | 0  | 0  | 1  | 0.00      | 0.00   | 0.00 |
| Basic7  | 0     | 1        | FAIL   | 0  | 0  | 1  | 0.00      | 0.00   | 0.00 |
| Basic8  | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Basic9  | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Basic10 | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Basic11 | 1     | 2        | FAIL   | 0  | 0  | 1  | 0.00      | 0.00   | 0.00 |
| Basic12 | 2     | 2        | PASS   | 2  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Basic13 | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Basic14 | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Basic15 | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Basic16 | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Basic17 | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Basic18 | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Basic19 | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Basic20 | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Basic21 | 0     | 4        | FAIL   | 0  | 0  | 4  | 0.00      | 0.00   | 0.00 |
| Basic22 | 0     | 1        | FAIL   | 0  | 0  | 1  | 0.00      | 0.00   | 0.00 |
| Basic23 | 0     | 3        | FAIL   | 0  | 0  | 3  | 0.00      | 0.00   | 0.00 |
| Basic24 | 0     | 1        | FAIL   | 0  | 0  | 1  | 0.00      | 0.00   | 0.00 |
| Basic25 | 0     | 1        | FAIL   | 0  | 0  | 1  | 0.00      | 0.00   | 0.00 |
| Basic26 | 0     | 1        | FAIL   | 0  | 0  | 1  | 0.00      | 0.00   | 0.00 |
| Basic27 | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Basic28 | 2     | 2        | PASS   | 2  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Basic29 | 3     | 2        | FAIL   | 0  | 1  | 0  | 0.00      | 0.00   | 0.00 |
| Basic30 | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Basic31 | 0     | 3        | FAIL   | 0  | 0  | 3  | 0.00      | 0.00   | 0.00 |
| Basic32 | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Basic33 | 0     | 1        | FAIL   | 0  | 0  | 1  | 0.00      | 0.00   | 0.00 |
| Basic34 | 1     | 2        | FAIL   | 0  | 0  | 1  | 0.00      | 0.00   | 0.00 |
| Basic35 | 6     | 6        | PASS   | 6  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Basic36 | 0     | 1        | FAIL   | 0  | 0  | 1  | 0.00      | 0.00   | 0.00 |
| Basic37 | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Basic38 | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Basic39 | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Basic40 | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Basic41 | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Basic42 | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| TOTAL   | 38    | 61       | 26/42  | 33 | 1  | 24 | 0.97      | 0.58   | 0.73 |


- **CollectionTest** - failed: 2, passed: 12 of 14 tests. `(85.71%)`

| Test          | Found | Expected | Status | TP | FP | FN | Precision | Recall | F1   |
|---------------|-------|----------|--------|----|----|----|-----------|--------|------|
| Collections1  | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Collections2  | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Collections3  | 2     | 2        | PASS   | 2  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Collections4  | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Collections5  | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Collections6  | 2     | 1        | FAIL   | 0  | 1  | 0  | 0.00      | 0.00   | 0.00 |
| Collections7  | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Collections8  | 0     | 1        | FAIL   | 0  | 0  | 1  | 0.00      | 0.00   | 0.00 |
| Collections9  | 0     | 0        | PASS   | 0  | 0  | 0  | 0.00      | 0.00   | 0.00 |
| Collections10 | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Collections11 | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Collections12 | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Collections13 | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Collections14 | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| TOTAL         | 14    | 14       | 12/14  | 12 | 1  | 1  | 0.92      | 0.92   | 0.92 |


- **DataStructureTest** - failed: 2, passed: 4 of 6 tests. `(66.67%)`

| Test            | Found | Expected | Status | TP | FP | FN | Precision | Recall | F1   |
|-----------------|-------|----------|--------|----|----|----|-----------|--------|------|
| Datastructures1 | 2     | 1        | FAIL   | 0  | 1  | 0  | 0.00      | 0.00   | 0.00 |
| Datastructures2 | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Datastructures3 | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Datastructures4 | 0     | 0        | PASS   | 0  | 0  | 0  | 0.00      | 0.00   | 0.00 |
| Datastructures5 | 0     | 1        | FAIL   | 0  | 0  | 1  | 0.00      | 0.00   | 0.00 |
| Datastructures6 | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| TOTAL           | 5     | 5        | 4/6    | 3  | 1  | 1  | 0.75      | 0.75   | 0.75 |


- **FactoryTest** - failed: 2, passed: 1 of 3 tests. `(33.33%)`

| Test       | Found | Expected | Status | TP | FP | FN | Precision | Recall | F1   |
|------------|-------|----------|--------|----|----|----|-----------|--------|------|
| Factories1 | 0     | 1        | FAIL   | 0  | 0  | 1  | 0.00      | 0.00   | 0.00 |
| Factories2 | 0     | 1        | FAIL   | 0  | 0  | 1  | 0.00      | 0.00   | 0.00 |
| Factories3 | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| TOTAL      | 1     | 3        | 1/3    | 1  | 0  | 2  | 1.00      | 0.33   | 0.50 |


- **InterTest** - failed: 1, passed: 13 of 14 tests. `(92.86%)`

| Test    | Found | Expected | Status | TP | FP | FN | Precision | Recall | F1   |
|---------|-------|----------|--------|----|----|----|-----------|--------|------|
| Inter1  | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Inter2  | 2     | 2        | PASS   | 2  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Inter3  | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Inter4  | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Inter5  | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Inter6  | 0     | 1        | FAIL   | 0  | 0  | 1  | 0.00      | 0.00   | 0.00 |
| Inter7  | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Inter8  | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Inter9  | 2     | 2        | PASS   | 2  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Inter10 | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Inter11 | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Inter12 | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Inter13 | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Inter14 | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| TOTAL   | 15    | 16       | 13/14  | 15 | 0  | 1  | 1.00      | 0.94   | 0.97 |


- **SessionTest** - failed: 3, passed: 0 of 3 tests. `(0.00%)`

| Test     | Found | Expected | Status | TP | FP | FN | Precision | Recall | F1   |
|----------|-------|----------|--------|----|----|----|-----------|--------|------|
| Session1 | 0     | 1        | FAIL   | 0  | 0  | 1  | 0.00      | 0.00   | 0.00 |
| Session2 | 0     | 1        | FAIL   | 0  | 0  | 1  | 0.00      | 0.00   | 0.00 |
| Session3 | 0     | 1        | FAIL   | 0  | 0  | 1  | 0.00      | 0.00   | 0.00 |
| TOTAL    | 0     | 3        | 0/3    | 0  | 0  | 3  | 0.00      | 0.00   | 0.00 |


- **StrongUpdateTest** - failed: 1, passed: 4 of 5 tests. `(80.00%)`

| Test           | Found | Expected | Status | TP | FP | FN | Precision | Recall | F1   |
|----------------|-------|----------|--------|----|----|----|-----------|--------|------|
| StrongUpdates1 | 0     | 0        | PASS   | 0  | 0  | 0  | 0.00      | 0.00   | 0.00 |
| StrongUpdates2 | 0     | 0        | PASS   | 0  | 0  | 0  | 0.00      | 0.00   | 0.00 |
| StrongUpdates3 | 0     | 0        | PASS   | 0  | 0  | 0  | 0.00      | 0.00   | 0.00 |
| StrongUpdates4 | 0     | 1        | FAIL   | 0  | 0  | 1  | 0.00      | 0.00   | 0.00 |
| StrongUpdates5 | 0     | 0        | PASS   | 0  | 0  | 0  | 0.00      | 0.00   | 0.00 |
| TOTAL          | 0     | 1        | 4/5    | 0  | 0  | 1  | 0.00      | 0.00   | 0.00 |