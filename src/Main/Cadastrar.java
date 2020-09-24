package Main;

import Entities.Exame;

import java.util.Locale;
import java.util.Scanner;

public class Cadastrar {

    public static void cadastrarExame(){

        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        int entradaId = 0;
        int entradaNivelGlicose = 0;
        boolean continuar = true;

        System.out.println("Digite o tipo de Exame: ");
        String entradaTipoExame = ler.nextLine();

        do {
            try {
                System.out.println("Digite o ID do Exame: ");
                entradaId = ler.nextInt();
                continuar = false;
            }
            catch (Exception e){
                System.out.println("Código deve ser numérico.");
                ler.next();
            }
        } while (continuar);

        do {
            continuar = true;
            try {
                System.out.println("Digite o nível de glicose: ");
                entradaNivelGlicose = ler.nextInt();
                continuar = false;
            }
            catch (Exception e){
                System.out.println("Entrada deve ser numérica.");
                ler.next();
            }
        } while (continuar);


        Exame exame = new Exame(entradaId, entradaTipoExame, entradaNivelGlicose);

        Exame.listaExames.add(exame);

        System.out.println("Exame Cadastrado com sucesso!");

    }

}
