package controller.helper;

import controller.LoginController;
import javax.swing.JOptionPane;
import model.Usuario;
import view.Login;
public class LoginHelper {

    private final Login view;

    public LoginHelper(Login view) {
        this.view = view;
    }
   
    public void realizarLogin() {
        Usuario usuario = obterModelo();
       
        LoginController loginController = new LoginController(view);
        if (!loginController.logar(usuario)) {
            JOptionPane.showMessageDialog(null, "Login incorreto.");
        }
    }
   
    public Usuario obterModelo() {
        String nome = view.getLabelUsuario().getText();
        String senha = String.valueOf(view.getLabelSenha().getPassword());
       
        return new Usuario("111.111.111-11", senha, "1", nome, "12-12-2012", "a@a.com", "1");
    }

    public void setarModelo(Usuario usuario){
        view.getLabelUsuario().setText(usuario.getNome());
        view.getLabelSenha().setText(usuario.getSenha());
    }

    public void limparTela() {
        view.getLabelUsuario().setText("");
        view.getLabelSenha().setText("");
       
    }
   
}