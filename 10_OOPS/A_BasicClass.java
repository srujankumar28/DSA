import java.util.*;

public class A_BasicClass {
    public static void main(String args[]) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.color = "yellow";
        System.out.println(p1.color);

        bankaccount myacc = new bankaccount(); // ACCESS SPECIFIER
        myacc.username = "srujan";
        // myacc.password="srujan";   //CANT DO THIS BECUASE PASSWORD IS SET TO PRIVATE 
        myacc.setPassword("abc");

    }
}

 class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;

    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

// ACCESS MODIFIERS

class bankaccount {
    public String username;
    private String password;

    void setPassword(String pwd) {
        password = pwd;

    }
}