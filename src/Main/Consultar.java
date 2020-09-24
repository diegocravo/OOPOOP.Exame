package Main;

import Entities.Exame;
import Entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Consultar {

    public static void consultarExame(){

        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        boolean achou = false;

        System.out.println("Digite o código do Exame: ");
        int option;

        try{
            option = ler.nextInt();
        }catch (Exception e){
            System.out.println("O valor deve ser numérico.");
            option = -1;
        }

        for (int x = 0; x < Exame.listaExames.size(); x++){
            if (Exame.listaExames.get(x).getIdExame() == option){
                System.out.println(Exame.listaExames.get(x).toString());
                achou = true;
                break;
            }
        }

        if (!achou){
            System.out.println("Código não encontrado");
        }

        if (option == -1){
            System.out.println("Código não encontrado");
        }
    }

    public static void consultarPessoa(){

        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        boolean achou = false;

        try {
            System.out.println("Digite o id da pessoa: ");
            int option = ler.nextInt();

            for (int x = 0; x < Pessoa.listaPessoas.size(); x++){
                if (Pessoa.listaPessoas.get(x).getIdPessoa() == option){
                    System.out.println(Pessoa.listaPessoas.get(x).toString());
                    achou = true;
                    break;
                }
            }
            if (!achou){
                System.out.println("Pessoa não encontrada");
            }
        } catch (Exception e){
            System.out.println("Opção inválida");
        }
    }

}
