package group.quartoprojeto;

public class ContaBancaria {

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Pessoa pessoa;

    public ContaBancaria(int agencia, int numero, double saldo, Pessoa pessoa) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.pessoa = pessoa;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

}
