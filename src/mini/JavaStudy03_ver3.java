//package mini;
//
//import java.util.Locale;
//import java.util.Scanner;
//
///**
// * 최진영 (cgy7127)
// * 미니과제2 : 놀이동산 입장권 계산 프로그램
// * 작성일 : 2023-08-03
//* 예외 처리해보기
//* 1. 나이가 음수 일 때
//* 2. 입장시간이 00 ~ 24 값이 아닐 때
//* 3. 여부 입력 시 'y' or 'n'이 아닐 때
// */
//
////class NotAvailableAgeException extends RuntimeException {}
////class NotAvailableTimeException extends RuntimeException {}
////class NotYesOrNoException extends RuntimeException {}
//
//public class JavaStudy03_ver3 {
//
////    public static boolean checkAgeWithThrows(int age) throws NotAvailableAgeException {
////        if (age < 1) {
////            throw new NotAvailableAgeException();
////        }
////        return true;
////    }
////
////    public static boolean checkTimeWithThrows(int time) throws NotAvailableTimeException {
////        if (time < 0 || time > 24) {
////            throw new NotAvailableTimeException();
////        }
////        return true;
////    }
////
////    public static boolean checkYesOrNoWithThrows(String yn) throws NotYesOrNoException {
////        if (!yn.equals("y") && !yn.equals("n")) {
////            throw new NotYesOrNoException();
////        }
////        return true;
////    }
//
//
//    static class Ticket {
//        private Discount discount;
//        private int price;
//
//        public void setDiscount(Discount discount) {
//            if (discount == Discount.FREE) {
//                this.setPrice(0);
//            } else if (discount == Discount.BASIC) {
//                this.setPrice(10000);
//            } else if (discount == Discount.NORMAL) {
//                this.setPrice(8000);
//            } else if (discount == Discount.SPECIAL) {
//                this.setPrice(4000);
//            }
//        }
//
//        public int getPrice() {
//            return price;
//        }
//
//        public void setPrice(int price) {
//            this.price = price;
//        }
//
//    }
//
//    enum Discount {
//        FREE, BASIC, NORMAL, SPECIAL
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("[입장권 계산]");
//        System.out.print("나이를 입력해 주세요.(숫자):");
//        int age = Integer.parseInt(scanner.nextLine());
//        boolean checkResult;
//        try {
//            checkResult = JavaStudy03_ver3.checkAgeWithThrows(age);
//        } catch (NotAvailableAgeException e) {
//            System.out.print("나이를 다시 입력해주세요.(나이 > 0):");
//            age = Integer.parseInt(scanner.nextLine());
//        }
//
//        System.out.print("입장시간을 입력해 주세요.(숫자입력):");
//        int enterTime = Integer.parseInt(scanner.nextLine());
//        try {
//            checkResult = JavaStudy03_ver3.checkTimeWithThrows(enterTime);
//        } catch (NotAvailableTimeException e) {
//            System.out.print("입장시간을 다시 입력해주세요.(0 <= 입장시간 <= 24):");
//            enterTime = Integer.parseInt(scanner.nextLine());
//        }
//
//        System.out.print("국가유공자 여부를 입력해 주세요.(y/n):");
//        String merit = scanner.nextLine().toLowerCase();
//        try {
//            checkResult = JavaStudy03_ver3.checkYesOrNoWithThrows(merit);
//        } catch (NotYesOrNoException e) {
//            System.out.print("국가유공자 여부를 다시 입력해주세요.(y/n):");
//            merit = scanner.nextLine().toLowerCase();
//        }
//
//        System.out.print("복지카드 여부를 입력해 주세요.(y/n):");
//        String card = scanner.nextLine().toLowerCase();
//        try {
//            checkResult = JavaStudy03_ver3.checkYesOrNoWithThrows(card);
//        } catch (NotYesOrNoException e) {
//            System.out.print("복지카드 여부를 다시 입력해주세요.(y/n):");
//            card = scanner.nextLine().toLowerCase();
//        }
//
//        Ticket ticket = new Ticket();
//
//        if (age < 3) {
//            ticket.setDiscount(Discount.FREE);
//        } else if (age < 13 || enterTime > 17) {
//            ticket.setDiscount(Discount.SPECIAL);
//        } else if (merit.equals("y") || card.equals("y")) {
//            ticket.setDiscount(Discount.NORMAL);
//        }
//        System.out.println("입장료: " + ticket.getPrice());
//    }
//}
