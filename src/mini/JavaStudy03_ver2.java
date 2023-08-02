package mini;

import java.util.Scanner;

/**
 * 최진영 (cgy7127)
 * 미니과제2 : 놀이동산 입장권 계산 프로그램
 * 작성일 : 2023-08-02
 */

public class JavaStudy03_ver2 {

    static class Ticket {
        private Discount discount;
        private int price;

        public void setDiscount(Discount discount) {
            if (discount == Discount.FREE) {
                this.setPrice(0);
            } else if (discount == Discount.BASIC) {
                this.setPrice(10000);
            } else if (discount == Discount.NORMAL) {
                this.setPrice(8000);
            } else if (discount == Discount.SPECIAL) {
                this.setPrice(4000);
            }
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

    }

    enum Discount {
        FREE, BASIC, NORMAL, SPECIAL
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("[입장권 계산]");
        System.out.print("나이를 입력해 주세요.(숫자):");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("입장시간을 입력해 주세요.(숫자입력):");
        int enterTime = Integer.parseInt(scanner.nextLine());

        System.out.print("국가유공자 여부를 입력해 주세요.(y/n):");
        String merit = scanner.nextLine();

        System.out.print("복지카드 여부를 입력해 주세요.(y/n):");
        String card = scanner.nextLine();

        Ticket ticket = new Ticket();
        // Discount discount = ticket.discount;

        if (age < 3) {
            ticket.setDiscount(Discount.FREE);
            // discount = Discount.FREE;
        } else if (age < 13 || enterTime > 17) {
            ticket.setDiscount(Discount.SPECIAL);
            // discount = Discount.SPECIAL;
        } else if (merit.equals("y") || card.equals("y")) {
            ticket.setDiscount(Discount.NORMAL);
            // discount = Discount.NORMAL;
        }
        System.out.println("입장료: " + ticket.getPrice());
    }
}
