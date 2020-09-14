package Main;

import Entities.*;

import java.util.Locale;
import java.util.Scanner;

public class Index {
    public static void main(String[] args) {

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
                continue;
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
                continue;
            }
        } while (continuar);


        Exame exame = new Exame(entradaId, entradaTipoExame, entradaNivelGlicose);

        System.out.println(exame.toString());
    }
}
