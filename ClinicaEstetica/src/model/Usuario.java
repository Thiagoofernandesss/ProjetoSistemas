package model;

public class Usuario extends Pessoa {
    private String cpf;
    private String senha;
    private String nivelAcesso;

    public Usuario() {}
    public Usuario(String cpf, String senha, String nivelAcesso, String nome, String dataNascimento, String email, String rg) {
        super(nome, dataNascimento, email, rg);
        this.cpf = cpf;
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    @Override
    public String toString() {
        return "Usuario{" + "cpf=" + cpf + ", senha=" + senha + ", nivelAcesso=" + nivelAcesso + '}';
    }
}
