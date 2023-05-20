## 2. String 배열
###  2-1. String 배열의 선언 & 생성
```java
  String[] name = new String[3]; 
```
|       자료형        |   기본값    |
|:----------------:|:--------:|
|     boolean      |  false   |
|       char       | '\u0000' |
| byte, short, int |    0     |
|       long       |    0L    |
|      float       |   0.0f   |
|      double      |  0.0(d)  |
|      참조형 변수      |   null   |
---
### 2-2. String 배열 초기화 
```java
  String[] name = new String[] {"Kim", "Park", "Yu"};
  String[] name = {"Kim", "Park", "Yu"};    // new String[] 생략 가능
```
참조형변수를 간단히 참조변수라고도하며, 모든 참조형 변수에는 객체가 메모리에 저장된 수조인 4byte의 정수값, 혹은 null이 저장된다.

---
### 2-3. char배열과 String클래스  
```java
    String클래스는 char배열에 메서드를 추가한 개체이다.  
```
자바에서는 char배열과 그에 관련된 기능들을 함께 묶어서 클래스의 정의했다.
객체지향개념이 나오기 기이전의 언어들은 데이터와 기능을 따로 다루었지만 객체지향언어에서는 데이터와 그에 관련된 기능을 하나의 클래스에 묶어서 다룰 수 있게 한다.
즉, 서로 관련된 것들끼리 데이터와 기능을 구분하지 않고 함께 묶은 것이다. 

#### String클래스의 주요 메서드 
|                메서드                 |                       설명                        |
|:----------------------------------:|:-----------------------------------------------:|
|       char charAt(int index        |        문자열에서 해당 위치(index)에 있는 문자를 반환한다.         |
|            int length()            |                 문자열의 길이를 반환한다.                  |
| String substring(int from, int to) |       문자열에서 해당범위(from~to)에 있는 문자열을 반환한다.        |
|     boolean equals(String str)     | 문자열의 내용이 같은지 확인한다. 같으면 결과는 true, 다르면 false가 된다. |
|        char[] toCharArray()        |          문자열을 문자배열(char[])로 변환해서 반환한다.          |

---
