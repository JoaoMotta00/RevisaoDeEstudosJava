package basico.listadetarefas;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Tarefas {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String caminho = ""; //caminho do arquivo que você gostaria de escrever!
        int qtdTarefas;

        System.out.print("Digite quantas tarefas você quer adicionar: ");
        qtdTarefas = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Você deseja limpar o arquivo?(S/N)");
        char opcao = scanner.next().charAt(0);
        scanner.nextLine();

        if(opcao == 's' || opcao == 'S'){
            BufferedWriter limpar = new BufferedWriter(new FileWriter(caminho));
            limpar.write("");
        } else {
            System.out.println("Prosseguindo normalmente!");
        }

        for (int i = 0; i < qtdTarefas; i++) {
            try(BufferedWriter buffWrite = new BufferedWriter(new FileWriter(caminho, true))) {

                System.out.print("Escreva uma tarefa para incluir no arquivo: ");
                String texto = scanner.nextLine();
                buffWrite.write(texto);
                buffWrite.newLine();


            } catch (IOException e){
                System.out.println("Arquivo não encontrado!");
            }
        }

        try(BufferedReader leitor = Files.newBufferedReader(Path.of(caminho))){
            String linha;
            int i = 1;
            while((linha = leitor.readLine()) != null){
                System.out.println(i + " - " + linha);
                i++;
            }
        } catch(IOException e){
            System.out.println("Arquivo não encontrado!");
        }






    }

}
