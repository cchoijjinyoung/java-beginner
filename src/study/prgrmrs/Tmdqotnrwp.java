package study.prgrmrs;

import java.util.Scanner;

public class Tmdqotnrwp {

    public static void main(String[] args) {
        SubClass subClass = new SubClass();
//        subClass.practice1();
//        subClass.practice2();
//        subClass.practice3();
//        subClass.practice4();
//        subClass.practice5();
//        subClass.practice6();
//        subClass.practice7();
//        subClass.practice8();
//        subClass.practice9();
        subClass.practice10();

    }

    public static class SubClass {
        public void practice1() {
            String[][] arr = new String[3][3];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = "(" + i + ", " + j + ")";
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
        }

        public void practice2() {
            int[][] arr = new int[6][6];
            int num = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    num = i * arr.length + j + 1;
                    arr[i][j] = num;
                    System.out.print(String.format("%3d ", arr[i][j]));
                }
                System.out.println();
            }
        }

        public void practice3() {
            int[][] arr = new int[5][5];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = arr.length * (arr.length - i) - j;
                    System.out.printf("%3d", arr[i][j]);
                }
                System.out.println();
            }
        }

        public void practice4() {
            int[][] arr = new int[4][4];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (j != arr[i].length - 1 && i != arr.length - 1) {
                        arr[i][j] = (int) (Math.random() * 10) + 1;
                        arr[i][arr[i].length - 1] += arr[i][j];
                        arr[arr.length - 1][j] += arr[i][j];
                        arr[arr.length - 1][arr[i].length - 1] += arr[i][j];
                    } else if (i == arr.length - 1 && j == arr[i].length - 1) {
                        arr[arr.length - 1][arr[i].length - 1] += arr[i][j];
                    }
                    System.out.print(String.format("%3d ", arr[i][j]));
                }
                System.out.println();
            }
        }

        public void practice5() {
            Scanner sc = new Scanner(System.in);
            int x = 0;
            int y = 0;
            while (true) {
                System.out.print("행 크기 : ");
                x = sc.nextInt();
                if (x >= 1 && x <= 10) {
                    break;
                }
                System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
            }
            while (true) {
                System.out.print("열 크기 : ");
                y = sc.nextInt();
                if (y >= 1 && y <= 10) {
                    break;
                }
                System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
            }
            char[][] arr = new char[x][y];
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    arr[i][j] = (char) (26 * Math.random() + 65);
                    System.out.print(arr[i][j] + "\t");
                }
                System.out.println();
            }
        }
        public void practice6() {
            String[][] strArr = new String[][]{
                    {"이", "까", "왔", "앞", "힘"},
                    {"차", "지", "습", "으", "냅"},
                    {"원", "열", "니", "로", "시"},
                    {"배", "심", "다", "좀", "다"},
                    {"열", "히", "! ", "더", "!! "}
            };

            for (int i = 0; i < strArr.length; i++) {
                System.out.println();
                for (int j = 0; j < strArr[i].length; j++) {
                    System.out.print(strArr[j][i]);
                }
            }
        }

        public void practice7() {
            Scanner sc = new Scanner(System.in);
            char c = 'a';
            System.out.print("행의 크기 : ");
            int x = sc.nextInt();
            char[][] arr = new char[x][];
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < x; i++) {
                System.out.print(i + "행의 열 크기 : ");
                int y = sc.nextInt();
                arr[i] = new char[y];

                for (int j = 0; j < y; j++) {
                    sb.append(c + " ");
                    arr[i][j] = c++;
                }
                sb.append("\n");
            }
            System.out.println(sb.toString());
        }

        public void practice8() {
            String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
                    "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};

            String[][] firstGroup = new String[3][2];
            StringBuilder firstSb = new StringBuilder();
            firstSb.append("== 1분단 ==\n");


            String[][] secondGroup = new String[3][2];
            StringBuilder secondSb = new StringBuilder();
            secondSb.append("== 2분단 ==\n");

            int index = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 2; j++) {
                    firstGroup[i][j] = students[index];
                    firstSb.append(firstGroup[i][j]).append("\t");

                    secondGroup[i][j] = students[index + 6];
                    secondSb.append(secondGroup[i][j]).append("\t");
                    index++;
                }
                firstSb.append("\n");
                secondSb.append("\n");
            }
            System.out.print(firstSb.toString());
            System.out.print(secondSb.toString());
        }

        public void practice9() {
            String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
                    "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};

            String[][] firstGroup = new String[3][2];
            StringBuilder firstSb = new StringBuilder();
            firstSb.append("== 1분단 ==\n");

            String[][] secondGroup = new String[3][2];
            StringBuilder secondSb = new StringBuilder();
            secondSb.append("== 2분단 ==\n");

            int index = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 2; j++) {
                    firstGroup[i][j] = students[index];
                    firstSb.append(firstGroup[i][j] + "\t");
                    secondGroup[i][j] = students[index + 6];
                    secondSb.append(secondGroup[i][j] + "\t");
                    index++;
                }
                firstSb.append("\n");
                secondSb.append("\n");
            }
            System.out.print(firstSb.toString());
            System.out.print(secondSb.toString());

            Scanner sc = new Scanner(System.in);
            System.out.println("============================");
            System.out.print("검색할 학생 이름을 입력하세요 : ");
            String target = sc.nextLine();
            StringBuilder sb = new StringBuilder();
            sb.append("검색하신 " + target + " 학생은 ");

            String[][][] groups = new String[2][3][2];
            groups[0] = firstGroup;
            groups[1] = secondGroup;

            for (int i = 0; i < groups.length; i++) {
                for (int j = 0; j < groups[i].length; j++) {
                    for (int k = 0; k < groups[i][j].length; k++) {
                        if (target.equals(groups[i][j][k])) {
                            sb.append(i + 1 + "분단 ");
                            switch (j) {
                                case 0:
                                    sb.append("첫 번째 줄 ");
                                    break;
                                case 1:
                                    sb.append("두 번째 줄 ");
                                    break;
                                case 2:
                                    sb.append("세 번째 줄 ");
                                    break;
                            }
                            if (k == 0) {
                                sb.append("왼쪽에 있습니다.");
                            } else if (k == 1) {
                                sb.append("오른쪽에 있습니다.");
                            }
                        }
                    }
                }
            }
            System.out.println(sb.toString());
        }

        public static void practice10() {
            int[][] arr = new int[4][4];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (i < arr.length - 1 && j < arr[i].length - 1) {
                        arr[i][j] = (int)(Math.random() * 10) + 1;
                        arr[arr.length - 1][j] += arr[i][j];
                        arr[i][arr[i].length - 1] += arr[i][j];
                        arr[arr.length - 1][arr[i].length - 1] += 2 * arr[i][j];
                    }
                    System.out.printf("%4d", arr[i][j]);
                }
                System.out.println();

            }
        }
    }
}

