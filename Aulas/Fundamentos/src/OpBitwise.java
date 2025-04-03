public class OpBitwise {
    public static void main(String[] args) {
        int n1 = 89; // 0101 1001
        int n2 = 60; // 0011 1100

        System.out.println(n1 & n2); // 24
        System.out.println(n1 | n2); // 125
        System.out.println(n1 ^ n2); // 101
    }
}
