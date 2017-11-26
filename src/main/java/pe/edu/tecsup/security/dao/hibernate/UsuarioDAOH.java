package pe.edu.tecsup.security.dao.hibernate;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import pe.edu.tecsup.security.dao.UsuarioDAO;
import pe.edu.tecsup.security.model.Curso;
import pe.edu.tecsup.security.model.Usuario;

@Repository
public class UsuarioDAOH extends BaseHibernateDAO implements UsuarioDAO {

    @Override
    public List<Usuario> list() {

        Criteria criteria = this.getSession().createCriteria(Usuario.class);
        return criteria.list();
    }

    @Override
    public Usuario get(Long t) {
        Criteria criteria = this.getSession().createCriteria(Usuario.class);
        criteria.add(Restrictions.eq("id", t));
        return (Usuario) criteria.uniqueResult();
    }

    @Override
    public void save(Usuario t) {
        this.getSession().save(t);
    }

    @Override
    public void update(Usuario t) {
        this.getSession().merge(t);
    }

    @Override
    public void delete(Usuario t) {
        this.getSession().delete(t);
    }

    @Override
    public Usuario findByLogin(String usuario) {

        String sql = "from " + Usuario.class.getName() + " u "
                + " left join fetch u.persona p "
                + " where u.username = :USERNAME "
                + " and u.estado = :ESTADO ";

        Query query = this.getSession().createQuery(sql);
        query.setString("USERNAME", usuario);
        query.setString("ESTADO", "ACT");

        
        return (Usuario) query.uniqueResult();
    }

}
