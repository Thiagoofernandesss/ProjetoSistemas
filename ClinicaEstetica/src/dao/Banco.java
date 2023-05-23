package DAO;

import model.Agendamento;
import model.Cliente;
import model.Servico;
import model.Usuario;
import java.util.ArrayList;

public class Banco {
    
    public static ArrayList<Usuario> usuario;
    public static ArrayList<Cliente> cliente;
    public static ArrayList<Servico> servico;
    public static ArrayList<Agendamento> agendamento;
    
    
    public static void inicia(){
        usuario = new ArrayList<>();
        cliente = new ArrayList<>();
        servico = new ArrayList<>();
        agendamento = new ArrayList<>();
        
        Usuario usuario1 = new Usuario("123.123.123-12", "1234", "1", "t=Thiago", "21/12/1999", "thiago@estetshop.com", "9267295365");
        Usuario usuario2 = new Usuario("123.123.123-12", "est123", "1", "Estet01", "09/05/1996", "estagiario@estetshop.com", "539479327");
         
        Cliente cliente1 = new Cliente("30212", "5142487", "Rua Martins Silava", "Thais Fagumes", "30/12/1999",  "tiagoluz.h607@gmail.com", "93300012");
        Cliente cliente2 = new Cliente("30213", "5142487", "Beco XI", "Lara Silva", "30/05/1999",  "juditeoliveirapet@gmail.com", "93300045");
        Cliente cliente3 = new Cliente("30214", "78451458", "Rua Adelson Menegaz ", "Leonardo Martins", "30/01/1999",  "pauloricardopet@gmail.com", "933007496");
        Cliente cliente4 = new Cliente("30215", "78451458", "Rua Souza Cruz", "Rogerio Lima", "30/01/1999",  "neymarsantospet@gmail.com", "93300748");

        Servico servico1 = new Servico("Consulta Médica", 300);

        Servico servico2 = new Servico("Check up", 1000);
        Servico servico3 = new Servico("Raiox", 80);
        Servico servico4 = new Servico("Ultrasson", 150);
        Servico servico5 = new Servico("Curativo", 50);

        Agendamento agendamento1 = new Agendamento(cliente1, servico2, 30, "14/02/2021", "08:30", "", usuario1);
        Agendamento agendamento2 = new Agendamento(cliente3, servico4, 40, "14/02/2021", "09:00", "", usuario2);
        Agendamento agendamento3 = new Agendamento(cliente4, servico1, 18, "14/02/2021", "09:30", "", usuario1);
        
        usuario.add(usuario1);
        usuario.add(usuario2);
        
        cliente.add(cliente1);
        cliente.add(cliente2);
        cliente.add(cliente3);
        cliente.add(cliente4);
        
        servico.add(servico1);
        servico.add(servico2);
        servico.add(servico3);
        servico.add(servico4);
        servico.add(servico5);
        
        agendamento.add(agendamento1);
        agendamento.add(agendamento2);
        agendamento.add(agendamento3);
    }
}
