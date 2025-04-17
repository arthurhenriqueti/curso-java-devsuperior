package TratamentoDeErros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            int n1 = sc.nextInt();
        }catch(InputMismatchException e) {
            System.out.printf("Erro: %s%n", e);
        }finally{
            if(sc != null) {
                sc.close();
                System.out.println("Scanner fechado!");
            }
        }
    }
}
