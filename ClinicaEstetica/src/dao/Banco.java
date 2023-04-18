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
        usuario = new ArrayList<Usuario>();
        cliente = new ArrayList<Cliente>();
        servico = new ArrayList<Servico>();
        agendamento = new ArrayList<Agendamento>();
        
        Usuario usuario1 = new Usuario("123.123.123-12", "admin123", "1", "Simone", "09/05/1990", "admin@estetshop.com", "521454123");
        Usuario usuario2 = new Usuario("123.123.123-12", "est123", "1", "Estet01", "09/05/1996", "estagiario@estetshop.com", "521454123");
         
        Cliente cliente1 = new Cliente("30212126", "5142487", "Rua jaboti 35 Canudos NH", "Alan Figueiredo", "30/01/1995",  "tiagoluz.h607@gmail.com", "93300012");
        Cliente cliente2 = new Cliente("30212127", "5142487", "Rua campo bom 78 Centro NH", "Judite Oliveira", "30/01/1995",  "juditeoliveirapet@gmail.com", "93300045");
        Cliente cliente3 = new Cliente("30212128", "78451458", "Rua Tres Irmaos 30 Vila Nova - NH", "Paulo Ricado", "30/01/1995",  "pauloricardopet@gmail.com", "933007496");
        Cliente cliente4 = new Cliente("30212130", "78451458", "Rua Lombardi 40 Canudos NH", "Neymar Santos", "30/01/1995",  "neymarsantospet@gmail.com", "93300748");

        Servico servico1 = new Servico("Depilação Completa", 200);

        Servico servico2 = new Servico("Massagem Corporal", 100);
        Servico servico3 = new Servico("Oxonio Barriga", 100);
        Servico servico4 = new Servico("Botox area olhos", 150);
        Servico servico5 = new Servico("Sombrancelhas", 50);
        Servico servico6 = new Servico("Penteados", 120);

        Agendamento agendamento1 = new Agendamento(cliente1, servico2, 30, "14/04/2023", "09:30", "", usuario1);
        Agendamento agendamento2 = new Agendamento(cliente3, servico4, 40, "14/04/2023", "10:00", "", usuario1);
        Agendamento agendamento3 = new Agendamento(cliente4, servico1, 18, "14/04/2023", "10:30", "", usuario1);
        
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
        servico.add(servico6);
        
        agendamento.add(agendamento1);
        agendamento.add(agendamento2);
        agendamento.add(agendamento3);
    }
}
