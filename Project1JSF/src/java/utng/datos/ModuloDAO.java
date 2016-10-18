package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Modulo;

/**
 *
 * @author Marco Antonio Mendiola Torres markochiva@gmail.com
 */
public class ModuloDAO extends DAO<Modulo>{

    public ModuloDAO() {
        super(new Modulo());
    }
    
    public Modulo getOneById(Modulo modulo)throws HibernateException{
        return super.getOneById(modulo.getIdModulo());
    }
}
