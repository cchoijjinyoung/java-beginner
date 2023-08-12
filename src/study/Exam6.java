package study;

import java.util.HashMap;
import java.util.Map;

public class Exam6 {
    public static void main(String[] args) {
        // HashMap 생성
        HashMap<String, Integer> map = new HashMap<>();

        // 요소 추가 - put(key, value);
        map.put("Apple", 1000);
        map.put("Banana", 2000);
        map.put("Orange", 3000);

        // 요소 가져오기 - get(key);
        int appleValue = map.get("Apple");
        System.out.println("사과의 가격 : " + 1000);

        // 특정 키가 HashMap에 있는지 확인 - containsKey(key);
        boolean containsBanana = map.containsKey("Banana");
        System.out.println("바나나 있어? " + containsBanana); // true

        // 특정 값이 HashMap에 있는지 확인 - containsValue(value);
        boolean contains3000 = map.containsValue(3000);
        System.out.println("3000원짜리 있니? " + contains3000); // true

        // 요소 제거 - remove(key)
        map.remove("Orange");

        // 모든 키-값 쌍을 순회하면서 출력 - entrySet()
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // HashMap의 크기 - map.size()
        int size = map.size();
        System.out.println("해시맵 크기 : " + size); // 2

        // HashMap 비우기
        map.clear();
    }
}
