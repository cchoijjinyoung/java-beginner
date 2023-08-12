# Stack (스택)
## Stack(스택) 이란?
**"쌓다"** 라는 뜻을 가진다.  
스택의 가장 중요한 특징은 **LIFO(후입선출)** 규칙을 따른다는 것이다.  
상자에 물건을 차곡차곡 쌓아 올린 형태를 생각하면 쉽다.  
## 스택의 특징
스택은 **'top'** 이라는 것을 가진다.  
상자에 물건을 넣을 때 바닥은 닫혀있고 열려있는 위로 물건을 넣고 빼듯이 Stack도 동일하다.  
이 때,  
top을 통해 데이터를 '삽입'하는 매서드를 `'push(data)'`,  
top을 통해 데이터를 '제거'하는 메서드를 `'pop()'`이라고 한다.  

## 메서드  
### `push(E item)`
- 스택의 맨 위에 요소를 추가한다. = 다음에 pop되는 요소가 된다.
- 매개변수가 필요하다
- 리턴 값으로 'push' 된 요소 자체를 반환한다.
- 시간복잡도 : O(1)

```java
// 제네릭을 사용할 수 있다.
Stack<String> stack = new Stack();

String data1 = "데이터1";
stack.push(data1);

String data2 = "데이터2";
stack.push(data2);

// push 된 요소 자체를 반환한다.
String data3 = "데이터3";
System.out.println(stack.push(data3)); // "데이터3"
```

### `pop()`
- 스택의 맨 위에 요소를 제거하고 그 요소를 반환한다.
- 스택이 비어있는 상태에서 호출 시 Exception을 던진다. = 'EmptyStackException'
- 시간복잡도 : O(1)
- push(삽입), pop(제거) 메서드의 시간복잡도가 O(1)로 동일한 이유는 'top'(맨 위) 데이터를 삽입하고 제거하기 때문이다.

```java
// 위에 로직과 이어짐
// stack : [데이터1, 데이터2, 데이터3] (top)
stack.pop(); // 데이터3 - stack : [데이터1, 데이터2]
stack.pop(); // 데이터2

stack.peek(); // 데이터1 - 반환만할 뿐, 제거하지는 않는다.

stack.pop(); // 데이터1
// stack.size() == 0
stack.empty() // true
stack.pop(); // EmptyStackException
// or stack.peek(); // 동일하게 예외를 던진다.
```

### `peek()`
- 스택의 맨 위의 요소를 반환하지만 제거하지는 않는다.
- 스택이 비어있는 상황에서 호출 시 마찬가지로 'EmptyStackException'을 던진다.

### `empty()`
- 스택이 비어있으면 'true'를 반환, 그렇지 않으면 'false'를 반환한다.

### `search(Object O)`
- 스택에서 주어진 객체를 찾고, 객체까지의 거리를 반환한다.
- top 에서부터 아래로 내려가며 찾는다.
- 찾지 못하면 -1 을 반환한다.

```java
Stack<Integer> stack = new Stack<>();
// 1 을 찾고 싶다.
stack.push(1); // 찾고자하는 Object
stack.push(2);
stack.push(3);
stack.push(4);
stack.push(1); // 값이 동일한 Object
System.out.println(stack.search(1)); // 1 (거리 반환)
// 가장 가까운 Object를 출력하는 것을 알 수 있다.
        
stack.pop(); // 맨 위 1 삭제
System.out.println(stack.search(1)); // 4
```
