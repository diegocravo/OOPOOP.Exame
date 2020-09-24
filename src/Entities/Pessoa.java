package Entities;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {

    private int idPessoa;
    private String nome;
    private String diabete;

    static public List<Pessoa> listaPessoas = new ArrayList<Pessoa>();

    public int getIdPessoa() {
        return idPessoa;
    }

    public Pessoa(int idPessoa, String nome, String diabete){
        this.idPessoa = idPessoa;
        this.nome = nome;
        this.diabete = diabete;
    }

    public void setDiabete(String diabete) {
        this.diabete = diabete;
    }

    public String toString() {
        return "Id Pessoa: "
                + idPessoa
                + "\nNome: "
                + nome
                + "\nDiagnóstico: "
                + diabete;
    }
}
