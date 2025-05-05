// public class G_Abstraction {

//     public static void main(String args[]) {

//         Horse h = new Horse();
//         h.eat();
//         h.walk();
//         Animal2 a= new Animal2();  // not possible..we cant create the object of the abstract base class but we can create the object of the //derived class 

//     }
// }

// abstract class Animal2 {
//     void eat() {
//         System.out.println("Eats");
//     }

//     abstract void walk(); // THIS SHOULD BE IMPLEMENTED BY THE DERIVED CLASS OF THIS BASE CLASS
// }

// class Horse extends Animal2 {
//     void walk() { // WALK IS IMPLEMENTED HERE AS IT IS ABSTRACTED FROM THE BASE CLASS AND SHOULD
//                   // BE IMPLEMENTED SINCE IT IS ALREADY DEFINED IN THE BASE CLASS
//         System.out.println("walks");
//     }
// }









// 2ND PART--- IN ABSTRACTION CONSTRUCTOR CAN BE CREATED INSIDE THE ABSTRACT CLASS BUT WE CANT CREATE THE OBJECT OF THE ABSTRACT CLASS(BASE CLASS)
public class G_Abstraction {
    public static void main(String args[]) {
        Mustag m = new Mustag(); // HERE EVENTHOGH MUSTAG CLASS CONSTRUCTOR IS CALLED THE PARENT CLASS
                                 // CONSTRUCTOR STATEMENT WILL BE
                                 // EXECUTED FIRST FOLLOWED BY THE BELOW TO (BECAUSE OF THE ABSTRACT CLASS)
    }
}

abstract class Animal3 {
    Animal3() {
        System.out.println("Animal constructor is called");
    }
}

class Horse1 extends Animal3 {
    Horse1() {
        System.out.println("Horse constructor is called");
    }
}

class Mustag extends Horse1 {
    Mustag() {
        System.out.println("Mustag constructor is called");
    }
}
