package controller;

import DAO.UsuarioDAO;
import model.Usuario;
import view.Login;
import view.MenuPrincipal;

public class LoginController {

    private final Login view;

    public LoginController(Login view) {
        this.view = view;
    }

    public boolean logar(Usuario usuario) {
        if (validarLogin(usuario) != null) {
            new MenuPrincipal().setVisible(true);
            view.setVisible(false);
            return true;
        }
        return false;

    }

    private Usuario validarLogin(Usuario usuario) {
        UsuarioDAO usuarioDAO = new UsuarioDAO();

        Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
        return usuarioAutenticado;
    }

}
