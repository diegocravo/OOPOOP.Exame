package Main;

import Entities.Exame;
import Entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Cadastrar {

    public static void cadastrarExame(){

        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        int entradaNivelGlicose = 0;
        boolean continuar = true;
        boolean continue1;

        Pessoa pessoa;
        int index = -1;
        boolean achou = false;

        int entradaIdPessoa;

        do {
            continue1 = true;
            try{
                System.out.println("Digite o id da pessoa: ");
                entradaIdPessoa = ler.nextInt();

                for (int x = 0; x < Pessoa.listaPessoas.size(); x++){
                    if (Pessoa.listaPessoas.get(x).getIdPessoa() == entradaIdPessoa){
                        index = x;
                        achou = true;
                        break;
                    }
                }
                if (achou){
                    pessoa = Pessoa.listaPessoas.get(index);
                }else {
                    pessoa = null;
                    System.out.println("Pessoa não encontrada");
                    Menu.menu();
                }
                continue1 = false;
            } catch (Exception e){
                pessoa = null;
                System.out.println("Entrada Inválida");
                ler.next();
            }
        }while (continue1);


        ler.nextLine();
        System.out.println("Digite o tipo de Exame: ");
        String entradaTipoExame = ler.nextLine();

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

        Exame exame = new Exame(entradaTipoExame, entradaNivelGlicose, pessoa);

        pessoa.setDiabete(exame.obterDiagnostico());
        Pessoa.listaExamesFeitos.add(exame.getIdExame());

        Exame.listaExames.add(exame);

        System.out.println("Exame Cadastrado com sucesso!"
                            + "\nId Exame Cadastrado: "
                            + exame.getIdExame());

    }

    public  static void cadastrarPessoa(){

        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o nome do paciente: ");
        String entradaNome = ler.nextLine();
        System.out.println("Digite o sobrenome do paciente: ");
        String entradaSobrenome = ler.nextLine();


        Pessoa pessoa = new Pessoa(entradaNome, entradaSobrenome, "Sem Diagnóstico");

        System.out.println(pessoa.toString());

        Pessoa.listaPessoas.add(pessoa);
    }

}
