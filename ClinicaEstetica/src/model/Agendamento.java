package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Agendamento {
    private int id;
    private Cliente cliente;
    private Servico servico;
    private float valor;
    private String data;
    private String hora;
    private String observacao;
    private Usuario funcionario;

    public Agendamento() {}
    public Agendamento(Cliente cliente, Servico servico, float valor, String data, String hora, String observacao, Usuario funcionario) {
        this.cliente = cliente;
        this.servico = servico;
        this.valor = valor;
        this.hora = hora;
        this.observacao = observacao;
        this.funcionario = funcionario;
        this.data= data;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Usuario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Usuario funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public String toString() {
        return "Agendamento{" + "id=" + id + ", cliente=" + cliente + ", servico=" + servico + ", valor=" + valor + ", data=" + data + ", hora=" + hora + ", observacao=" + observacao + ", funcionario=" + funcionario + '}';
    }
    
}
