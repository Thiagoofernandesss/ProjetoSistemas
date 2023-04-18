package model;

public class Cliente extends Pessoa {
    private String cep;
    private String telefone;
    private String endereco;

    public Cliente() {}
    public Cliente(String cep, String telefone, String endereco, String nome, String dataNascimento, String email, String rg) {
        super(nome, dataNascimento, email, rg);
        this.cep = cep;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cep=" + cep + ", telefone=" + telefone + ", endereco=" + endereco + '}';
    }
}
