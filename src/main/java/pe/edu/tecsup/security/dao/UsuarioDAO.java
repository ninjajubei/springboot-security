package pe.edu.tecsup.security.dao;

import pe.edu.tecsup.security.helper.GenericDAO;
import pe.edu.tecsup.security.model.Usuario;

public interface UsuarioDAO extends GenericDAO<Usuario> {

    Usuario findByLogin(String usuario);

}
