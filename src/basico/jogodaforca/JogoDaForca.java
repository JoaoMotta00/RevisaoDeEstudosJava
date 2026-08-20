package basico.jogodaforca;

import java.util.Arrays;
import java.util.Scanner;

public class JogoDaForca {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);



        System.out.print("Diga uma palavra para o jogo da forca: ");
        String palavra = scanner.nextLine().toUpperCase();
        char[] tentativaCerta = new char[palavra.length()];
        boolean ganhou = false;
        boolean acertou = false;

        while(!ganhou) {
            System.out.println("Digite uma letra: ");
            char letra = scanner.next().toUpperCase().charAt(0);

            for (int i = 0; i < palavra.length(); i++) {
                if(letra == palavra.charAt(i)){
                    acertou = true;
                    tentativaCerta[i] = letra;
                }
            }

            if(acertou){
                System.out.println("Você acertou uma letra");
                System.out.println(tentativaCerta);
                acertou = false;
                ganhou = new String(tentativaCerta).equals(palavra);
            } else {
                System.out.println("Você errou!");
            }

        }

        System.out.println("Você ganhou!!");

    }

}
