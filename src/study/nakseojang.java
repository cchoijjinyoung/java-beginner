package study;

public class nakseojang {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] query = {0, 3};

        int tmp = 0;
        tmp = arr[query[0]];
        arr[query[0]] = arr[query[1]];
        arr[query[1]] = tmp;

        for (int i : arr) {
            System.out.print(i + " ");
        }
//        int a = 91;
//        int b = 2;
//        String as = String.valueOf(a);
//        String bs = Integer.toString(b);
//        System.out.println("bs = " + bs);
//        System.out.println("bs의 타입 = " + bs.getClass());
//        int answer = Integer.parseInt(as + bs);
//        if (answer < 2 * a * b) {
//            answer = 2 * a * b;
//        }
//        System.out.println(answer);

//        int index = 2;
//        String my_string = "He11oWor1d";
//        String overwrite_string = "lloWorl";
//        StringBuilder sb = new StringBuilder();
//        sb.append(my_string.substring(0, index));
//        sb.append(overwrite_string);
//        sb.append(my_string.substring(index + overwrite_string.length()));
//        String answer = "";
//        answer = sb.toString();
//        System.out.println(answer);
    }
}
