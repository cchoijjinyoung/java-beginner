//package mini.amusementpark;
//
//import mini.amusementpark.domain.Ticket;
//import mini.amusementpark.domain.User;
//import mini.amusementpark.exception.NotAvailableAgeException;
//import mini.amusementpark.exception.NotAvailableTimeException;
//import mini.amusementpark.exception.NotYesOrNoException;
//
//import java.util.Scanner;
///**
// * 최진영 (cgy7127)
// * 미니과제2 : 놀이동산 입장권 계산 프로그램
// * 작성일 : 2023-08-03
// */
//public class Amusementpark {
//    User user = new User();
//    Ticket ticket = new Ticket();
//    Scanner sc = new Scanner(System.in);
//    private void start() {
//        System.out.println("[입장권 계산]");
//
//    }
//
//    private void checkAge() throws NotAvailableAgeException {
//        System.out.print("나이를 입력해 주세요.(숫자입력):");
//        int age = sc.nextInt();
//    }
//
//    private void checkVisitTime() throws NotAvailableTimeException {
//        System.out.print("입장시간을 입력해 주세요.(숫자입력):");
//    }
//
//    private void checkNationalMeritExistStatus() throws NotYesOrNoException {
//        System.out.print("국가유공자 여부를 입력해 주세요.(y/n):");
//    }
//
//    private void checkWelfareCardExistStatus() throws NotYesOrNoException {
//        System.out.print("복지 카드 여부를 입력해 주세요.(y/n):");
//    }
//
//    private void calculate(User user) {
//        if (user.getAge() < 3) {
//            ticket.setDiscountPolicy(DiscountPolicy.FREE);
//        } else if (user.getAge() < 13 || user.getVisitTime() > 17) {
//            ticket.setDiscountPolicy(DiscountPolicy.SPECIAL);
//        } else if (user.isExistNationalMerit() || user.isExistWelfareCard()) {
//            ticket.setDiscountPolicy(DiscountPolicy.NORMAL);
//        }
//        System.out.printf("입장료는 %d입니다.", ticket.getPrice());
//    }
//}