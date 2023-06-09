## 3. 다차원 배열
###  3-1. 2차원 배열의 선언과 인덱스
|          선언방법          |       예시       |
|:----------------------:|:--------------:|
| type[][] variableName; | int[][] score; |
| type variableName[][]; | int score[][]; |
| type[] variableName[]; | int[] score[]; |

* (※3차원이상의 고차원 배열 선언은 대괄호[]의 개수를 차원의 수만큼 추가해주면 된다.)

2차원 배열은 주로 테이블형태의 데이터를 담는데 사용된다. 예를 들어 4행 3열의 데이터를 담기위한 배열을 생성하는 방식은 다음과 같다. 
```java
    int[][] score = new int[4][3];
```
---
### 3-2. 2차원 배열 초기화 
```java
    int[][] arr = new int[][] {{1, 2, 3}, {4, 5, 6}};
    int[][] arr = {{1, 2, 3}, {4, 5, 6}}; // new int[][] 생략 가능
```
---
### 3-3. 가변배열 
자바에서 다차원배열을 생성할 때 전체배열차수 중 마지막차수의 길이를 지정하지 않게 되면, 보다 유동적인 가변배열을 구성할 수 있다.
int[3][] score을 가변배열로 생성할 경우는 다음과 같이 사용할 수 있다. 

```java
    int[][] score = {
        {100, 100, 100, 100},
        {100, 100, 100},
        {100, 100},
        {100, 100, 100}
        }
```
---