# [5번] 심폐소생술

<br>

## 문제설명
심폐소생술은 다음과 같은 순서를 통해 실시합니다.

1. 심정지 및 무호흡 확인 [check]
2. 도움 및 119 신고 요청 [call]
3. 가슴압박 30회 시행 [pressure]
4. 인공호흡 2회 시행 [respiration]
5. 가슴압박, 인공호흡 반복 [repeat]

주어진 solution 함수는 심폐소생술을 하는 방법의 순서가 담긴 문자열들이 무작위 순서로 담긴 리스트 `cpr`이 주어질 때, 각각의 방법이 몇 번째 단계인지 순서대로 담아 return 하는 함수입니다. solution 함수가 올바르게 작동하도록 빈칸을 채워 solution 함수를 완성해 주세요.

<br>

## 제한사항
- `cpr`은 다음 문자열들이 한 번씩 포함되어 있습니다.
- "check", "call", "pressure", "respiration", "repeat"

<br>

## 입출력 예
| cpr | result |
|---|---|
| ["call", "respiration", "repeat", "check", "pressure"] | [2, 4, 5, 1, 3] |
| ["respiration", "repeat", "check", "pressure", "call"] | [4, 5, 1, 3, 2] |

<br>

## 입출력 예 설명
- 입출력 예 #1
    - "call", "respiration", "repeat", "check", "pressure"는 각각 2, 4, 5, 1, 3번째 순서이므로 [2, 4, 5, 1, 3]을 리턴합니다.

- 입출력 예 #2
    - "respiration", "repeat", "check", "pressure", "call"은 각각 4, 5, 1, 3, 2번째 순서이므로 [4, 5, 1, 3, 2]를 리턴합니다.

<br>

## 링크
[[5번] 심폐소생술](https://school.programmers.co.kr/learn/courses/30/lessons/340203)
