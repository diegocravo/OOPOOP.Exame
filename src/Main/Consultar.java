package Main;

import Entities.Exame;

import java.util.Locale;
import java.util.Scanner;

public class Consultar {

    public static void consultarExame(){

        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

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
                break;
            }
        }

        if (option == -1){
            System.out.println("Código não encontrado");
        }
    }

}
