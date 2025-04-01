public class Casting {
    public static void main(String[] args) {
        /*
        byte v1 = 10;
        short v2 = v1; // -> Casting Implícito
        */
        short v3 = 10;
        byte v4 = (byte) v3; // -> Casting Explícito
        /*
        int v5 = 10;
        double v6 = v5;
        */
        double v7 = 10.0;
        int v8 = (int) v7;
    }
}
