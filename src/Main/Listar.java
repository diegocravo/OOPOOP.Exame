package Main;

import Entities.Exame;

public class Listar {

    public static void listarExame(){

        int tamanhoLista = Exame.listaExames.size();

        if (tamanhoLista == 0){
            System.out.println("Não há exames cadastrados.");
        }else{
            for (int x = 0; x < tamanhoLista; x++){
                System.out.println(Exame.listaExames.get(x).toString());
            }
        }
    }

}
