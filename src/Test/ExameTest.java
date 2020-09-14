package Test;

import Entities.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class ExameTest {

    @Test
    public void obterDiagnostico() {
        Exame exame = new Exame(1, "Sangue", 126);

        assertEquals("Diabetes", exame.obterDiagnostico());
        exame.setNivelGlicose(98);
        assertEquals("Normal", exame.obterDiagnostico());
        exame.setNivelGlicose(125);
        assertEquals("Pré-Diabetes", exame.obterDiagnostico());
    }
}