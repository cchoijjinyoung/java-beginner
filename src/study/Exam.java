package study;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Operators;
import com.sun.org.apache.xpath.internal.operations.Operation;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class Exam {
    public static void main(String[] args) {
        // offer(), add()메서드의 가득찬 상황을 테스트하기 위해 해당 클래스를 사용했다.
        // LinkedList는 크기 제한이 없는 클래스이기 때문에 테스트에 적합하지 않았다.

        // offer() 메서드
        ArrayBlockingQueue<Integer> offerTest = new ArrayBlockingQueue<>(1);
        System.out.println(offerTest.offer(1)); // true
        System.out.println(offerTest.offer(1)); // false

        // add() 메서드
        ArrayBlockingQueue<Integer> addTest = new ArrayBlockingQueue<>(1);
        System.out.println(addTest.add(1)); // true

        try {
            System.out.println(addTest.add(1));
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        LinkedList<Integer> deque = new LinkedList<>();
        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);
        deque.add(5); // 1, 2, 3, 4, 5

        System.out.println("poll(제거) : " + deque.poll()); // 1을 출력하고 맨 앞 제거

        deque.peek();
        deque.peek(); // 몇 번을 해도 똑같다.
        System.out.println("peek(조회) : " + deque.peek()); // 2를 출력하고 요소 제거 X

        for (int item : deque) {
            System.out.print(item + " "); // 2 3 4 5
        }
        System.out.println();

        // 현재 deque : 2 3 4 5
        // 양방향 메서드를 사용해보겠다. addLast()는 사실 그냥 add와 같다.
        deque.addFirst((6)); // 6 2 3 4 5
        deque.offerFirst(7); // 7 6 2 3 4 5

        deque.removeLast(); // 맨 뒤 5를 제거 후 반환 -- 7 6 2 3 4
        deque.pollLast(); // 맨 뒤 4를 제거 후 반환 -- 7 6 2 3

        deque.getLast(); // 3
        deque.peekLast(); // 3

        // 양방향 큐(Deque)의 장점
        deque.offerFirst(deque.pollLast()); // 맨 뒤 3을 제거 후 맨 앞으로 추가
        for (int item : deque) {
            System.out.print(item + " "); // 3 7 6 2
        }
    }
}
