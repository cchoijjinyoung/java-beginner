package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class Practice_Collection {
    public static void main(String[] args) {
        // 로또 번호 만들기
        HashSet hs = new HashSet();
        for (int i = 0; hs.size() < 6; i++) {
            int num = (int)(Math.random() * 45) + 1;
            hs.add(num);
        }
        ArrayList list = new ArrayList(hs);
        Collections.sort(list);
        System.out.println("로또 번호: " + list);
    }
}
