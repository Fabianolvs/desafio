package desafio;

import java.util.Scanner;

public class Number {
    public static void main(String[] args){
        System.out.println("Digite um numero:");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.println(verifyNumber(x));
    }

    public static String verifyNumber(int n){
        if(n < 0) {
            return "Invalid argument";
        }

        if(isPrime(n)){
            return "Prime number";
        } else {
            return "Not a prime number";
        }
    }

    public static boolean isPrime(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;
        }
        return true;
    }
}
