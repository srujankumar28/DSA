public class E1_Abstarction {

    public static void main(String[] args) {

        Mammals m = new Mammals();
    }

}

abstract class Animal10 {
    Animal10() {
        System.out.println("Animal constructor");
    }

}

class Horse extends Animal10 {
    Horse() {
        System.out.println("Horse constructor");
    }
}

class Mammals extends Horse {
    Mammals() {
        System.out.println("Mammals constructor");
    }
}
