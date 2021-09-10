package group.quartoprojeto;

public abstract class Pessoa {

    protected String nome;
    protected String endereco;
    protected double rendimentos;

    public Pessoa(String name, String endereco, double rendimentos) {

        this.nome = name;
        this.endereco = endereco;
        this.rendimentos = rendimentos;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public double getRendimentos() {
        return rendimentos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setRendimentos(double rendimentos) {
        this.rendimentos = rendimentos;
    }
}
