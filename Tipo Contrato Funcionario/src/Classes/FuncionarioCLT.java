package Classes;

public class FuncionarioCLT extends Funcionario {

    @Override
    public float calcularBonus() {
        return getSalarioBase() * 10 / 100;
    }

    @Override
    public String getTipo() {
        return "CLT";
    }
}