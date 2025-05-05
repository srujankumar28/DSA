public class N_FriendsPair {

    public static int FriensPair(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        return FriensPair(n - 1) + (n - 1) * FriensPair(n - 2);

    }

    public static void main(String args[]) {
        System.out.println(FriensPair(3));
    }

}
