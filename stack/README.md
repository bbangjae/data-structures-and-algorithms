## Stack

### 📌 정의
**스택(Stack)** 은 **후입선출(LIFO, Last In First Out)** 구조를 가지는 선형 자료구조로,  
가장 **마지막에 넣은 데이터가 가장 먼저 나오는** 구조입니다.


```java
// 비권장 Vector를 상속해 구현됐으며(동기화 이슈로 성능 저하)
Stack<Integer> stack = new Stack<>();

// 권장
Deque<Integer> stack = new ArrayDeque<>();
```

### ⚙️ 특징
- **LIFO(후입 선출)** 방식으로 동작
- Top 포인터를 기준으로 삽입(push), 삭제(pop)
- 기본 연산: `push()`, `pop()`, `peek()`

### ✅ 장점
- **삽입/삭제가 빠름** (항상 Top에서만 수행 → O(1))
- 구조와 동작 원리가 간단하고 직관적
- 재귀적 문제 해결, 함수 호출 스택, 작업 기록 등에서 효과적

### ❌ 단점
- **중간 데이터 접근 불가** 
- **인덱스 기반 순차 탐색 불가**  (전체 탐색 O(n))
- 데이터의 **순서나 특정 값 변경 불가** (Top 외 접근 불가)

### ⏱️ 시간 복잡도

| 연산          | 시간 복잡도 | 설명                    |
|-------------|--------|-----------------------|
| 접근          | O(n)   | 임의 접근 불가              |
| 탐색          | O(n)   | 원하는 값을 찾기 위해 전체 탐색 필요 |
| 삽입(Top 위치)  | O(1)   | Top에 바로 삽입 가능         |
| 삭제 (Top 위치) | O(1)   | Top에서 바로 삭제 가능     |
| 값 확인(Top위치) | O(1)   | Top의 값 바로 확인 가능             |