package model;

public class Pessoa {

    private int id;
    private String nome;
    private String dataNascimento;
    private String email;
    private String rg;

    public Pessoa() {
    }

    public Pessoa(String nome, String dataNascimento, String email, String rg) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.rg = rg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public String toString() {
        return this.getId() + ", "
                + this.getNome() + ", "
                + this.getDataNascimento() + ", "
                + this.getRg() + ", "
                + this.getEmail() + ", ";

    }
}
