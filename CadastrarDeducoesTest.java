package tst;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

import app.IRPF;

public class CadastrarDeducoesTest {
    
    private IRPF irpf;

    @Before
    public void setup() {
        irpf = new IRPF();    
    }
    
    @Test
    public void testCadastrarPrevidenciaOficial() {
        irpf.cadastrarPrevidenciaOficial(700f);
        assertEquals(1000.00f, irpf.getTotalPrevidenciaOficial(), 0);
    }

    @Test
    public void testCadastrarPrevidenciaOficial2() {
        irpf.cadastrarPrevidenciaOficial(800f);
        assertEquals(800.00f, irpf.getTotalPrevidenciaOficial(), 0);
    }

    @Test
    public void testCadastrarPrevidenciaOficial3() {
        irpf.cadastrarPrevidenciaOficial(900f);
        assertEquals(900.00f, irpf.getTotalPrevidenciaOficial(), 0);
    }

}