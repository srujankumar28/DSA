import java.util.*;
public class H_SuperKeyword {
    public static void main(String args[]){
        Monkey m=new Monkey();

    }
    
}

class Animal4{
    Animal4(){
        System.out.println("Animal constructor");
    }
}
class Monkey extends Animal4{
    Monkey(){
        super();
        System.out.println("Moneky constructor");
    }
}
