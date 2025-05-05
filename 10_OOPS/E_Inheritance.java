
class Animal { // BASE CLASS

    String color;

    void eat() {
        System.out.println("Eats");
    }

    void breathe() {
        System.out.println("Breathess");
    }

}

class Fish extends Animal { // SINGLE LEVEL INHERITANCE // DERIVED CLASS

    void swims() {
        System.out.println("Swims");
    }
}

public class E_Inheritance {

    public static void main(String args[]) {

        Fish shark = new Fish();
        shark.eat();
        shark.swims();

    }

}