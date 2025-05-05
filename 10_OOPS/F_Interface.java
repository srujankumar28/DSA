public class F_Interface {

    public static void main(String args[]) {
        Swift s = new Swift();
        s.moves();
        Maruthi m = new Maruthi();
        m.moves();

    }

}

interface cars {
    void moves(); // BLUE PRINT FOR THE CLASS
}

class Swift implements cars {
    public void moves() {
        System.out.println("Its a beautiful car (Swift)");
    }

}

class Maruthi implements cars {
    public void moves() {
        System.out.println("Its maruthi 800 brooo");
    }
}
