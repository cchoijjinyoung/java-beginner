package practice;

class Animal {
    String desc;
    Animal() {
        this.desc = "동물 클래스 입니다.";
    }
    Animal(String desc) {
        this.desc = desc;
    }

    public void printInfo() {
        System.out.println(this.desc);
    }
}

class Cat extends Animal {
    Cat() {
        super();
    }
}

public class ExtendsPractice {
    public static void main(String[] args) {
        // Test code
        Cat cat = new Cat();
        System.out.println(cat.desc);
        cat.printInfo();
    }
}
