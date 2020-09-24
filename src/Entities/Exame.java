package Entities;
import Entities.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class Exame {

    private int idExame;
    private String tipoExame;
    private int nivelGlicose;
    private int idPessoa;

    static public List<Exame> listaExames = new ArrayList<Exame>();

    public Exame(int idExame, String tipoExame, int nivelGlicose, Pessoa pessoa){
        this.idExame = idExame;
        this.tipoExame = tipoExame;
        this.nivelGlicose = nivelGlicose;
        this.idPessoa = pessoa.getIdPessoa();
    }

    public void setNivelGlicose(int nivelGlicose) {
        this.nivelGlicose = nivelGlicose;
    }

    public int getIdExame() {
        return idExame;
    }

    public String obterDiagnostico(){
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
                + obterDiagnostico()
                + "\n";
    }

}
