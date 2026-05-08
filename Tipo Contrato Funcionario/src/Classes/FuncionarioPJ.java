package Classes;

public class FuncionarioPJ extends Funcionario {

    @Override
    public float calcularBonus() {
        return getSalarioBase() * 5 / 100;
    }

    @Override
    public String getTipo() {
        return "PJ";
    }
}