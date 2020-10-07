package desafio;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int x = input.nextInt();

        String fatorial = String.valueOf(fatorial(x));

        System.out.println(lastNumberBeforeZero(fatorial));
    }

    public static int fatorial(int n){
        if(n == 1){
            return n;
        }
        return n * fatorial(n - 1);
    }

    public static String lastNumberBeforeZero(String fatorial){
        char lastChar = '0';
        for(int i = 0 ; i < fatorial.length(); ++i){
            if(!(fatorial.charAt(fatorial.length() - 1) == '0')){
                return "Não existe ultimo numero anterior a zero";
            } else {
                for(int j = fatorial.length() - 2; j >= fatorial.length() - 2; --j){
                    if(fatorial.charAt(j) != '0'){
                        lastChar = fatorial.charAt(j);
                    }
                }
            }
        }
        return "O ultimo numero anterioro a 0 é " + lastChar;
    }

}
