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
            System.out.println("1. Cadastrar Exame");
            System.out.println("2. Listar Exames");
            System.out.println("3. Consultar Exame");
            System.out.println("0. Sair");

            String option = ler.nextLine();

            switch (option){
                case "1":
                    Cadastrar.cadastrarExame();
                    break;
                case "2":
                    Listar.listarExame();
                    break;
                case "3":
                    Consultar.consultarExame();
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
