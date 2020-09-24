package Main;

public class GeradorId {

    private static int contador = 0;
    public static int gerarIdExame(){
        contador += 1;
        return contador;
    }

    private static int contadorPessoa = 0;
    public static int gerarIdPessoa(){
        contadorPessoa++;
        return contadorPessoa;
    }

}
