public class pradectobin {

    public static int dectobin(int decno) {
        int binarynum = 0;
        int pow = 0;
        while (decno > 0) {
            int lastdigit = decno % 2;
            binarynum = binarynum + (lastdigit * (int) Math.pow(10, pow));
            pow++;
            decno = decno / 2;
        }
        return binarynum;
    }

    public static void main(String[] args) {
        int decno= 8;
        System.out.println(dectobin(decno));
    }

}