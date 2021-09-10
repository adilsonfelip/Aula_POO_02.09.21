package group.quartoprojeto;

public class ContaPoupanca extends ContaCorrente {

    protected double juros = 0.125;

    public ContaPoupanca(int agencia, int numero, double saldo, Pessoa pessoa) {
        super(agencia, numero, saldo, pessoa);
    }

    public void depositar(double valor) {
        this.saldo += valor * juros;

    }

}
