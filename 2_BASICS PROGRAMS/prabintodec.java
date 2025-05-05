public class prabintodec {

    public static int bintodec(int binarynum) {
        int decmalno = 0;
        int pow = 0;
        while (binarynum > 0) {
            int lastdigit = binarynum % 10;
            decmalno = decmalno +(lastdigit * (int)Math.pow(2, pow));
            pow++;
            binarynum = binarynum / 10;
        }
        return decmalno;
    }

    public static void main(String[] args) {
        int binarynum = 1000;
        System.out.println(bintodec(binarynum));
    }

}
