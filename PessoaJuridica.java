package group.quartoprojeto;

public class PessoaJuridica extends Pessoa {

    private String cnpj;

    public PessoaJuridica(String name, String endereco, double rendimentos, String cnpj) {
        super(name, endereco, rendimentos);
        this.cnpj = cnpj;
    }

    public double calcularImposto() {
        return this.rendimentos * 0.18;
    }

    public String getCnpj() {
        return cnpj;
    }

}
