package Classes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTemplateTest {

    @Test
    void cltBonusDeveSerDezPorCento() {
        FuncionarioCLT f = new FuncionarioCLT();
        f.setSalarioBase(5000f);
        assertEquals(500f, f.calcularBonus(), 0.01f);
    }

    @Test
    void cltSalarioFinalDeveIncluirBaseExtrasEBonus() {
        FuncionarioCLT f = new FuncionarioCLT();
        f.setSalarioBase(5000f);
        f.setHorasExtras(0f);
        assertEquals(5500f, f.calcularSalarioFinal(), 0.01f);
    }

    @Test
    void cltComHorasExtrasDeveCalcularCorretamente() {
        FuncionarioCLT f = new FuncionarioCLT();
        f.setSalarioBase(4400f);
        f.setHorasExtras(22f);
        assertEquals(5280f, f.calcularSalarioFinal(), 0.01f);
    }

    @Test
    void cltTipoDeveSerCLT() {
        FuncionarioCLT f = new FuncionarioCLT();
        assertEquals("CLT", f.getTipo());
    }

    @Test
    void pjBonusDeveSerCincoPorCento() {
        FuncionarioPJ f = new FuncionarioPJ();
        f.setSalarioBase(8000f);
        assertEquals(400f, f.calcularBonus(), 0.01f);
    }

    @Test
    void pjSalarioFinalDeveIncluirBaseExtrasEBonus() {
        FuncionarioPJ f = new FuncionarioPJ();
        f.setSalarioBase(8000f);
        f.setHorasExtras(0f);
        assertEquals(8400f, f.calcularSalarioFinal(), 0.01f);
    }

    @Test
    void pjComHorasExtrasDeveCalcularCorretamente() {
        FuncionarioPJ f = new FuncionarioPJ();
        f.setSalarioBase(4400f);
        f.setHorasExtras(22f);
        assertEquals(5060f, f.calcularSalarioFinal(), 0.01f);
    }

    @Test
    void pjTipoDeveSerPJ() {
        FuncionarioPJ f = new FuncionarioPJ();
        assertEquals("PJ", f.getTipo());
    }

    @Test
    void cltEPjDevemUsarMesmoEsqueletoDeCalculo() {
        FuncionarioCLT clt = new FuncionarioCLT();
        clt.setSalarioBase(5000f);
        clt.setHorasExtras(0f);

        FuncionarioPJ pj = new FuncionarioPJ();
        pj.setSalarioBase(5000f);
        pj.setHorasExtras(0f);

        assertTrue(clt.calcularSalarioFinal() > pj.calcularSalarioFinal());
    }

    @Test
    void getInfoDeveConterNomeTipoEValores() {
        FuncionarioCLT f = new FuncionarioCLT();
        f.setNome("Ana Souza");
        f.setSalarioBase(5000f);
        f.setHorasExtras(0f);

        String info = f.getInfo();
        assertTrue(info.contains("Ana Souza"));
        assertTrue(info.contains("CLT"));
        assertTrue(info.contains("5000"));
    }
}