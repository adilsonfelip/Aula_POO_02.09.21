package group.quartoprojeto;

import java.util.Scanner;

public class main {

    Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        PessoaFisica pf = new PessoaFisica("Teobaldo", "Osasco", 2900.00, "7852354");
        PessoaJuridica pj = new PessoaJuridica("Arnaldo", "Morumbi", 7000.01, "123568");
        ContaCorrente cc = new ContaCorrente(86, 1547, 8000.00, pj);
        ContaPoupanca cp = new ContaPoupanca(68, 7415, 120.00, pf);

        System.out.println("Nome: " + pf.getNome() + "\nEndereco: " + pf.getEndereco() + "\nRendimento: " + pf.getRendimentos() + "\nRG: " + pf.getRg() + "\nImposto: " + pf.calcularImposto());
        System.out.println("\nNome: " + pj.getNome() + "\nEndereco: " + pj.getEndereco() + "\nRendimento: " + pj.getRendimentos() + "\nCNPJ: " + pj.getCnpj() + "\nImposto: " + pj.calcularImposto());
        System.out.println("\n\n");
        System.out.println("\nAgencia: " + cc.getAgencia() + "\nNumero: " + cc.getNumero() + "\nSaldo: " + cc.getSaldo() + "\nNome: " + cc.getPessoa().getNome());
        System.out.println("\nAgencia: " + cc.getAgencia() + "\nNumero: " + cp.getNumero() + "\nSaldo: " + cp.getSaldo() + "\nNome: " + cp.getPessoa().getNome());
        cc.depositar(777.51);
        cp.depositar(777.51);
        System.out.println("\n\n");
        System.out.println("\nNovo Saldo Corrente: " + cc.getSaldo());
        System.out.println("\nNovo Saldo Poupanca: " + cp.getSaldo());
    }
}
