class Reactangle {

    int length;
    int breadth;

    Reactangle(int length, int breadth) { // constructor
        this.length = length;
        this.breadth = breadth;
    }

    Reactangle() {
        this.length = 0;
        this.breadth = 0;
    }

    public int area() {
        return this.length * this.breadth;
    }

    public void display() {
        System.out.println("length:" + this.length + " breadth:" + breadth);
    }

}

public class Reactangle1 {
    public static void main(String[] args) {
        // Reactangle rect1=new Reactangle();
        // rect1.display();
        Reactangle rect2 = new Reactangle(10, 20);
        rect2.display();
        System.out.println("The area of the Rectangle = " + rect2.area());

    }
}
