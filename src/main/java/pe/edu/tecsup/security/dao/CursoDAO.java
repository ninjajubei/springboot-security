package pe.edu.tecsup.security.dao;

import java.util.List;
import pe.edu.tecsup.security.helper.GenericDAO;
import pe.edu.tecsup.security.model.Curso;

public interface CursoDAO extends GenericDAO<Curso> {

    Curso getByCodigo(String codigo);

     List<Curso> getByNombre(String nombre);
}
