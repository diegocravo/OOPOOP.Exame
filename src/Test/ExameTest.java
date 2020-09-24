package Test;

import Entities.*;
import Main.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class ExameTest {

    Pessoa pessoa = new Pessoa(100, "Diego", "algumacoisa");
    Exame exame = new Exame(1, "Sangue", 126, pessoa);

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