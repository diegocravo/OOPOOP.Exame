package Entities;

public class Exame {

    private int idExame;
    private String tipoExame;
    private int nivelGlicose;

    public Exame(int idExame, String tipoExame, int nivelGlicose){
        this.idExame = idExame;
        this.tipoExame = tipoExame;
        this.nivelGlicose = nivelGlicose;
    }

    public String obterDiagnostico(){
        int nivelGlicose = this.nivelGlicose;
        String resultado;
        if (nivelGlicose > 125){
            resultado = "Diabetes";
        }else if (nivelGlicose < 99){
            resultado = "Normal";
        }else {
            resultado = "Pré-Diabetes";
        }
        return resultado;
    }

    public String toString(){
        return " Id Exame: "
                + idExame
                + "\n Tipo Exame: "
                + tipoExame
                + "\n Nível Glicose: "
                + nivelGlicose
                + "\n Diagnóstico: "
                + obterDiagnostico();
    }

}
