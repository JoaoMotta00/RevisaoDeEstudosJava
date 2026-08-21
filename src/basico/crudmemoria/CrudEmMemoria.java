package basico.crudmemoria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CrudEmMemoria {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        List<Conta> listaDeConta = new ArrayList<>();


        System.out.print("Digite quantas consta você quer inserir: ");
        int qntdInsercao = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < qntdInsercao; i++) {
            System.out.print("Digite um id para sua conta:");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Digite o seu cpf para sua conta:");
            String cpf = scanner.nextLine();

            System.out.print("Digite um nome para sua conta:");
            String nome = scanner.nextLine();


            System.out.print("Digite um sobrenome para sua conta:");
            String sobrenome = scanner.nextLine();
            cadastrarConta(listaDeConta, new Conta(id, cpf, nome, sobrenome));
        }

        lerTudo(listaDeConta);

        System.out.println("Digite um Id para ler: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        lerPorId(listaDeConta, id);

        System.out.println("Digite um id para remover: ");
        id = scanner.nextInt();
        deletarConta(listaDeConta, id);

        lerTudo(listaDeConta);

    }

    //Implementar unicidade no cpf
    public static void cadastrarConta(List<Conta> listaDeConta, Conta conta){
        if (listaDeConta.stream().anyMatch(c1 -> c1.getId() == conta.getId())){
            conta.setId(conta.getId() + 1);
            cadastrarConta(listaDeConta, conta);

        } else{
            System.out.println("Inserindo a conta " + conta.getId() + " na lista");
            System.out.println();
            listaDeConta.add(conta);
        }
    }

    public static void lerPorId(List<Conta> listaDeConta, int id){
        listaDeConta.stream().filter(c1 -> c1.getId() == id).forEach(System.out::println);
    }

    public static void lerTudo(List<Conta> listaDeConta){
        System.out.println(listaDeConta.toString());
    }

    public static void deletarConta(List<Conta> listaDeConta, int id){
        System.out.println("A conta de id: " + id + " foi removida");
        listaDeConta.removeIf(c1 -> c1.getId() == id);
    }
}
