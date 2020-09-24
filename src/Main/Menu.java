package Main;

import java.util.Locale;
import java.util.Scanner;

public class Menu {

    public static void menu(){

        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        boolean cond = true;

        while (cond){

            System.out.println("Escolha uma opção: ");
            System.out.println("1. Cadastrar Pessoa");
            System.out.println("2. Cadastrar Exame");
            System.out.println("3. Listar Exames");
            System.out.println("4. Consultar Exame");
            System.out.println("5. Consultar Pessoa");
            System.out.println("0. Sair");

            String option = ler.nextLine();

            switch (option){
                case "1":
                    Cadastrar.cadastrarPessoa();
                    break;
                case "2":
                    Cadastrar.cadastrarExame();
                    break;
                case "3":
                    Listar.listarExame();
                    break;
                case "4":
                    Consultar.consultarExame();
                    break;
                case "5":
                    Consultar.consultarPessoa();
                    break;
                case "0":
                    System.out.println("Até mais");
                    cond = false;
                    break;
                default:
                    System.out.println("Opção Inválida");
            }

        }
    }

}
