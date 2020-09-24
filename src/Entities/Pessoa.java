package Entities;

import Main.GeradorId;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {

    private int idPessoa;
    private String nome;
    private String sobrenome;
    private String diabete;

    static public List<Pessoa> listaPessoas = new ArrayList<Pessoa>();

    static public ArrayList<Integer> listaExamesFeitos = new ArrayList<Integer>();

    public String getNome() {
        return nome;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public Pessoa(String nome, String sobrenome, String diabete){
        this.idPessoa = GeradorId.gerarIdPessoa();
        this.sobrenome = sobrenome;
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
                + " "
                + sobrenome
                + "\nDiagnóstico: "
                + diabete
                + "\nId Exames feitos: "
                + listaExamesFeitos
                + "\n";
    }
}
