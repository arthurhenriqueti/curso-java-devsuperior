import java.util.Scanner;

public class OpComparativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v1 = sc.nextInt();
        int v2 = sc.nextInt();

        System.out.println(v1 > v2);
        System.out.println(v1 < v2);
        System.out.println(v1 >= v2);
        System.out.println(v1 <= v2);
        System.out.println(v1 == v2);
        System.out.println(v1 != v2);

        sc.close();
    }
}
