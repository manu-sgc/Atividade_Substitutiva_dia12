package tst;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

import app.IRPF;

public class CadastroDependentesTest {
    private IRPF irpf;

    @Before
    public void setUp() {
        irpf = new IRPF();
    }

    @Test
    public void testCadastrarDependentes(){
        irpf.cadastrarDependentes("Joao");
        assertEquals(189.59f, irpf.getDeducaoDependentes(), 0);
    }

    @Test
    public void testCadastrarDoisDependentes(){
        irpf.cadastrarDependentes("Joao");
        irpf.cadastrarDependentes("Maria");
        irpf.cadastrarDependentes("Jose");
        assertEquals(3 * 189.59f, irpf.getDeducaoDependentes(), 0);
    }

    @Test
    public void testCadastrarTresDependentes(){
        irpf.cadastrarDependentes("Joao");
        irpf.cadastrarDependentes("Maria");
        irpf.cadastrarDependentes("Jose");
        irpf.cadastrarDependentes("Jose Maria");
        irpf.cadastrarDependentes("Maria Jose");
        assertEquals(5 * 189.59f, irpf.getDeducaoDependentes(), 0);
    }
}