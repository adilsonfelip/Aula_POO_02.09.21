/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group.quartoprojeto;

public class PessoaFisica extends Pessoa {

    private String rg;

    public PessoaFisica(String name, String endereco, double rendimentos, String rg) {
        super(name, endereco, rendimentos);
        this.rg = rg;
    }

    public double calcularImposto() {
        if (this.rendimentos < 3000) {
            return this.rendimentos * 0.11;
        } else {
            return this.rendimentos * 0.275;
        }
    }

    public String getRg() {
        return rg;
    }

}
