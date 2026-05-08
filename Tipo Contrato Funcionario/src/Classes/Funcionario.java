package Classes;

public abstract class Funcionario {

    private int matricula;
    protected String nome;
    private float salarioBase;
    private float horasExtras;

    public int getMatricula()                  { return matricula; }
    public void setMatricula(int matricula)    { this.matricula = matricula; }
    public String getNome()                    { return nome; }
    public void setNome(String nome)           { this.nome = nome; }
    public float getSalarioBase()              { return salarioBase; }
    public void setSalarioBase(float s)        { this.salarioBase = s; }
    public float getHorasExtras()              { return horasExtras; }
    public void setHorasExtras(float h)        { this.horasExtras = h; }

    public float calcularValorHorasExtras() {
        return horasExtras * (salarioBase / 220);
    }

    public abstract float calcularBonus();

    public float calcularSalarioFinal() {
        return salarioBase + calcularValorHorasExtras() + calcularBonus();
    }

    public abstract String getTipo();

    public String getInfo() {
        return "Funcionário: " + nome
                + " | Tipo: " + getTipo()
                + " | Salário base: R$" + salarioBase
                + " | Bônus: R$" + calcularBonus()
                + " | Salário final: R$" + calcularSalarioFinal();
    }
}