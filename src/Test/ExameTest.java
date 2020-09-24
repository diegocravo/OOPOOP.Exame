package Test;

import Entities.*;
import Main.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class ExameTest {

    Pessoa pessoa = new Pessoa("Diego", "Rodrigues", "algumacoisa");
    Exame exame = new Exame("Sangue", 126, pessoa);

    @Rule
    public ErrorCollector error = new ErrorCollector();

    @Test
    public void obterDiagnostico() {
        error.checkThat(exame.obterDiagnostico(), is("Diabetes"));
        exame.setNivelGlicose(98);
        error.checkThat(exame.obterDiagnostico(), is("Normal"));
        exame.setNivelGlicose(125);
        error.checkThat(exame.obterDiagnostico(), is("Pré-Diabetes"));
    }

}