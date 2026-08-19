package basico.calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraDeConsole{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean ligado = true;
        double num1, num2, resultado;


            while (ligado) {
                try {
                System.out.println("----------Calculadora----------");
                System.out.println("1 - Somar");
                System.out.println("2 - Subtrair");
                System.out.println("3 - Multiplicar");
                System.out.println("4 - Dividir");
                System.out.println("5 - Encerrar");
                System.out.println("-------------------------------");
                int opção = scanner.nextInt();

                switch (opção) {
                    case 1:
                        System.out.print("Digite dois números para somar:");
                        num1 = scanner.nextInt();
                        num2 = scanner.nextInt();
                        resultado = num1 + num2;
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 2:
                        System.out.print("Digite dois números para subtrair:");
                        num1 = scanner.nextInt();
                        num2 = scanner.nextInt();
                        resultado = num1 - num2;
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 3:
                        System.out.print("Digite dois números para multiplicar:");
                        num1 = scanner.nextInt();
                        num2 = scanner.nextInt();
                        resultado = num1 * num2;
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 4:
                            System.out.print("Digite dois números para dividir:");
                            num1 = scanner.nextInt();
                            num2 = scanner.nextInt();
                            resultado = num1 / num2;
                            if(Double.isInfinite(resultado) || Double.isNaN(resultado)){
                                System.out.println("Não é possível dividir por zero");
                            } else {
                                System.out.println("Resultado: " + resultado);
                            }
                        break;
                    case 5:
                        System.out.println("Encerrando aplicação");
                        ligado = false;
                    }
                }catch (InputMismatchException e){
                    System.out.println("Por favor insira um número válido");
                    scanner.next();
                }
            }
        scanner.close();
    }
}


