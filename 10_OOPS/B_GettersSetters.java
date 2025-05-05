 public class B_GettersSetters {

    public static void main(String args[]) {
        Pen1 p1 = new Pen1();

        p1.setColor("Blue");
        System.out.println(p1.getColor());
        // System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.getTip());
        // System.out.println(p1.tip);

    }

}

class Pen1 {
    String color;
    int tip;

    String getColor() { // GETTER
        return this.color;

    }

    int getTip() {
        return this.tip; // GETTER

    }

    void setColor(String newColor) {            //SETTERS
        this.color = newColor;
    }

    void setTip(int tip) {               //SETTER
        this.tip = tip;
    }

}
