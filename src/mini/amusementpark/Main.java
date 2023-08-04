//package mini.amusementpark;
//
//import mini.amusementpark.domain.Visitor;
//import mini.amusementpark.exception.NotAvailableAgeException;
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int age = getInput(scanner, "나이를 입력하세요: ", "나이는 음수일 수 없습니다.", value -> value < 0);
//        int visitTime = getInput(scanner, "방문 시간을 입력하세요(24시간 형식): ", "방문 시간은 0에서 24 사이의 값이어야 합니다.", value -> value < 0 || value > 24);
//        boolean isExistNationalMerit = getInput(scanner, "국가 유공자 여부를 입력하세요(y/n): ", "방문 시간은 0에서 24 사이의 값이어야 합니다.", value -> value < 0 || value > 24);
//        boolean isExistWelfareCard = getInput(scanner, "복지 카드 여부를 입력하세요(y/n): ", "방문 시간은 0에서 24 사이의 값이어야 합니다.", value -> value < 0 || value > 24);
//
//        // 방문자 객체 생성
//        Visitor visitor = new Visitor(age, visitTime, isExistNationalMerit, isExistWelfareCard);
//
//        // 티켓 계산기 객체 생성
//        TicketCalculator ticketCalculator = new TicketCalculator();
//
//        // 티켓 가격 계산
//        int price = ticketCalculator.calculate(visitor);
//
//        // 결과 출력
//        System.out.println("티켓 가격은 " + price + "원입니다.");
//
//        scanner.close();
//    }
//
//    public static int getInput(Scanner scanner, String prompt, String errorMessage, java.util.function.Predicate<Integer> isInvalid) {
//        int value;
//        while (true) {
//            try {
//                System.out.print(prompt);
//                value = scanner.nextInt();
//                if (isInvalid.test(value)) {
//                    throw new IllegalArgumentException(errorMessage);
//                }
//                break;
//            } catch (IllegalArgumentException e) {
//                System.out.println(e.getMessage());
//            }
//        }
//        return value;
//    }
//}
